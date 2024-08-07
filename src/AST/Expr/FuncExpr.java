package src.AST.Expr;

import java.util.ArrayList;

public class FuncExpr extends Expr {
    public String funcName;
    public ArrayList<Expr> args;

    public FuncExpr(String name) {
        funcName = name;
        args = new ArrayList<>();
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
