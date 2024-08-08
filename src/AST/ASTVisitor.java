package src.AST;

import src.AST.Def.ClassDef;
import src.AST.Def.Constructor;
import src.AST.Def.FuncDef;
import src.AST.Def.VarDef;
import src.AST.Expr.Expr;
import src.AST.Stmt.Stmt;

public interface ASTVisitor {

   void visit(Prog node);
   void visit(FuncDef node);
   void visit(ClassDef node);
   void visit(VarDef node);
   void visit(Constructor node);
   void visit(Expr node);
   void visit(Stmt node);

}
