package src.Semantic;

import src.AST.ASTVisitor;
import src.AST.Def.ClassDef;
import src.AST.Def.Constructor;
import src.AST.Def.FuncDef;
import src.AST.Def.VarDef;
import src.AST.Expr.Expr;
import src.AST.Prog;
import src.AST.Stmt.Stmt;
import src.utils.Scope.GlobalScope;
import src.utils.error.error;
import src.utils.type.ClassType;
import src.utils.type.FuncType;

import java.util.Map;

public class SymbolCollector implements ASTVisitor {

    public GlobalScope gScope;
    public String curClass = null;
    // if in class, take down var and func
    // if not, take down func and class only

    public SymbolCollector(GlobalScope g) {
        gScope = g;
    }

    @Override
    public void visit(Prog node) {
        node.defs.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(FuncDef node) {
        FuncType ft = new FuncType(node.funcType);
        ft.args = node.funcParams;
        if (curClass == null)
            gScope.addFunc(node.funcName, ft, node.pos);
        else
            gScope.addMemberFunc(curClass, node.funcName, ft, node.pos);
    }

    @Override
    public void visit(ClassDef node) {
        gScope.addClass(node.className, new ClassType(), node.pos);
        if (curClass == null) curClass = node.className;
        else throw new error("nested class definition", node.pos);
        node.classFunc.forEach(d -> d.accept(this));
        node.classMem.forEach(d -> d.accept(this));
        curClass = null;
    }

    @Override
    public void visit(VarDef node) {
        if (curClass != null)
            for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
                gScope.addMemberVar(curClass, entry.getKey(), node.type, node.pos);
            }
    }

    @Override
    public void visit(Constructor node) {

    }

    @Override
    public void visit(Expr node) {

    }

    @Override
    public void visit(Stmt node) {

    }
}
