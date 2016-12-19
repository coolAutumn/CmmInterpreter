// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CmmInterpreter/resources/CmmLexer.g4 by ANTLR 4.5.3

    package old;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Type=1, LeftBracket=2, RightBracket=3, Iden=4, LeftSquareBracket=5, RightSquareBracket=6, 
		IntConstant=7, DoubleConstant=8, LeftParenthesis=9, RightParenthesis=10, 
		Compare=11, Boolean=12, If=13, Else=14, While=15, Read=16, Write=17, Add=18, 
		Minus=19, Multiply=20, Divide=21, Equal=22, Semicolon=23, Comma=24, Ws=25, 
		Note=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Type", "LeftBracket", "RightBracket", "Iden", "LeftSquareBracket", "RightSquareBracket", 
		"IntConstant", "DoubleConstant", "LeftParenthesis", "RightParenthesis", 
		"Compare", "Boolean", "If", "Else", "While", "Read", "Write", "Add", "Minus", 
		"Multiply", "Divide", "Equal", "Semicolon", "Comma", "Ws", "Note"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", null, "'['", "']'", null, null, "'('", "')'", 
		null, null, "'if'", "'else'", "'while'", "'read'", "'write'", "'+'", "'-'", 
		"'*'", "'/'", "'='", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Type", "LeftBracket", "RightBracket", "Iden", "LeftSquareBracket", 
		"RightSquareBracket", "IntConstant", "DoubleConstant", "LeftParenthesis", 
		"RightParenthesis", "Compare", "Boolean", "If", "Else", "While", "Read", 
		"Write", "Add", "Minus", "Multiply", "Divide", "Equal", "Semicolon", "Comma", 
		"Ws", "Note"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "old/CmmLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00e4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2A\n\2"+
		"\3\3\3\3\3\4\3\4\3\5\5\5H\n\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\5\5Q\n\5"+
		"\7\5S\n\5\f\5\16\5V\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b_\n\b\f\b\16\b"+
		"b\13\b\5\bd\n\b\3\t\5\tg\n\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\7"+
		"\tr\n\t\f\t\16\tu\13\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\5\t~\n\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008e\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u00c3\n\32\r\32\16\32\u00c4\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\7\33\u00cd\n\33\f\33\16\33\u00d0\13\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\7\33\u00d8\n\33\f\33\16\33\u00db\13\33\3"+
		"\33\5\33\u00de\n\33\3\33\5\33\u00e1\n\33\3\33\3\33\2\2\34\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\t\4\2C\\c|\6\2\62;C\\"+
		"aac|\5\2\62;C\\c|\3\2\63;\3\2\62;\7\2\13\f\17\17\"\"))~~\4\2\f\f\17\17"+
		"\u00f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3@\3\2\2\2\5B\3\2\2\2"+
		"\7D\3\2\2\2\tG\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17c\3\2\2\2\21}\3\2\2\2"+
		"\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u008d\3\2\2\2\31\u0098\3\2\2\2\33"+
		"\u009a\3\2\2\2\35\u009d\3\2\2\2\37\u00a2\3\2\2\2!\u00a8\3\2\2\2#\u00ad"+
		"\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b7\3\2\2\2+\u00b9\3\2\2\2"+
		"-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61\u00bf\3\2\2\2\63\u00c2\3\2\2\2\65\u00e0"+
		"\3\2\2\2\678\7k\2\289\7p\2\29A\7v\2\2:;\7f\2\2;<\7q\2\2<=\7w\2\2=>\7d"+
		"\2\2>?\7n\2\2?A\7g\2\2@\67\3\2\2\2@:\3\2\2\2A\4\3\2\2\2BC\7}\2\2C\6\3"+
		"\2\2\2DE\7\177\2\2E\b\3\2\2\2FH\t\2\2\2GF\3\2\2\2HT\3\2\2\2IK\t\3\2\2"+
		"JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OQ\t\4\2\2"+
		"PO\3\2\2\2QS\3\2\2\2RL\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\n\3\2\2"+
		"\2VT\3\2\2\2WX\7]\2\2X\f\3\2\2\2YZ\7_\2\2Z\16\3\2\2\2[d\7\62\2\2\\`\t"+
		"\5\2\2]_\t\6\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2c[\3\2\2\2c\\\3\2\2\2d\20\3\2\2\2eg\7\62\2\2fe\3\2\2\2fg\3\2\2\2"+
		"gh\3\2\2\2hl\7\60\2\2ik\t\6\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2m~\3\2\2\2nl\3\2\2\2os\t\5\2\2pr\t\6\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2"+
		"\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vz\7\60\2\2wy\t\6\2\2xw\3\2\2\2y|\3\2"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}f\3\2\2\2}o\3\2\2\2~\22\3"+
		"\2\2\2\177\u0080\7*\2\2\u0080\24\3\2\2\2\u0081\u0082\7+\2\2\u0082\26\3"+
		"\2\2\2\u0083\u0084\7?\2\2\u0084\u008e\7?\2\2\u0085\u008e\7>\2\2\u0086"+
		"\u0087\7>\2\2\u0087\u008e\7?\2\2\u0088\u008e\7@\2\2\u0089\u008a\7@\2\2"+
		"\u008a\u008e\7?\2\2\u008b\u008c\7#\2\2\u008c\u008e\7?\2\2\u008d\u0083"+
		"\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008d\u008b\3\2\2\2\u008e\30\3\2\2\2\u008f\u0090\7v\2\2"+
		"\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0099\7g\2\2\u0093\u0094"+
		"\7h\2\2\u0094\u0095\7c\2\2\u0095\u0096\7n\2\2\u0096\u0097\7u\2\2\u0097"+
		"\u0099\7g\2\2\u0098\u008f\3\2\2\2\u0098\u0093\3\2\2\2\u0099\32\3\2\2\2"+
		"\u009a\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c\34\3\2\2\2\u009d\u009e\7"+
		"g\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\36"+
		"\3\2\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7f\2\2\u00ac\"\3\2\2\2\u00ad"+
		"\u00ae\7y\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7v\2\2"+
		"\u00b1\u00b2\7g\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4&\3\2\2\2\u00b5"+
		"\u00b6\7/\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8*\3\2\2\2\u00b9\u00ba"+
		"\7\61\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc.\3\2\2\2\u00bd\u00be"+
		"\7=\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7.\2\2\u00c0\62\3\2\2\2\u00c1\u00c3"+
		"\t\7\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\32\2\2\u00c7\64\3\2\2"+
		"\2\u00c8\u00c9\7\61\2\2\u00c9\u00ca\7,\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd"+
		"\13\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2"+
		"\7,\2\2\u00d2\u00e1\7\61\2\2\u00d3\u00d4\7\61\2\2\u00d4\u00d5\7\61\2\2"+
		"\u00d5\u00d9\3\2\2\2\u00d6\u00d8\n\b\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00de\7\17\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\7\f\2\2\u00e0\u00c8\3\2\2\2\u00e0"+
		"\u00d3\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\33\2\2\u00e3\66\3\2\2"+
		"\2\27\2@GJLPT`cflsz}\u008d\u0098\u00c4\u00ce\u00d9\u00dd\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}