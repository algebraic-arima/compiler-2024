package src.Optim.RegAlloc;

import org.antlr.v4.runtime.misc.Pair;
import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRInst.*;
import src.utils.Entity.*;

import java.util.*;

public class Liveness {

    static int loopConst = 16;
    public IRFuncDef irFunc;
    public HashMap<String, HashSet<Pair<IRBlock, IRInst>>> varList;
    public HashMap<String, Pair<IRBlock, IRInst>> defInst;
    public HashMap<IRInst, IRInst> preInst;
    HashSet<IRBlock> visBlocks;
    public HashMap<String, Long> cost;
    long loop = 1;
    public RIG rig;
    HashMap<String, Integer> spillList;

    public Liveness(IRFuncDef irFunc) {
        this.irFunc = irFunc;
        varList = new HashMap<>();
        preInst = new HashMap<>();
        cost = new HashMap<>();
        defInst = new HashMap<>();

        varDefCollect();
        varUseCollect();
        trimUseless();

        rig = new RIG();
        rig.addCost(cost);
        liveAnalysis();

//        for (Map.Entry<String, RIG.RIGNode> e : rig.g.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue().color + " " + e.getValue().cost + " " + e.getValue().n.size());
//            if (!e.getValue().n.isEmpty()) {
//                System.out.println("  " + e.getValue().cost / e.getValue().n.size());
//            }
//        }
//        int maxColor = 0;
//        int trueColor = rig.colors.size();
//        IRInst maxInst = null;
//        for (IRBlock b : irFunc.blocks) {
//            for (IRInst i : b.instList) {
//                if (i.liveOut.size() > maxColor) {
//                    maxInst = i;
//                    maxColor = i.liveOut.size();
//                }
//            }
//        }
        int regNum = 12;
        spill(regNum);
        rig.MCS();
        rig.color(regNum);
        reducePhi();
        /// may have data hazard in phi
    }

