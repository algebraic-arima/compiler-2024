package src.ASM.ASMInst.Bin;

public class ORI extends BinInst {
    public ORI(String lhs_, long rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  ori " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
