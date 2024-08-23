package src.ASM.ASMInst.Bin;

public class SUB extends BinInst{
    public SUB(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  sub " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
