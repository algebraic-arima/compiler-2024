package src.IR.IRInst;

public class Br extends terminalInst {

    public String label;

    public Br(String label) {
        this.label = label;
    }

    @Override
    public String str() {
        return "";
    }
}
