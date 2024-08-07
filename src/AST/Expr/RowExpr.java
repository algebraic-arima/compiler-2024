package src.AST.Expr;

import src.utils.pos.Position;

import java.util.ArrayList;

public class RowExpr extends Expr {
    public ArrayList<Expr> exps;

    public RowExpr(Position p) {
        super(p);
        exps = new ArrayList<>();
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
