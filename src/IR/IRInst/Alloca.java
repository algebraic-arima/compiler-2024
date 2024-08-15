package src.IR.IRInst;

import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Alloca extends Inst {

    public IRType irType;
    public Register ptr;

    public Alloca(IRType irType, Register ptr) {
        this.irType = irType;
        this.ptr = ptr;
    }

    @Override
    public String str() {
        return "";
    }
}
