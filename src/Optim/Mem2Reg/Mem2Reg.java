package src.Optim.Mem2Reg;

import src.IR.IRDef.IRFuncDef;
import src.IR.IRProg;

import java.util.ArrayList;

public class Mem2Reg {

    public ArrayList<CFGNode> CFGSet;

    public Mem2Reg(IRProg node) {
        CFGSet = new ArrayList<>();
        for (IRFuncDef func : node.funcDefs) {
            CFGSet.add(new CFG(func).CFGRoot);
        }
    }
}
