package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class SEQZ extends ASMInst{

    public PhyReg rd, rs;

    public SEQZ(String rd_, String rs_) {
        rd = new PhyReg(rd_);
        rs = new PhyReg(rs_);
    }

    public void print() {
        System.out.println("  seqz " + rd.toString() + ", " + rs.toString());
    }
}
