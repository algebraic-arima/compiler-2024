package src.utils.Entity;

public class Constant extends Entity {
    public long value;

    @Override
    public void print() {
        System.out.print(value);
    }

    public Constant(long d) {
        super();
        value = d;
    }
}
