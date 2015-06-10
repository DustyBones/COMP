import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerInterpreter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.tool.Grammar;

public class XML2SDL {
    public static void main(String[] args) {
        if (args.length != 1 && args.length != 2) {
            System.out.println("Wrong number of arguments. Expected XML2SDL <path to xml file>");
        } else {
            try {
                Grammar g = Grammar.load("Comp.g4");
                LexerInterpreter lexer = g.createLexerInterpreter(new ANTLRFileStream(args[0]));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CompParser parser = new CompParser(tokens);
                ParseTree t = parser.startParser();
                ParseTreeWalker walker = new ParseTreeWalker();
                Listener listener = new Listener();
                walker.walk(listener, t);
                if (listener.isValid()) {
                    SDLWriter sdl = new SDLWriter(args[1], listener);
                    sdl.generate();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
