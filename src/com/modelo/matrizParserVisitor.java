// Generated from C:/Users/rmama/IdeaProjects/praxis2/src/com/modelo\matrizParser.g4 by ANTLR 4.8
package com.modelo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link matrizParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface matrizParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link matrizParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(matrizParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asigna}
	 * labeled alternative in {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigna(matrizParser.AsignaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operacion}
	 * labeled alternative in {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(matrizParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Imprim}
	 * labeled alternative in {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprim(matrizParser.ImprimContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#imprime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprime(matrizParser.ImprimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(matrizParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#pc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPc(matrizParser.PcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(matrizParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Potencias}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencias(matrizParser.PotenciasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(matrizParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(matrizParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trans}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans(matrizParser.TransContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divicion}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivicion(matrizParser.DivicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(matrizParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(matrizParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(matrizParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code R1}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR1(matrizParser.R1Context ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(matrizParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(matrizParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(matrizParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(matrizParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(matrizParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code R2}
	 * labeled alternative in {@link matrizParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR2(matrizParser.R2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code R3}
	 * labeled alternative in {@link matrizParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR3(matrizParser.R3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Damearry}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamearry(matrizParser.DamearryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DAMEint}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDAMEint(matrizParser.DAMEintContext ctx);
}