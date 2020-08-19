// Generated from C:/Users/rmama/IdeaProjects/praxis2/src/com/modelo\matrizParser.g4 by ANTLR 4.8
package com.modelo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link matrizParser}.
 */
public interface matrizParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link matrizParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(matrizParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(matrizParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asigna}
	 * labeled alternative in {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterAsigna(matrizParser.AsignaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asigna}
	 * labeled alternative in {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitAsigna(matrizParser.AsignaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operacion}
	 * labeled alternative in {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(matrizParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operacion}
	 * labeled alternative in {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(matrizParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Imprim}
	 * labeled alternative in {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterImprim(matrizParser.ImprimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Imprim}
	 * labeled alternative in {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitImprim(matrizParser.ImprimContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#imprime}.
	 * @param ctx the parse tree
	 */
	void enterImprime(matrizParser.ImprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#imprime}.
	 * @param ctx the parse tree
	 */
	void exitImprime(matrizParser.ImprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(matrizParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(matrizParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#pc}.
	 * @param ctx the parse tree
	 */
	void enterPc(matrizParser.PcContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#pc}.
	 * @param ctx the parse tree
	 */
	void exitPc(matrizParser.PcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterVariable(matrizParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitVariable(matrizParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Potencias}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterPotencias(matrizParser.PotenciasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Potencias}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitPotencias(matrizParser.PotenciasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(matrizParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(matrizParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterPlus(matrizParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitPlus(matrizParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trans}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterTrans(matrizParser.TransContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trans}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitTrans(matrizParser.TransContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divicion}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterDivicion(matrizParser.DivicionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divicion}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitDivicion(matrizParser.DivicionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(matrizParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(matrizParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMinus(matrizParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMinus(matrizParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterParen(matrizParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitParen(matrizParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code R1}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterR1(matrizParser.R1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code R1}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitR1(matrizParser.R1Context ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(matrizParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(matrizParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterResta(matrizParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitResta(matrizParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(matrizParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(matrizParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(matrizParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(matrizParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(matrizParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(matrizParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code R2}
	 * labeled alternative in {@link matrizParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterR2(matrizParser.R2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code R2}
	 * labeled alternative in {@link matrizParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitR2(matrizParser.R2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code R3}
	 * labeled alternative in {@link matrizParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterR3(matrizParser.R3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code R3}
	 * labeled alternative in {@link matrizParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitR3(matrizParser.R3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Damearry}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterDamearry(matrizParser.DamearryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Damearry}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitDamearry(matrizParser.DamearryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DAMEint}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterDAMEint(matrizParser.DAMEintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DAMEint}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitDAMEint(matrizParser.DAMEintContext ctx);
}