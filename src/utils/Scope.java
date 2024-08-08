package src.utils;

import src.utils.type.Type;

import java.util.HashMap;

public class Scope {
    public HashMap<String, Type> varMap;
    public HashMap<String, Type> funcMap;
    public Scope parent;

    public Scope() {
        parent = null;
    }

    public Scope(Scope p) {
        parent = p;
    }
}
