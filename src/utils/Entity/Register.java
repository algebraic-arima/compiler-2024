package src.utils.Entity;

import src.utils.type.Type;

public class Register extends Entity {

    public String name = null;

    public Register() {
        super();
    }

    public Register(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print(name);
    }

    public Register(Type type, String name) {
        super(type);
        this.name = name;
    }


}
