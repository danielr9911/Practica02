// Generated from SCvamo_a_compilarANTLRLexer.g4 by ANTLR 4.5.3
import java.util.Set;
import java.util.HashSet;
/**
 * This class provides an empty implementation of {@link SCvamo_a_compilarANTLRLexerVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <Set<String>> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class SCvamo_a_compilarDefVarsVisitor extends SCvamo_a_compilarANTLRLexerBaseVisitor<Set<String>> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitCtrl(SCvamo_a_compilarANTLRLexerParser.CtrlContext ctx) {
		Set<String> vars = visit(ctx.decls());
		return vars;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDeclsEmpty(SCvamo_a_compilarANTLRLexerParser.DeclsEmptyContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitLetList(SCvamo_a_compilarANTLRLexerParser.LetListContext ctx) {
		Set<String> varDeclLet = visit(ctx.decllet());
		Set<String> varDecls = visit(ctx.decls());
		varDecls.addAll(varDeclLet);
		return varDecls;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitDispList(SCvamo_a_compilarANTLRLexerParser.DispListContext ctx) {
		Set<String> varDeclDisp = visit(ctx.decldisp());
		Set<String> varDecls = visit(ctx.decls());
		varDecls.addAll(varDeclDisp);
		return varDecls;;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitDisp(SCvamo_a_compilarANTLRLexerParser.DispContext ctx) {
		Set<String> vars = new HashSet<String>();
		vars.add(ctx.ID().getText());
		return vars;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitLet(SCvamo_a_compilarANTLRLexerParser.LetContext ctx) {
		Set<String> vars = new HashSet<String>();
		vars.add(ctx.ID().getText());
		return vars;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt(SCvamo_a_compilarANTLRLexerParser.DeltContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt0p(SCvamo_a_compilarANTLRLexerParser.Delt0pContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt0ppEmpty(SCvamo_a_compilarANTLRLexerParser.Delt0ppEmptyContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt0pp(SCvamo_a_compilarANTLRLexerParser.Delt0ppContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt1(SCvamo_a_compilarANTLRLexerParser.Delt1Context ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt1p(SCvamo_a_compilarANTLRLexerParser.Delt1pContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt1ppEmpty(SCvamo_a_compilarANTLRLexerParser.Delt1ppEmptyContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt1pp(SCvamo_a_compilarANTLRLexerParser.Delt1ppContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt2(SCvamo_a_compilarANTLRLexerParser.Delt2Context ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt2p(SCvamo_a_compilarANTLRLexerParser.Delt2pContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt2ppEmpty(SCvamo_a_compilarANTLRLexerParser.Delt2ppEmptyContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt2pp(SCvamo_a_compilarANTLRLexerParser.Delt2ppContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitDelt3ID(SCvamo_a_compilarANTLRLexerParser.Delt3IDContext ctx) {
		return new HashSet<String>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt3Curl(SCvamo_a_compilarANTLRLexerParser.Delt3CurlContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt3Brack(SCvamo_a_compilarANTLRLexerParser.Delt3BrackContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt3Paren(SCvamo_a_compilarANTLRLexerParser.Delt3ParenContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitAdd(SCvamo_a_compilarANTLRLexerParser.AddContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitSub(SCvamo_a_compilarANTLRLexerParser.SubContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExpr1(SCvamo_a_compilarANTLRLexerParser.Expr1Context ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitTimes(SCvamo_a_compilarANTLRLexerParser.TimesContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDivide(SCvamo_a_compilarANTLRLexerParser.DivideContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExpr2(SCvamo_a_compilarANTLRLexerParser.Expr2Context ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitNum(SCvamo_a_compilarANTLRLexerParser.NumContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExpr3(SCvamo_a_compilarANTLRLexerParser.Expr3Context ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitAt(SCvamo_a_compilarANTLRLexerParser.AtContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitUnderLine(SCvamo_a_compilarANTLRLexerParser.UnderLineContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitInput(SCvamo_a_compilarANTLRLexerParser.InputContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitListParen(SCvamo_a_compilarANTLRLexerParser.ListParenContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitListAng(SCvamo_a_compilarANTLRLexerParser.ListAngContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExp0pEmpty(SCvamo_a_compilarANTLRLexerParser.Exp0pEmptyContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExpr(SCvamo_a_compilarANTLRLexerParser.ExprContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitPositive(SCvamo_a_compilarANTLRLexerParser.PositiveContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitNegative(SCvamo_a_compilarANTLRLexerParser.NegativeContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitTao1(SCvamo_a_compilarANTLRLexerParser.Tao1Context ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitT0pEmpty(SCvamo_a_compilarANTLRLexerParser.T0pEmptyContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDots(SCvamo_a_compilarANTLRLexerParser.DotsContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitT1Int(SCvamo_a_compilarANTLRLexerParser.T1IntContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitT1Void(SCvamo_a_compilarANTLRLexerParser.T1VoidContext ctx) { return new HashSet<String>(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitT1Paren(SCvamo_a_compilarANTLRLexerParser.T1ParenContext ctx) { return new HashSet<String>(); }
}