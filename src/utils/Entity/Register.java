package src.utils.Entity;

import src.ASM.Operand.PhyReg;
import src.IR.IRBuilder;
import src.utils.IRType.IRType;
import src.utils.type.Type;

public class Register extends Entity {

    public String name = null;
    public PhyReg phyReg = null;

    public Register() {
        super();
    }

    public Register(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print(name);
    }

    public Register(Type type, String name) {
        super(new IRType(type));
        this.name = name;
    }

    public Register(IRType type, String name) {
        super(type);
        this.name = name;
    }

    public String getName() {
            return name;
    }

}
