import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.IOException;

public class Lexer {
    public static void  main (String[] args){
        //if (args.length == 0) {
        //    throw new RuntimeException("Arquivo não informado");
        //}
        //String fileName = args[0];
        String filePath = "/home/felipe/Área de Trabalho/GCC130-Portugues2.0/codigo1.txt";//System.getProperty("user.dir")+"/"+fileName;
        try{
            CharStream input = CharStreams.fromFileName(filePath);
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