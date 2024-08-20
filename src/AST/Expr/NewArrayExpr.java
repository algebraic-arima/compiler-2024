package src.AST.Expr;

import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;

public class NewArrayExpr extends Expr {
    public ArrayList<Expr> len;
    public int dim;

    public NewArrayExpr(Position p) {
        super(p);
        len = new ArrayList<>();
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
