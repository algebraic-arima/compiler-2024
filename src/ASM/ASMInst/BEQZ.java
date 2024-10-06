package src.ASM.ASMInst;

import src.ASM.Operand.Reg;

public class BEQZ extends ASMInst {
    public Reg rs;
    public String label;

    public BEQZ(String rs_, String label_) {
        rs = Reg.get(rs_);
        label = label_.replace("-", "_");
    }

    public void print() {
        System.out.println("  beqz " + rs.toString() + ", " + label);
    }
}
