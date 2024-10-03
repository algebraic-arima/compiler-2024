package src.utils.Entity;

import src.utils.IRType.IRType;

public class Constant extends Entity {
    public long value;

    public String getName() {
        return null;
    }

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
        type = typeI32;
    }

    public Constant(long d, boolean isBool) {
        super();
        value = d;
        type = typeI1;
    }

    public Constant(boolean isNull) {
        super();
        value = 0;
        type = typePtr;
    }
}
