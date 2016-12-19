// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CmmInterpreter/resources/Cmm.g4 by ANTLR 4.5.3

    package tokenanalysis;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Else=2, While=3, Read=4, Write=5, Type=6, LeftBracket=7, RightBracket=8, 
		LeftSquareBracket=9, RightSquareBracket=10, LeftParenthesis=11, RightParenthesis=12, 
		Compare=13, Boolean=14, Add=15, Minus=16, Multiply=17, Divide=18, Equal=19, 
		Semicolon=20, Comma=21, IntConstant=22, DoubleConstant=23, Ident=24, Ws=25, 
		Note=26;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_varDecl = 2, RULE_var = 3, RULE_varList = 4, 
		RULE_ifStmt = 5, RULE_whileStmt = 6, RULE_readStmt = 7, RULE_writeStmt = 8, 
		RULE_assignStmt = 9, RULE_constants = 10, RULE_exprStmt = 11, RULE_expr = 12;
	public static final String[] ruleNames = {
		"prog", "stmt", "varDecl", "var", "varList", "ifStmt", "whileStmt", "readStmt", 
		"writeStmt", "assignStmt", "constants", "exprStmt", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'read'", "'write'", null, "'{'", "'}'", 
		"'['", "']'", "'('", "')'", null, null, "'+'", "'-'", "'*'", "'/'", "'='", 
		"';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "If", "Else", "While", "Read", "Write", "Type", "LeftBracket", "RightBracket", 
		"LeftSquareBracket", "RightSquareBracket", "LeftParenthesis", "RightParenthesis", 
		"Compare", "Boolean", "Add", "Minus", "Multiply", "Divide", "Equal", "Semicolon", 
		"Comma", "IntConstant", "DoubleConstant", "Ident", "Ws", "Note"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				stmt();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Read) | (1L << Write) | (1L << Type) | (1L << Ident))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(CmmParser.Semicolon, 0); }
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				whileStmt();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				ifStmt();
				}
				break;
			case Read:
			case Write:
			case Type:
			case Ident:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				switch (_input.LA(1)) {
				case Type:
					{
					setState(33);
					varDecl();
					}
					break;
				case Ident:
					{
					setState(34);
					assignStmt();
					}
					break;
				case Read:
					{
					setState(35);
					readStmt();
					}
					break;
				case Write:
					{
					setState(36);
					writeStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39);
				match(Semicolon);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(CmmParser.Type, 0); }
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(Type);
			setState(44);
			varList();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(CmmParser.Ident, 0); }
		public TerminalNode LeftSquareBracket() { return getToken(CmmParser.LeftSquareBracket, 0); }
		public TerminalNode IntConstant() { return getToken(CmmParser.IntConstant, 0); }
		public TerminalNode RightSquareBracket() { return getToken(CmmParser.RightSquareBracket, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(Ident);
				setState(47);
				match(LeftSquareBracket);
				setState(48);
				match(IntConstant);
				setState(49);
				match(RightSquareBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(Ident);
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

	public static class VarListContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CmmParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CmmParser.Comma, i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			var();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(54);
				match(Comma);
				setState(55);
				var();
				}
				}
				setState(60);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CmmParser.If, 0); }
		public TerminalNode LeftParenthesis() { return getToken(CmmParser.LeftParenthesis, 0); }
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(CmmParser.RightParenthesis, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(CmmParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CmmParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CmmParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CmmParser.RightBracket, i);
		}
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public TerminalNode Else() { return getToken(CmmParser.Else, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(If);
			setState(62);
			match(LeftParenthesis);
			setState(63);
			exprStmt();
			setState(64);
			match(RightParenthesis);
			setState(65);
			match(LeftBracket);
			setState(67);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Read) | (1L << Write) | (1L << Type) | (1L << Ident))) != 0)) {
				{
				setState(66);
				prog();
				}
			}

			setState(69);
			match(RightBracket);
			setState(76);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(70);
				match(Else);
				setState(71);
				match(LeftBracket);
				setState(73);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Read) | (1L << Write) | (1L << Type) | (1L << Ident))) != 0)) {
					{
					setState(72);
					prog();
					}
				}

				setState(75);
				match(RightBracket);
				}
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CmmParser.While, 0); }
		public TerminalNode LeftParenthesis() { return getToken(CmmParser.LeftParenthesis, 0); }
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(CmmParser.RightParenthesis, 0); }
		public TerminalNode LeftBracket() { return getToken(CmmParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CmmParser.RightBracket, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(While);
			setState(79);
			match(LeftParenthesis);
			setState(80);
			exprStmt();
			setState(81);
			match(RightParenthesis);
			setState(82);
			match(LeftBracket);
			setState(84);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Read) | (1L << Write) | (1L << Type) | (1L << Ident))) != 0)) {
				{
				setState(83);
				prog();
				}
			}

			setState(86);
			match(RightBracket);
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

	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode Read() { return getToken(CmmParser.Read, 0); }
		public TerminalNode LeftParenthesis() { return getToken(CmmParser.LeftParenthesis, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(CmmParser.RightParenthesis, 0); }
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Read);
			setState(89);
			match(LeftParenthesis);
			setState(90);
			var();
			setState(91);
			match(RightParenthesis);
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

	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode Write() { return getToken(CmmParser.Write, 0); }
		public TerminalNode LeftParenthesis() { return getToken(CmmParser.LeftParenthesis, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(CmmParser.RightParenthesis, 0); }
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(Write);
			setState(94);
			match(LeftParenthesis);
			setState(95);
			var();
			setState(96);
			match(RightParenthesis);
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

	public static class AssignStmtContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Equal() { return getToken(CmmParser.Equal, 0); }
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			var();
			setState(99);
			match(Equal);
			setState(100);
			exprStmt();
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

	public static class ConstantsContext extends ParserRuleContext {
		public TerminalNode IntConstant() { return getToken(CmmParser.IntConstant, 0); }
		public TerminalNode DoubleConstant() { return getToken(CmmParser.DoubleConstant, 0); }
		public TerminalNode Boolean() { return getToken(CmmParser.Boolean, 0); }
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << IntConstant) | (1L << DoubleConstant))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(CmmParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(CmmParser.RightParenthesis, 0); }
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprStmt);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case Compare:
			case Boolean:
			case Add:
			case Minus:
			case Multiply:
			case Divide:
			case IntConstant:
			case DoubleConstant:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				expr();
				}
				break;
			case LeftParenthesis:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(105);
				match(LeftParenthesis);
				setState(106);
				expr();
				setState(107);
				match(RightParenthesis);
				}
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

	public static class ExprContext extends ParserRuleContext {
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Ident() { return getToken(CmmParser.Ident, 0); }
		public TerminalNode Add() { return getToken(CmmParser.Add, 0); }
		public TerminalNode Minus() { return getToken(CmmParser.Minus, 0); }
		public TerminalNode Multiply() { return getToken(CmmParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(CmmParser.Divide, 0); }
		public TerminalNode Compare() { return getToken(CmmParser.Compare, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				constants();
				setState(112);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(Ident);
				setState(115);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(Add);
				setState(117);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(Minus);
				setState(119);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(Multiply);
				setState(121);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(Divide);
				setState(123);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				match(Compare);
				setState(125);
				expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				constants();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				match(Ident);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3(\n\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\66\n\5\3\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7F\n\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bW\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\rp\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0083"+
		"\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\4\2\20\20\30\31"+
		"\u008c\2\35\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f"+
		"?\3\2\2\2\16P\3\2\2\2\20Z\3\2\2\2\22_\3\2\2\2\24d\3\2\2\2\26h\3\2\2\2"+
		"\30o\3\2\2\2\32\u0082\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2"+
		"\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!,\5\16\b\2\",\5\f\7\2#(\5\6\4"+
		"\2$(\5\24\13\2%(\5\20\t\2&(\5\22\n\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2"+
		"\'&\3\2\2\2()\3\2\2\2)*\7\26\2\2*,\3\2\2\2+!\3\2\2\2+\"\3\2\2\2+\'\3\2"+
		"\2\2,\5\3\2\2\2-.\7\b\2\2./\5\n\6\2/\7\3\2\2\2\60\61\7\32\2\2\61\62\7"+
		"\13\2\2\62\63\7\30\2\2\63\66\7\f\2\2\64\66\7\32\2\2\65\60\3\2\2\2\65\64"+
		"\3\2\2\2\66\t\3\2\2\2\67<\5\b\5\289\7\27\2\29;\5\b\5\2:8\3\2\2\2;>\3\2"+
		"\2\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2\2><\3\2\2\2?@\7\3\2\2@A\7\r\2\2AB\5"+
		"\30\r\2BC\7\16\2\2CE\7\t\2\2DF\5\2\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2G"+
		"N\7\n\2\2HI\7\4\2\2IK\7\t\2\2JL\5\2\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2"+
		"MO\7\n\2\2NH\3\2\2\2NO\3\2\2\2O\r\3\2\2\2PQ\7\5\2\2QR\7\r\2\2RS\5\30\r"+
		"\2ST\7\16\2\2TV\7\t\2\2UW\5\2\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\n"+
		"\2\2Y\17\3\2\2\2Z[\7\6\2\2[\\\7\r\2\2\\]\5\b\5\2]^\7\16\2\2^\21\3\2\2"+
		"\2_`\7\7\2\2`a\7\r\2\2ab\5\b\5\2bc\7\16\2\2c\23\3\2\2\2de\5\b\5\2ef\7"+
		"\25\2\2fg\5\30\r\2g\25\3\2\2\2hi\t\2\2\2i\27\3\2\2\2jp\5\32\16\2kl\7\r"+
		"\2\2lm\5\32\16\2mn\7\16\2\2np\3\2\2\2oj\3\2\2\2ok\3\2\2\2p\31\3\2\2\2"+
		"qr\5\26\f\2rs\5\32\16\2s\u0083\3\2\2\2tu\7\32\2\2u\u0083\5\32\16\2vw\7"+
		"\21\2\2w\u0083\5\32\16\2xy\7\22\2\2y\u0083\5\32\16\2z{\7\23\2\2{\u0083"+
		"\5\32\16\2|}\7\24\2\2}\u0083\5\32\16\2~\177\7\17\2\2\177\u0083\5\32\16"+
		"\2\u0080\u0083\5\26\f\2\u0081\u0083\7\32\2\2\u0082q\3\2\2\2\u0082t\3\2"+
		"\2\2\u0082v\3\2\2\2\u0082x\3\2\2\2\u0082z\3\2\2\2\u0082|\3\2\2\2\u0082"+
		"~\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\33\3\2\2\2\r\37"+
		"\'+\65<EKNVo\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}