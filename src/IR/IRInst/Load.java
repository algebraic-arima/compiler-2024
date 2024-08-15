package src.IR.IRInst;

import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Load extends Inst {

    public IRType irType;
    public Register src, dest;

    public Load(IRType irType, Register src, Register dest) {
        this.irType = irType;
        this.src = src;
        this.dest = dest;
    }

    @Override
    public String str() {
        return "";
    }
}
