package src.utils.Scope;

import src.utils.error.MultipleDefinitions;
import src.utils.pos.Position;
import src.utils.type.ClassType;
import src.utils.type.FuncType;
import src.utils.type.Type;

import java.util.HashMap;

public class GlobalScope extends Scope {


    public HashMap<String, ClassType> ClassList;

    GlobalScope() {
        super();
        ClassList = new HashMap<>();
    }

    public void addClass(String name, ClassType t, Position p) {
        if (ClassList.containsKey(name)) {
            throw new MultipleDefinitions(p);
        }
        ClassList.put(name, t);
    }

    public ClassType getClass(String name) {
        if (ClassList.containsKey(name)) return ClassList.get(name);
        return null;
    }
}
