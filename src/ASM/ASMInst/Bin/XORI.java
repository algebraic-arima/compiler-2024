package src.ASM.ASMInst.Bin;

public class XORI extends BinInst {
    public XORI(String lhs_, long rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  xori " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
