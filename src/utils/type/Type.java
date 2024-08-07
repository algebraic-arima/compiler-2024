package src.utils.type;

import java.util.ArrayList;
import java.util.HashMap;

public class Type {
    public enum T {
        INT, BOOL, STRING, VOID, CLASS, ARRAY, NULL, UNKNOWN
    }

    public T atomType;
    public String typeName;
//    public HashMap<String, Type> members;
//    store the members of a class in a universal hashmap
    public Integer dim;

    public Type() {
        atomType = T.UNKNOWN;
        typeName = null;
        dim = 0;
    }
}
