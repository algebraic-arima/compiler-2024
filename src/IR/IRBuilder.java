package src.IR;

import src.AST.Def.*;
import src.AST.Expr.*;
import src.AST.Prog;
import src.AST.Stmt.*;
import src.AST.Stmt.JumpStmt.*;
import src.AST.Stmt.LoopStmt.*;
import src.AST.Stmt.VarDefStmt;
import src.AST.__ASTVisitor;
import src.IR.IRDef.IRClassDef;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRDef.IRGlobalVarDef;
import src.IR.IRInst.*;
import src.utils.Entity.AnonReg;
import src.utils.Entity.Constant;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;
import src.utils.Scope.GlobalScope;
import src.utils.Scope.Scope;
import src.utils.type.FuncType;
import src.utils.type.Type;

import java.util.*;

import static src.AST.Expr.BinaryArithExpr.BArithOp.*;
import static src.AST.Expr.BinaryLogicExpr.BLogicOp.*;
import static src.AST.Expr.UnaryArithExpr.UArithOp.*;
import static src.utils.type.Type.T.*;


public class IRBuilder implements __ASTVisitor {

    public IRProg irProg;
    GlobalScope gScope;
    Scope curScope;
    //    public HashMap<Register, String> entityMap;
    // temporary register to name
    // the address of variable `a` is stored in %a.addr
    // name to the register name that stores the variable address
    // for change of field, update and restore the map
    public String curClassDef = null;
    public IRBlock curBlock;
    public IRFuncDef curFunc;
    public ArrayList<IRFuncDef> initFunc;

    public IRBlock breakBlock = null, contBlock = null;


    public IRType typeI32 = new IRType().setType(INT);
    public IRType typeI1 = new IRType().setType(BOOL);
    public IRType typePtr = new IRType().setType(STRING);


    public void RollBack() {
        if (curScope.parent == null) return;
        curScope.VarList = null;
        curScope.FuncList = null;
        curScope = curScope.parent;
    }

    public IRBuilder(GlobalScope gScope) {
        irProg = new IRProg();
//        entityMap = new HashMap<>();
        curBlock = null;
        initFunc = new ArrayList<>();
        this.gScope = gScope;
        this.curScope = gScope;
        gScope.strLiteral.forEach(s -> irProg.strDef.push(s));
        for (Map.Entry<String, String> e : gScope.renameVarMap.entrySet()) {
            gScope.VarList.put(e.getValue(), gScope.VarList.get(e.getKey()));
            gScope.VarList.remove(e.getKey());
        }
    }

    @Override
    public void visit(Prog node) {
        node.defs.forEach(d -> d.accept(this));
        IRFuncDef initGlob = new IRFuncDef("@.init");
        irProg.addFuncDef(initGlob);
        initGlob.retType = new IRType();
        curBlock = new IRBlock("entry");
        curFunc = initGlob;
        for (IRFuncDef e : initFunc) {
            curBlock.addInst(new Call(e.name, new IRType(), null));
        }
        curBlock.addInst(new Ret());
        curFunc.addBlock(curBlock);
    }

    @Override
    public void visit(FuncDef node) {
        if (curScope.isGlobal()) {
            IRFuncDef f = new IRFuncDef("@" + node.funcName);
            irProg.addFuncDef(f);
            f.retType = new IRType(node.retType);
            curBlock = new IRBlock("entry");
            curFunc = f;
            if (node.funcName.equals("main")) {
                curBlock.addInst(new Call("@.init", new IRType(), null));
            }
            for (Map.Entry<String, Type> entry : node.funcParams.entrySet()) {
                f.paramTypes.add(new IRType(entry.getValue()));
                f.paramNames.add("%" + entry.getKey() + ".val");
                Register r = new Register("%" + entry.getKey());
                curFunc.addAlloca(new Alloca(new IRType(entry.getValue()), r));
                curBlock.addInst(new Store(new IRType(entry.getValue()),
                        new Register("%" + entry.getKey() + ".val"), r));
            }

            curScope = new Scope(curScope);
            curScope.VarList = curScope.getFunc(node.funcName).args;

            node.funcBody.stmts.forEach(d -> d.accept(this));

            if (node.retType.isVoid()) {
                curBlock.addInst(new Ret());
            }
            if (Objects.equals(node.funcName, "main")) {
                curBlock.addInst(new Ret(typeI32, new Constant(0)));
            }

            curFunc.addBlock(curBlock);

            for (Inst i : curFunc.blocks.getFirst().insts) {
                curFunc.regCollector.addInst(i);
            }
            curFunc.blocks.set(0, curFunc.regCollector);

            RollBack();
        } else {
            IRFuncDef f = new IRFuncDef("@" + curClassDef + ".." + node.funcName);
            irProg.addFuncDef(f);
            f.retType = new IRType(node.retType);
            curBlock = new IRBlock("entry");
            curFunc = f;
            f.paramTypes.add(typePtr);
            f.paramNames.add("%this.val");
            for (Map.Entry<String, Type> entry : node.funcParams.entrySet()) {
                f.paramTypes.add(new IRType(entry.getValue()));
                f.paramNames.add("%" + entry.getKey() + ".val");
                Register r = new Register("%" + entry.getKey());
                curFunc.addAlloca(new Alloca(new IRType(entry.getValue()), r));
                curBlock.addInst(new Store(new IRType(entry.getValue()),
                        new Register("%" + entry.getKey() + ".val"), r));
            }

            curScope = new Scope(curScope);
            curScope.VarList = gScope.getClass(curClassDef).methods.get(node.funcName).args;

            Register originThisReg = new Register("%this");
            Register thisReg = new Register("%this1");
            curFunc.addAlloca(new Alloca(typePtr, originThisReg));
            curBlock.addInst(new Store(typePtr, new Register("%this.val"), originThisReg));
            curBlock.addInst(new Load(typePtr, originThisReg, thisReg));

            int m = 0;
            for (Map.Entry<String, Type> e : gScope.getClass(curClassDef).fields.entrySet()) {
                GetElePtr g = new GetElePtr(curClassDef, e.getValue().typeName, thisReg, new Register("%" + curClassDef + ".." + e.getKey()), 0, m);
                curBlock.addInst(g);
                m++;
            }

            node.funcBody.stmts.forEach(d -> d.accept(this));

            if (node.retType.isVoid()) {
                curBlock.addInst(new Ret());
            }

            curFunc.addBlock(curBlock);

            for (Inst i : curFunc.blocks.getFirst().insts) {
                curFunc.regCollector.addInst(i);
            }
            curFunc.blocks.set(0, curFunc.regCollector);

            RollBack();
        }
    }

