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

}
