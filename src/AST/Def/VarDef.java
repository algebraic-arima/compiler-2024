package src.AST.Def;

import src.AST.ASTVisitor;
import src.AST.Expr.Expr;
import src.utils.pos.Position;
import src.utils.type.Type;

import java.util.ArrayList;

public class VarDef extends Def{

    public Type type;
    public ArrayList<String> names;
    public ArrayList<Expr> initVals;


    public VarDef(Position p) {
        super(p);
        names = new ArrayList<>();
        initVals = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
