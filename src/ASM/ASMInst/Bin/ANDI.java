package src.ASM.ASMInst.Bin;

public class ANDI extends BinInst {
    public ANDI(String lhs_, long rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  andi " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
