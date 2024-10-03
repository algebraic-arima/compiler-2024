package src.IR.IRInst;

import src.IR.IRVisitor;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Select extends IRInst {

    public Entity cond;
    public IRType type;
    public Entity trueVal, falseVal;

    public Select(Entity cond, IRType type, Entity trueVal, Entity falseVal, Register dest) {
        this.cond = cond;
        this.type = type;
        this.trueVal = trueVal;
        this.falseVal = falseVal;
        this.dest = dest;
    }

    @Override
    public void print() {
        System.out.print("  ");
        dest.print();
        System.out.print(" = select i1 ");
        cond.print();
        System.out.print(", ");
        type.print();
        System.out.print(" ");
        trueVal.print();
        System.out.print(", ");
        type.print();
        System.out.print(" ");
        falseVal.print();
        System.out.print("\n");
    }

    @Override
    public void accept(IRVisitor visitor) {

    }
}
