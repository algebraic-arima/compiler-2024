package src.IR.IRInst;

import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Store extends Inst {

    public IRType irType;
    public Entity value;
    public Register dest;

    public Store(IRType irType, Entity value, Register dest) {
        this.irType = irType;
        this.value = value;
        this.dest = dest;
    }

    @Override
    public String str() {
        return "";
    }
}
