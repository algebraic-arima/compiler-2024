package src.utils.type;

import java.util.LinkedHashMap;

public class FuncType {
    public Type retType;
    public LinkedHashMap<String, Type> args;

    public FuncType(Type returnType) {
        this.retType = returnType;
        args = new LinkedHashMap<>();
    }
}