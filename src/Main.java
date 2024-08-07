package src;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import src.parser.Lex;
import src.parser.Mx;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, MxWorld!");
        InputStream in = System.in;
        Lex lexer = new Lex(CharStreams.fromStream(in));
        lexer.removeErrorListeners();
//        lexer.addErrorListener(new MxErrorListener());
        Mx parser = new Mx(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
//        parser.addErrorListener(new YxErrorListener());
        Mx.ProgContext parseTreeRoot = parser.prog();
    }

    private static void foo(){

    }
}
