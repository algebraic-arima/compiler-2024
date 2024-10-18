package src.IR.IRInst;

import src.IR.IRVisitor;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

import java.util.HashSet;

public class Load extends IRInst {

    public IRType irType;
    public Register src;

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

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

    @Override
    public HashSet<String> getUse() {
        HashSet<String> d = new HashSet<>();
        d.add(src.name);
        return d;
    }

    @Override
    public String getDef() {
        return dest.name;
    }
}
