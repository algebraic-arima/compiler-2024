package src.Optim.DCE;

import org.antlr.v4.runtime.misc.Pair;
import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRInst.*;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FuncDCE {

    public IRFuncDef func;
    public HashMap<String, HashSet<Pair<IRBlock, IRInst>>> varUseList;
    public HashMap<String, Pair<IRBlock, IRInst>> varDefInst;
    ArrayDeque<IRInst> workList = new ArrayDeque<>();
//    HashSet<String> wl = new HashSet<>(varDefInst.keySet());

    public FuncDCE(IRFuncDef _func) {
        this.func = _func;
        varUseList = new HashMap<>();
        varDefInst = new HashMap<>();
        collectVar();
        eliminate();
        mergeBr();
        reformat();
        mergeEdge();
    }

    public void collectVar() {
        for (IRBlock b : func.blocks) {
            b.instList.clear();
            b.instList.addAll(b.phis.values());
            b.instList.addAll(b.IRInsts);
            for (IRInst i : b.instList) {
                String d = i.getDef();
                if (d != null) {
                    varDefInst.put(d, new Pair<>(b, i));
                }
                for (String u : i.getUse()) {
                    if (!varUseList.containsKey(u)) {
                        varUseList.put(u, new HashSet<>());
                    }
                    varUseList.get(u).add(new Pair<>(b, i));
                }
                i.DCER = true;
                if (i instanceof Store || i instanceof Call || i instanceof terminalIRInst) {
                    workList.add(i);
                    i.DCER = false;
                }
            }
        }
    }

    public void eliminate() {
//        while (!wl.isEmpty()) {
//            String v = wl.iterator().next();
//            wl.remove(v);
//            var t = varUseList.get(v);
//            if (t == null || t.isEmpty()) {
//                var defAt = varDefInst.get(v);
//                if (defAt == null) continue;
//                IRBlock b = defAt.a;
//                IRInst i = defAt.b;
//                if (i instanceof Call c) {
//                    c.dest = null;
//                } else {
//                    for (String x : i.getUse()) {
//                        varUseList.get(x).removeIf(use -> use.b == i);
//                        wl.add(x);
//                    }
//                    b.instList.remove(i);
//                }
//                varDefInst.remove(v);
//                varUseList.remove(v);
//            }
//        }
        while (!workList.isEmpty()) {
            IRInst i = workList.poll();
            for (String r : i.getUse()) {
                var defAt = varDefInst.get(r);
                if (defAt != null) {
                    IRInst def = defAt.b;
                    if (def.DCER) {
                        def.DCER = false;
                        workList.add(def);
                    }
                }

            }
        }
        for (IRBlock b : func.blocks) {
            b.instList.removeIf(d -> d.DCER);
        }
    }

    public void mergeBr() {
        for (IRBlock b : func.blocks) {
            IRInst j = b.IRInsts.getLast();
            if (j instanceof Br br) {
                if (b.IRInsts.size() > 1 && b.IRInsts.get(b.IRInsts.size() - 2) instanceof Icmp cmp) {
                    if (varUseList.get(cmp.dest.name).size() == 1) {
                        br.cmp = cmp;
                        b.IRInsts.set(b.IRInsts.size() - 2, br);
                        b.IRInsts.removeLast();
                        b.instList.removeLast();
                        b.instList.set(b.instList.size() - 1, b.IRInsts.getLast());
                        varUseList.remove(cmp.dest.name);
                        varDefInst.remove(cmp.dest.name);
                    }
                }
            }
        }
    }

    public void reformat() {
        for (IRBlock b : func.blocks) {
            HashSet<Phi> ps = new HashSet<>();
            b.IRInsts.clear();
            for (IRInst i : b.instList) {
                if (i instanceof Phi p) {
                    ps.add(p);
                } else {
                    b.IRInsts.add(i);
                }
            }
            HashSet<String> t = new HashSet<>();
            for (Map.Entry<String, Phi> p : b.phis.entrySet()) {
                if (!ps.contains(p.getValue())) {
                    t.add(p.getKey());
                }
            }
            t.forEach(s -> b.phis.remove(s));
        }
    }

    public void mergeEdge() {
        HashMap<IRBlock, IRBlock> mergeList = new HashMap<>();

    }

}
