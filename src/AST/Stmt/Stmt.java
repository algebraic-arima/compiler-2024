package src.AST.Stmt;

import src.AST.ASTVisitor;
import src.AST.BaseASTNode;
import src.utils.pos.Position;

public abstract class Stmt extends BaseASTNode {

    public Stmt(Position p){
        super(p);
    }

    abstract public void accept(ASTVisitor v);
}