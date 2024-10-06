package src.ASM.ASMInst;

import src.ASM.Operand.Reg;

public class BNEZ extends ASMInst{
    public Reg rs;
    public String label;

    public BNEZ(String rs_, String label_) {
        rs = Reg.get(rs_);
        label = label_;
    }

    public void print() {
        System.out.println("  bnez " + rs.toString() + ", " + label);
    }
}
