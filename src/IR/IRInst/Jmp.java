package src.IR.IRInst;

import src.IR.IRBlock;

public class Jmp extends terminalInst {
    // unconditional branch

    public IRBlock irBlock;

    public Jmp(IRBlock irBlock) {
        this.irBlock = irBlock;
    }

    @Override
    public void print() {
        System.out.print("  br label " + irBlock.label.label + "\n");
    }
}
