package src.ASM.ASMInst.Bin;

public class SLT extends BinInst{
    public SLT(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  slt " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
