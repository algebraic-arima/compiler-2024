package src.AST.Def;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;


public class ClassDef extends Def {
    public String className;
    public Constructor constructor;
    public ArrayList<VarDef> classMem;
    public ArrayList<FuncDef> classFunc;

    public ClassDef(Position p) {
        super(p);
        classMem = new ArrayList<>();
        classFunc = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}