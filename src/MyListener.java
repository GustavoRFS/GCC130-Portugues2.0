import antlr.Portugues2BaseListener;
import antlr.Portugues2Parser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class MyListener extends Portugues2BaseListener {

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();
    public boolean OcorreuErro = false;

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println("Erro sintatico: " + node.getText() );
    }

    @Override
    public void exitNIdentificacao(Portugues2Parser.NIdentificacaoContext ctx)  {
        String tipo = ctx.tipo().getText();
        String id = ctx.ID().getText();
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
            OcorreuErro = true;
        } else {
            tabelaSimbolos.put(id,tipo);
        }
    }

    private boolean validarID(String id){
        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração inexistente! Variável " + id + " não declarada");
            OcorreuErro = true;
            return false;
        }

        return true;
    }

    @Override
    public  void enterNEntradaSaida(Portugues2Parser.NEntradaSaidaContext ctx){
        String id = ctx.ID().getText();
        validarID(id) ;
    }

    @Override
    public  void enterNExpressaoArit(Portugues2Parser.NExpressaoAritContext ctx){
        for(TerminalNode t: ctx.ID() ){
            validarID(t.getText());
        }

        String valor1;
        String valor2;
        String tipo1;
        String tipo2;

        if(ctx.ID(0) != null ){
            String id = ctx.ID(0).getText();
            valor1 = id;
            tipo1 = tabelaSimbolos.get(id);
        }else{
            valor1 = ctx.NUM(0).getText();
            tipo1 = (valor1.contains(".")?"flutuante":"int");
        }

        if(ctx.ID(1) != null ){
            String id = ctx.ID(1).getText();
            valor2 = id;
            tipo2 = tabelaSimbolos.get(id);
        }else{
            valor2 = ctx.NUM(1).getText();
            tipo2 = (valor2.contains(".")?"flutuante":"int");
        }

        if(!tipo1.equals(tipo2)){
            System.out.println("Conversão inválida: não é possível realizar operações matemáticas entre os tipos " + tipo1 + " e " + tipo2);
            OcorreuErro= true;
        }

    }

    @Override
    public  void enterNExpressaoBool(Portugues2Parser.NExpressaoBoolContext ctx){
        for(TerminalNode t: ctx.ID() ){
            validarID(t.getText());
        }
    }

    @Override
    public  void enterNAtribuicao(Portugues2Parser.NAtribuicaoContext ctx){
        String id = ctx.ID().getText();

        if(validarID(id)){
           switch (tabelaSimbolos.get(id)){
               case "int":
                   if(ctx.NUM() == null){
                       if(ctx.expressaoarit() == null){
                           System.out.println("Conversão inválida:" + id + " é do tipo int");
                       }
                   }else{
                       if(ctx.NUM().getText().contains(".")){
                           System.out.println("Conversão inválida:" + id + " é do tipo int, tentativa de atribuir um flutuante a ele");
                       }
                   }
                   break;

               case "flutuante":
                   if(ctx.NUM() == null){
                       if(ctx.expressaoarit() == null) {
                           System.out.println("Conversão inválida:" + id + " é do tipo flutuante");
                       }
                   }else{
                       if(!ctx.NUM().getText().contains(".")){
                           System.out.println("Conversão inválida:" + id + " é do tipo flutuante, tentativa de atribuir um inteiro a ele");
                       }
                   }

                   break;
               case "texto":
                   if(ctx.TEXTO() == null){
                       System.out.println("Conversão inválida:" + id + " é do tipo texto");
                       OcorreuErro = true;
                   }
                   break;
               case "vouf":
                   if(ctx.expressaobool() == null && ctx.v() == null && ctx.f() == null ){
                       System.out.println("Conversão inválida:" + id + " é do tipo vouf");
                       OcorreuErro = true;
                   }
                   break;
           }
        }

    }



    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}