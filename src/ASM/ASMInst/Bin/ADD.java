package src.ASM.ASMInst.Bin;

public class ADD extends BinInst {
    public ADD(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  add " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }

}
