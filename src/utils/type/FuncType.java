package src.utils.type;

import java.util.HashMap;

public class FuncType {
    public Type returnType;
    public HashMap<String, Type> args;

    public FuncType(Type returnType) {
        this.returnType = returnType;
        args = new HashMap<>();
    }
}