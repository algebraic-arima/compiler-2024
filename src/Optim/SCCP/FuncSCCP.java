package src.Optim.SCCP;

import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRInst.IRInst;

import java.util.ArrayDeque;
import java.util.HashMap;

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

        }
    }
}
