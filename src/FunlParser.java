// Generated from Funl.g by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MAIN=2, WHERE=3, RPAREN=4, LPAREN=5, RBRACE=6, LBRACE=7, IF=8, THEN=9, 
		ELSE=10, COMMA=11, LAMBDA=12, ARROW=13, SEMICOLON=14, EQ=15, EQUALS=16, 
		MINUS=17, AND=18, OR=19, NEQ=20, LT=21, GT=22, LTE=23, GTE=24, PLUS=25, 
		DIV=26, MUL=27, CONS=28, IDENT=29, NUMERAL=30, LETTER=31;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_decls = 2, RULE_where = 3, RULE_args = 4, 
		RULE_expr = 5, RULE_lexpr = 6, RULE_aexpr = 7, RULE_binop = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "decls", "where", "args", "expr", "lexpr", "aexpr", 
			"binop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'main'", "'where'", "')'", "'('", "'}'", "'{'", "'if'", 
			"'then'", "'else'", "','", "'\\'", "'->'", "';'", "'=='", "'='", "'-'", 
			"'&&'", "'||'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'/'", "'*'", 
			"'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "MAIN", "WHERE", "RPAREN", "LPAREN", "RBRACE", "LBRACE", 
			"IF", "THEN", "ELSE", "COMMA", "LAMBDA", "ARROW", "SEMICOLON", "EQ", 
			"EQUALS", "MINUS", "AND", "OR", "NEQ", "LT", "GT", "LTE", "GTE", "PLUS", 
			"DIV", "MUL", "CONS", "IDENT", "NUMERAL", "LETTER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Funl.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DeclsContext> decls() {
			return getRuleContexts(DeclsContext.class);
		}
		public DeclsContext decls(int i) {
			return getRuleContext(DeclsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(18);
				decls();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			main();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(25);
				decls();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(FunlParser.MAIN, 0); }
		public TerminalNode EQUALS() { return getToken(FunlParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunlParser.SEMICOLON, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(MAIN);
			setState(32);
			match(EQUALS);
			setState(33);
			expr();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(34);
				where();
				}
			}

			setState(37);
			match(SEMICOLON);
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
		public TerminalNode IDENT() { return getToken(FunlParser.IDENT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(FunlParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunlParser.SEMICOLON, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(IDENT);
			setState(40);
			args();
			setState(41);
			match(EQUALS);
			setState(42);
			expr();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(43);
				where();
				}
			}

			setState(46);
			match(SEMICOLON);
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

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(FunlParser.WHERE, 0); }
		public TerminalNode LBRACE() { return getToken(FunlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FunlParser.RBRACE, 0); }
		public List<DeclsContext> decls() {
			return getRuleContexts(DeclsContext.class);
		}
		public DeclsContext decls(int i) {
			return getRuleContext(DeclsContext.class,i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(WHERE);
			setState(49);
			match(LBRACE);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				decls();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(55);
			match(RBRACE);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(FunlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FunlParser.IDENT, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(57);
				match(IDENT);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinOpExprContext extends ExprContext {
		public LexprContext lhs;
		public ExprContext rhs;
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BinOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterBinOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitBinOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitBinOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftExprContext extends ExprContext {
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public LeftExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterLeftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitLeftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitLeftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(FunlParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new LeftExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				lexpr();
				}
				break;
			case 2:
				_localctx = new BinOpExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				((BinOpExprContext)_localctx).lhs = lexpr();
				setState(65);
				binop();
				setState(66);
				((BinOpExprContext)_localctx).rhs = expr();
				}
				break;
			case 3:
				_localctx = new MinusExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(MINUS);
				setState(69);
				expr();
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

	public static class LexprContext extends ParserRuleContext {
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
	 
		public LexprContext() { }
		public void copyFrom(LexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApplicationExprContext extends LexprContext {
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public ApplicationExprContext(LexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterApplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitApplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitApplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends LexprContext {
		public ExprContext clause;
		public ExprContext then_expr;
		public ExprContext else_expr;
		public TerminalNode IF() { return getToken(FunlParser.IF, 0); }
		public TerminalNode THEN() { return getToken(FunlParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(FunlParser.ELSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfExprContext(LexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExprContext extends LexprContext {
		public TerminalNode LAMBDA() { return getToken(FunlParser.LAMBDA, 0); }
		public TerminalNode IDENT() { return getToken(FunlParser.IDENT, 0); }
		public TerminalNode ARROW() { return getToken(FunlParser.ARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LambdaExprContext(LexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lexpr);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAMBDA:
				_localctx = new LambdaExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(LAMBDA);
				setState(73);
				match(IDENT);
				setState(74);
				match(ARROW);
				setState(75);
				expr();
				}
				break;
			case IF:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(IF);
				setState(77);
				((IfExprContext)_localctx).clause = expr();
				setState(78);
				match(THEN);
				setState(79);
				((IfExprContext)_localctx).then_expr = expr();
				setState(80);
				match(ELSE);
				setState(81);
				((IfExprContext)_localctx).else_expr = expr();
				}
				break;
			case LPAREN:
			case IDENT:
			case NUMERAL:
				_localctx = new ApplicationExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83);
					aexpr();
					}
					}
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENT) | (1L << NUMERAL))) != 0) );
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

	public static class AexprContext extends ParserRuleContext {
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
	 
		public AexprContext() { }
		public void copyFrom(AexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentExprContext extends AexprContext {
		public TerminalNode IDENT() { return getToken(FunlParser.IDENT, 0); }
		public IdentExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterIdentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitIdentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitIdentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends AexprContext {
		public TerminalNode NUMERAL() { return getToken(FunlParser.NUMERAL, 0); }
		public NumExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends AexprContext {
		public TerminalNode LPAREN() { return getToken(FunlParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunlParser.RPAREN, 0); }
		public ParenExprContext(AexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aexpr);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(LPAREN);
				setState(91);
				expr();
				setState(92);
				match(RPAREN);
				}
				break;
			case IDENT:
				_localctx = new IdentExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(IDENT);
				}
				break;
			case NUMERAL:
				_localctx = new NumExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(NUMERAL);
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunlParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunlParser.OR, 0); }
		public TerminalNode EQ() { return getToken(FunlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(FunlParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(FunlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(FunlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(FunlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(FunlParser.GTE, 0); }
		public TerminalNode PLUS() { return getToken(FunlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunlParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(FunlParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(FunlParser.MUL, 0); }
		public TerminalNode CONS() { return getToken(FunlParser.CONS, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunlVisitor ) return ((FunlVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << MINUS) | (1L << AND) | (1L << OR) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LTE) | (1L << GTE) | (1L << PLUS) | (1L << DIV) | (1L << MUL) | (1L << CONS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!g\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26\n"+
		"\2\f\2\16\2\31\13\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\3\3\3\3"+
		"\5\3&\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\5\3\5\3\5\6\5"+
		"\66\n\5\r\5\16\5\67\3\5\3\5\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\6\bW\n\b\r\b\16\bX\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\n\3"+
		"\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\4\2\21\21\23\36\2j\2\27\3\2\2\2"+
		"\4!\3\2\2\2\6)\3\2\2\2\b\62\3\2\2\2\n>\3\2\2\2\fH\3\2\2\2\16Z\3\2\2\2"+
		"\20b\3\2\2\2\22d\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\36\5\4\3\2\33"+
		"\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\3"+
		"\3\2\2\2 \36\3\2\2\2!\"\7\4\2\2\"#\7\22\2\2#%\5\f\7\2$&\5\b\5\2%$\3\2"+
		"\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\20\2\2(\5\3\2\2\2)*\7\37\2\2*+\5\n\6\2"+
		"+,\7\22\2\2,.\5\f\7\2-/\5\b\5\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61"+
		"\7\20\2\2\61\7\3\2\2\2\62\63\7\5\2\2\63\65\7\t\2\2\64\66\5\6\4\2\65\64"+
		"\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\b\2\2:"+
		"\t\3\2\2\2;=\7\37\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2"+
		"\2\2@>\3\2\2\2AI\5\16\b\2BC\5\16\b\2CD\5\22\n\2DE\5\f\7\2EI\3\2\2\2FG"+
		"\7\23\2\2GI\5\f\7\2HA\3\2\2\2HB\3\2\2\2HF\3\2\2\2I\r\3\2\2\2JK\7\16\2"+
		"\2KL\7\37\2\2LM\7\17\2\2M[\5\f\7\2NO\7\n\2\2OP\5\f\7\2PQ\7\13\2\2QR\5"+
		"\f\7\2RS\7\f\2\2ST\5\f\7\2T[\3\2\2\2UW\5\20\t\2VU\3\2\2\2WX\3\2\2\2XV"+
		"\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZJ\3\2\2\2ZN\3\2\2\2ZV\3\2\2\2[\17\3\2\2\2"+
		"\\]\7\7\2\2]^\5\f\7\2^_\7\6\2\2_c\3\2\2\2`c\7\37\2\2ac\7 \2\2b\\\3\2\2"+
		"\2b`\3\2\2\2ba\3\2\2\2c\21\3\2\2\2de\t\2\2\2e\23\3\2\2\2\f\27\36%.\67"+
		">HXZb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}