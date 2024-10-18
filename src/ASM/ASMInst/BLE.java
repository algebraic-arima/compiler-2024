package src.ASM.ASMInst;

import src.ASM.Operand.Reg;

public class BLE extends ASMInst {
    public Reg rs1, rs2;
    public String label;

    public BLE(String rs1_, String rs2_, String label_) {
        rs1 = Reg.get(rs1_);
        rs2 = Reg.get(rs2_);
        label = label_.replace("-", "_");
    }

    public void print() {
        System.out.println("  bge " + rs2.toString() + ", " + rs1.toString() + ", " + label);
    }
}
