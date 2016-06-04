// Generated from SCvamo_a_compilarANTLRLexer.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SCvamo_a_compilarANTLRLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SCvamo_a_compilarANTLRLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ctrl}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrl(SCvamo_a_compilarANTLRLexerParser.CtrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declsEmpty}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclsEmpty(SCvamo_a_compilarANTLRLexerParser.DeclsEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letList}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetList(SCvamo_a_compilarANTLRLexerParser.LetListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dispList}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispList(SCvamo_a_compilarANTLRLexerParser.DispListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code disp}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#decldisp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisp(SCvamo_a_compilarANTLRLexerParser.DispContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#decllet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(SCvamo_a_compilarANTLRLexerParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt(SCvamo_a_compilarANTLRLexerParser.DeltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt0p}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta0p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt0p(SCvamo_a_compilarANTLRLexerParser.Delt0pContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt0ppEmpty}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta0pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt0ppEmpty(SCvamo_a_compilarANTLRLexerParser.Delt0ppEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt0pp}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta0pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt0pp(SCvamo_a_compilarANTLRLexerParser.Delt0ppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt1}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt1(SCvamo_a_compilarANTLRLexerParser.Delt1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code delt1p}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta1p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt1p(SCvamo_a_compilarANTLRLexerParser.Delt1pContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt1ppEmpty}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta1pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt1ppEmpty(SCvamo_a_compilarANTLRLexerParser.Delt1ppEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt1pp}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta1pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt1pp(SCvamo_a_compilarANTLRLexerParser.Delt1ppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt2}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt2(SCvamo_a_compilarANTLRLexerParser.Delt2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code delt2p}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta2p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt2p(SCvamo_a_compilarANTLRLexerParser.Delt2pContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt2ppEmpty}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta2pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt2ppEmpty(SCvamo_a_compilarANTLRLexerParser.Delt2ppEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt2pp}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta2pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt2pp(SCvamo_a_compilarANTLRLexerParser.Delt2ppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt3ID}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt3ID(SCvamo_a_compilarANTLRLexerParser.Delt3IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt3Curl}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt3Curl(SCvamo_a_compilarANTLRLexerParser.Delt3CurlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt3Brack}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt3Brack(SCvamo_a_compilarANTLRLexerParser.Delt3BrackContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delt3Paren}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#delta3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelt3Paren(SCvamo_a_compilarANTLRLexerParser.Delt3ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(SCvamo_a_compilarANTLRLexerParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(SCvamo_a_compilarANTLRLexerParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr1}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(SCvamo_a_compilarANTLRLexerParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code times}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes(SCvamo_a_compilarANTLRLexerParser.TimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(SCvamo_a_compilarANTLRLexerParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(SCvamo_a_compilarANTLRLexerParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(SCvamo_a_compilarANTLRLexerParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr3}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(SCvamo_a_compilarANTLRLexerParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code at}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt(SCvamo_a_compilarANTLRLexerParser.AtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underLine}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderLine(SCvamo_a_compilarANTLRLexerParser.UnderLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(SCvamo_a_compilarANTLRLexerParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listParen}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListParen(SCvamo_a_compilarANTLRLexerParser.ListParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listAng}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAng(SCvamo_a_compilarANTLRLexerParser.ListAngContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp0pEmpty}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp0p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp0pEmpty(SCvamo_a_compilarANTLRLexerParser.Exp0pEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#exp0p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SCvamo_a_compilarANTLRLexerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positive}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#eta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive(SCvamo_a_compilarANTLRLexerParser.PositiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#eta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(SCvamo_a_compilarANTLRLexerParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tao1}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTao1(SCvamo_a_compilarANTLRLexerParser.Tao1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code t0pEmpty}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#t0p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT0pEmpty(SCvamo_a_compilarANTLRLexerParser.T0pEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dots}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#t0p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDots(SCvamo_a_compilarANTLRLexerParser.DotsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code t1Int}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#t1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT1Int(SCvamo_a_compilarANTLRLexerParser.T1IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code t1Void}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#t1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT1Void(SCvamo_a_compilarANTLRLexerParser.T1VoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code t1Paren}
	 * labeled alternative in {@link SCvamo_a_compilarANTLRLexerParser#t1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT1Paren(SCvamo_a_compilarANTLRLexerParser.T1ParenContext ctx);
}