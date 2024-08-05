package src.AST;

import src.utils.Position;
import src.utils.Scope;

public abstract class BaseASTNode {
    public position pos;
    public Scope scope;

    abstract public void accept(ASTVisitor v);
}