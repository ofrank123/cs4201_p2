import calculus.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class Translate {

    public static void main(String[] args) throws Exception {

        String inputFile = null;
        boolean showOutput = true;

        if (args.length > 0 )
            inputFile = args[0];
        if (args.length > 1 )
            showOutput = !args[1].equals("--no-output");

        if (inputFile == null) {
            System.err.println("No input file");
            System.exit(-1);
        }

        try (InputStream preludeStream = new FileInputStream("src/prelude.hs"); // Load in prelude file
             InputStream inputStream = new FileInputStream(inputFile)) { // Load in input file

            // Lex + Parse file using ANTLR

            CharStream charStream = CharStreams.fromStream(new SequenceInputStream(preludeStream, inputStream));

            FunlLexer lexer = new FunlLexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            FunlParser parser = new FunlParser(tokens);

            ParseTree tree = parser.program();

            // Run visitor on parse tree, generating lambda expression

            FVisitor visitor = new FVisitor();

            CalcExpr mainExpr = visitor.visit(tree);


            long startTime = System.nanoTime();
            // Check whether reduction performed
            while (CalcExpr.checkReductionFlag()) {
                if (showOutput) {
                    System.out.println(mainExpr.toString());
                }
                // Unset flag
                CalcExpr.unsetReductionFlag();
                // Perform reduction, sets flag if anything was reduced
                mainExpr = mainExpr.reduce();
            }
            long duration = System.nanoTime() - startTime;

            // Print out execution time and the final reduction of the statement
            System.out.println("Execution Time: " + duration / Math.pow(10, 9) + " seconds");
            System.out.println("Final Reduction: " + mainExpr.toString());
        }
    }
}
