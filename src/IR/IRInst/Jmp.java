package src.IR.IRInst;

import src.IR.IRDef.IRBlock;
import src.IR.IRVisitor;

public class Jmp extends terminalIRInst {
    // unconditional branch

    public IRBlock irBlock;

    public Jmp(IRBlock irBlock) {
        this.irBlock = irBlock;
    }

    @Override
    public void print() {
        System.out.print("  br label %" + irBlock.label.label + "\n");
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
