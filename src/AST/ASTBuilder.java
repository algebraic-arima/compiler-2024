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
import src.utils.type.Type;

import src.utils.error.*;

import java.util.Objects;

public class ASTBuilder extends MxBaseVisitor<BaseASTNode> {
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
        funcDef.funcType = new Type(ctx.type(0));
        funcDef.funcName = ctx.ID(0).getText();
        for (int i = 1; i < ctx.ID().size(); i++) {
            funcDef.funcParams.put(ctx.ID(i).getText(), new Type(ctx.type(i)));
        }
        return funcDef;
    }

    @Override
    public BaseASTNode visitConstructor(Mx.ConstructorContext ctx) {
        Constructor constructor = new Constructor(new Position(ctx));
        constructor.className = ctx.ID().getText();
        constructor.funcBody = (PolyStmt) visit(ctx.stmts());
        return constructor;
    }

    @Override
    public BaseASTNode visitStmts(Mx.StmtsContext ctx) {
        PolyStmt polyStmt = new PolyStmt(new Position(ctx));
        for (Mx.StmtContext stmt : ctx.stmt()) {
            polyStmt.stmts.add((Stmt) visit(stmt));
        }
        return polyStmt;
    }

    @Override
    public BaseASTNode visitClassdef(Mx.ClassdefContext ctx) {
        ClassDef classDef = new ClassDef(new Position(ctx));
        classDef.className = ctx.ID().getText();
        classDef.constructor = (Constructor) visit(ctx.constructor());
        for (Mx.VardefContext tc : ctx.vardef()) {
            classDef.classMem.add((VarDef) visit(tc));
        }
        for (Mx.FuncdefContext fuck : ctx.funcdef()) {
            classDef.classFunc.add((FuncDef) visit(fuck));
        }
        return classDef;
    }

    @Override
    public BaseASTNode visitVardef(Mx.VardefContext ctx) {
        VarDef varDef = new VarDef(new Position(ctx));
        varDef.type = new Type(ctx.type());
        for (Mx.SinglevardefContext sv : ctx.singlevardef()) {
            varDef.initVals.put(sv.getText(), (Expr) visit(sv.expr()));
        }
        return varDef;
    }

    @Override
    public BaseASTNode visitIfStmt(Mx.IfStmtContext jumping) {
        IfStmt is = new IfStmt(new Position(jumping));
        is.condition = (Expr) visit(jumping.expr());
        is.trueStmt = (Stmt) visit(jumping.stmt(0));
        is.falseStmt = (Stmt) visit(jumping.stmt(1));
        return is;
    }

    @Override
    public BaseASTNode visitBreakStmt(Mx.BreakStmtContext ctx) {
        return new BreakStmt(new Position(ctx));
    }

    @Override
    public BaseASTNode visitContinueStmt(Mx.ContinueStmtContext ctx) {
        return new ContinueStmt(new Position(ctx));
    }

    @Override
    public BaseASTNode visitReturnStmt(Mx.ReturnStmtContext ctx) {
        ReturnStmt rs = new ReturnStmt(new Position(ctx));
        if (ctx.expr() != null) rs.retExpr = (Expr) visit(ctx.expr());
        return rs;
    }

    @Override
    public BaseASTNode visitForStmt(Mx.ForStmtContext ctx) {
        ForStmt fs = new ForStmt(new Position(ctx));
        fs.init = (RowExpr) visit(ctx.expr(0));
        fs.cond = (RowExpr) visit(ctx.expr(1));
        fs.update = (RowExpr) visit(ctx.expr(2));
        fs.body = (Stmt) visit(ctx.stmt());
        return fs;
    }

    @Override
    public BaseASTNode visitWhileStmt(Mx.WhileStmtContext ctx) {
        WhileStmt ws = new WhileStmt(new Position(ctx));
        ws.cond = (Expr) visit(ctx.expr());
        ws.body = (Stmt) visit(ctx.stmt());
        return ws;
    }

    @Override
    public BaseASTNode visitStmt(Mx.StmtContext ctx) {
        return visit(ctx.getChild(0));
    }

    ///expr
    @Override
    public BaseASTNode visitParentheses(Mx.ParenthesesContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public BaseASTNode visitMemberFuncCall(Mx.MemberFuncCallContext ctx) {
        MemberFuncCallExpr mfce = new MemberFuncCallExpr(new Position(ctx),
                (Expr) visit(ctx.expr()),
                ctx.ID().getText());
        mfce.args = (RowExpr) visit(ctx.rowexpr());
        return mfce;
    }

    @Override
    public BaseASTNode visitMemberObjAccess(Mx.MemberObjAccessContext ctx) {
        return new MemberObjAccessExpr(new Position(ctx),
                (Expr) visit(ctx.expr()),
                ctx.ID().getText());
    }

    @Override
    public BaseASTNode visitArrayAccess(Mx.ArrayAccessContext ctx) {
        return new ArrayAccessExpr(new Position(ctx),
                (Expr) visit(ctx.expr(0)),
                (Expr) visit(ctx.expr(1)));
    }

    @Override
    public BaseASTNode visitFuncCall(Mx.FuncCallContext ctx) {
        FuncCallExpr fc = new FuncCallExpr(new Position(ctx),
                ctx.ID().getText());
        fc.args = (RowExpr) visit(ctx.rowexpr());
        return fc;
    }

    @Override
    public BaseASTNode visitRUnaryExp(Mx.RUnaryExpContext ctx) {
        return new UnaryArithExpr(new Position(ctx),
                (Expr) visit(ctx.expr()), ctx.op.getText(), false);
    }

    @Override
    public BaseASTNode visitLUnaryExp(Mx.LUnaryExpContext ctx) {
        String op = ctx.op.getText();
        return switch (op) {
            case "++", "--", "~", "-" -> new UnaryArithExpr(new Position(ctx),
                    (Expr) visit(ctx.expr()), op, true);
            case "!" -> new UnaryLogicExpr(new Position(ctx),
                    (Expr) visit(ctx.expr()));
            default -> null;
        };
    }

    @Override
    public BaseASTNode visitBinaryExp(Mx.BinaryExpContext ctx) {
        String op = ctx.op.getText();
        return switch (op) {
            case "+", "-", "*", "/", "%", "<<", ">>", "&", "|", "^" -> new BinaryArithExpr(new Position(ctx),
                    (Expr) visit(ctx.expr(0)),
                    (Expr) visit(ctx.expr(1)),
                    op);
            case "<", ">", "<=", ">=", "==", "!=", "&&", "||" -> new BinaryLogicExpr(new Position(ctx),
                    (Expr) visit(ctx.expr(0)),
                    (Expr) visit(ctx.expr(1)),
                    op);
            default -> null;
        };
    }


    @Override
    public BaseASTNode visitTernaryExp(Mx.TernaryExpContext ctx) {
        return new TernaryBranchExpr(new Position(ctx),
                (Expr) visit(ctx.expr(0)),
                (Expr) visit(ctx.expr(1)),
                (Expr) visit(ctx.expr(2)));
    }


    @Override
    public BaseASTNode visitNewArray(Mx.NewArrayContext ctx) {
        int dim = ctx.LBKT().size();
        if (!ctx.expr().isEmpty() && ctx.arrayliteral() == null) {
            // no init
            NewArrayExpr n = new NewArrayExpr(new Position(ctx));
            n.dim = dim;
            n.type = new Type(ctx.singletype().getText());
            for (Mx.ExprContext e : ctx.expr()) {
                n.len.add((Expr) visit(e));
            }
            return n;
        } else if (ctx.expr().isEmpty() && ctx.arrayliteral() != null) {
            NewArrayInitExpr n = new NewArrayInitExpr(new Position(ctx));
            n.dim = dim;
            n.type = new Type(ctx.singletype().getText());
            n.init = (ArrayLiteralExpr) visit(ctx.arrayliteral());
            return n;
        }
        // throw sth.
        return null;
    }

    @Override
    public BaseASTNode visitNewClass(Mx.NewClassContext ctx) {
        return new NewTypeExpr(new Position(ctx),
                new Type(ctx.ID().getText()));
    }

    @Override
    public BaseASTNode visitThisPtr(Mx.ThisPtrContext ctx) {
        return new ThisPtrExpr(new Position(ctx));
    }

    @Override
    public BaseASTNode visitVarAccess(Mx.VarAccessContext ctx) {
        return new VarExpr(new Position(ctx), ctx.ID().getText());
    }

    @Override
    public BaseASTNode visitConstant(Mx.ConstantContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public BaseASTNode visitFormatString(Mx.FormatStringContext ctx) {
        return visit(ctx.fmtstr());
    }

    @Override
    public BaseASTNode visitLiteral(Mx.LiteralContext ctx) {
        if (ctx.INTCONST() != null) {
            return new IntLiteralExpr(new Position(ctx), Integer.parseInt(ctx.INTCONST().getText()));
        }
        if (ctx.TRUE() != null || ctx.FALSE() != null) {
            return new BoolLiteralExpr(new Position(ctx), ctx.TRUE() != null);
        }
        if (ctx.STRINGCONST() != null) {
            return new StringLiteralExpr(new Position(ctx), ctx.STRINGCONST().getText());
        }
        if (ctx.NULL() != null) {
            return new NullExpr(new Position(ctx));
        }
        if (ctx.arrayliteral() != null) {
            return visitArrayliteral(ctx.arrayliteral());
        }
        return null;
    }


    @Override
    public BaseASTNode visitRowexpr(Mx.RowexprContext ctx) {
        RowExpr re = new RowExpr(new Position(ctx));
        for (int i = 0; i < ctx.expr().size(); i++) {
            if (ctx.expr(i) != null) re.exps.add((Expr) visit(ctx.expr(i)));
        }
        return re;
    }

    @Override
    public BaseASTNode visitArrayliteral(Mx.ArrayliteralContext ctx) {
        ArrayLiteralExpr ale = new ArrayLiteralExpr(new Position(ctx));
        for (Mx.ExprContext e : ctx.rowexpr().expr()) {
            ale.elements.add((Expr) visit(e));
        }
        return ale;
    }

    @Override
    public BaseASTNode visitFmtstr(Mx.FmtstrContext ctx) {
        if (ctx.FMTSTRPURE() != null) {
            String p = ctx.FMTSTRPURE().getText();
            p = p.substring(1, p.length() - 1);
            p = p.replace("$$", "$");
            return new StringLiteralExpr(new Position(ctx), p);
        }
        // with expr
        FmtStrLiteralExpr f = new FmtStrLiteralExpr(new Position(ctx));
        String bgn = ctx.FMTSTRBGN().getText();
        bgn = bgn.substring(2, bgn.length() - 1);
        bgn = bgn.replace("$$", "$");
        f.strs.add(bgn);
        for (int i = 0; i < ctx.FMTSTRBODY().size(); ++i) {
            String body = ctx.FMTSTRBODY(i).getText();
            body = body.substring(1, body.length() - 1);
            body = body.replace("$$", "$");
            f.strs.add(body);
        }
        String end = ctx.FMTSTREND().getText();
        end = end.substring(1, end.length() - 2);
        end = end.replace("$$", "$");
        for (int i = 0; i < ctx.expr().size(); ++i) {
            f.exprs.add((Expr) visit(ctx.expr(i)));
        }
        return f;
    }


}
