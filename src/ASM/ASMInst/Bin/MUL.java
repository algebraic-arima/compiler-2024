package src.ASM.ASMInst.Bin;

public class MUL extends BinInst {
    public MUL(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  mul " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
