package src.IR.IRInst;

public class Jmp extends terminalInst {
    // unconditional branch

    public String label;

    public Jmp(String label) {
        this.label = label;
    }

    @Override
    public String str() {
        return "";
    }
}
