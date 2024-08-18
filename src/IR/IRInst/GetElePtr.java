package src.IR.IRInst;

import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class GetElePtr extends Inst {

    public IRType ptrType, destType;
    public Register ptr;
    public Register dest;
    public int offset, fieldInd;


    @Override
    public void print() {

    }
}
