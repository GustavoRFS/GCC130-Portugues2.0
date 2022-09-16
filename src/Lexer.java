import antlr.Portugues2Lexer;
import antlr.Portugues2Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Lexer {
    public static void main(String[] args){
        //parsing the input
        String nomeArq = "codigo1";
        Portugues2Parser parser = getParser(System.getProperty("user.dir")+"/src/testes/" +nomeArq + ".txt");

        ParseTree ast = parser.programa();

        if(parser.getNumberOfSyntaxErrors() > 0){
            System.out.println("Ocorreram erros de sintaxe!");
        }else{
            MyListener listener = new MyListener();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(listener,ast);

            if(!listener.OcorreuErro ){
                System.out.println("Código válido: não foram encontrados erros");
            }
        }

    }


    private static Portugues2Parser getParser(String fileName){
        Portugues2Parser parser = null;
        try{
            InputStream is = new FileInputStream(fileName);

            CharStream input = CharStreams.fromStream(is);
            Portugues2Lexer lexer = new Portugues2Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new Portugues2Parser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }
}