package src.ASM.ASMInst;

import src.ASM.Operand.PhyReg;

public class SW extends ASMInst {
    public PhyReg srcAddr, dest;
    public long offset;

    public SW(String srcAddr_, long offset_, String dest_) {
        srcAddr = new PhyReg(srcAddr_);
        offset = offset_;
        dest = new PhyReg(dest_);
    }

    public void print() {
        System.out.println("  sw " + dest.toString() + " " + offset + "(" + srcAddr.toString() + ")");
    }
}
