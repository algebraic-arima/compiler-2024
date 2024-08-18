package src.IR.IRInst;

public class Label extends Inst {

    public String label;

    public Label(String label) {
        this.label = label;
    }

    @Override
    public void print() {
        System.out.print(label + "\n");
    }
}
