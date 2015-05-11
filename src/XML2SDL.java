import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerInterpreter;
import org.antlr.v4.runtime.ParserInterpreter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.tool.Grammar;

public class XML2SDL {
    public static void main(String[] args){
        try{
            Grammar g = Grammar.load("Comp.g4");
            LexerInterpreter lexEngine = g.createLexerInterpreter(new ANTLRFileStream("input/valid.xml"));
            CommonTokenStream tokens = new CommonTokenStream(lexEngine);
            ParserInterpreter parser = g.createParserInterpreter(tokens);
            ParseTree t = parser.parse(g.getRule("start").index);
            System.out.println("parse tree: "+t.toStringTree(parser));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
