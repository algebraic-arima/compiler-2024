package src.AST.Stmt;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;

public class PolyStmt extends Stmt {
    public ArrayList<Stmt> stmts;

    public PolyStmt(Position p){
        super(p);
        stmts = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
