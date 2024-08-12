package src.utils.type;

import java.util.HashMap;

public class ClassType {
    public HashMap<String, Type> fields;
    public HashMap<String, FuncType> methods;

    public ClassType() {
        fields = new HashMap<>();
        methods = new HashMap<>();
    }
}