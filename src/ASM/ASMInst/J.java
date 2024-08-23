package src.ASM.ASMInst;

public class J extends ASMInst {
    public String toLabel;

    public J(String toLabel_) {
        toLabel = toLabel_;
    }

    public void print() {
        System.out.println("  j " + toLabel);
    }
}
