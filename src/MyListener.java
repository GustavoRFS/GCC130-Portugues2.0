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
               case "flutuante":
                   if(ctx.NUM() == null && ctx.expressaoarit() == null){
                       System.out.println("Conversão inválida:" + id + " é do tipo "  + (tabelaSimbolos.get(id) == "int"? "inteiro":"flutuante"));
                       OcorreuErro = true;
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