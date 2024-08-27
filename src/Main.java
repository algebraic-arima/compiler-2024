package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import src.ASM.ASMBuilder;
import src.ASM.ASMPrinter;
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

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
//            String file = "/home/limike/Git/compiler-2024/t.mx";
            String file = "/home/limike/Git/compiler-2024/src/testcases/codegen/test/t20.mx";
            InputStream in = new FileInputStream(file);
//            InputStream in = System.in;
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
            boolean printIR = true;
            if(printIR){
                FileOutputStream fileOutputStream = new FileOutputStream("/home/limike/Git/compiler-2024/test.ll");
                PrintStream printStream = new PrintStream(fileOutputStream);
                System.setOut(printStream);
            }
            irPrinter.print(printIR);


            ASMBuilder asmBuilder = new ASMBuilder(irBuilder.irProg,printIR);
            ASMPrinter asmPrinter = new ASMPrinter(asmBuilder.asmProg);
            PrintStream consolePrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
            System.setOut(consolePrintStream);
//            irPrinter.print(true);
            asmPrinter.print();
            FileOutputStream fileOutputStream1 = new FileOutputStream("/home/limike/Git/compiler-2024/test.s");
            PrintStream printStream1 = new PrintStream(fileOutputStream1);
            System.setOut(printStream1);
            asmPrinter.print();
            System.exit(0);
        } catch (error e) {
            System.err.println(e.pos.row + ":" + e.pos.column + " " + e.message);
//            System.exit(1); // if judge
        }
    }
}
