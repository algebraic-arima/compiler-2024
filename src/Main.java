package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import src.ASM.ASMBuilder;
import src.ASM.ASMPrinter;
import src.ASM.ASMProg;
import src.AST.ASTBuilder;
import src.AST.Prog;
import src.IR.IRBuilder;
import src.IR.IRPrinter;
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
        try {
//            String file = "/home/limike/Git/compiler-2024/t.mx";
//            String file = "F:\\vscode\\antlr-demo\\compiler-2024\\testcases\\codegen\\t9.mx";
//            InputStream in = new FileInputStream(file);
            InputStream in = System.in;
            Lex lexer = new Lex(CharStreams.fromStream(in));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new MxErrorListener());
            Mx parser = new Mx(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(new MxErrorListener());
            Mx.ProgContext parseTreeRoot = parser.prog();
            ASTBuilder AST = new ASTBuilder();
            Prog ASTRoot = (Prog) AST.visit(parseTreeRoot);
            GlobalScope gScope = new GlobalScope();
            new SymbolCollector(gScope).visit(ASTRoot);
            SemanticChecker sc = new SemanticChecker(gScope);
            sc.visit(ASTRoot);
            IRBuilder irBuilder = new IRBuilder(gScope);
            irBuilder.visit(ASTRoot);
            IRPrinter irPrinter = new IRPrinter(irBuilder.irProg);
            irPrinter.print();
            ASMBuilder asmBuilder = new ASMBuilder(irBuilder.irProg);
            ASMPrinter asmPrinter = new ASMPrinter(asmBuilder.asmProg);
            asmPrinter.print();
            System.exit(0);
        } catch (error e) {
            System.err.println(e.pos.row + ":" + e.pos.column + " " + e.message);
//            System.exit(1); // if judge
        }
    }
}
