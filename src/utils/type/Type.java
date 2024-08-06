package src.utils.type;

import java.util.ArrayList;
import java.util.HashMap;

public class Type {
    public enum T {
        INT, BOOL, STRING, VOID, CLASS, ARRAY, FUNCTION, NULL, UNKNOWN
    }

    public T atomType;
    public String typeName;
    public HashMap<String, Type> members;
    public ArrayList<Integer> dim;

    public Type() {
        atomType = T.UNKNOWN;
        typeName = null;
        members = null;
        dim = new ArrayList<>();
    }
}
