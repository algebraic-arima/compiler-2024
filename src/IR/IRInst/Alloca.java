package src.IR.IRInst;

import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Alloca extends Inst {

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
}
