package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import src.AST.ASTBuilder;
import src.AST.Prog;
import src.Semantic.*;
import src.parser.Lex;
import src.parser.Mx;
import src.utils.MxErrorListener;
import src.utils.Scope.GlobalScope;
import src.utils.error.error;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            String file = "F:\\vscode\\antlr-demo\\compiler-2024\\testcases\\sema\\expression-package\\expression-1.mx";
            InputStream in = new FileInputStream(file);
            Lex lexer = new Lex(CharStreams.fromStream(in));
//        InputStream in = System.in;
            lexer.removeErrorListeners();
            lexer.addErrorListener(new MxErrorListener());
            Mx parser = new Mx(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(new MxErrorListener());
            Mx.ProgContext parseTreeRoot = parser.prog();
            ASTBuilder astBuilder = new ASTBuilder();
            Prog root = (Prog) astBuilder.visit(parseTreeRoot);
            GlobalScope gScope = new GlobalScope();
            new SymbolCollector(gScope).visit(root);
            new SemanticChecker(gScope).visit(root);
            return;
        } catch (error e){
            System.err.println(e.pos.row + ":" + e.pos.column + " " + e.message);
        }
    }
}
