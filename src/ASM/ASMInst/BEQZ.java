package src.ASM.ASMInst;

import src.ASM.ASMNode;
import src.ASM.Operand.PhyReg;

public class BEQZ extends ASMInst {
    public PhyReg rs;
    public String label;

    public BEQZ(String rs_, String label_) {
        rs = new PhyReg(rs_);
        label = label_;
    }

    public void print() {
        System.out.println("  beqz " + rs.toString() + ", " + label);
    }
}
