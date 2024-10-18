package src.IR.IRInst;

import src.IR.IRDef.IRBlock;
import src.IR.IRVisitor;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;

import java.util.HashSet;

public class Br extends terminalIRInst {

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
        System.out.print(trueBlock.label);
        System.out.print(", label %");
        System.out.print(falseBlock.label);
        System.out.print("\n");
    }

    @Override
    public HashSet<String> getUse() {
        HashSet<String> d = new HashSet<>();
        if (cond instanceof Register r) {
            d.add(r.name);
        }
        return d;
    }

    @Override
    public String getDef() {
        return null;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
