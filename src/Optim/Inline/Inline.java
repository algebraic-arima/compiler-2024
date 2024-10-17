package src.Optim.Inline;

import src.ASM.ASMInst.J;
import src.IR.IRBuilder;
import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRInst.Call;
import src.IR.IRInst.IRInst;
import src.IR.IRProg;

import java.util.HashMap;
import java.util.HashSet;

public class Inline {

//    public static class fNode {
//        public String name;
//        public HashSet<fNode> callee;
//        public HashSet<fNode> caller;
//
//        public fNode(String name) {
//            this.name = name;
//        }
//    }

    IRProg irProg;
    HashMap<String, IRFuncDef> inlineList = new HashMap<>();
//    public HashMap<String, fNode> callGraph;

    public Inline(IRProg irProg) {
        this.irProg = irProg;
        for (IRFuncDef func : irProg.funcDefs) {
            if (func.hasCall) inlineList.put(func.name, func);
        }
        if (!inlineList.isEmpty()) {
            inline();
        }
    }

    public void inline() {
        for (int i = 0; i < irProg.funcDefs.size(); ++i) {
            IRFuncDef f = irProg.funcDefs.get(i);
            if (!f.hasCall) continue;
            for (int j = 0; j < f.blocks.size(); ++j) {
                IRBlock b = f.blocks.get(j);
                for (int k = 0; k < b.IRInsts.size(); ++k) {
                    IRInst inst = b.IRInsts.get(k);
                    if (inst instanceof Call c) {
                        if(!inlineList.containsKey(c.funcName)) continue;

                    }
                }
            }
        }
    }

//    public void build(IRFuncDef func) {
//        for (IRBlock b : func.blocks) {
//            for (IRInst i : b.IRInsts) {
//                if (i instanceof Call c) {
//
//                }
//            }
//        }
//    }

}
