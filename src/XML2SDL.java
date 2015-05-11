import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerInterpreter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.tool.Grammar;

public class XML2SDL {
    public static void main(String[] args) {
        try {
            Grammar g = Grammar.load("Comp.g4");
            LexerInterpreter lexer = g.createLexerInterpreter(new ANTLRFileStream(args[0]));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CompParser parser = new CompParser(tokens);
            ParseTree t = parser.start();
            ParseTreeWalker walker = new ParseTreeWalker();
            Listener listener = new Listener();
            walker.walk(listener, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
