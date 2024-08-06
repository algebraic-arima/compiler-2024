package src.AST.Stmt.LoopStmt;

import src.AST.ASTVisitor;
import src.AST.Expr.Expr;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class WhileStmt extends Stmt {

    Expr cond;
    Stmt body;

    public WhileStmt(Position p, Expr c, Stmt y) {
        super(p);
        cond = c;
        body = y;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
