package src.AST.Expr;

import org.antlr.v4.runtime.tree.TerminalNode;
import src.utils.pos.Position;

public class StringLiteralExpr extends Expr {
    public String value;

    public StringLiteralExpr(Position p, String v) {
        super(p);
        value = v;
    }

    public StringLiteralExpr(TerminalNode node){
        value = node.getText();
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
