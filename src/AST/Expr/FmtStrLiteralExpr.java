package src.AST.Expr;

import src.AST.ASTVisitor;

import java.util.ArrayList;

public class FmtStrLiteralExpr extends Expr{
    public ArrayList<String> strs;
    public ArrayList<Expr> exprs;

    public FmtStrLiteralExpr(ArrayList<String> s, ArrayList<Expr> e) {
        strs = s;
        exprs = e;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
