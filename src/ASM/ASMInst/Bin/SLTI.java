package src.ASM.ASMInst.Bin;

public class SLTI extends BinInst {
    public SLTI(String lhs_, long rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  slti " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
