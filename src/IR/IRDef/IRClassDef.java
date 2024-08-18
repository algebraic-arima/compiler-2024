package src.IR.IRDef;

import src.AST.Def.VarDef;

import java.util.ArrayList;

public class IRClassDef extends IRDef {

    public String className;
    public int fieldNum;
    public ArrayList<VarDef> fields;

    public IRClassDef (String className){
        this.className = "%class-" + className;
        this.fieldNum = 0;
        this.fields = new ArrayList<>();
    }

    public IRClassDef(String className, ArrayList<VarDef> fields) {
        this.className = "%class-" + className;
        this.fieldNum = fields.size();
        this.fields = fields;
    }


    @Override
    void print() {

    }
}
