package src.AST.Expr;

import src.utils.type.Type;

import java.util.ArrayList;

public class NewArrayExpr extends Expr{
    public Expr size;
    public Type typeName;
    public ArrayList<Expr> initList;

    public NewArrayExpr(Expr s, Type t) {
        size = s;
        typeName = t;
        initList = new ArrayList<>();
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
