package src.Optim.CSE;

import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;

public class FuncCSE {

    public FuncCSE(IRFuncDef func){
        func.blocks.forEach(this::scan);
    }

    public void scan(IRBlock b){
        
    }
}
