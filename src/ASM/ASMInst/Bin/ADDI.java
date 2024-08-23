package src.ASM.ASMInst.Bin;

public class ADDI extends BinInst {
    public ADDI(String lhs_, long rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  addi "+ dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
