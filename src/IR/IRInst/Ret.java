package src.IR.IRInst;

import src.utils.Entity.Entity;
import src.utils.IRType.IRType;

public class Ret extends terminalInst {

    public IRType type;
    public Entity value;

    public Ret(IRType type, Entity value) {
        this.type = type;
        this.value = value;
    }

    public Ret() {
        this.type = new IRType();
        this.value = null;
    }

    @Override
    public void print() {
        if (type.typeName == null) {
            System.out.print("  ret ptr null\n");
            // in irtype, typename=null: null
            // in other cases, typename can be i32,i1,ptr and void
        } else if (type.typeName.equals("void")) {
            System.out.print("  ret void\n");
        } else {
            System.out.print("  ret ");
            type.print();
            System.out.print(" ");
            value.print();
            System.out.print("\n");
        }
    }
}
