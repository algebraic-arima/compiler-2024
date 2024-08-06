package src.AST.Stmt;

import src.AST.ASTVisitor;
import src.AST.Def.VarDef;
import src.utils.pos.Position;

public class DefStmt extends Stmt{

    VarDef varDef;

    public DefStmt(Position p, VarDef v){
        super(p);
        varDef = v;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
