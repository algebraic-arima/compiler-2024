package src.utils.Entity;

import src.utils.IRType.IRType;

public class Constant extends Entity {
    public long value;

    @Override
    public void print() {
        if (type.typeName.equals("ptr")) {
            System.out.print("null");
        } else {
            System.out.print(value);
        }
    }

    public Constant(long d) {
        super();
        value = d;
        type = new IRType("int");
    }

    public Constant(boolean isNull) {
        super();
        value = 0;
        type = new IRType("ptr");
    }
}
