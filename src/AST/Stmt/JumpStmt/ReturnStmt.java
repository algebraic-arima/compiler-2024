package src.AST.Stmt.JumpStmt;

import src.AST.ASTVisitor;
import src.AST.Expr.Expr;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;
import src.utils.type.Type;

public class ReturnStmt extends Stmt {
//    public Type returnType;
    public Expr retExpr;

    public ReturnStmt(Position p) {
        super(p);
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
