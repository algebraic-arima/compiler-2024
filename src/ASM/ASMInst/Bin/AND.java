package src.ASM.ASMInst.Bin;

public class AND extends BinInst{
    public AND(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  and "+ dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
