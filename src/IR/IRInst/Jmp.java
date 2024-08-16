package src.IR.IRInst;

import src.IR.IRBlock;

public class Jmp extends terminalInst {
    // unconditional branch

    public IRBlock dest;

    public Jmp(IRBlock dest) {
        this.dest = dest;
    }

    @Override
    public String str() {
        return "";
    }
}
