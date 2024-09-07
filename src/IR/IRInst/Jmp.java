package src.IR.IRInst;

import src.IR.IRDef.IRBlock;
import src.IR.IRVisitor;

public class Jmp extends terminalIRInst {
    // unconditional branch

    public IRBlock block;

    public Jmp(IRBlock block) {
        this.block = block;
    }

    @Override
    public void print() {
        System.out.print("  br label %" + block.label.label + "\n");
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
