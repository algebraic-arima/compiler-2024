package src.IR;


import src.IR.IRDef.*;

import java.util.ArrayList;

public class IRProg{
    public ArrayList<IRClassDef> classDefs=new ArrayList<>();
    public ArrayList<IRGlobalVarDef> gVarDefs=new ArrayList<>();
    public ArrayList<IRFuncDecl> funcDecls=new ArrayList<>();
    public ArrayList<IRFuncDef> funcDefs=new ArrayList<>();
    public IRStrDef strDef=new IRStrDef();

    public void addClassDef(IRClassDef classDef){
        classDefs.add(classDef);
    }

    public void addGVarDef(IRGlobalVarDef gVarDef){
        gVarDefs.add(gVarDef);
    }

    public void addFuncDecl(IRFuncDecl funcDecl){
        funcDecls.add(funcDecl);
    }

    public void addFuncDef(IRFuncDef funcDef){
        funcDefs.add(funcDef);
    }

    public void addStrDef(IRStrDef strDef){
        this.strDef=strDef;
    }

    public String str() {
        return "";
    }
}
