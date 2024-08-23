package src.ASM.ASMInst.Bin;

public class SRAI extends BinInst {
    public SRAI(String lhs_, long rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  srai " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
