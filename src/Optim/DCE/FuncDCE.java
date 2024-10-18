package src.Optim.DCE;

import org.antlr.v4.runtime.misc.Pair;
import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRInst.Call;
import src.IR.IRInst.IRInst;
import src.IR.IRInst.Phi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FuncDCE {

    public IRFuncDef func;
    public HashMap<String, HashSet<Pair<IRBlock, IRInst>>> varUseList;
    public HashMap<String, Pair<IRBlock, IRInst>> varDefInst;

    public FuncDCE(IRFuncDef _func) {
        this.func = _func;
        varUseList = new HashMap<>();
        varDefInst = new HashMap<>();
//        collectVar();
//        eliminate();
//        reformat();
    }

    public void collectVar() {
        for (IRBlock b : func.blocks) {
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
            }
        }
    }

    public void eliminate() {
        HashSet<String> wl = new HashSet<>(varDefInst.keySet());
        while (!wl.isEmpty()) {
            String v = wl.iterator().next();
            wl.remove(v);
            var t = varUseList.get(v);
            if (t == null || t.isEmpty()) {
                var defAt = varDefInst.get(v);
                if (defAt == null) continue;
                IRBlock b = defAt.a;
                IRInst i = defAt.b;
                if (i instanceof Call c) {
                    c.dest = null;
                } else {
                    for (String x : i.getUse()) {
                        varUseList.get(x).removeIf(use -> use.b == i);
                        wl.add(x);
                    }
                    b.instList.remove(i);
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

}
