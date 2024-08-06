package src.AST.Stmt.LoopStmt;

import src.AST.ASTVisitor;
import src.AST.Expr.Expr;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class ForStmt extends Stmt {

    Expr init, cond, update;
    Stmt body;

    public ForStmt(Position p, Expr i, Expr c, Expr u, Stmt b) {
        super(p);
        init = i;
        cond = c;
        update = u;
        body = b;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
