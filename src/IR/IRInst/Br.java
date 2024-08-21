package src.IR.IRInst;

import src.IR.IRBlock;
import src.utils.Entity.Entity;

public class Br extends terminalInst {

    public Entity cond;
    public IRBlock trueBlock, falseBlock;

    public Br(Entity cond, IRBlock trueBlock, IRBlock falseBlock) {
        this.cond = cond;
        this.trueBlock = trueBlock;
        this.falseBlock = falseBlock;
    }

    public Br(Entity cond) {
        this.cond = cond;
        this.trueBlock = null;
        this.falseBlock = null;
    }

    @Override
    public void print() {
        System.out.print("  br i1 ");
        cond.print();
        System.out.print(", label %");
        System.out.print(trueBlock.label.label);
        System.out.print(", label %");
        System.out.print(falseBlock.label.label);
        System.out.print("\n");
    }
}
