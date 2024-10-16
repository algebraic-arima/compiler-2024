package src.IR.IRInst;

import src.IR.IRVisitor;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

import java.util.HashSet;

public class Store extends IRInst {

    public IRType irType;
    public Entity value;
    // dest: ptr to the destination memory

    public Store(IRType irType, Entity value, Register dest) {
        this.irType = irType;
        this.value = value;
        this.dest = dest;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void print() {
        System.out.print("  store ");
        irType.print();
        System.out.print(" ");
        if (value == null) {
            System.out.print("null");
        } else {
            value.print();
        }
        System.out.print(", ptr ");
        dest.print();
        System.out.print("\n");
    }

    @Override
    public HashSet<String> getUse() {
        HashSet<String> d = new HashSet<>();
        if (value instanceof Register r) {
            d.add(r.name);
        }
        d.add(dest.name);
        return d;
    }

    @Override
    public String getDef() {
        return null;
    }


}
