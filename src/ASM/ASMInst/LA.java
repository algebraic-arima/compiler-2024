package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class LA extends ASMInst{
    PhyReg rd;
    String fromLabel;

    public LA(String rd_, String fromLabel_) {
        rd = new PhyReg(rd_);
        fromLabel = fromLabel_;
    }

    public void print() {
        System.out.println("  la " + rd.toString() + ", " + fromLabel);
    }
}
