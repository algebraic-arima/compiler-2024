package src.IR.IRInst;

import src.IR.IRVisitor;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Alloca extends IRInst {

    public IRType irType;

    public Alloca(IRType irType, Register dest) {
        this.irType = irType;
        this.dest = dest;
    }

    @Override
    public void print() {
        System.out.print("  " + dest.name + " = alloca ");
        irType.print();
        System.out.print("\n");
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
