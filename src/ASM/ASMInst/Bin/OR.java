package src.ASM.ASMInst.Bin;

public class OR extends BinInst {
    public OR(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  or " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
