package src.ASM.ASMInst.Bin;

public class SRA extends BinInst{
    public SRA(String dest_, String lhs_, String rhs_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  sra " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
