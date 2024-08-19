package src.IR.IRInst;

import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class GetElePtr extends Inst {

    public IRType ptrType, destType;
    public Register ptr;
    public int offset, fieldInd;

    public GetElePtr(String ptrType, String destType, Register ptr, Register dest, int offset, int fieldInd) {
        this.ptrType = new IRType(ptrType);
        this.ptr = ptr;
        this.offset = offset;
        this.fieldInd = fieldInd;
        this.destType = new IRType(destType);
        this.dest = dest;
    }

    public GetElePtr() {
        this.ptrType = new IRType();
        this.ptr = new Register();
        this.offset = 0;
        this.fieldInd = 0;
        this.destType = new IRType();
    }


    @Override
    public void print() {
        System.out.print("  ");
        dest.print();
        System.out.print(" = getelementptr ");
        ptrType.print();
        System.out.print(", ptr ");
        ptr.print();
        System.out.print(", i32 ");
        System.out.print(offset);
        System.out.print(", i32 ");
        System.out.println(fieldInd);
    }
}