    @Override
    public void visit(ClassDef node) {
        curScope = new Scope(curScope);
        curScope.VarList = gScope.getClass(node.className).fields;
        curClassDef = node.className;
        IRClassDef cd = new IRClassDef(node.className);
        curBlock = new IRBlock("entry");
        curFunc = new IRFuncDef("@" + node.className + ".." + node.className);
        curFunc.paramNames.add("%this.val");
        curFunc.paramTypes.add(typePtr);
        Register originThisReg = new Register("%this");
        Register thisReg = new Register("%this1");
        curFunc.addAlloca(new Alloca(typePtr, originThisReg));
        curBlock.addInst(new Store(typePtr, new Register("%this.val"), originThisReg));
        curBlock.addInst(new Load(typePtr, originThisReg, thisReg));

        int m = 0;
        for (Map.Entry<String, Type> e : gScope.getClass(curClassDef).fields.entrySet()) {
            GetElePtr g = new GetElePtr(curClassDef, e.getValue().typeName, thisReg, new Register("%" + curClassDef + ".." + e.getKey()), 0, m);
            curBlock.addInst(g);
            m++;
        }

        for (VarDef v : node.classMem) {
            for (Map.Entry<String, Expr> entry : v.initVals.entrySet()) {
                cd.fields.add(new IRType(v.type));
                if (entry.getValue() != null) {
                    Register reg = new Register("%" + node.className + ".." + entry.getKey());
                    entry.getValue().accept(this);
                    Store s = new Store(new IRType(v.type), entry.getValue().entity, reg);
                    curBlock.addInst(s);
                }
            }
        }
        if (node.constructor != null)
            node.constructor.accept(this);
        curBlock.addInst(new Ret());
        curFunc.addBlock(curBlock);

        for (Inst i : curFunc.blocks.getFirst().insts) {
            curFunc.regCollector.addInst(i);
        }
        curFunc.blocks.set(0, curFunc.regCollector);

        irProg.addClassDef(cd);
        irProg.addFuncDef(curFunc);
        node.classFunc.forEach(d -> d.accept(this));
        curClassDef = null;
        RollBack();
    }

