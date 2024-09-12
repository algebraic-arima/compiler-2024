package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import src.ASM.ASMBuilder;
import src.ASM.ASMPrinter;
import src.AST.ASTBuilder;
import src.AST.Prog;
import src.IR.IRBuilder;
import src.IR.IRPrinter;
import src.IR.IRProg;
import src.Optim.Mem2Reg.Mem2Reg;
import src.Semantic.*;
import src.parser.Lex;
import src.parser.Mx;
import src.utils.MxErrorListener;
import src.utils.Scope.GlobalScope;
import src.utils.error.error;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        SemanticJudge sj = new SemanticJudge();
        boolean fileIn = false;
        boolean printIR = false;
        boolean fileOutIR = false;
        boolean printM2R = true;
        boolean fileOutM2R = false;
        boolean printASM = false;
        boolean fileOutASM = false;
        try {
            InputStream in;
            if (fileIn) {
                String file = "/home/limike/git/compiler-2024/testcases/codegen/test/t61.mx";
                in = new FileInputStream(file);
            } else {
                in = System.in;
            }
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
            IRProg irProg = irBuilder.build(ASTRoot);
            irProg.reformat();

            if (printIR) {
                IRPrinter irPrinter = new IRPrinter(irProg);
                if (fileOutIR) {
                    FileOutputStream fileOutputStream = new FileOutputStream("/home/limike/git/compiler-2024/test.ll");
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    System.setOut(printStream);
                } else {
                    irPrinter.print();
                }
            }

            Mem2Reg m2r = new Mem2Reg(irProg);

            if (printM2R) {
                IRPrinter irPrinter = new IRPrinter(irProg);
                if (fileOutM2R) {
                    FileOutputStream fileOutputStream = new FileOutputStream("/home/limike/git/compiler-2024/test.ll");
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    System.setOut(printStream);
                } else {
                    irPrinter.print();
                }
            }



            if (printASM) {
                ASMBuilder asmBuilder = new ASMBuilder(irBuilder.irProg, printIR);
                ASMPrinter asmPrinter = new ASMPrinter(asmBuilder.asmProg);
                if (fileOutASM) {
                    FileOutputStream fileOutputStream1 = new FileOutputStream("/home/limike/Git/compiler-2024/test.s");
                    PrintStream printStream1 = new PrintStream(fileOutputStream1);
                    System.setOut(printStream1);
                } else {
                    PrintStream consolePrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
                    System.setOut(consolePrintStream);
                }
                asmPrinter.print();
            }

            System.exit(0);
        } catch (error e) {
//            System.err.println(e.pos.row + ":" + e.pos.column + " " + e.message);
            sj.catPrint(e);
            System.exit(1); // if judge
        }
    }
}
