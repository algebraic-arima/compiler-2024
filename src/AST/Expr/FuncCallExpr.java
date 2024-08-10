package src.AST.Expr;

import src.utils.pos.Position;

public class FuncCallExpr extends Expr {
    public String funcName;
    public RowExpr args;

    public FuncCallExpr(Position p, String name) {
        super(p);
        funcName = name;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
