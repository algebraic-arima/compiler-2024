package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class MV extends ASMInst {
    public PhyReg dest;
    public PhyReg src;

    public MV(String dest_, String src_) {
        dest = new PhyReg(dest_);
        src = new PhyReg(src_);
    }

    public void print() {
        System.out.println("  mv " + dest.toString() + ", " + src.toString());
    }
}
