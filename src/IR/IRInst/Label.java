package src.IR.IRInst;

import src.IR.IRVisitor;

public class Label extends IRInst {

    public String label;

    public Label(String label) {
        this.label = label;
    }

    @Override
    public void print() {
        System.out.print(label + "\n");
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
