package src.AST.Expr;

import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;

public class RowExpr extends Expr {
    public ArrayList<Expr> exps;

    public RowExpr(Position p) {
        super(p);
        exps = new ArrayList<>();
    }

    public int size() {
        return exps.size();
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public <T> T accept(ASTVisitor<T> v) {
        return v.visit(this);
    }
}
