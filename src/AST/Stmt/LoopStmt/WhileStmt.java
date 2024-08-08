package src.AST.Stmt.LoopStmt;

import src.AST.ASTVisitor;
import src.AST.Expr.Expr;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class WhileStmt extends Stmt {
    public Expr cond;
    public Stmt body;

    public WhileStmt(Position p) {
        super(p);
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
