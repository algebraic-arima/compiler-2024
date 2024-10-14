package src.Optim.SCCP;

import src.IR.IRDef.IRFuncDef;
import src.IR.IRProg;

public class SCCP {

    public IRProg irProg;

    public SCCP(IRProg irProg) {
        this.irProg = irProg;
        for (IRFuncDef func : irProg.funcDefs) {
            FuncSCCP f = new FuncSCCP(func);
        }
    }

}
