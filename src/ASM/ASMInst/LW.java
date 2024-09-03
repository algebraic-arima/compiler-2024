package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class LW extends ASMInst {
    public PhyReg rd, rs1;
    public long offset;

    public LW(String d, long offset_, String s) {
        rd = new PhyReg(d);
        offset = offset_;
        rs1 = new PhyReg(s);
    }

    public void print() {
        System.out.println("  lw " + rd.toString() + ", " + offset + "(" + rs1.toString() + ")");
    }
}
