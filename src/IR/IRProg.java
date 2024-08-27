package src.IR;


import src.IR.IRDef.*;

import java.util.ArrayList;

public class IRProg {
    public ArrayList<IRClassDef> classDefs = new ArrayList<>();
    public ArrayList<IRGlobalVarDef> gVarDefs = new ArrayList<>();
    public ArrayList<IRFuncDef> funcDefs = new ArrayList<>();
    public IRStrDef strDef = new IRStrDef();

    public void addClassDef(IRClassDef classDef) {
        classDefs.add(classDef);
    }

    public void addGVarDef(IRGlobalVarDef gVarDef) {
        gVarDefs.add(gVarDef);
    }

    public void addFuncDef(IRFuncDef funcDef) {
        funcDefs.add(funcDef);
    }

    public void print(boolean p) {
        if (p) classDefs.forEach(e -> e.print(true));
        strDef.print(p);
        if (p) gVarDefs.forEach(e -> e.print(true));
        funcDefs.forEach(e -> e.print(p));
    }
}
