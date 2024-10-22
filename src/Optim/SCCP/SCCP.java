package src.Optim.SCCP;

import src.IR.IRProg;

public class SCCP {

    public IRProg irProgram;

    public SCCP(IRProg irProgram_) {
        irProgram = irProgram_;
        for (var func : irProgram.funcDefs) {
            FuncSCCP f = new FuncSCCP(func);
        }
    }
}
