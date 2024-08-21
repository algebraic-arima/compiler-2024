package src.utils.Entity;

import src.utils.IRType.IRType;

public class Constant extends Entity {
    public long value;

    @Override
    public void print() {
        System.out.print(value);
    }

    public Constant(long d) {
        super();
        value = d;
        type = new IRType("int");
    }
}
