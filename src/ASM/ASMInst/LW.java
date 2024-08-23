package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class LW extends ASMInst{
    public PhyReg srcAddr, dest;
    public long offset;

    public LW(String srcAddr_, long offset_, String dest_) {
        srcAddr = new PhyReg(srcAddr_);
        offset = offset_;
        dest = new PhyReg(dest_);
    }

    public void print() {
        System.out.println("  lw " + dest.toString() + " " + offset + "(" + srcAddr.toString() + ")");
    }
}
