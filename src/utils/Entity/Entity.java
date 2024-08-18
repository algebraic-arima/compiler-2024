package src.utils.Entity;

import src.utils.IRType.IRType;
import src.utils.type.Type;

abstract public class Entity {
    public IRType type;

    public Entity(){
        this.type = new IRType();
    }

    public Entity(Type type) {
        this.type = new IRType(type);
    }

    abstract public void print();
}
