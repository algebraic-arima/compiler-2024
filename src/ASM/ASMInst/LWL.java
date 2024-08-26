package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class LWL extends ASMInst {
    public PhyReg rd;
    public String fromLabel;

    public LWL(String d, String s) {
        rd = new PhyReg(d);
        fromLabel = s;
    }

    public void print() {
        System.out.println("  lw " + rd.toString() + ", " + fromLabel);
    }
}
