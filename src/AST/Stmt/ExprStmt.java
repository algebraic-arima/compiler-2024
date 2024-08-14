package src.AST.Stmt;

import src.AST.__ASTVisitor;
import src.AST.Expr.Expr;
import src.utils.pos.Position;

public class ExprStmt extends Stmt {
    public Expr expr;

    public ExprStmt(Position p, Expr e) {
        super(p);
        expr = e;
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
