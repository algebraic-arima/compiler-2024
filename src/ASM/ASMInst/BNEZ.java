package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class BNEZ extends ASMInst{
    public PhyReg rs;
    public String label;

    public BNEZ(String rs_, String label_) {
        rs = new PhyReg(rs_);
        label = label_;
    }

    public void print() {
        System.out.println("  bnez " + rs.toString() + ", " + label);
    }
}
