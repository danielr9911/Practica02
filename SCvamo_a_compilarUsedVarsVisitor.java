// Generated from SCvamo_a_compilarANTLRLexer.g4 by ANTLR 4.5.3

import java.util.HashSet;
import java.util.Set;


/**
 * This class provides an empty implementation of {@link SCvamo_a_compilarANTLRLexerVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 */
public class SCvamo_a_compilarUsedVarsVisitor extends SCvamo_a_compilarANTLRLexerBaseVisitor<Set<String>> {
    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitCtrl(SCvamo_a_compilarANTLRLexerParser.CtrlContext ctx) {
        Set<String> varDelta = visit(ctx.delta());
        Set<String> varDecls = visit(ctx.decls());
        varDecls.addAll(varDelta);
        return varDecls;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDeclsEmpty(SCvamo_a_compilarANTLRLexerParser.DeclsEmptyContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitLetList(SCvamo_a_compilarANTLRLexerParser.LetListContext ctx) {
        Set<String> varDellet = visit(ctx.decllet());
        Set<String> varDels = visit(ctx.decls());
        varDels.addAll(varDellet);
        return varDels;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDispList(SCvamo_a_compilarANTLRLexerParser.DispListContext ctx) {
        return  visit(ctx.decls());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDisp(SCvamo_a_compilarANTLRLexerParser.DispContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitLet(SCvamo_a_compilarANTLRLexerParser.LetContext ctx) {
        return visit(ctx.delta());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt(SCvamo_a_compilarANTLRLexerParser.DeltContext ctx) {
        Set<String> varDelt1 = visit(ctx.delta1());
        Set<String> varDelt0pp = visit(ctx.delta0pp());
        varDelt1.addAll(varDelt0pp);
        return varDelt1;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt0p(SCvamo_a_compilarANTLRLexerParser.Delt0pContext ctx) {
        Set<String> varDelt1 = visit(ctx.delta1());
        Set<String> varDelt0pp = visit(ctx.delta0pp());
        varDelt1.addAll(varDelt0pp);
        return varDelt1;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt0ppEmpty(SCvamo_a_compilarANTLRLexerParser.Delt0ppEmptyContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt0pp(SCvamo_a_compilarANTLRLexerParser.Delt0ppContext ctx) {
        return visit(ctx.delta0p());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt1(SCvamo_a_compilarANTLRLexerParser.Delt1Context ctx) {
        Set<String> varDelt2 = visit(ctx.delta2());
        Set<String> varDelt1pp = visit(ctx.delta1pp());
        varDelt2.addAll(varDelt1pp);
        return varDelt2;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt1p(SCvamo_a_compilarANTLRLexerParser.Delt1pContext ctx) {
        Set<String> varDelt2 = visit(ctx.delta2());
        Set<String> varDelt1pp = visit(ctx.delta1pp());
        varDelt2.addAll(varDelt1pp);
        return varDelt2;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt1ppEmpty(SCvamo_a_compilarANTLRLexerParser.Delt1ppEmptyContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt1pp(SCvamo_a_compilarANTLRLexerParser.Delt1ppContext ctx) {
        return visit(ctx.delta1p());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt2(SCvamo_a_compilarANTLRLexerParser.Delt2Context ctx) {
        Set<String> varDelt3 = visit(ctx.delta3());
        Set<String> varDelt2pp = visit(ctx.delta2pp());
        varDelt3.addAll(varDelt2pp);
        return varDelt3;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt2p(SCvamo_a_compilarANTLRLexerParser.Delt2pContext ctx) {
        Set<String> varDelt3 = visit(ctx.delta3());
        Set<String> varDelt2pp = visit(ctx.delta2pp());
        varDelt3.addAll(varDelt2pp);
        return varDelt3;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt2ppEmpty(SCvamo_a_compilarANTLRLexerParser.Delt2ppEmptyContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt2pp(SCvamo_a_compilarANTLRLexerParser.Delt2ppContext ctx) {
        return visit(ctx.delta2p());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt3ID(SCvamo_a_compilarANTLRLexerParser.Delt3IDContext ctx) {
        Set<String> vars = new HashSet<String>();
        vars.add(ctx.ID().getText());
        //System.out.println("ID:"+ctx.ID().getText());
        return vars;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt3Curl(SCvamo_a_compilarANTLRLexerParser.Delt3CurlContext ctx) {
        return visit(ctx.delta());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt3Brack(SCvamo_a_compilarANTLRLexerParser.Delt3BrackContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDelt3Paren(SCvamo_a_compilarANTLRLexerParser.Delt3ParenContext ctx) {
        Set<String> left = visit(ctx.delta(0));
        Set<String> right = visit(ctx.delta(1));
        left.addAll(right);
        return left;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitAdd(SCvamo_a_compilarANTLRLexerParser.AddContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitSub(SCvamo_a_compilarANTLRLexerParser.SubContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitExpr1(SCvamo_a_compilarANTLRLexerParser.Expr1Context ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitTimes(SCvamo_a_compilarANTLRLexerParser.TimesContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDivide(SCvamo_a_compilarANTLRLexerParser.DivideContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitExpr2(SCvamo_a_compilarANTLRLexerParser.Expr2Context ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitNum(SCvamo_a_compilarANTLRLexerParser.NumContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitExpr3(SCvamo_a_compilarANTLRLexerParser.Expr3Context ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitAt(SCvamo_a_compilarANTLRLexerParser.AtContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitUnderLine(SCvamo_a_compilarANTLRLexerParser.UnderLineContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitInput(SCvamo_a_compilarANTLRLexerParser.InputContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitListParen(SCvamo_a_compilarANTLRLexerParser.ListParenContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitListAng(SCvamo_a_compilarANTLRLexerParser.ListAngContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitExp0pEmpty(SCvamo_a_compilarANTLRLexerParser.Exp0pEmptyContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitExpr(SCvamo_a_compilarANTLRLexerParser.ExprContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitPositive(SCvamo_a_compilarANTLRLexerParser.PositiveContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitNegative(SCvamo_a_compilarANTLRLexerParser.NegativeContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitTao1(SCvamo_a_compilarANTLRLexerParser.Tao1Context ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitT0pEmpty(SCvamo_a_compilarANTLRLexerParser.T0pEmptyContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitDots(SCvamo_a_compilarANTLRLexerParser.DotsContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitT1Int(SCvamo_a_compilarANTLRLexerParser.T1IntContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitT1Void(SCvamo_a_compilarANTLRLexerParser.T1VoidContext ctx) {
        return new HashSet<String>();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Set<String> visitT1Paren(SCvamo_a_compilarANTLRLexerParser.T1ParenContext ctx) {
        return new HashSet<String>();
    }
}