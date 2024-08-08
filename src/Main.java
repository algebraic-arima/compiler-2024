package src;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import src.AST.ASTBuilder;
import src.AST.Prog;
import src.parser.Lex;
import src.parser.Mx;
import src.utils.MxErrorListener;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, MxWorld!");
        InputStream in = System.in;
        System.out.println(in);
        Lex lexer = new Lex(CharStreams.fromStream(in));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MxErrorListener());
        Mx parser = new Mx(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new MxErrorListener());
        Mx.ProgContext parseTreeRoot = parser.prog();
        ASTBuilder astBuilder = new ASTBuilder();
        Prog root = (Prog) astBuilder.visit(parseTreeRoot);
        return;
    }

    public static String trim(String s) {
        return s + "3";
    }
}
