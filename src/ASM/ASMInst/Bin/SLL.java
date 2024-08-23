package src.ASM.ASMInst.Bin;

public class SLL extends BinInst{
    public SLL(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  sll " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
