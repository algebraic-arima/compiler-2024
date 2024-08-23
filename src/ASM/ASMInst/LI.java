package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class LI extends ASMInst{
    public PhyReg rd;
    public long imm;

    public LI(String rd_, long imm_) {
        rd = new PhyReg(rd_);
        imm = imm_;
    }

    public void print() {
        System.out.println("  li " + rd.toString() + ", " + imm);
    }
}
