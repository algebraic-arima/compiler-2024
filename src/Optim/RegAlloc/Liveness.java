package src.Optim.RegAlloc;

import org.antlr.v4.runtime.misc.Pair;
import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRInst.*;
import src.utils.Entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Liveness {

    public IRFuncDef irFunc;
    public HashMap<String, HashSet<Pair<IRBlock, IRInst>>> varList;
    public HashMap<IRInst, IRInst> preInst;
    HashSet<IRBlock> visBlocks;

    public Liveness(IRFuncDef irFunc) {
        this.irFunc = irFunc;
        varList = new HashMap<>();
        preInst = new HashMap<>();
        for (IRBlock b : irFunc.blocks) {
            b.instList.addAll(b.phis.values());
            b.instList.addAll(b.IRInsts);
            IRInst te = b.IRInsts.getLast();
            if (te instanceof Br br) {
                b.succ.add(br.trueBlock);
                b.succ.add(br.falseBlock);
                br.trueBlock.pred.add(b);
                br.falseBlock.pred.add(b);
            } else if (te instanceof Jmp j) {
                b.succ.add(j.block);
                j.block.pred.add(b);
            } else {
                b.succ.clear();
            }
            for (IRInst i : b.instList) {
                if (i instanceof Alloca || i instanceof Binary || i instanceof GetElePtr
                        || i instanceof Icmp || i instanceof Load || i instanceof Phi) {
                    varList.put(i.dest.name, new HashSet<>());
                } else if (i instanceof Call c) {
                    if (!c.retType.typeName.equals("void") && c.dest != null) {
                        varList.put(i.dest.name, new HashSet<>());
                    }
                }
            }

        }
        for (int bi = 0; bi < irFunc.blocks.size(); ++bi) {
            IRBlock b = irFunc.blocks.get(bi);
            IRInst cur = null;
            for (IRInst i : b.instList) {
                preInst.put(i, cur);
                cur = i;
                if (i instanceof Binary bin) {
                    if (bin.lhs instanceof Register r) {
                        varList.get(r.name).add(new Pair<>(b, bin));
                    }
                    if (bin.rhs instanceof Register r) {
                        varList.get(r.name).add(new Pair<>(b, bin));
                    }
                } else if (i instanceof Br br) {
                    if (br.cond instanceof Register r) {
                        varList.get(r.name).add(new Pair<>(b, br));
                    }
                } else if (i instanceof Call c) {
                    for (Entity en : c.args) {
                        if (en instanceof Register r) {
                            varList.get(r.name).add(new Pair<>(b, c));
                        }
                    }
                } else if (i instanceof GetElePtr g) {
                    if (g.offset instanceof Register r) {
                        varList.get(r.name).add(new Pair<>(b, g));
                    }
                    varList.get(g.ptr.name).add(new Pair<>(b, g));
                } else if (i instanceof Icmp bin) {
                    if (bin.lhs instanceof Register r) {
                        varList.get(r.name).add(new Pair<>(b, bin));
                    }
                    if (bin.rhs instanceof Register r) {
                        varList.get(r.name).add(new Pair<>(b, bin));
                    }
                } else if (i instanceof Load l) {
                    varList.get(l.src.name).add(new Pair<>(b, l));
                } else if (i instanceof Store s) {
                    varList.get(s.dest.name).add(new Pair<>(b, s));
                    if (s.value instanceof Register r) {
                        varList.get(r.name).add(new Pair<>(b, s));
                    }
                } else if (i instanceof Ret ret) {
                    if (ret.value instanceof Register r) {
                        varList.get(r.name).add(new Pair<>(b, ret));
                    }
                } else if (i instanceof Phi p) {
                    for (var d : p.valList) {
                        if (d.a instanceof Register r) {
                            varList.get(r.name).add(new Pair<>(b, p));
                        }
                    }
                }
            }
        }


        visBlocks = new HashSet<>();
        for (Map.Entry<String, HashSet<Pair<IRBlock, IRInst>>> e : varList.entrySet()) {
            visBlocks.clear();
            String v = e.getKey();
            for (var use : e.getValue()) {
                IRBlock useBlock = use.a;
                IRInst useInst = use.b;
                if (useInst instanceof Phi p) {
                    for (int i = 0; i < p.valList.size(); ++i) {
                        var va = p.valList.get(i);
                        Entity en = va.a;
                        if (en instanceof Register r) {
                            if (r.name.equals(v)) {
                                scanBlock(va.b, v);
                            }
                        }
                    }
                } else {
                    liveIn(useBlock, useInst, v);
                }
            }
        }
    }

    public void scanBlock(IRBlock b, String v) {
        if (visBlocks.contains(b)) return;
        visBlocks.add(b);
        liveOut(b, b.instList.getLast(), v);
    }

    public void liveIn(IRBlock b, IRInst s, String v) {
        s.liveIn.add(v);
        IRInst pre = preInst.get(s);
        if (pre == null) {
            for (IRBlock p : b.pred) {
                scanBlock(p, v);
            }
        } else {
            liveOut(b, pre, v);
        }
    }

    public void liveOut(IRBlock b, IRInst i, String v) {
        i.liveOut.add(v);
        HashSet<String> def = new HashSet<>();
        if (i instanceof Alloca || i instanceof Binary || i instanceof GetElePtr
                || i instanceof Icmp || i instanceof Load || i instanceof Phi) {
            def.add(i.dest.name);
        } else if (i instanceof Call c) {
            if (!c.retType.typeName.equals("void") && c.dest != null) {
                def.add(i.dest.name);
            }
        }
        for (String y : def) {
            if (y.equals(v)) continue;
            // interfere

        }
        if (!def.contains(v)) {
            liveIn(b, i, v);
        }
    }
}
