import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.BitSet;
import java.util.Set;

public class MainSCvamo_a_compilarVisitor {

    public static void main(String args[]) {

        String inputFile = null;

        if (args.length > 0) {
            inputFile = args[0];
        }

        InputStream is = System.in;
        try {
            if (inputFile != null) is = new FileInputStream(inputFile);

            ANTLRInputStream input = new ANTLRInputStream(is);

            SCvamo_a_compilarANTLRLexerLexer lexer = new SCvamo_a_compilarANTLRLexerLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            SCvamo_a_compilarANTLRLexerParser parser = new SCvamo_a_compilarANTLRLexerParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new ManageErrorClass());

            ParseTree tree = parser.control();

            SCvamo_a_compilarDefVarsVisitor defVisitor = new SCvamo_a_compilarDefVarsVisitor();

            Set<String> varsDef = defVisitor.visit(tree);

            SCvamo_a_compilarUsedVarsVisitor usedVisitor = new SCvamo_a_compilarUsedVarsVisitor();

            Set<String> varsUsed = usedVisitor.visit(tree);

            System.out.println("fichero: " + args[0]);
            System.out.println("bien formado");

            boolean valido = false;
            if (varsDef.containsAll(varsUsed)) {
                valido = true;
                System.out.println("programa valido");
            } else {
                System.out.println("programa no valido");
            }

            String vars = "";
            for (String s : varsUsed) {
                vars = vars + s + ", ";
            }
            vars = vars.substring(0, vars.length() - 2);
            System.out.println("usa dispositivos: " + vars);

            if (!valido) {

                varsUsed.removeAll(varsDef);
                Set<String> malVars = varsUsed;
                String malasVars = "";
                for (String s : malVars) {
                    malasVars = malasVars + s + ", ";
                }
                malasVars = malasVars.substring(0, malasVars.length() - 2);
                System.out.println("dispositivos mal formados: " + malasVars);
            }
        }
        catch(FileNotFoundException fn){
            System.out.println(fn.getMessage());
            System.exit(1);
        }
        catch(Exception e){
            System.out.println("fichero: " + args[0]);
            System.out.println("mal formado");
            System.exit(1);
        }


    }

    private static class ManageErrorClass implements ANTLRErrorListener {

        public void reportAmbiguity(Parser recognizer, DFA dfa,
                                    int startIndex, int stopIndex, boolean exact,
                                    BitSet ambigAlts, ATNConfigSet configs) {
        }

        public void reportAttemptingFullContext(Parser recognizer, DFA dfa,
                                                int startIndex, int stopIndex,
                                                BitSet conflictingAlts, ATNConfigSet configs) {
        }

        public void reportContextSensitivity(Parser recognizer, DFA dfa,
                                             int startIndex, int stopIndex,
                                             int prediction, ATNConfigSet configs) {
        }

        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg,
                                RecognitionException e) {

            ANTLRFileStream fileinput = (ANTLRFileStream) recognizer.getInputStream();
            String input = fileinput.toString();
            String lines[] = input.split("\n");
            System.err.println(
                    "No Valido");
            System.exit(1);
        }
    }
}
