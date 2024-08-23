package src.ASM.ASMInst.Bin;

public class XOR extends BinInst{
    public XOR(String lhs_, String rhs_, String dest_) {
        super(lhs_, rhs_, dest_);
    }

    public void print() {
        System.out.println("  xor " + dest.toString() + " " + lhs.toString() + " " + rhs.toString());
    }
}
