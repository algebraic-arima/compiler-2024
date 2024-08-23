package src.ASM.ASMInst.Bin;

public class MOD extends BinInst {
    public MOD(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  rem "+ dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
