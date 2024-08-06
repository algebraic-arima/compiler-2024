package src.AST.Stmt;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;

public class PolyStmt extends Stmt {
    ArrayList<Stmt> stmts;

    PolyStmt(Position p){
        super(p);
        stmts = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
