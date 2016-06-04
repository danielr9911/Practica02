// Generated from SCvamo_a_compilarANTLRLexer.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCvamo_a_compilarANTLRLexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		VOID=25, STRING=26, NUMERO=27, ID=28, WS=29, ERROR=30;
	public static final int
		RULE_control = 0, RULE_decls = 1, RULE_decldisp = 2, RULE_decllet = 3, 
		RULE_delta = 4, RULE_delta0p = 5, RULE_delta0pp = 6, RULE_delta1 = 7, 
		RULE_delta1p = 8, RULE_delta1pp = 9, RULE_delta2 = 10, RULE_delta2p = 11, 
		RULE_delta2pp = 12, RULE_delta3 = 13, RULE_exp = 14, RULE_exp1 = 15, RULE_exp2 = 16, 
		RULE_exp3 = 17, RULE_exp0p = 18, RULE_eta = 19, RULE_t = 20, RULE_t0p = 21, 
		RULE_t1 = 22;
	public static final String[] ruleNames = {
		"control", "decls", "decldisp", "decllet", "delta", "delta0p", "delta0pp", 
		"delta1", "delta1p", "delta1pp", "delta2", "delta2p", "delta2pp", "delta3", 
		"exp", "exp1", "exp2", "exp3", "exp0p", "eta", "t", "t0p", "t1"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'disp'", "'='", "'let'", "'>>='", "'>>'", "'|'", "'{'", "'}'", 
		"'['", "']'", "'('", "','", "')'", "'+'", "'-'", "'*'", "'/'", "'@'", 
		"'_'", "'input'", "'<'", "'>'", "':'", "'Int'", "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "VOID", "STRING", "NUMERO", "ID", "WS", "ERROR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SCvamo_a_compilarANTLRLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SCvamo_a_compilarANTLRLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ControlContext extends ParserRuleContext {
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
	 
		public ControlContext() { }
		public void copyFrom(ControlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CtrlContext extends ControlContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DeltaContext delta() {
			return getRuleContext(DeltaContext.class,0);
		}
		public CtrlContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitCtrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_control);
		try {
			_localctx = new CtrlContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			decls();
			setState(47);
			delta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclsContext extends ParserRuleContext {
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
	 
		public DeclsContext() { }
		public void copyFrom(DeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclsEmptyContext extends DeclsContext {
		public DeclsEmptyContext(DeclsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDeclsEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetListContext extends DeclsContext {
		public DeclletContext decllet() {
			return getRuleContext(DeclletContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public LetListContext(DeclsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitLetList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DispListContext extends DeclsContext {
		public DecldispContext decldisp() {
			return getRuleContext(DecldispContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DispListContext(DeclsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDispList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__10:
			case ID:
				_localctx = new DeclsEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
				_localctx = new LetListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				decllet();
				setState(51);
				decls();
				}
				break;
			case T__0:
				_localctx = new DispListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				decldisp();
				setState(54);
				decls();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecldispContext extends ParserRuleContext {
		public DecldispContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decldisp; }
	 
		public DecldispContext() { }
		public void copyFrom(DecldispContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DispContext extends DecldispContext {
		public TerminalNode ID() { return getToken(SCvamo_a_compilarANTLRLexerParser.ID, 0); }
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SCvamo_a_compilarANTLRLexerParser.STRING, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DispContext(DecldispContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDisp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecldispContext decldisp() throws RecognitionException {
		DecldispContext _localctx = new DecldispContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decldisp);
		try {
			_localctx = new DispContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			match(ID);
			setState(60);
			t();
			setState(61);
			match(STRING);
			setState(62);
			match(T__1);
			setState(63);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclletContext extends ParserRuleContext {
		public DeclletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decllet; }
	 
		public DeclletContext() { }
		public void copyFrom(DeclletContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetContext extends DeclletContext {
		public TerminalNode ID() { return getToken(SCvamo_a_compilarANTLRLexerParser.ID, 0); }
		public DeltaContext delta() {
			return getRuleContext(DeltaContext.class,0);
		}
		public LetContext(DeclletContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclletContext decllet() throws RecognitionException {
		DeclletContext _localctx = new DeclletContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decllet);
		try {
			_localctx = new LetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__2);
			setState(66);
			match(ID);
			setState(67);
			match(T__1);
			setState(68);
			delta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeltaContext extends ParserRuleContext {
		public DeltaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta; }
	 
		public DeltaContext() { }
		public void copyFrom(DeltaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeltContext extends DeltaContext {
		public Delta1Context delta1() {
			return getRuleContext(Delta1Context.class,0);
		}
		public Delta0ppContext delta0pp() {
			return getRuleContext(Delta0ppContext.class,0);
		}
		public DeltContext(DeltaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeltaContext delta() throws RecognitionException {
		DeltaContext _localctx = new DeltaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delta);
		try {
			_localctx = new DeltContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			delta1();
			setState(71);
			delta0pp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delta0pContext extends ParserRuleContext {
		public Delta0pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta0p; }
	 
		public Delta0pContext() { }
		public void copyFrom(Delta0pContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Delt0pContext extends Delta0pContext {
		public Delta1Context delta1() {
			return getRuleContext(Delta1Context.class,0);
		}
		public Delta0ppContext delta0pp() {
			return getRuleContext(Delta0ppContext.class,0);
		}
		public Delt0pContext(Delta0pContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt0p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delta0pContext delta0p() throws RecognitionException {
		Delta0pContext _localctx = new Delta0pContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_delta0p);
		try {
			_localctx = new Delt0pContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__3);
			setState(74);
			delta1();
			setState(75);
			delta0pp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delta0ppContext extends ParserRuleContext {
		public Delta0ppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta0pp; }
	 
		public Delta0ppContext() { }
		public void copyFrom(Delta0ppContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Delt0ppContext extends Delta0ppContext {
		public Delta0pContext delta0p() {
			return getRuleContext(Delta0pContext.class,0);
		}
		public Delt0ppContext(Delta0ppContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt0pp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Delt0ppEmptyContext extends Delta0ppContext {
		public Delt0ppEmptyContext(Delta0ppContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt0ppEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delta0ppContext delta0pp() throws RecognitionException {
		Delta0ppContext _localctx = new Delta0ppContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delta0pp);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case ID:
				_localctx = new Delt0ppEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__3:
				_localctx = new Delt0ppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				delta0p();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delta1Context extends ParserRuleContext {
		public Delta1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta1; }
	 
		public Delta1Context() { }
		public void copyFrom(Delta1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Delt1Context extends Delta1Context {
		public Delta2Context delta2() {
			return getRuleContext(Delta2Context.class,0);
		}
		public Delta1ppContext delta1pp() {
			return getRuleContext(Delta1ppContext.class,0);
		}
		public Delt1Context(Delta1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delta1Context delta1() throws RecognitionException {
		Delta1Context _localctx = new Delta1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_delta1);
		try {
			_localctx = new Delt1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			delta2();
			setState(82);
			delta1pp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delta1pContext extends ParserRuleContext {
		public Delta1pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta1p; }
	 
		public Delta1pContext() { }
		public void copyFrom(Delta1pContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Delt1pContext extends Delta1pContext {
		public Delta2Context delta2() {
			return getRuleContext(Delta2Context.class,0);
		}
		public Delta1ppContext delta1pp() {
			return getRuleContext(Delta1ppContext.class,0);
		}
		public Delt1pContext(Delta1pContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt1p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delta1pContext delta1p() throws RecognitionException {
		Delta1pContext _localctx = new Delta1pContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_delta1p);
		try {
			_localctx = new Delt1pContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__4);
			setState(85);
			delta2();
			setState(86);
			delta1pp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delta1ppContext extends ParserRuleContext {
		public Delta1ppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta1pp; }
	 
		public Delta1ppContext() { }
		public void copyFrom(Delta1ppContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Delt1ppContext extends Delta1ppContext {
		public Delta1pContext delta1p() {
			return getRuleContext(Delta1pContext.class,0);
		}
		public Delt1ppContext(Delta1ppContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt1pp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Delt1ppEmptyContext extends Delta1ppContext {
		public Delt1ppEmptyContext(Delta1ppContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt1ppEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delta1ppContext delta1pp() throws RecognitionException {
		Delta1ppContext _localctx = new Delta1ppContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delta1pp);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
			case T__3:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case ID:
				_localctx = new Delt1ppEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__4:
				_localctx = new Delt1ppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				delta1p();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delta2Context extends ParserRuleContext {
		public Delta2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta2; }
	 
		public Delta2Context() { }
		public void copyFrom(Delta2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Delt2Context extends Delta2Context {
		public Delta3Context delta3() {
			return getRuleContext(Delta3Context.class,0);
		}
		public Delta2ppContext delta2pp() {
			return getRuleContext(Delta2ppContext.class,0);
		}
		public Delt2Context(Delta2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delta2Context delta2() throws RecognitionException {
		Delta2Context _localctx = new Delta2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_delta2);
		try {
			_localctx = new Delt2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			delta3();
			setState(93);
			delta2pp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delta2pContext extends ParserRuleContext {
		public Delta2pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta2p; }
	 
		public Delta2pContext() { }
		public void copyFrom(Delta2pContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Delt2pContext extends Delta2pContext {
		public Delta3Context delta3() {
			return getRuleContext(Delta3Context.class,0);
		}
		public Delta2ppContext delta2pp() {
			return getRuleContext(Delta2ppContext.class,0);
		}
		public Delt2pContext(Delta2pContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt2p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delta2pContext delta2p() throws RecognitionException {
		Delta2pContext _localctx = new Delta2pContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_delta2p);
		try {
			_localctx = new Delt2pContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__5);
			setState(96);
			delta3();
			setState(97);
			delta2pp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delta2ppContext extends ParserRuleContext {
		public Delta2ppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta2pp; }
	 
		public Delta2ppContext() { }
		public void copyFrom(Delta2ppContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Delt2ppEmptyContext extends Delta2ppContext {
		public Delt2ppEmptyContext(Delta2ppContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt2ppEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Delt2ppContext extends Delta2ppContext {
		public Delta2pContext delta2p() {
			return getRuleContext(Delta2pContext.class,0);
		}
		public Delt2ppContext(Delta2ppContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt2pp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delta2ppContext delta2pp() throws RecognitionException {
		Delta2ppContext _localctx = new Delta2ppContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_delta2pp);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case ID:
				_localctx = new Delt2ppEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__5:
				_localctx = new Delt2ppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				delta2p();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delta3Context extends ParserRuleContext {
		public Delta3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta3; }
	 
		public Delta3Context() { }
		public void copyFrom(Delta3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Delt3CurlContext extends Delta3Context {
		public DeltaContext delta() {
			return getRuleContext(DeltaContext.class,0);
		}
		public Delt3CurlContext(Delta3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt3Curl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Delt3IDContext extends Delta3Context {
		public TerminalNode ID() { return getToken(SCvamo_a_compilarANTLRLexerParser.ID, 0); }
		public Delt3IDContext(Delta3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt3ID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Delt3ParenContext extends Delta3Context {
		public List<DeltaContext> delta() {
			return getRuleContexts(DeltaContext.class);
		}
		public DeltaContext delta(int i) {
			return getRuleContext(DeltaContext.class,i);
		}
		public Delt3ParenContext(Delta3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt3Paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Delt3BrackContext extends Delta3Context {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Delt3BrackContext(Delta3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDelt3Brack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delta3Context delta3() throws RecognitionException {
		Delta3Context _localctx = new Delta3Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_delta3);
		int _la;
		try {
			setState(122);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Delt3IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ID);
				}
				break;
			case T__6:
				_localctx = new Delt3CurlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__6);
				setState(105);
				delta();
				setState(106);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new Delt3BrackContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__8);
				setState(109);
				exp();
				setState(110);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new Delt3ParenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(T__10);
				setState(113);
				delta();
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(114);
					match(T__11);
					setState(115);
					delta();
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 );
				setState(120);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public AddContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public SubContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr1Context extends ExpContext {
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Expr1Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__13);
				setState(125);
				exp();
				setState(126);
				exp0p();
				}
				break;
			case 2:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__14);
				setState(129);
				exp();
				setState(130);
				exp0p();
				}
				break;
			case 3:
				_localctx = new Expr1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				exp1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp1Context extends ParserRuleContext {
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	 
		public Exp1Context() { }
		public void copyFrom(Exp1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimesContext extends Exp1Context {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public TimesContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends Exp1Context {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public DivideContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr2Context extends Exp1Context {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Expr2Context(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp1);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case T__15:
				_localctx = new TimesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__15);
				setState(136);
				exp();
				setState(137);
				exp0p();
				}
				break;
			case T__16:
				_localctx = new DivideContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__16);
				setState(140);
				exp();
				setState(141);
				exp0p();
				}
				break;
			case T__10:
			case T__14:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case NUMERO:
				_localctx = new Expr2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				exp2();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp2Context extends ParserRuleContext {
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
	 
		public Exp2Context() { }
		public void copyFrom(Exp2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumContext extends Exp2Context {
		public EtaContext eta() {
			return getRuleContext(EtaContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(SCvamo_a_compilarANTLRLexerParser.NUMERO, 0); }
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public NumContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr3Context extends Exp2Context {
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public Expr3Context(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp2);
		try {
			setState(151);
			switch (_input.LA(1)) {
			case T__14:
			case NUMERO:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				eta();
				setState(147);
				match(NUMERO);
				setState(148);
				exp0p();
				}
				break;
			case T__10:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				_localctx = new Expr3Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				exp3();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp3Context extends ParserRuleContext {
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
	 
		public Exp3Context() { }
		public void copyFrom(Exp3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputContext extends Exp3Context {
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public InputContext(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListParenContext extends Exp3Context {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public ListParenContext(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitListParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtContext extends Exp3Context {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public AtContext(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitAt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListAngContext extends Exp3Context {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public ListAngContext(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitListAng(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnderLineContext extends Exp3Context {
		public Exp0pContext exp0p() {
			return getRuleContext(Exp0pContext.class,0);
		}
		public UnderLineContext(Exp3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitUnderLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp3Context exp3() throws RecognitionException {
		Exp3Context _localctx = new Exp3Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp3);
		int _la;
		try {
			setState(177);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new AtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__17);
				setState(154);
				exp();
				setState(155);
				exp0p();
				}
				break;
			case T__18:
				_localctx = new UnderLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__18);
				setState(158);
				exp0p();
				}
				break;
			case T__19:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__19);
				setState(160);
				exp0p();
				}
				break;
			case T__10:
				_localctx = new ListParenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(T__10);
				setState(162);
				exp();
				setState(163);
				match(T__12);
				setState(164);
				exp0p();
				}
				break;
			case T__20:
				_localctx = new ListAngContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(T__20);
				setState(167);
				exp();
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(168);
					match(T__11);
					setState(169);
					exp();
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 );
				setState(174);
				match(T__21);
				setState(175);
				exp0p();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp0pContext extends ParserRuleContext {
		public Exp0pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp0p; }
	 
		public Exp0pContext() { }
		public void copyFrom(Exp0pContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Exp0pEmptyContext extends Exp0pContext {
		public Exp0pEmptyContext(Exp0pContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitExp0pEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprContext extends Exp0pContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExprContext(Exp0pContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp0pContext exp0p() throws RecognitionException {
		Exp0pContext _localctx = new Exp0pContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp0p);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Exp0pEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				exp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EtaContext extends ParserRuleContext {
		public EtaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eta; }
	 
		public EtaContext() { }
		public void copyFrom(EtaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegativeContext extends EtaContext {
		public NegativeContext(EtaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositiveContext extends EtaContext {
		public PositiveContext(EtaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitPositive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtaContext eta() throws RecognitionException {
		EtaContext _localctx = new EtaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eta);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case NUMERO:
				_localctx = new PositiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__14:
				_localctx = new NegativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TContext extends ParserRuleContext {
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
	 
		public TContext() { }
		public void copyFrom(TContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Tao1Context extends TContext {
		public T1Context t1() {
			return getRuleContext(T1Context.class,0);
		}
		public T0pContext t0p() {
			return getRuleContext(T0pContext.class,0);
		}
		public Tao1Context(TContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitTao1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_t);
		try {
			_localctx = new Tao1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			t1();
			setState(188);
			t0p();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T0pContext extends ParserRuleContext {
		public T0pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t0p; }
	 
		public T0pContext() { }
		public void copyFrom(T0pContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DotsContext extends T0pContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public DotsContext(T0pContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitDots(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class T0pEmptyContext extends T0pContext {
		public T0pEmptyContext(T0pContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitT0pEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T0pContext t0p() throws RecognitionException {
		T0pContext _localctx = new T0pContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_t0p);
		try {
			setState(193);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case STRING:
				_localctx = new T0pEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__22:
				_localctx = new DotsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__22);
				setState(192);
				t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T1Context extends ParserRuleContext {
		public T1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t1; }
	 
		public T1Context() { }
		public void copyFrom(T1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class T1IntContext extends T1Context {
		public T1IntContext(T1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitT1Int(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class T1ParenContext extends T1Context {
		public List<TContext> t() {
			return getRuleContexts(TContext.class);
		}
		public TContext t(int i) {
			return getRuleContext(TContext.class,i);
		}
		public T1ParenContext(T1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitT1Paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class T1VoidContext extends T1Context {
		public TerminalNode VOID() { return getToken(SCvamo_a_compilarANTLRLexerParser.VOID, 0); }
		public T1VoidContext(T1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCvamo_a_compilarANTLRLexerVisitor ) return ((SCvamo_a_compilarANTLRLexerVisitor<? extends T>)visitor).visitT1Void(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T1Context t1() throws RecognitionException {
		T1Context _localctx = new T1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_t1);
		int _la;
		try {
			setState(207);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new T1IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__23);
				}
				break;
			case VOID:
				_localctx = new T1VoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(VOID);
				}
				break;
			case T__10:
				_localctx = new T1ParenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(T__10);
				setState(198);
				t();
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					match(T__11);
					setState(200);
					t();
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 );
				setState(205);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\bR\n\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13]\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\5\16h\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\6\17w\n\17\r\17\16\17x\3\17\3\17\5\17}\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0088\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0093\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u009a\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u00ad\n\23\r\23\16\23\u00ae\3\23\3"+
		"\23\3\23\5\23\u00b4\n\23\3\24\3\24\5\24\u00b8\n\24\3\25\3\25\5\25\u00bc"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00c4\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\6\30\u00cc\n\30\r\30\16\30\u00cd\3\30\3\30\5\30\u00d2\n\30"+
		"\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\u00d5"+
		"\2\60\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\bC\3\2\2\2\nH\3\2\2\2\fK\3\2\2\2\16"+
		"Q\3\2\2\2\20S\3\2\2\2\22V\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30a\3\2\2\2"+
		"\32g\3\2\2\2\34|\3\2\2\2\36\u0087\3\2\2\2 \u0092\3\2\2\2\"\u0099\3\2\2"+
		"\2$\u00b3\3\2\2\2&\u00b7\3\2\2\2(\u00bb\3\2\2\2*\u00bd\3\2\2\2,\u00c3"+
		"\3\2\2\2.\u00d1\3\2\2\2\60\61\5\4\3\2\61\62\5\n\6\2\62\3\3\2\2\2\63;\3"+
		"\2\2\2\64\65\5\b\5\2\65\66\5\4\3\2\66;\3\2\2\2\678\5\6\4\289\5\4\3\29"+
		";\3\2\2\2:\63\3\2\2\2:\64\3\2\2\2:\67\3\2\2\2;\5\3\2\2\2<=\7\3\2\2=>\7"+
		"\36\2\2>?\5*\26\2?@\7\34\2\2@A\7\4\2\2AB\5\36\20\2B\7\3\2\2\2CD\7\5\2"+
		"\2DE\7\36\2\2EF\7\4\2\2FG\5\n\6\2G\t\3\2\2\2HI\5\20\t\2IJ\5\16\b\2J\13"+
		"\3\2\2\2KL\7\6\2\2LM\5\20\t\2MN\5\16\b\2N\r\3\2\2\2OR\3\2\2\2PR\5\f\7"+
		"\2QO\3\2\2\2QP\3\2\2\2R\17\3\2\2\2ST\5\26\f\2TU\5\24\13\2U\21\3\2\2\2"+
		"VW\7\7\2\2WX\5\26\f\2XY\5\24\13\2Y\23\3\2\2\2Z]\3\2\2\2[]\5\22\n\2\\Z"+
		"\3\2\2\2\\[\3\2\2\2]\25\3\2\2\2^_\5\34\17\2_`\5\32\16\2`\27\3\2\2\2ab"+
		"\7\b\2\2bc\5\34\17\2cd\5\32\16\2d\31\3\2\2\2eh\3\2\2\2fh\5\30\r\2ge\3"+
		"\2\2\2gf\3\2\2\2h\33\3\2\2\2i}\7\36\2\2jk\7\t\2\2kl\5\n\6\2lm\7\n\2\2"+
		"m}\3\2\2\2no\7\13\2\2op\5\36\20\2pq\7\f\2\2q}\3\2\2\2rs\7\r\2\2sv\5\n"+
		"\6\2tu\7\16\2\2uw\5\n\6\2vt\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3"+
		"\2\2\2z{\7\17\2\2{}\3\2\2\2|i\3\2\2\2|j\3\2\2\2|n\3\2\2\2|r\3\2\2\2}\35"+
		"\3\2\2\2~\177\7\20\2\2\177\u0080\5\36\20\2\u0080\u0081\5&\24\2\u0081\u0088"+
		"\3\2\2\2\u0082\u0083\7\21\2\2\u0083\u0084\5\36\20\2\u0084\u0085\5&\24"+
		"\2\u0085\u0088\3\2\2\2\u0086\u0088\5 \21\2\u0087~\3\2\2\2\u0087\u0082"+
		"\3\2\2\2\u0087\u0086\3\2\2\2\u0088\37\3\2\2\2\u0089\u008a\7\22\2\2\u008a"+
		"\u008b\5\36\20\2\u008b\u008c\5&\24\2\u008c\u0093\3\2\2\2\u008d\u008e\7"+
		"\23\2\2\u008e\u008f\5\36\20\2\u008f\u0090\5&\24\2\u0090\u0093\3\2\2\2"+
		"\u0091\u0093\5\"\22\2\u0092\u0089\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u0091"+
		"\3\2\2\2\u0093!\3\2\2\2\u0094\u0095\5(\25\2\u0095\u0096\7\35\2\2\u0096"+
		"\u0097\5&\24\2\u0097\u009a\3\2\2\2\u0098\u009a\5$\23\2\u0099\u0094\3\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a#\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d"+
		"\5\36\20\2\u009d\u009e\5&\24\2\u009e\u00b4\3\2\2\2\u009f\u00a0\7\25\2"+
		"\2\u00a0\u00b4\5&\24\2\u00a1\u00a2\7\26\2\2\u00a2\u00b4\5&\24\2\u00a3"+
		"\u00a4\7\r\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\7\17\2\2\u00a6\u00a7"+
		"\5&\24\2\u00a7\u00b4\3\2\2\2\u00a8\u00a9\7\27\2\2\u00a9\u00ac\5\36\20"+
		"\2\u00aa\u00ab\7\16\2\2\u00ab\u00ad\5\36\20\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\7\30\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u009b\3\2\2\2\u00b3\u009f\3\2\2\2\u00b3\u00a1\3\2\2\2\u00b3\u00a3\3\2"+
		"\2\2\u00b3\u00a8\3\2\2\2\u00b4%\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8"+
		"\5\36\20\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\'\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00bc\7\21\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3"+
		"\2\2\2\u00bc)\3\2\2\2\u00bd\u00be\5.\30\2\u00be\u00bf\5,\27\2\u00bf+\3"+
		"\2\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c2\7\31\2\2\u00c2\u00c4\5*\26\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4-\3\2\2\2\u00c5\u00d2\7\32\2\2"+
		"\u00c6\u00d2\7\33\2\2\u00c7\u00c8\7\r\2\2\u00c8\u00cb\5*\26\2\u00c9\u00ca"+
		"\7\16\2\2\u00ca\u00cc\5*\26\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\7\17\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c6\3\2\2\2"+
		"\u00d1\u00c7\3\2\2\2\u00d2/\3\2\2\2\22:Q\\gx|\u0087\u0092\u0099\u00ae"+
		"\u00b3\u00b7\u00bb\u00c3\u00cd\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}