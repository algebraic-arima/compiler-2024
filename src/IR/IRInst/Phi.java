package src.IR.IRInst;

import org.antlr.v4.runtime.misc.Pair;
import src.IR.IRDef.IRBlock;
import src.IR.IRVisitor;
import src.utils.Entity.*;
import src.utils.IRType.IRType;
import src.utils.type.Type;

import java.util.ArrayList;
import java.util.HashSet;

public class Phi extends IRInst {

    public IRType irType;
    public ArrayList<Pair<Entity, IRBlock>> valList;

    public Phi(Register dest, Type type) {
        this.dest = dest;
        this.irType = new IRType(type);
        valList = new ArrayList<>();
    }

    public Phi(Register dest, IRType type) {
        this.dest = dest;
        this.irType = type;
        valList = new ArrayList<>();
    }

    public void addList(Entity val, IRBlock label) {
        valList.add(new Pair<>(val, label));
    }

    @Override
    public void accept(IRVisitor visitor) {
    }

    @Override
    public void print() {
        System.out.print("  ");
        dest.print();
        System.out.print(" = phi ");
        irType.print();
        for (int i = 0; i < valList.size(); ++i) {
            System.out.print(" [");
            valList.get(i).a.print();
            System.out.print(", ");
            System.out.print("%" + valList.get(i).b.label);
            System.out.print("]");
            if (i != valList.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.print("\n");
    }

    @Override
    public HashSet<String> getUse() {
        HashSet<String> d = new HashSet<>();
        for (var e : valList) {
            if (e.a instanceof Register r) {
                d.add(r.name);
            }
        }
        return d;
    }

    @Override
    public String getDef() {
        return dest.name;
    }
}
