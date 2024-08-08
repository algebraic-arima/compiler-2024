package src.utils.Scope;

import src.utils.error.MultipleDefinitions;
import src.utils.pos.Position;
import src.utils.type.ClassType;
import src.utils.type.FuncType;
import src.utils.type.Type;

import java.util.HashMap;

public class Scope {
    public HashMap<String, Type> VarList;
    public HashMap<String, FuncType> FuncList;


    public Scope parent;

    public Scope() {
        parent = null;
        VarList = new HashMap<>();
        FuncList = new HashMap<>();

    }

    public Scope(Scope p) {
        parent = p;
        VarList = new HashMap<>();
    }

    public void addVar(String name, Type t, Position p) {
        if (VarList.containsKey(name)) {
            throw new MultipleDefinitions(p);
        }
        VarList.put(name, t);
    }

    public Type getVar(String name) {
        if (VarList.containsKey(name)) return VarList.get(name);
        if (parent != null) return parent.getVar(name);
        return null;
    }

    public void addFunc(String name, FuncType t, Position p) {
        if (FuncList.containsKey(name)) {
            throw new MultipleDefinitions(p);
        }
        FuncList.put(name, t);
    }

    public FuncType getFunc(String name) {
        if (FuncList.containsKey(name)) return FuncList.get(name);
        return null;
    }
}
