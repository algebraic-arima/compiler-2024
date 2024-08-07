package src.AST;

import src.AST.*;
import src.AST.Def.*;
import src.AST.Expr.*;
import src.AST.Stmt.*;
import src.AST.Stmt.JumpStmt.*;
import src.AST.Stmt.LoopStmt.*;
import src.parser.MxBaseVisitor;
import src.parser.Mx;
import src.utils.pos.Position;

public class ASTBuider extends MxBaseVisitor<BaseASTNode> {
    @Override
    public BaseASTNode visitProg(Mx.ProgContext ctx) {
        Prog prog = new Prog(new Position(ctx));
        for (Mx.DefContext def : ctx.def()) {
            prog.defs.add((Def) visit(def));
        }
        return prog;
    }

    @Override
    public BaseASTNode visitDef(Mx.DefContext ctx) {
        if (ctx.funcdef() != null) {
            return visitFuncdef(ctx.funcdef());
        } else if (ctx.classdef() != null) {
            return visitClassdef(ctx.classdef());
        } else {
            return visitVardef(ctx.vardef());
        }
    }

    @Override
    public BaseASTNode visitFuncdef(Mx.FuncdefContext ctx) {
        FuncDef funcDef = new FuncDef(new Position(ctx));

        return funcDef;
    }
}
