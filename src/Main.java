package src;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import src.AST.ASTBuilder;
import src.AST.Prog;
import src.parser.Lex;
import src.parser.Mx;
import src.utils.MxErrorListener;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, MxWorld!");
//        InputStream in = System.in;
        String name = "F:\\vscode\\antlr-demo\\compiler-2024\\src\\t.mx";
        InputStream in = new FileInputStream(name);
//        System.out.println(Arrays.toString(in.readAllBytes()));
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
}
