package src.AST.Def;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;


public class ClassDef extends Def {
    public String className;
    public ArrayList<Def> classBody;

    public ClassDef(Position p) {
        super(p);
        classBody = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}