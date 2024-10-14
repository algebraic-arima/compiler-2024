package src.IR.IRInst;

import src.IR.IRVisitor;
import src.utils.Entity.Constant;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class GetElePtr extends IRInst {

    public IRType ptrType, destType;
    public Register ptr;
    public Entity offset;
    public int fieldInd;

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    public GetElePtr(String ptrType, String destType, Register ptr, Register dest, int offset, int fieldInd) {
        if (ptrType.equals("bool")) {
            this.ptrType = new IRType("int");
        } else {
            this.ptrType = new IRType(ptrType);
        }
        this.ptr = ptr;
        this.offset = new Constant(offset);
        this.fieldInd = fieldInd;
        this.destType = new IRType(destType);
        this.dest = dest;
    }

    public GetElePtr(String ptrType, String destType, Register ptr, Register dest, Entity offset, int fieldInd) {
        if (ptrType.equals("bool")) {
            this.ptrType = new IRType("int");
        } else {
            this.ptrType = new IRType(ptrType);
        }
        this.ptr = ptr;
        this.offset = offset;
        this.fieldInd = fieldInd;
        this.destType = new IRType(destType);
        this.dest = dest;
    }


    @Override
    public void print() {
        System.out.print("  ");
        dest.print();
        System.out.print(" = getelementptr ");
        ptrType.print();
        System.out.print(", ptr ");
        if (ptr != null) {
            ptr.print();
        } else {
            System.out.print("null");
        }
        System.out.print(", i32 ");
        offset.print();
        if (fieldInd != -1) {
            System.out.print(", i32 ");
            System.out.print(fieldInd);
        }
        System.out.print("\n");
    }
}
