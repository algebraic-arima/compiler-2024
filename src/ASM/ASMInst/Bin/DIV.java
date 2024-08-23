package src.ASM.ASMInst.Bin;

public class DIV extends BinInst{
    public DIV(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  div " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
