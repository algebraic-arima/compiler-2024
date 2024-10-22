package src.Optim.SCCP;

import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRInst.IRInst;
import src.IR.IRInst.Phi;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static src.Optim.SCCP.Var.*;

public class FuncSCCP {

    IRFuncDef func;
    ArrayDeque<SCCPNode> workList;
    HashMap<String, Var> varList;
    HashMap<String, Blk> blockList;

    public FuncSCCP(IRFuncDef _func) {
        func = _func;
        varList = new HashMap<>();
        blockList = new HashMap<>();
        workList = new ArrayDeque<>();
//        func.blocks.forEach(d -> blockList.put(d.label, new Blk(d)));
        collect();
        propagate();
        trim();
        reformat();
    }

    public void collect() {
        for (IRBlock b : func.blocks) {
            b.instList.clear();
            b.instList.addAll(b.phis.values());
            b.instList.addAll(b.IRInsts);
            blockList.put(b.label, new Blk(b));
            for (IRInst i : b.instList) {
                String def = i.getDef();
                if (def != null) {
                    varList.put(def, new Var(def));
                }
            }
        }
        for (IRBlock b : func.blocks) {
            for (IRInst i : b.instList) {
                for (String str : i.getUse()) {
                    varList.get(str).use.add(i);
                }
            }
        }
    }

    public void propagate() {
        workList.add(blockList.get("entry"));
        while (!workList.isEmpty()) {
            SCCPNode n = workList.poll();
            if (n instanceof Blk b) {
                for (IRInst i : b.blk.instList) {

                }
            }
        }
    }

    public void trim() {

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

    public void meet(Var dst, Var lhs, String op, Var rhs) {
        if (lhs.p == C && rhs.p == C && !(rhs.value == 0 && (op.equals("sdiv") || op.equals("srem")))) {
            long value = 0, lv = lhs.value, rv = rhs.value;
            switch (op) {
                case "add" -> value = lv + rv;
                case "sub" -> value = lv - rv;
                case "mul" -> value = lv * rv;
                case "sdiv" -> value = lv / rv;
                case "srem" -> value = lv % rv;
                case "shl" -> value = lv << rv;
                case "ashr" -> value = lv >> rv;
                case "and" -> value = lv & rv;
                case "or" -> value = lv | rv;
                case "xor" -> value = lv ^ rv;
            }
            if (dst.p == U) {
                workList.add(dst);
            }
            dst.p = C;
            dst.value = value;

        }
        if (lhs.p == M || rhs.p == M) {
            if (dst.p != M) {
                workList.add(dst);
            }
            dst.p = M;
        }
    }


}