    @Override
    public void visit(VarDef node) {
        if (curScope.isGlobal()) {
            for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
                IRGlobalVarDef g = new IRGlobalVarDef();
                Register addr = new Register(node.type, "@" + entry.getKey());
//                entityMap.put(addr, "@" + entry.getKey());
                g.irType = new IRType(node.type);
                g.name = "@" + entry.getKey();
                if (entry.getValue() instanceof IntLiteralExpr) {
                    g.value = ((IntLiteralExpr) entry.getValue()).value;
                } else {
                    g.value = 0;
                    if (entry.getValue() != null) {
                        IRFuncDef init = new IRFuncDef("@.init.global." + entry.getKey());
                        curBlock = new IRBlock("entry");
                        curFunc = init;
                        entry.getValue().accept(this);
                        curBlock.addInst(new Store(new IRType(node.type), entry.getValue().entity, new Register(g.name)));
                        curBlock.addInst(new Ret());
                        curFunc.addBlock(curBlock);
                        for (Inst i : curFunc.blocks.getFirst().insts) {
                            curFunc.regCollector.addInst(i);
                        }
                        curFunc.blocks.set(0, curFunc.regCollector);
                        initFunc.add(init);
                        irProg.addFuncDef(init);
                    }
                }
                irProg.addGVarDef(g);
            }
        } else {
            for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
                Register addr = new Register(node.type, "%" + entry.getKey());
//                entityMap.put(addr, "%" + entry.getKey());

                if (entry.getValue() != null) {
                    entry.getValue().accept(this);
                }

                if (node.type.isInt() || node.type.isBool()) {
                    curFunc.addAlloca(new Alloca(typeI32, addr));
                    if (entry.getValue() != null) {
                        Store s = new Store(node.type.isInt() ? typeI32 : typeI1, entry.getValue().entity, addr);
                        curBlock.addInst(s);
                    }
                } else if (node.type.isClass() || node.type.isString() || node.type.isArray()) {
                    curFunc.addAlloca(new Alloca(typePtr, addr));
                    if (entry.getValue() != null) {
                        Store s = new Store(typePtr, entry.getValue().entity, addr);
                        curBlock.addInst(s);
                    }
                }
            }
        }
    }

    @Override
    public void visit(Constructor node) {
        node.funcBody.stmts.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(BreakStmt node) {
        Jmp j = new Jmp(breakBlock);
        curBlock.insts.add(j);
    }

    @Override
    public void visit(ContinueStmt node) {
        Jmp j = new Jmp(contBlock);
        curBlock.insts.add(j);
    }

    @Override
    public void visit(ReturnStmt node) {
        if (node.retExpr != null) {
            node.retExpr.accept(this);
            Ret r = new Ret(new IRType(node.retExpr.type), node.retExpr.entity);
            curBlock.insts.add(r);
        } else {
            Ret r = new Ret();
            curBlock.insts.add(r);
        }
    }

    @Override
    public void visit(IfStmt node) {
        node.condition.accept(this);
        if (node.falseStmt == null) {
            IRBlock thenBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-if-then");
            IRBlock endBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-if-end");
            Br b = new Br(node.condition.entity, thenBlock, endBlock);
            curBlock.insts.add(b);
            curFunc.addBlock(curBlock);
            curBlock = thenBlock;
            node.trueStmt.accept(this);
            Jmp j = new Jmp(endBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = endBlock;
        } else {
            IRBlock thenBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-if-then");
            IRBlock elseBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-if-else");
            IRBlock endBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-if-end");
            Br b = new Br(node.condition.entity, thenBlock, elseBlock);
            curBlock.insts.add(b);
            curFunc.addBlock(curBlock);
            curBlock = thenBlock;
            node.trueStmt.accept(this);
            Jmp j = new Jmp(endBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = elseBlock;
            node.falseStmt.accept(this);
            j = new Jmp(endBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = endBlock;
        }
    }

    @Override
    public void visit(WhileStmt node) {
        if (node.body == null) return;
        IRBlock condBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-while-cond");
        IRBlock bodyBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-while-body");
        IRBlock endBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-while-end");
        IRBlock tmpBreak = breakBlock, tmpCont = contBlock;
        breakBlock = endBlock;
        contBlock = condBlock;
        Jmp j = new Jmp(condBlock);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = condBlock;
        node.cond.accept(this);
        Br b = new Br(node.cond.entity, bodyBlock, endBlock);
        curBlock.addInst(b);
        curFunc.addBlock(curBlock);
        curBlock = bodyBlock;
        node.body.accept(this);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = endBlock;
        breakBlock = tmpBreak;
        contBlock = tmpCont;
    }

    @Override
    public void visit(ForStmt node) {
        if (node.body == null) return;
        if (node.init != null) {
            node.init.accept(this);
        }
        IRBlock condBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-for-cond");
        IRBlock bodyBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-for-body");
        IRBlock stepBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-for-step");
        IRBlock endBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-for-end");
        IRBlock tmpBreak = breakBlock, tmpCont = contBlock;
        breakBlock = endBlock;
        contBlock = (node.update == null) ? condBlock : stepBlock;

        Jmp j = new Jmp(condBlock);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = condBlock;
        if (node.cond != null) {
            node.cond.accept(this);
            Br b = new Br(node.cond.entity, bodyBlock, endBlock);
            curBlock.addInst(b);
            curFunc.addBlock(curBlock);
            curBlock = bodyBlock;
        }
        node.body.accept(this);
        if (node.update != null) {
            Jmp jj = new Jmp(stepBlock);
            curBlock.addInst(jj);
            curFunc.addBlock(curBlock);
            curBlock = stepBlock;
            node.update.accept(this);
        }
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = endBlock;

        breakBlock = tmpBreak;
        contBlock = tmpCont;
    }

    @Override
    public void visit(VarDefStmt node) {
        node.varDef.accept(this);
    }

    @Override
    public void visit(ExprStmt node) {
        node.expr.accept(this);
    }

    @Override
    public void visit(BlockStmt node) {
        curScope = new Scope(curScope);
        node.stmts.forEach(s -> s.accept(this));
        curScope = curScope.parent;
    }

    @Override
    public void visit(EmptyStmt node) {
    }

    @Override
    public void visit(ArrayAccessExpr node) {
        node.array.accept(this);
        node.index.accept(this);
        Register res = new AnonReg(typePtr);
        Register res_offset_addr = new AnonReg(node.type.isArray() ? typePtr : typeI32);

        GetElePtr g = new GetElePtr((node.array.type.hasClass()) ? "ptr" : node.array.type.typeName,
                node.type.typeName,
                (Register) node.array.entity, res,
                node.index.entity, -1);

        Load l = new Load(new IRType(node.type), res, res_offset_addr);

        curBlock.addInst(g);
        curBlock.addInst(l);
        node.entity = res_offset_addr;
        node.addr = res;
    }

    @Override
    public void visit(ArrayLiteralExpr node) {
        if (node.elements.isEmpty()) {
            node.entity = null;
            return;
        }
        node.elements.forEach(e -> e.accept(this));
        Register res = new AnonReg(typePtr);
        Call c = new Call("@array..malloc", typePtr, res);
        c.args.add(new Constant(node.elements.size()));
        c.argTypes.add(typeI32);
        node.entity = res;
        curBlock.addInst(c);
        int cnt = 0;
        for (Expr e : node.elements) {
            // a geteleptr and a store
            Register offset = new AnonReg(typePtr);
            GetElePtr g = new GetElePtr(node.type.typeName,
                    "ptr", res, offset, cnt, -1);
            curBlock.addInst(g);
            Store s = new Store(new IRType(e.type), e.entity, offset);
            curBlock.addInst(s);
            ++cnt;
        }
    }

    /*
        int[][][] a = new int[][][]{
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

     */

    @Override
    public void visit(AssignExpr node) {
        node.value.accept(this);
        Entity val = node.value.entity;
        if (node.var instanceof VarExpr) {
            node.var.accept(this);
            Store s = new Store(new IRType(node.var.type), val,
                    ((VarExpr) node.var).addr);
            curBlock.addInst(s);
        } else if (node.var instanceof MemberObjAccessExpr) {
            node.var.accept(this);
            Store s = new Store(new IRType(node.var.type), val,
                    ((MemberObjAccessExpr) node.var).addr);
            curBlock.addInst(s);
        } else if (node.var instanceof ArrayAccessExpr) {
            node.var.accept(this);
            Store s = new Store(new IRType(node.var.type), val,
                    ((ArrayAccessExpr) node.var).addr);
            curBlock.addInst(s);
        }
    }

    @Override
    public void visit(BinaryArithExpr node) {
        node.lhs.accept(this);
        node.rhs.accept(this);
        if (node.lhs.type.isInt() && node.rhs.type.isInt()) {
            Register res = new AnonReg(typeI32);
            if (node.op == ADD || node.op == SUB || node.op == MUL || node.op == DIV || node.op == MOD
                    || node.op == BLS || node.op == BRS || node.op == BAND || node.op == BOR || node.op == BXOR) {
                Binary n = new Binary(node.op);
                n.dest = res;
                n.setLhs(node.lhs.entity);
                n.setRhs(node.rhs.entity);
                n.type = typeI32;
                node.entity = res;
                curBlock.insts.add(n);
            } else {
                Icmp n = new Icmp(node.op);
                n.dest = res;
                n.setLhs(node.lhs.entity);
                n.setRhs(node.rhs.entity);
                n.type = typeI32;
                node.entity = res;
                curBlock.insts.add(n);
            }
        } else if (node.lhs.type.isString() && node.rhs.type.isString()) {
            if (node.op == ADD) {
                Register res = new AnonReg(typePtr);
                Call c = new Call("@string..add", node.lhs.type, res);
                c.args.add(node.lhs.entity);
                c.args.add(node.rhs.entity);
                c.argTypes.add(new IRType(node.lhs.type));
                c.argTypes.add(new IRType(node.rhs.type));
                node.entity = res;
                node.entity.type = c.retType;
                curBlock.addInst(c);
            } else if (node.op == EQ || node.op == NE
                    || node.op == LT || node.op == GT
                    || node.op == LE || node.op == GE) {
                Register res = new AnonReg(typeI1);
                Call c = switch (node.op) {
                    case EQ -> new Call("@string..eq", typeI1, res);
                    case NE -> new Call("@string..ne", typeI1, res);
                    case LT -> new Call("@string..lt", typeI1, res);
                    case GT -> new Call("@string..gt", typeI1, res);
                    case LE -> new Call("@string..le", typeI1, res);
                    case GE -> new Call("@string..ge", typeI1, res);
                    default -> null;
                };
                c.args.add(node.lhs.entity);
                c.args.add(node.rhs.entity);
                c.argTypes.add(typePtr);
                c.argTypes.add(typePtr);
                node.entity = res;
                node.entity.type = c.retType;
                curBlock.addInst(c);
            }
        } else if (node.lhs.type.isArray() || node.rhs.type.isArray()) {
            Register res = new AnonReg(typeI1);
            Icmp n = new Icmp(node.op);
            n.dest = res;
            if (node.lhs.type.isNull()) {
                n.setRhs(node.rhs.entity);
            } else {
                n.setLhs(node.lhs.entity);
            }
            node.entity = res;
            n.type = typePtr;
            curBlock.insts.add(n);
        } else if (node.lhs.type.isClass() || node.rhs.type.isClass()) {
            Register res = new AnonReg(typeI1);
            Icmp n = new Icmp(node.op);
            n.dest = res;
            if (node.lhs.type.isNull()) {
                n.setRhs(node.rhs.entity);
            } else {
                n.setLhs(node.lhs.entity);
            }
            node.entity = res;
            n.type = typePtr;
            curBlock.insts.add(n);
        }

    }


    @Override
    public void visit(BinaryLogicExpr node) {
        if (node.op == AND) {
            Register brAddr = new AnonReg(typeI1);
            curFunc.addAlloca(new Alloca(typeI1, brAddr));
            curBlock.addInst(new Store(typeI1, new Constant(0), brAddr));
            IRBlock trueBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-and-rhs");
            IRBlock falseBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-and-end");
            node.lhs.accept(this);
            Br b = new Br(node.lhs.entity, trueBlock, falseBlock);
            curBlock.insts.add(b);
            curFunc.addBlock(curBlock);
            curBlock = trueBlock;
            curBlock.addInst(new Store(typeI1, new Constant(1), brAddr));
            node.rhs.accept(this);
            Jmp j = new Jmp(falseBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = falseBlock;
            Register br = new AnonReg(typeI1);
            curBlock.addInst(new Load(typeI1, brAddr, br));
            Register res = new AnonReg(typeI1);
            curBlock.addInst(new Select(br, typeI1, node.rhs.entity, new Constant(0), res));
            node.entity = res;
        } else if (node.op == OR) {
            Register brAddr = new AnonReg(typeI1);
            curFunc.addAlloca(new Alloca(typeI1, brAddr));
            curBlock.addInst(new Store(typeI1, new Constant(0), brAddr));
            IRBlock trueBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-or-end");
            IRBlock falseBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-or-rhs");
            node.lhs.accept(this);
            Br b = new Br(node.lhs.entity, trueBlock, falseBlock);
            curBlock.insts.add(b);
            curFunc.addBlock(curBlock);
            curBlock = falseBlock;
            curBlock.addInst(new Store(typeI1, new Constant(1), brAddr));
            node.rhs.accept(this);
            Jmp j = new Jmp(trueBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = trueBlock;
            Register br = new AnonReg(typeI1);
            curBlock.addInst(new Load(typeI1, brAddr, br));
            Register res = new AnonReg(typeI1);
            curBlock.addInst(new Select(br, typeI1, node.rhs.entity, new Constant(1), res));
            node.entity = res;
        }
    }

    @Override
    public void visit(BoolLiteralExpr node) {
        node.entity = new Constant(node.value ? 1 : 0);
    }

    @Override
    public void visit(FmtStrLiteralExpr node) {
        node.exprs.forEach(e -> e.accept(this));
        /// todo: call printf to print all the expr values
    }

    @Override
    public void visit(FuncCallExpr node) {
        Call c;
        FuncType gft = gScope.getFunc(node.funcName);
        FuncType cft;
        if (curClassDef != null) {
            cft = gScope.getClass(curClassDef).methods.get(node.funcName);
        } else {
            cft = null;
        }
        if (cft != null) {
            node.args.exps.forEach(e -> e.accept(this));
            if (node.type.isVoid()) {
                c = new Call("@" + curClassDef + ".." + node.funcName, cft.retType, null);
            } else {
                Register res = new AnonReg((node.type.isInt() || node.type.isBool()) ? typeI32 : typePtr);
                c = new Call("@" + curClassDef + ".." + node.funcName, cft.retType, res);
                node.entity = res;
            }
            c.args.add(new Register("%this1"));
            c.argTypes.add(typePtr);
        } else {
            node.args.exps.forEach(e -> e.accept(this));
            if (node.type.isVoid()) {
                c = new Call("@" + node.funcName, gft.retType, null);
                node.entity = null;
            } else {
                Register res = new AnonReg((node.type.isInt() || node.type.isBool()) ? typeI32 : typePtr);
                c = new Call("@" + node.funcName, gft.retType, res);
                node.entity = res;
            }
        }
        for (Expr e : node.args.exps) {
            c.args.add(e.entity);
            if (e.entity != null) c.argTypes.add(new IRType(e.type));
            else c.argTypes.add(null);
        }
        curBlock.insts.add(c);
    }

    @Override
    public void visit(IntLiteralExpr node) {
        node.entity = new Constant(node.value);
    }

    @Override
    public void visit(MemberFuncCallExpr node) {
        node.obj.accept(this);
        node.args.exps.forEach(e -> e.accept(this));

        if (node.obj.type.isArray()) {
            Call c = new Call("@array..size", typeI32, new AnonReg(typeI32));
            c.args.add(node.obj.entity);
            c.argTypes.add(typePtr);
            curBlock.insts.add(c);
            node.entity = c.dest;
            return;
        }

        FuncType ft = gScope.getClass(node.obj.type.typeName).methods.get(node.funcName);
        Call c = null;
        if (node.type.isVoid()) {
            c = new Call("@" + node.obj.type.typeName + ".." + node.funcName, ft.retType, null);
            node.entity = null;
        } else {
            Register res = new AnonReg((node.type.isInt() || node.type.isBool()) ? typeI32 : typePtr);
            c = new Call("@" + node.obj.type.typeName + ".." + node.funcName, ft.retType, res);
            node.entity = res;
        }

        c.args.add(node.obj.entity);
        c.argTypes.add(typePtr);
        for (Expr e : node.args.exps) {
            c.args.add(e.entity);
            if (e.entity != null) {
                c.argTypes.add(new IRType(e.type));
            } else {
                c.argTypes.add(null);
            }
        }
        curBlock.insts.add(c);
    }

    @Override
    public void visit(MemberObjAccessExpr node) {
        node.obj.accept(this);
        Register res_offset_addr = new AnonReg(typePtr);
        Register res = new AnonReg((node.type.isInt() || node.type.isBool()) ? typeI32 : typePtr);

//        Register res_member = new Register(node.type, "%" + node.obj.type.typeName + "-" + node.member);
//        // res stores the address of the object
//        Load l = new Load(new IRType(node.type), (Register) node.obj.entity, res);
//        curBlock.addInst(l);

        GetElePtr g = new GetElePtr(node.obj.type.typeName, node.type.typeName, (Register) node.obj.entity, res_offset_addr,
                0, gScope.getClass(node.obj.type.typeName).getMemberOffset(node.member));
        curBlock.addInst(g);
        Load ll = new Load(new IRType(node.type), res_offset_addr, res);
        curBlock.addInst(ll);
        node.entity = res;
        node.addr = res_offset_addr;
    }

    @Override
    public void visit(NewArrayExpr node) {
        /// no need to use null or 0 to initialize the array
        node.len.forEach(e -> e.accept(this));
        int dim = node.type.dim;
        int loop = node.len.size();
        ArrayList<Entity> e = new ArrayList<>();
        node.len.forEach(ed -> e.add(ed.entity));

        if (loop == 0) {
            return;
        } else if (loop == 1) {
            Call c = new Call("@array..malloc", node.type, new AnonReg(typePtr));
            c.args.add(e.getFirst());
            c.argTypes.add(typeI32);
            curBlock.addInst(c);
            node.entity = c.dest;
            return;
        }
        IRBlock[] condBlocks = new IRBlock[loop * 3 - 3];
        for (int i = 0; i < loop - 1; ++i) {
            condBlocks[2 * i] = new IRBlock(node.pos.row + "-" + node.pos.column + "-na-cond" + i);
            condBlocks[2 * i + 1] = new IRBlock(node.pos.row + "-" + node.pos.column + "-na-body" + i);
            condBlocks[loop * 3 - 4 - i] = new IRBlock(node.pos.row + "-" + node.pos.column + "-na-end" + i);
        }
        for (int i = 0; i < loop - 1; ++i) {
            Register tmp1 = new Register("%na-" + node.pos.row + "-" + node.pos.column + "-tmp" + i);
            Register cmp1 = new Register("%na-" + node.pos.row + "-" + node.pos.column + "-cmp" + i);
            Register inc1 = new Register("%na-" + node.pos.row + "-" + node.pos.column + "-inc" + i);
            Register addr1 = new Register("%na-" + node.pos.row + "-" + node.pos.column + "-addr" + i);
            Register addr2 = new Register("%na-" + node.pos.row + "-" + node.pos.column + "-addr" + (i + 1));

            condBlocks[2 * i].addInst(new Load(typeI32, addr1, tmp1));
            condBlocks[2 * i].addInst(new Icmp("<", tmp1, e.get(i), cmp1, typeI32));
            condBlocks[2 * i].addInst(new Br(cmp1, condBlocks[2 * i + 1], condBlocks[loop * 3 - 4 - i]));

            Register p1 = new Register("%na-" + node.pos.row + "-" + node.pos.column + "-p" + i);
            Register t1 = new Register("%na-" + node.pos.row + "-" + node.pos.column + "-t" + (i));
            Register t2 = new Register("%na-" + node.pos.row + "-" + node.pos.column + "-t" + (i + 1));
            Call c = new Call("@array..malloc", typePtr, t2);
            c.args.add(e.get(i + 1));
            c.argTypes.add(typeI32);
            condBlocks[2 * i + 1].addInst(new GetElePtr("ptr",
                    node.type.typeName, t1, p1, tmp1, -1));

            condBlocks[2 * i + 1].addInst(c);
            condBlocks[2 * i + 1].addInst(new Store(typePtr, t2, p1));
            condBlocks[2 * i + 1].addInst(new Binary("+", tmp1, new Constant(1), inc1, typeI32));
            condBlocks[2 * i + 1].addInst(new Store(typeI32, inc1, addr1));
            if (i != loop - 2) {
                curFunc.addAlloca(new Alloca(typeI32, addr2));
                condBlocks[2 * i + 1].addInst(new Store(typeI32, new Constant(0), addr2));
            }
            condBlocks[2 * i + 1].addInst(new Jmp((i == loop - 2) ? condBlocks[2 * i] : condBlocks[2 * i + 2]));

            if (i != 0) {
                condBlocks[loop * 3 - 4 - i].addInst(new Jmp(condBlocks[2 * i - 2]));
            }
        }
        Call c = new Call("@array..malloc", node.type,
                new Register("%na-" + node.pos.row + "-" + node.pos.column + "-t" + 0));
        c.args.add(e.getFirst());
        c.argTypes.add(typeI32);
        curBlock.addInst(c);
        Register addr = new Register("%na-" + node.pos.row + "-" + node.pos.column + "-addr" + 0);
        curFunc.addAlloca(new Alloca(typeI32, addr));
        curBlock.addInst(new Store(typeI32, new Constant(0), addr));


        node.entity = c.dest;
        curBlock.addInst(new Jmp(condBlocks[0]));
        curFunc.addBlock(curBlock);
        for (int i = 0; i < loop * 3 - 4; ++i) {
            curFunc.addBlock(condBlocks[i]);
        }
        curBlock = condBlocks[loop * 3 - 4];
    }

    /*
        int[][][] a = new int[x + y][x - y][6 * z];
        %s1, %s2, %s3, ...

        %t1 = @array..malloc(%s1)
        br na1.cond

        na1.cond:
            %tmp1 = phi i32 [0 , %entry], [%inc1 , na2.end]
            %cmp1 = icmp slt i32 %tmp1, %s1
            br i1 %cmp1, na1.body, na1.end

        na1.body:
            %p1 = getelementptr ptr, ptr %t1, i32 %tmp1
            %t2 = @array..malloc(%s2)
            store ptr %t2, ptr %p1
            %inc1 = add i32 %tmp1, 1
            br na2.cond

            na2.cond
                %tmp2 = phi i32 [0 , na1.body], [%inc2 , na2.body]
                %cmp2 = icmp slt i32 %tmp2, %s2
                br i1 %cmp2, na2.body, na2.end

            na2.body:
                %p2 = getelementptr ptr, ptr %t2, i32 %tmp2
                %t3 = @array..malloc(%s3)
                store ptr %t3, ptr %p2
                %inc2 = add i32 %tmp2, 1
                br na2.cond

            na2.end:
                br na1.cond

        na1.end:

     */

    /*
        without phi stmt ver. :

        int[][][] a = new int[x + y][x - y][6 * z];
        %s1, %s2, %s3, ...



        %t1 = @array..malloc(%s1)
        %addr1 = alloca i32
        store i32 0, ptr %addr1
        br na1.cond

        na1.cond:
            %tmp1 = load i32, ptr %addr1
            %cmp1 = icmp slt i32 %tmp1, %s1
            br i1 %cmp1, na1.body, na1.end

        na1.body:
            %p1 = getelementptr ptr, ptr %t1, i32 %tmp1
            %t2 = @array..malloc(%s2)
            store ptr %t2, ptr %p1
            %inc1 = add i32 %tmp1, 1
            store i32 %inc1, ptr %addr1
            %addr2 = alloca i32
            store i32 0, ptr %addr2
            br na2.cond

            na2.cond
                %tmp2 = load i32, ptr %addr2
                %cmp2 = icmp slt i32 %tmp2, %s2
                br i1 %cmp2, na2.body, na2.end

            na2.body:
                %p2 = getelementptr ptr, ptr %t2, i32 %tmp2
                %t3 = @array..malloc(%s3)
                store ptr %t3, ptr %p2
                %inc2 = add i32 %tmp2, 1
                store i32 %inc2, ptr %addr2
                %addr3 = alloca i32 ; redundant
                store i32 0, ptr %addr3 ; redundant
                br na2.cond

            na2.end:
                br na1.cond

        na1.end:

     */

    @Override
    public void visit(NewArrayInitExpr node) {
        node.init.accept(this);
        node.entity = node.init.entity;
    }

    @Override
    public void visit(NewTypeExpr node) {
        irProg.classDefs.forEach(c -> {
            if (c.className.substring(7).equals(node.type.typeName)) {
                String cn = node.type.typeName;
                Register res = new AnonReg(typePtr);
                node.entity = res;
                Call c1 = new Call("@..malloc", node.type, res);
                c1.args.add(new Constant(c.fields.size() * 4L));
                c1.argTypes.add(typeI32);
                curBlock.addInst(c1);
                Call c2 = new Call("@" + cn + ".." + cn, new IRType(), null);
                c2.args.add(res);
                c2.argTypes.add(typePtr);
                curBlock.addInst(c2);
            }
        });
    }

    @Override
    public void visit(NullExpr node) {
        node.entity = null;
    }

    @Override
    public void visit(ParenthesesExpr node) {
        node.exp.accept(this);
        node.entity = node.exp.entity;
        if (node.exp instanceof VarExpr) {
            node.addr = ((VarExpr) node.exp).addr;
        } else if (node.exp instanceof MemberObjAccessExpr) {
            node.addr = ((MemberObjAccessExpr) node.exp).addr;
        } else if (node.exp instanceof ArrayAccessExpr) {
            node.addr = ((ArrayAccessExpr) node.exp).addr;
        } else if (node.exp instanceof UnaryArithExpr) {
            node.addr = ((UnaryArithExpr) node.exp).addr;
        }
    }

    @Override
    public void visit(RowExpr node) {
        node.exps.forEach(e -> e.accept(this));
        node.entity = node.exps.getLast().entity;
    }

    @Override
    public void visit(StringLiteralExpr node) {
        node.entity = new Register(typePtr, irProg.strDef.getString(node.value));
    }

    @Override
    public void visit(TernaryBranchExpr node) {
        node.cond.accept(this);
        Register res;
        if (node.type.isInt() || node.type.isBool()) {
            res = new AnonReg(typeI32);
        } else {
            res = new AnonReg(typePtr);
        }
        IRBlock trueBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-ternary-true");
        IRBlock falseBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-ternary-false");
        IRBlock endBlock = new IRBlock(node.pos.row + "-" + node.pos.column + "-ternary-end");
        Br b = new Br(node.cond.entity, trueBlock, falseBlock);
        curBlock.addInst(b);
        curFunc.addBlock(curBlock);
        curBlock = trueBlock;
        node.trueBranch.accept(this);
        Jmp j = new Jmp(endBlock);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = falseBlock;
        node.falseBranch.accept(this);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = endBlock;
        if (!node.trueBranch.type.isVoid() || !node.falseBranch.type.isVoid()) {
            curBlock.addInst(new Select(node.cond.entity, new IRType(node.type), node.trueBranch.entity, node.falseBranch.entity, res));
        }
        node.entity = res;
    }

    @Override
    public void visit(ThisPtrExpr node) {
        node.entity = new Register(typePtr, "%this1");
    }

    @Override
    public void visit(UnaryArithExpr node) {
        node.expr.accept(this);
        Register res = new AnonReg(typeI32);
        if (node.op == NEG) {
            Binary n = new Binary("-");
            n.dest = res;
            n.setLhs(0);
            n.setRhs(node.expr.entity);
            n.type = typeI32;
            node.entity = res;
            curBlock.insts.add(n);
        } else if (node.op == BNOT) {
            Binary n = new Binary("^");
            n.dest = res;
            n.setRhs(-1);
            n.type = typeI32;
            n.setLhs(node.expr.entity);
            node.entity = res;
            curBlock.insts.add(n);
        } else if (node.op == LINC || node.op == LDEC
                || node.op == RINC || node.op == RDEC) {
            Binary n = new Binary((node.op == LINC || node.op == RINC) ? "+" : "-");
            n.dest = res;
            n.setLhs(node.expr.entity);
            n.setRhs(1);
            n.type = typeI32;
            node.entity = res;
            Register addr = null;
            if (node.expr instanceof VarExpr) {
                addr = ((VarExpr) node.expr).addr;
            } else if (node.expr instanceof MemberObjAccessExpr) {
                addr = ((MemberObjAccessExpr) node.expr).addr;
            } else if (node.expr instanceof ArrayAccessExpr) {
                addr = ((ArrayAccessExpr) node.expr).addr;
            } else if (node.expr instanceof UnaryArithExpr) {
                addr = ((UnaryArithExpr) node.expr).addr;
            }
            Store s = new Store(new IRType(node.expr.type),
                    res, addr);
            // bug--store in the original address
            node.entity = ((!(node.op == LINC || node.op == LDEC)) ?
                    (Register) node.expr.entity : res);
            curBlock.insts.add(n);
            curBlock.insts.add(s);
            if (node.op == LINC || node.op == LDEC) {
                node.addr = addr;
            }
        }

    }

    @Override
    public void visit(UnaryLogicExpr node) {
        node.expr.accept(this);
        Register res = new AnonReg(typeI1);
        Binary n = new Binary("^");
        n.dest = res;
        n.setLhs(1);
        n.setRhs(node.expr.entity);
        n.type = typeI1;
        node.entity = res;
        curBlock.insts.add(n);
    }

    @Override
    public void visit(VarExpr node) {
        Register res = new AnonReg((node.type.isInt() || node.type.isBool()) ? typeI32 : typePtr);
        boolean isg = gScope.VarList.containsKey(node.varName);
        Register addr = new Register(node.type, (isg ? "@" : "%") + node.varName);
        Load l = new Load(new IRType(node.type), addr, res);
        // the value of variable `i` is stored in the position that @i/%i points
        node.entity = res;
        node.addr = addr;
        curBlock.insts.add(l);
    }
}
