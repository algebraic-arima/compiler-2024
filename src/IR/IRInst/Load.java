package src.IR.IRInst;

import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Load extends Inst {

    public IRType irType;
    public Register src, dest;

    public Load(IRType irType, Register src, Register dest) {
        this.irType = irType;
        this.src = src;
        this.dest = dest;
    }

    @Override
    public void print() {
        System.out.print("  ");
        dest.print();
        System.out.print(" = load ");
        irType.print();
        System.out.print(", ptr ");
        src.print();
        System.out.print("\n");
    }
}
