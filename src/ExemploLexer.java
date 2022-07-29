import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class ExemploLexer {

    public static void  main (String[] args){
        String filename = "/home/felipe/Área de Trabalho/GCC130-Portugues2.0/errado3.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            Portugues2Lexer lexer = new Portugues2Lexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("    Lexema: "+ token.getText());
                System.out.println("    Classe: "+lexer.getVocabulary().getSymbolicName(token.getType()));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}