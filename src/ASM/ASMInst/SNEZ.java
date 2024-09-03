package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class SNEZ extends ASMInst {
    PhyReg rd, rs;

    public SNEZ(String rd_, String rs_) {
        rd = new PhyReg(rd_);
        rs = new PhyReg(rs_);
    }

    public void print() {
        System.out.println("  snez " + rd.toString() + ", " + rs.toString());
    }
}
