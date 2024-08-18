package src.IR.IRInst;

import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Alloca extends Inst {

    public IRType irType;
    public Register ptr;

    public Alloca(IRType irType, Register ptr) {
        this.irType = irType;
        this.ptr = ptr;
    }

    @Override
    public void print() {
        System.out.print("  "+ptr.name+" = alloca ");
        irType.print();
        System.out.print("\n");
    }
}
