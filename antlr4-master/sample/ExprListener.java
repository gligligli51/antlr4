// Generated from Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(ExprParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(ExprParser.LinhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(ExprParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(ExprParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(ExprParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(ExprParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#divisoes_inteiros}.
	 * @param ctx the parse tree
	 */
	void enterDivisoes_inteiros(ExprParser.Divisoes_inteirosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#divisoes_inteiros}.
	 * @param ctx the parse tree
	 */
	void exitDivisoes_inteiros(ExprParser.Divisoes_inteirosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(ExprParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(ExprParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(ExprParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(ExprParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numeros_inteiros}.
	 * @param ctx the parse tree
	 */
	void enterNumeros_inteiros(ExprParser.Numeros_inteirosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numeros_inteiros}.
	 * @param ctx the parse tree
	 */
	void exitNumeros_inteiros(ExprParser.Numeros_inteirosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numeros_floats}.
	 * @param ctx the parse tree
	 */
	void enterNumeros_floats(ExprParser.Numeros_floatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numeros_floats}.
	 * @param ctx the parse tree
	 */
	void exitNumeros_floats(ExprParser.Numeros_floatsContext ctx);
}