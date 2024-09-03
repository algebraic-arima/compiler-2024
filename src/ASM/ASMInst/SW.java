package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class SW extends ASMInst {
    public PhyReg rs2, rs1;
    public long offset;

    public SW(String src_, long offset_, String destAddr_) {
        rs2 = new PhyReg(src_);
        offset = offset_;
        rs1 = new PhyReg(destAddr_);
    }

    public void print() {
        System.out.println("  sw " + rs2.toString() + ", " + offset + "(" + rs1.toString() + ")");
    }
}
