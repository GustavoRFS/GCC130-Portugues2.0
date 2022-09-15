// Generated from Portugues2.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Portugues2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Portugues2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link Portugues2Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNPrograma(Portugues2Parser.NProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NDeclaracoes}
	 * labeled alternative in {@link Portugues2Parser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNDeclaracoes(Portugues2Parser.NDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NIdentificacao}
	 * labeled alternative in {@link Portugues2Parser#identificacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNIdentificacao(Portugues2Parser.NIdentificacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NCodigo}
	 * labeled alternative in {@link Portugues2Parser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNCodigo(Portugues2Parser.NCodigoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link Portugues2Parser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNComando(Portugues2Parser.NComandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NExpressaoArit}
	 * labeled alternative in {@link Portugues2Parser#expressaoarit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNExpressaoArit(Portugues2Parser.NExpressaoAritContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NExpressaoBool}
	 * labeled alternative in {@link Portugues2Parser#expressaobool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNExpressaoBool(Portugues2Parser.NExpressaoBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link Portugues2Parser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAtribuicao(Portugues2Parser.NAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEntradaSaida}
	 * labeled alternative in {@link Portugues2Parser#entradasaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEntradaSaida(Portugues2Parser.NEntradaSaidaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NExpressaoRepeticao1}
	 * labeled alternative in {@link Portugues2Parser#expressaocondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNExpressaoRepeticao1(Portugues2Parser.NExpressaoRepeticao1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code NExpressaoCondicional2}
	 * labeled alternative in {@link Portugues2Parser#expressaocondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNExpressaoCondicional2(Portugues2Parser.NExpressaoCondicional2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code NExpressaoRepeticao}
	 * labeled alternative in {@link Portugues2Parser#expressaorepeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNExpressaoRepeticao(Portugues2Parser.NExpressaoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NF}
	 * labeled alternative in {@link Portugues2Parser#vouf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNF(Portugues2Parser.NFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NV}
	 * labeled alternative in {@link Portugues2Parser#vouf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNV(Portugues2Parser.NVContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#cod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCod(Portugues2Parser.CodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(Portugues2Parser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Portugues2Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#v}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV(Portugues2Parser.VContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(Portugues2Parser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtr(Portugues2Parser.AtrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp(Portugues2Parser.ApContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#fp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFp(Portugues2Parser.FpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#ac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAc(Portugues2Parser.AcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#fc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFc(Portugues2Parser.FcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#pev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPev(Portugues2Parser.PevContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#op_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_arit(Portugues2Parser.Op_aritContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#op_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_rel(Portugues2Parser.Op_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#op_bol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_bol(Portugues2Parser.Op_bolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(Portugues2Parser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#condsenao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondsenao(Portugues2Parser.CondsenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#rep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep(Portugues2Parser.RepContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#ler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLer(Portugues2Parser.LerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Portugues2Parser#escrever}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrever(Portugues2Parser.EscreverContext ctx);
}