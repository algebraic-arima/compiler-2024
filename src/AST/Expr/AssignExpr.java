package src.AST.Expr;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

public class AssignExpr extends Expr {
    public Expr var;
    public Expr value;

    public AssignExpr(Position p, Expr v, Expr va) {
        super(p);
        var = v;
        value = va;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