    public void varDefCollect() {
        // collect var defs
        for (IRBlock b : irFunc.blocks) {
            if (b.label.label.endsWith("-for-cond")
                    || b.label.label.endsWith("-while-cond")
                    || b.label.label.endsWith("-na-cond")) {
                loop *= loopConst;
            } else if (b.label.label.endsWith("-for-end")
                    || b.label.label.endsWith("-while-end")
                    || b.label.label.endsWith("-na-end")) {
                loop /= loopConst;
            }
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
                    defInst.put(i.dest.name, new Pair<>(b, i));
                    cost.put(i.dest.name, loop);
                } else if (i instanceof Call c) {
                    if (!c.retType.typeName.equals("void") && c.dest != null) {
                        varList.put(i.dest.name, new HashSet<>());
                        defInst.put(i.dest.name, new Pair<>(b, i));
                        cost.put(i.dest.name, loop);
                    }
                }
            }

        }
    }

    public void varUseCollect() {
        // collect uses
        loop = 1;
        for (int bi = 0; bi < irFunc.blocks.size(); ++bi) {
            IRBlock b = irFunc.blocks.get(bi);
            IRInst cur = null;
            if (b.label.label.endsWith("-for-cond")
                    || b.label.label.endsWith("-while-cond")
                    || b.label.label.endsWith("-na-cond")) {
                loop *= loopConst;
            } else if (b.label.label.endsWith("-for-end")
                    || b.label.label.endsWith("-while-end")
                    || b.label.label.endsWith("-na-end")) {
                loop /= loopConst;
            }
            for (IRInst i : b.instList) {
                preInst.put(i, cur);
                cur = i;
                if (i instanceof Binary bin) {
                    if (bin.lhs instanceof Register r) {
                        if (varList.containsKey(r.name)) {
                            varList.get(r.name).add(new Pair<>(b, bin));
                            cost.put(r.name, cost.get(r.name) + loop);
                        }
                    }
                    if (bin.rhs instanceof Register r) {
                        if (varList.containsKey(r.name)) {
                            varList.get(r.name).add(new Pair<>(b, bin));
                            cost.put(r.name, cost.get(r.name) + loop);
                        }
                    }
                } else if (i instanceof Br br) {
                    if (br.cond instanceof Register r) {
                        if (varList.containsKey(r.name)) {
                            varList.get(r.name).add(new Pair<>(b, br));
                            cost.put(r.name, cost.get(r.name) + loop);
                        }
                    }
                } else if (i instanceof Call c) {
                    for (Entity en : c.args) {
                        if (en instanceof Register r) {
                            if (varList.containsKey(r.name)) {
                                varList.get(r.name).add(new Pair<>(b, c));
                                cost.put(r.name, cost.get(r.name) + loop);
                            }
                        }
                    }
                } else if (i instanceof GetElePtr g) {
                    if (g.offset instanceof Register r) {
                        if (varList.containsKey(r.name)) {
                            varList.get(r.name).add(new Pair<>(b, g));
                            cost.put(r.name, cost.get(r.name) + loop);
                        }
                    }
                    if (varList.containsKey(g.ptr.name)) {
                        varList.get(g.ptr.name).add(new Pair<>(b, g));
                        cost.put(g.ptr.name, cost.get(g.ptr.name) + loop);
                    }
                } else if (i instanceof Icmp bin) {
                    if (bin.lhs instanceof Register r) {
                        if (varList.containsKey(r.name)) {
                            varList.get(r.name).add(new Pair<>(b, bin));
                            cost.put(r.name, cost.get(r.name) + loop);
                        }
                    }
                    if (bin.rhs instanceof Register r) {
                        if (varList.containsKey(r.name)) {
                            varList.get(r.name).add(new Pair<>(b, bin));
                            cost.put(r.name, cost.get(r.name) + loop);
                        }
                    }
                } else if (i instanceof Load l) {
                    if (varList.containsKey(l.src.name)) {
                        varList.get(l.src.name).add(new Pair<>(b, l));
                        cost.put(l.src.name, cost.get(l.src.name) + loop);
                    }
                } else if (i instanceof Store s) {
                    if (varList.containsKey(s.dest.name)) {
                        varList.get(s.dest.name).add(new Pair<>(b, s));
                        cost.put(s.dest.name, cost.get(s.dest.name) + loop);
                    }
                    if (s.value instanceof Register r) {
                        if (varList.containsKey(r.name)) {
                            varList.get(r.name).add(new Pair<>(b, s));
                            cost.put(r.name, cost.get(r.name) + loop);
                        }
                    }

                } else if (i instanceof Ret ret) {
                    if (ret.value instanceof Register r) {
                        if (varList.containsKey(r.name)) {
                            varList.get(r.name).add(new Pair<>(b, ret));
                            cost.put(r.name, cost.get(r.name) + loop);
                        }
                    }
                } else if (i instanceof Phi p) {
                    for (var d : p.valList) {
                        if (d.a instanceof Register r) {
                            if (varList.containsKey(r.name)) {
                                varList.get(r.name).add(new Pair<>(b, p));
                                cost.put(r.name, cost.get(r.name) + loop);
                            }
                        }
                    }
                }
            }
        }
    }

    public void trimUseless() {
        for (Map.Entry<String, HashSet<Pair<IRBlock, IRInst>>> e : varList.entrySet()) {
            if (e.getValue().isEmpty()) {
                String var = e.getKey();
                Pair<IRBlock, IRInst> def = defInst.get(var);
                if (def.b instanceof Call) {
                    continue; // Call can modify some other vars
                }
                preInst.put(def.a.instList.get(def.a.instList.indexOf(def.b) + 1), preInst.get(def.b));
                def.a.instList.remove(def.b);
                def.a.IRInsts.remove(def.b);
                cost.remove(var);
            }
        }
    }

    public void liveAnalysis() {
        visBlocks = new HashSet<>();
        for (Map.Entry<String, HashSet<Pair<IRBlock, IRInst>>> e : varList.entrySet()) {
            visBlocks.clear();
            String v = e.getKey();
            HashSet<Pair<IRBlock, IRInst>> uses = e.getValue();
            for (var use : uses) {
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
        b.liveOut.add(v);
        visBlocks.add(b);
        liveOut(b, b.instList.getLast(), v);
    }

    public void liveIn(IRBlock b, IRInst s, String v) {
        s.addIn(v);
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
        i.addOut(v);
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
            rig.addEdge(v, y);
            // y: def in the inst
            // v: some active var suring the inst
        }
        if (!def.contains(v)) {
            liveIn(b, i, v);
        } else {
            return;
        }
    }

    public void spill(int rn) {
        spillList = new HashMap<>();
        for (IRBlock b : irFunc.blocks) {
            for (IRInst i : b.instList) {
                int cnt = 0;
                for (var r : i.liveOut) {
                    String s = r.name;
                    if (!spillList.containsKey(s)) {
                        ++cnt;
                    }
                }
                if (cnt > rn) {
                    // select the min-cost (cnt - rn) vars to spill
                    PriorityQueue<Pair<String, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.b));
                    for (Register r : i.liveOut) {
                        String s = r.name;
                        if (!spillList.containsKey(s)) {
                            pq.offer(new Pair<>(s, cost.get(s).intValue()));
                        }
                    }
                    for (int j = 0; j < cnt - rn; ++j) {
                        Pair<String, Integer> p = pq.poll();
                        spillList.put(p.a, p.b);
                    }
                    i.omega = rn;
                } else {
                    i.omega = cnt;
                }
            }
        }
        for (Map.Entry<String, Integer> e : spillList.entrySet()) {
//            System.out.println("  " + e.getKey() + " " + e.getValue());
            Register.markStack(e.getKey());
            rig.removeVertex(e.getKey());
        }
        irFunc.stackSize = spillList.size();
    }

    public void reducePhi() {
        for (IRBlock b : irFunc.blocks) {
            HashMap<Register, Phi> phis = new HashMap<>();
            HashMap<String, ArrayList<Pair<Entity, Register>>> totMVList = new HashMap<>();
            for (IRBlock p : b.pred) {
                totMVList.put(p.label.label, new ArrayList<>());
            }
            for (IRInst i : b.instList) {
                if (i instanceof Phi p) {
                    phis.put(p.dest, p);
                    for (var c : p.valList) {
                        totMVList.get(c.b.label.label).add(new Pair<>(c.a, p.dest));
                    }
                } else break;
            }
            // no need to consider parallel data shifting
            // since you don't know where it will be assigned
            for (IRBlock p : b.pred) {
                // apply modifies to p.mv
                ArrayList<Pair<Entity, Register>> mvList = totMVList.get(p.label.label);
                ArrayList<Move> moveArray = new ArrayList<>();
                p.mv.put(b.label.label, moveArray);
                for (var e : mvList) {
                    moveArray.add(new Move(e.a, e.b));
                }
            }
            // reserve those not trimmed, using phis
        }
    }
}
