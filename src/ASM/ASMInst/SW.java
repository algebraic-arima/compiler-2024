package src.ASM.ASMInst;

import src.ASM.Operand.Reg;

public class SW extends ASMInst {
    public Reg rs2, rs1;
    public long offset;

    public SW(String src_, long offset_, String destAddr_) {
        rs2 = Reg.get(src_);
        offset = offset_;
        rs1 = Reg.get(destAddr_);
    }

    public void print() {
        System.out.println("  sw " + rs2.toString() + ", " + offset + "(" + rs1.toString() + ")");
    }
}
