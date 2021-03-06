// Generated from Mox.g4 by ANTLR 4.7.1

    package me.gmisail.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, NAME=50, STRING=51, CHAR=52, NUM=53, 
		INT=54, FLOAT=55, NEWLINE=56, WS=57, LINE_COMMENT=58, BLOCK_COMMENT=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"NAME", "STRING", "CHAR", "NUM", "INT", "FLOAT", "Digit", "ExponentPart", 
		"HexDigit", "HexExponentPart", "NEWLINE", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'class'", "'end'", "'module'", "'var'", "':'", "'.'", 
		"'new'", "'!'", "'delete'", "'['", "']'", "'function'", "'<'", "'>'", 
		"'->'", "'@size'", "'@char'", "'extern'", "','", "'return'", "'if'", "'else if'", 
		"'else'", "'while'", "'from'", "'to'", "'for'", "'import'", "'&'", "'|'", 
		"'~'", "'<<'", "'>>'", "'+'", "'-'", "'and'", "'or'", "'*'", "'/'", "'%'", 
		"'true'", "'false'", "'='", "'=='", "'>='", "'<='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "NAME", "STRING", "CHAR", "NUM", "INT", "FLOAT", "NEWLINE", 
		"WS", "LINE_COMMENT", "BLOCK_COMMENT"
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


	public MoxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mox.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/"+
		"\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\7\63\u013d"+
		"\n\63\f\63\16\63\u0140\13\63\3\64\3\64\7\64\u0144\n\64\f\64\16\64\u0147"+
		"\13\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u0151\n\66\3\67\6"+
		"\67\u0154\n\67\r\67\16\67\u0155\38\68\u0159\n8\r8\168\u015a\38\38\78\u015f"+
		"\n8\f8\168\u0162\138\38\58\u0165\n8\38\38\68\u0169\n8\r8\168\u016a\38"+
		"\58\u016e\n8\38\68\u0171\n8\r8\168\u0172\38\38\58\u0177\n8\39\39\3:\3"+
		":\5:\u017d\n:\3:\6:\u0180\n:\r:\16:\u0181\3;\3;\3<\3<\5<\u0188\n<\3<\6"+
		"<\u018b\n<\r<\16<\u018c\3=\5=\u0190\n=\3=\3=\6=\u0194\n=\r=\16=\u0195"+
		"\3=\3=\3>\6>\u019b\n>\r>\16>\u019c\3>\3>\3?\3?\7?\u01a3\n?\f?\16?\u01a6"+
		"\13?\3?\3?\3@\3@\3@\3@\7@\u01ae\n@\f@\16@\u01b1\13@\3@\3@\3@\3@\3@\3\u01af"+
		"\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q\2s\2u\2w\2y:{;}<\177=\3\2\r\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17"+
		"\17$$\3\2))\3\2\62;\4\2GGgg\4\2--//\5\2\62;CHch\4\2RRrr\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\2\u01c8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2"+
		"\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0083\3\2\2\2\7\u0085\3\2\2\2\t\u008b"+
		"\3\2\2\2\13\u008f\3\2\2\2\r\u0096\3\2\2\2\17\u009a\3\2\2\2\21\u009c\3"+
		"\2\2\2\23\u009e\3\2\2\2\25\u00a2\3\2\2\2\27\u00a4\3\2\2\2\31\u00ab\3\2"+
		"\2\2\33\u00ad\3\2\2\2\35\u00af\3\2\2\2\37\u00b8\3\2\2\2!\u00ba\3\2\2\2"+
		"#\u00bc\3\2\2\2%\u00bf\3\2\2\2\'\u00c5\3\2\2\2)\u00cb\3\2\2\2+\u00d2\3"+
		"\2\2\2-\u00d4\3\2\2\2/\u00db\3\2\2\2\61\u00de\3\2\2\2\63\u00e6\3\2\2\2"+
		"\65\u00eb\3\2\2\2\67\u00f1\3\2\2\29\u00f6\3\2\2\2;\u00f9\3\2\2\2=\u00fd"+
		"\3\2\2\2?\u0104\3\2\2\2A\u0106\3\2\2\2C\u0108\3\2\2\2E\u010a\3\2\2\2G"+
		"\u010d\3\2\2\2I\u0110\3\2\2\2K\u0112\3\2\2\2M\u0114\3\2\2\2O\u0118\3\2"+
		"\2\2Q\u011b\3\2\2\2S\u011d\3\2\2\2U\u011f\3\2\2\2W\u0121\3\2\2\2Y\u0126"+
		"\3\2\2\2[\u012c\3\2\2\2]\u012e\3\2\2\2_\u0131\3\2\2\2a\u0134\3\2\2\2c"+
		"\u0137\3\2\2\2e\u013a\3\2\2\2g\u0141\3\2\2\2i\u014a\3\2\2\2k\u0150\3\2"+
		"\2\2m\u0153\3\2\2\2o\u0176\3\2\2\2q\u0178\3\2\2\2s\u017a\3\2\2\2u\u0183"+
		"\3\2\2\2w\u0185\3\2\2\2y\u0193\3\2\2\2{\u019a\3\2\2\2}\u01a0\3\2\2\2\177"+
		"\u01a9\3\2\2\2\u0081\u0082\7*\2\2\u0082\4\3\2\2\2\u0083\u0084\7+\2\2\u0084"+
		"\6\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087\7n\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7u\2\2\u0089\u008a\7u\2\2\u008a\b\3\2\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e\n\3\2\2\2\u008f\u0090\7o\2\2\u0090"+
		"\u0091\7q\2\2\u0091\u0092\7f\2\2\u0092\u0093\7w\2\2\u0093\u0094\7n\2\2"+
		"\u0094\u0095\7g\2\2\u0095\f\3\2\2\2\u0096\u0097\7x\2\2\u0097\u0098\7c"+
		"\2\2\u0098\u0099\7t\2\2\u0099\16\3\2\2\2\u009a\u009b\7<\2\2\u009b\20\3"+
		"\2\2\2\u009c\u009d\7\60\2\2\u009d\22\3\2\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7y\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3"+
		"\26\3\2\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa\30\3\2\2\2\u00ab"+
		"\u00ac\7]\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7_\2\2\u00ae\34\3\2\2\2\u00af"+
		"\u00b0\7h\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7e\2\2"+
		"\u00b3\u00b4\7v\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7"+
		"\7p\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9 \3\2\2\2\u00ba\u00bb"+
		"\7@\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd\u00be\7@\2\2\u00be$\3"+
		"\2\2\2\u00bf\u00c0\7B\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7|\2\2\u00c3\u00c4\7g\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7B\2\2\u00c6"+
		"\u00c7\7e\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2"+
		"\u00ca(\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7z\2\2\u00cd\u00ce\7v\2"+
		"\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7p\2\2\u00d1*\3\2"+
		"\2\2\u00d2\u00d3\7.\2\2\u00d3,\3\2\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7p\2\2\u00da.\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7h\2\2\u00dd"+
		"\60\3\2\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7h\2"+
		"\2\u00e5\62\3\2\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9"+
		"\7u\2\2\u00e9\u00ea\7g\2\2\u00ea\64\3\2\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed"+
		"\7j\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\66\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7q\2\2\u00f4"+
		"\u00f5\7o\2\2\u00f58\3\2\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7q\2\2\u00f8"+
		":\3\2\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7t\2\2\u00fc"+
		"<\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7r\2\2\u0100"+
		"\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102\u0103\7v\2\2\u0103>\3\2\2\2\u0104"+
		"\u0105\7(\2\2\u0105@\3\2\2\2\u0106\u0107\7~\2\2\u0107B\3\2\2\2\u0108\u0109"+
		"\7\u0080\2\2\u0109D\3\2\2\2\u010a\u010b\7>\2\2\u010b\u010c\7>\2\2\u010c"+
		"F\3\2\2\2\u010d\u010e\7@\2\2\u010e\u010f\7@\2\2\u010fH\3\2\2\2\u0110\u0111"+
		"\7-\2\2\u0111J\3\2\2\2\u0112\u0113\7/\2\2\u0113L\3\2\2\2\u0114\u0115\7"+
		"c\2\2\u0115\u0116\7p\2\2\u0116\u0117\7f\2\2\u0117N\3\2\2\2\u0118\u0119"+
		"\7q\2\2\u0119\u011a\7t\2\2\u011aP\3\2\2\2\u011b\u011c\7,\2\2\u011cR\3"+
		"\2\2\2\u011d\u011e\7\61\2\2\u011eT\3\2\2\2\u011f\u0120\7\'\2\2\u0120V"+
		"\3\2\2\2\u0121\u0122\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124\7w\2\2\u0124"+
		"\u0125\7g\2\2\u0125X\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128\7c\2\2\u0128"+
		"\u0129\7n\2\2\u0129\u012a\7u\2\2\u012a\u012b\7g\2\2\u012bZ\3\2\2\2\u012c"+
		"\u012d\7?\2\2\u012d\\\3\2\2\2\u012e\u012f\7?\2\2\u012f\u0130\7?\2\2\u0130"+
		"^\3\2\2\2\u0131\u0132\7@\2\2\u0132\u0133\7?\2\2\u0133`\3\2\2\2\u0134\u0135"+
		"\7>\2\2\u0135\u0136\7?\2\2\u0136b\3\2\2\2\u0137\u0138\7#\2\2\u0138\u0139"+
		"\7?\2\2\u0139d\3\2\2\2\u013a\u013e\t\2\2\2\u013b\u013d\t\3\2\2\u013c\u013b"+
		"\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"f\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0145\7$\2\2\u0142\u0144\n\4\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7$\2\2\u0149"+
		"h\3\2\2\2\u014a\u014b\7)\2\2\u014b\u014c\n\5\2\2\u014c\u014d\7)\2\2\u014d"+
		"j\3\2\2\2\u014e\u0151\5m\67\2\u014f\u0151\5o8\2\u0150\u014e\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151l\3\2\2\2\u0152\u0154\5q9\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156n\3\2\2\2"+
		"\u0157\u0159\5q9\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0160\7\60\2\2"+
		"\u015d\u015f\5q9\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0165\5s:\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0177\3\2\2"+
		"\2\u0166\u0168\7\60\2\2\u0167\u0169\5q9\2\u0168\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016e\5s:\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0177\3\2\2"+
		"\2\u016f\u0171\5q9\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\5s:\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0158\3\2\2\2\u0176\u0166\3\2\2\2\u0176\u0170\3\2"+
		"\2\2\u0177p\3\2\2\2\u0178\u0179\t\6\2\2\u0179r\3\2\2\2\u017a\u017c\t\7"+
		"\2\2\u017b\u017d\t\b\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0180\5q9\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2"+
		"\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182t\3\2\2\2\u0183\u0184"+
		"\t\t\2\2\u0184v\3\2\2\2\u0185\u0187\t\n\2\2\u0186\u0188\t\b\2\2\u0187"+
		"\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u018b\5q"+
		"9\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018dx\3\2\2\2\u018e\u0190\7\17\2\2\u018f\u018e\3\2\2\2"+
		"\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0194\7\f\2\2\u0192\u0194"+
		"\7\17\2\2\u0193\u018f\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2"+
		"\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198"+
		"\b=\2\2\u0198z\3\2\2\2\u0199\u019b\t\13\2\2\u019a\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019f\b>\2\2\u019f|\3\2\2\2\u01a0\u01a4\7%\2\2\u01a1\u01a3"+
		"\n\f\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\b?"+
		"\2\2\u01a8~\3\2\2\2\u01a9\u01aa\7%\2\2\u01aa\u01ab\7%\2\2\u01ab\u01af"+
		"\3\2\2\2\u01ac\u01ae\13\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2"+
		"\u01af\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b2\u01b3\7%\2\2\u01b3\u01b4\7%\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\b@\2\2\u01b6\u0080\3\2\2\2\30\2\u013e\u0145\u0150\u0155\u015a\u0160"+
		"\u0164\u016a\u016d\u0172\u0176\u017c\u0181\u0187\u018c\u018f\u0193\u0195"+
		"\u019c\u01a4\u01af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}