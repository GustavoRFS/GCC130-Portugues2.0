import antlr.Portugues2Lexer;
import antlr.Portugues2Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Lexer {
    public static void main(String[] args){
        //parsing the input
        Portugues2Parser parser = getParser("/home/felipe/Documentos/GCC130-Portugues2.0/src/testes/errado3semantico.txt");

        //obter arvore
        ParseTree ast = parser.programa();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolos().toString());
    }


    private static Portugues2Parser getParser(String fileName){
        Portugues2Parser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            Portugues2Lexer lexer = new Portugues2Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new Portugues2Parser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }
}