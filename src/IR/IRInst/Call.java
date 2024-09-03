package src.IR.IRInst;

import src.IR.IRVisitor;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;
import src.utils.type.Type;

import java.util.ArrayList;

public class Call extends IRInst {

    public IRType retType;
    public String funcName;
    public ArrayList<Entity> args;
    public ArrayList<IRType> argTypes;

    public Call(String name, Type type, Register dest) {
        args = new ArrayList<>();
        argTypes = new ArrayList<>();
        funcName = name;
        retType = new IRType(type);
        this.dest = dest;
    }

    public Call(String name, IRType type, Register dest) {
        args = new ArrayList<>();
        argTypes = new ArrayList<>();
        funcName = name;
        retType = type;
        this.dest = dest;
    }

    @Override
    public void print() {
        System.out.print("  ");
        if (dest != null && !retType.typeName.equals("void")) {
            dest.print();
            System.out.print(" = ");
        }
        System.out.print("call ");
        retType.print();
        System.out.print(" ");
        System.out.print(funcName);
        System.out.print("(");
        for (int i = 0; i < args.size(); i++) {
            if (argTypes.get(i) != null) {
                argTypes.get(i).print();
            } else {
                System.out.print("ptr");
            }
            System.out.print(" ");
            if (args.get(i) != null) {
                args.get(i).print();
            } else {
                System.out.print("null");
            }
            if (i != args.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
