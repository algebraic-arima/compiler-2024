package src.ASM;

import src.ASM.ASMDef.*;
import src.ASM.ASMInst.*;
import src.ASM.ASMInst.Bin.*;
import src.IR.IRDef.*;
import src.IR.IRInst.*;
import src.IR.IRProg;
import src.IR.IRVisitor;
import src.utils.Entity.Constant;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ASMBuilder implements IRVisitor {

    public ASMProg asmProg;
    public ASMFuncDef curFunc;
    public ASMBlock curBlock;
    public HashMap<String, Integer> classDefs; // number of fields in each class
    public HashMap<String, Integer> regPos;
    public IRFuncDef curIRFuncDef;
    public int occSP = 0;

    public ASMBuilder(IRProg prog) {
        classDefs = new HashMap<>();
        curIRFuncDef = null;
        prog.classDefs.forEach(x -> classDefs.put(x.className, x.fields.size()));
        this.asmProg = new ASMProg();
        regPos = new HashMap<>();
        visit(prog);
    }

    @Override
    public void visit(IRProg node) {
        node.gVarDefs.forEach(x -> x.accept(this));
        node.strDef.accept(this);
        node.funcDefs.forEach(x -> x.accept(this));
        for (Map.Entry<String, Integer> entry : regPos.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Override
    public void visit(IRClassDef node) {

    }

    @Override
    public void visit(IRFuncDef node) {
        curFunc = new ASMFuncDef(node.name.substring(1));
        curIRFuncDef = node;
        asmProg.funcDefs.add(curFunc);

        ASMBlock in = new ASMBlock(node.name.substring(1));
        curFunc.blocks.add(in);
        curBlock = in;
        int stackSize = 4 * (node.regNum + (node.funcParamMax > 8 ? node.funcParamMax - 8 : 0) + 1);
        curFunc.stackSize = (stackSize / 16 + 1) * 16;
        in.addInst(new ADDI("sp", "sp", -curFunc.stackSize));
        occSP = 4;
        in.addInst(new SW("ra", curFunc.stackSize - occSP, "sp"));

        node.blocks.forEach(x -> x.accept(this));
        curIRFuncDef = null;

    }

    @Override
    public void visit(IRGlobalVarDef node) {
        asmProg.gVarDefs.add(new ASMGVarDef(node.name, node.value));
    }

    @Override
    public void visit(IRStrDef node) {
        node.strMap.forEach((k, v) -> {
            asmProg.gStrDefs.add(new ASMGStrDef(k, "@constStr-" + v));
        });
    }

    @Override
    public void visit(IRBlock node) {
        String bn = node.label.label;
        if (node.label.label.equals("entry")) {
            bn = curFunc.name;
        }
        if (!curBlock.label.equals(bn)) {
            curBlock = new ASMBlock(node.label.label);
            curFunc.blocks.add(curBlock);
        }
        node.IRInsts.forEach(x -> x.accept(this));
    }

    @Override
    public void visit(Alloca node) {
        occSP += 8;
        regPos.put(node.dest.name, curFunc.stackSize - occSP);
        curBlock.addInst(new ADDI("t0", "sp", curFunc.stackSize - occSP + 4));
        curBlock.addInst(new SW("t0", regPos.get(node.dest.name), "sp"));
    }

    @Override
    public void visit(Binary node) {
        if (node.op.equals("add")) {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                if (node.rhs instanceof Register) {
                    String rn2 = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t0", regPos.get(rn2), "sp"));
                    curBlock.addInst(new ADD("t0", "t0", "t1"));
                } else {
                    curBlock.addInst(new ADDI("t0", "t1", ((Constant) node.rhs).value));
                }
            } else {
                if (node.rhs instanceof Register) {
                    String rn = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                    curBlock.addInst(new ADDI("t0", "t1", ((Constant) node.lhs).value));
                } else {
                    curBlock.addInst(new LI("t0",
                            ((Constant) node.lhs).value + ((Constant) node.rhs).value));
                }
            }
        } else if (node.op.equals("sub")) {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                if (node.rhs instanceof Register) {
                    String rn2 = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t0", regPos.get(rn2), "sp"));
                    curBlock.addInst(new SUB("t0", "t0", "t1"));
                } else {
                    curBlock.addInst(new ADDI("t0", "t1", -((Constant) node.rhs).value));
                }
            } else {
                if (node.rhs instanceof Register) {
                    String rn = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                    curBlock.addInst(new ADDI("t0", "t1", -((Constant) node.lhs).value));
                } else {
                    curBlock.addInst(new LI("t0",
                            ((Constant) node.lhs).value - ((Constant) node.rhs).value));
                }
            }
        } else if (node.op.equals("mul") || node.op.equals("sdiv") || node.op.equals("srem")) {
            if (node.lhs instanceof Constant) {
                curBlock.addInst(new LI("t0", ((Constant) node.lhs).value));
            } else {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t0", regPos.get(rn), "sp"));
            }
            if (node.rhs instanceof Constant) {
                curBlock.addInst(new LI("t1", ((Constant) node.rhs).value));
            } else {
                String rn = ((Register) node.rhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
            }
            if (node.op.equals("mul"))
                curBlock.addInst(new MUL("t0", "t0", "t1"));
            else if (node.op.equals("sdiv"))
                curBlock.addInst(new DIV("t0", "t0", "t1"));
            else
                curBlock.addInst(new REM("t0", "t0", "t1"));
        } else if (node.op.equals("shl")) {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                if (node.rhs instanceof Register) {
                    String rn2 = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t0", regPos.get(rn2), "sp"));
                    curBlock.addInst(new SLL("t0", "t0", "t1"));
                } else {
                    curBlock.addInst(new SLLI("t0", "t1", ((Constant) node.rhs).value));
                }
            } else {
                if (node.rhs instanceof Register) {
                    String rn = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                    curBlock.addInst(new SLLI("t0", "t1", ((Constant) node.lhs).value));
                } else {
                    curBlock.addInst(new LI("t0",
                            ((Constant) node.lhs).value << ((Constant) node.rhs).value));
                }
            }
        } else if (node.op.equals("ashr")) {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                if (node.rhs instanceof Register) {
                    String rn2 = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t0", regPos.get(rn2), "sp"));
                    curBlock.addInst(new SRA("t0", "t0", "t1"));
                } else {
                    curBlock.addInst(new SRAI("t0", "t1", ((Constant) node.rhs).value));
                }
            } else {
                if (node.rhs instanceof Register) {
                    String rn = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                    curBlock.addInst(new SRAI("t0", "t1", ((Constant) node.lhs).value));
                } else {
                    curBlock.addInst(new LI("t0",
                            ((Constant) node.lhs).value >> ((Constant) node.rhs).value));
                }
            }
        } else if (node.op.equals("and")) {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                if (node.rhs instanceof Register) {
                    String rn2 = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t0", regPos.get(rn2), "sp"));
                    curBlock.addInst(new AND("t0", "t0", "t1"));
                } else {
                    curBlock.addInst(new ANDI("t0", "t1", ((Constant) node.rhs).value));
                }
            } else {
                if (node.rhs instanceof Register) {
                    String rn = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                    curBlock.addInst(new ANDI("t0", "t1", ((Constant) node.lhs).value));
                } else {
                    curBlock.addInst(new LI("t0",
                            ((Constant) node.lhs).value & ((Constant) node.rhs).value));
                }
            }
        } else if (node.op.equals("or")) {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                if (node.rhs instanceof Register) {
                    String rn2 = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t0", regPos.get(rn2), "sp"));
                    curBlock.addInst(new OR("t0", "t0", "t1"));
                } else {
                    curBlock.addInst(new ORI("t0", "t1", ((Constant) node.rhs).value));
                }
            } else {
                if (node.rhs instanceof Register) {
                    String rn = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                    curBlock.addInst(new ORI("t0", "t1", ((Constant) node.lhs).value));
                } else {
                    curBlock.addInst(new LI("t0",
                            ((Constant) node.lhs).value | ((Constant) node.rhs).value));
                }
            }
        } else if (node.op.equals("xor")) {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                if (node.rhs instanceof Register) {
                    String rn2 = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t0", regPos.get(rn2), "sp"));
                    curBlock.addInst(new XOR("t0", "t0", "t1"));
                } else {
                    curBlock.addInst(new XORI("t0", "t1", ((Constant) node.rhs).value));
                }
            } else {
                if (node.rhs instanceof Register) {
                    String rn = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                    curBlock.addInst(new XORI("t0", "t1", ((Constant) node.lhs).value));
                } else {
                    curBlock.addInst(new LI("t0",
                            ((Constant) node.lhs).value ^ ((Constant) node.rhs).value));
                }
            }
        }
        String rdn = node.dest.name;
        occSP += 4;
        regPos.put(rdn, curFunc.stackSize - occSP);
        curBlock.addInst(new SW("t0", curFunc.stackSize - occSP, "sp"));
    }

    @Override
    public void visit(Br node) {
        if (node.cond instanceof Constant) {
            if (((Constant) node.cond).value == 0) {
                curBlock.addInst(new J(node.falseBlock.label.label));
            } else {
                curBlock.addInst(new J(node.trueBlock.label.label));
            }
        } else {
            String rn = ((Register) node.cond).name;
            curBlock.addInst(new LW("t0", regPos.get(rn), "sp"));
            curBlock.addInst(new BEQZ("t0", node.falseBlock.label.label));
            curBlock.addInst(new J(node.trueBlock.label.label));
        }
    }

    @Override
    public void visit(Call node) {
        if (node.args.size() < 8) {
            int cnt = 0;
            for (Entity e : node.args) {
                if (e instanceof Constant) {
                    curBlock.addInst(new LI("a" + cnt, ((Constant) e).value));
                } else {
                    curBlock.addInst(new LW("a" + cnt, regPos.get(((Register) e).name), "sp"));
                }
            }
            curBlock.addInst(new CALL(node.funcName.substring(1)));
            if (node.dest != null && !node.retType.typeName.equals("void")) {
                occSP += 4;
                regPos.put(node.dest.name, curFunc.stackSize - occSP);
                curBlock.addInst(new SW("a0", curFunc.stackSize - occSP, "sp"));
            }
        }
    }

    @Override
    public void visit(GetElePtr node) {

    }

    @Override
    public void visit(Icmp node) {
        if (node.op.equals("eq")) {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                if (node.rhs instanceof Register) {
                    String rn2 = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t0", regPos.get(rn2), "sp"));
                    curBlock.addInst(new XOR("t0", "t0", "t1"));
                    curBlock.addInst(new SEQZ("t0", "t0"));
                } else {
                    curBlock.addInst(new XORI("t0", "t1", ((Constant) node.rhs).value));
                    curBlock.addInst(new SEQZ("t0", "t0"));
                }
            } else {
                if (node.rhs instanceof Register) {
                    String rn = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                    curBlock.addInst(new XORI("t0", "t1", ((Constant) node.lhs).value));
                    curBlock.addInst(new SEQZ("t0", "t0"));
                } else {
                    curBlock.addInst(new LI("t0", ((Constant) node.lhs).value == ((Constant) node.rhs).value ? 1L : 0L));
                }
            }
        } else if (node.op.equals("neq")) {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                if (node.rhs instanceof Register) {
                    String rn2 = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t0", regPos.get(rn2), "sp"));
                    curBlock.addInst(new XOR("t0", "t0", "t1"));
                    curBlock.addInst(new SNEZ("t0", "t0"));
                } else {
                    curBlock.addInst(new XORI("t0", "t1", ((Constant) node.rhs).value));
                    curBlock.addInst(new SNEZ("t0", "t0"));
                }
            } else {
                if (node.rhs instanceof Register) {
                    String rn = ((Register) node.rhs).name;
                    curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
                    curBlock.addInst(new XORI("t0", "t1", ((Constant) node.lhs).value));
                    curBlock.addInst(new SNEZ("t0", "t0"));
                } else {
                    curBlock.addInst(new LI("t0", ((Constant) node.lhs).value != ((Constant) node.rhs).value ? 1L : 0L));
                }
            }
        } else {
            if (node.lhs instanceof Register) {
                String rn = ((Register) node.lhs).name;
                curBlock.addInst(new LW("t0", regPos.get(rn), "sp"));
            } else {
                curBlock.addInst(new LI("t0", ((Constant) node.lhs).value));
            }
            if (node.rhs instanceof Register) {
                String rn = ((Register) node.rhs).name;
                curBlock.addInst(new LW("t1", regPos.get(rn), "sp"));
            } else {
                curBlock.addInst(new LI("t1", ((Constant) node.rhs).value));
            }
            if (node.op.equals("slt")) {
                curBlock.addInst(new SLT("t0", "t0", "t1"));
            } else if (node.op.equals("sle")) {
                curBlock.addInst(new SLT("t0", "t1", "t0"));
                curBlock.addInst(new XORI("t0", "t0", 1L));
            } else if (node.op.equals("sgt")) {
                curBlock.addInst(new SLT("t0", "t1", "t0"));
            } else if (node.op.equals("sge")) {
                curBlock.addInst(new SLT("t0", "t0", "t1"));
                curBlock.addInst(new XORI("t0", "t0", 1L));
            }
        }
        String rdn = node.dest.name;
        occSP += 4;
        regPos.put(rdn, curFunc.stackSize - occSP);
        curBlock.addInst(new SW("t0", curFunc.stackSize - occSP, "sp"));
    }

    @Override
    public void visit(Jmp node) {
        curBlock.addInst(new J(node.irBlock.label.label));
    }

    @Override
    public void visit(Label node) {
    }

    @Override
    public void visit(Load node) {
        if (node.src.name.startsWith("@")) {
            curBlock.addInst(new LWL("t0", node.src.name.substring(1)));
            curBlock.addInst(new SW("t0", regPos.get(node.dest.name), "sp"));
        } else {
            curBlock.addInst(new LW("t0", regPos.get(node.src.name), "sp"));
            curBlock.addInst(new LW("t0", 0, "t0"));
            occSP += 4;
            regPos.put(node.dest.name, curFunc.stackSize - occSP);
            curBlock.addInst(new SW("t0", curFunc.stackSize - occSP, "sp"));
        }
    }

    @Override
    public void visit(Phi node) {
        // omitted
    }

    @Override
    public void visit(Ret node) {
        if (!node.type.typeName.equals("void")) {
            if (node.value instanceof Constant) {
                curBlock.addInst(new LI("a0", ((Constant) node.value).value));
            } else {
                curBlock.addInst(new LW("a0", regPos.get(((Register) node.value).name), "sp"));
            }
        }
        curBlock.addInst(new LW("ra", curFunc.stackSize - 4, "sp"));
        curBlock.addInst(new ADDI("sp", "sp", curFunc.stackSize));
        curBlock.addInst(new RET());
    }

    @Override
    public void visit(Select node) {
        if (node.cond instanceof Constant) {
            if (((Constant) node.cond).value == 0) {
                if (node.falseVal instanceof Constant) {
                    curBlock.addInst(new LI("t0", ((Constant) node.falseVal).value));
                } else {
                    curBlock.addInst(new LW("t0", regPos.get(((Register) node.falseVal).name), "sp"));
                }
                curBlock.addInst(new SW("t0", regPos.get(node.dest.name), "sp"));
            } else {
                if (node.trueVal instanceof Constant) {
                    curBlock.addInst(new LI("t0", ((Constant) node.trueVal).value));
                } else {
                    curBlock.addInst(new LW("t0", regPos.get(((Register) node.trueVal).name), "sp"));
                }
                curBlock.addInst(new SW("t0", regPos.get(node.dest.name), "sp"));
            }
        } else if (node.cond instanceof Register) {
            curBlock.addInst(new LW("t0", regPos.get(((Register) node.cond).name), "sp"));
            if (node.trueVal instanceof Constant) {
                curBlock.addInst(new LI("t1", ((Constant) node.trueVal).value));
            } else {
                curBlock.addInst(new LW("t1", regPos.get(((Register) node.trueVal).name), "sp"));
            }
            if (node.falseVal instanceof Constant) {
                curBlock.addInst(new LI("t2", ((Constant) node.falseVal).value));
            } else {
                curBlock.addInst(new LW("t2", regPos.get(((Register) node.falseVal).name), "sp"));
            }
            /// todo: add select inst
        }

    }

    @Override
    public void visit(Store node) {
        if (node.value instanceof Constant) {
            curBlock.addInst(new LI("t0", ((Constant) node.value).value));
        } else {
            String rn = ((Register) node.value).name;
            if (rn.endsWith(".val")) {
                int ind = curIRFuncDef.paramNames.indexOf(rn);
                if (ind < 8) {
                    curBlock.addInst(new ADDI("t0", "a" + ind, 0));
                } else {
                    curBlock.addInst(new LW("t0", curFunc.stackSize + (ind - 8) * 4L, "sp"));
                }
            } else {
                curBlock.addInst(new LW("t0", regPos.get(((Register) node.value).name), "sp"));
            }
        }
        if (node.dest.name.startsWith("@")) {
            curBlock.addInst(new LA("t1", node.dest.name.substring(1)));
            curBlock.addInst(new SW("t0", 0, "t1"));
        } else {
            curBlock.addInst(new LW("t1", regPos.get(node.dest.name), "sp"));
            curBlock.addInst(new SW("t0", 0, "t1"));
        }
    }

}
