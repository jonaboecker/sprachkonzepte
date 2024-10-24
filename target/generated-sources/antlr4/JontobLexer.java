// Generated from JontobLexer.g4 by ANTLR 4.13.2

package org.example.aufgabe2;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JontobLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUB=2, MUL=3, DIV=4, EQUAL=5, NEQUAL=6, LT=7, GT=8, IF=9, LPAREN=10, 
		RPAREN=11, LBRACE=12, RBRACE=13, COMMA=14, SEMICOLON=15, INT=16, STRING=17, 
		VAR=18, WS=19, InvalidChar=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "SUB", "MUL", "DIV", "EQUAL", "NEQUAL", "LT", "GT", "IF", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "INT", "STRING", 
			"VAR", "WS", "InvalidChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "'!'", "'<'", "'>'", "'if'", 
			"'('", "')'", "'{'", "'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "SUB", "MUL", "DIV", "EQUAL", "NEQUAL", "LT", "GT", "IF", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "INT", 
			"STRING", "VAR", "WS", "InvalidChar"
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


	public JontobLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JontobLexer.g4"; }

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
		"\u0004\u0000\u0014s\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000fN\b\u000f\u000b\u000f\f\u000fO\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010[\b\u0010\n\u0010\f\u0010^\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004"+
		"\u0011g\b\u0011\u000b\u0011\f\u0011h\u0001\u0012\u0004\u0012l\b\u0012"+
		"\u000b\u0012\f\u0012m\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001"+
		"\u0000\u0004\u0001\u000009\u0001\u0000\"\"\u0003\u000009AZaz\u0003\u0000"+
		"\t\n\r\r  v\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000"+
		"\u0000\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b"+
		"3\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f7\u0001\u0000"+
		"\u0000\u0000\u00119\u0001\u0000\u0000\u0000\u0013<\u0001\u0000\u0000\u0000"+
		"\u0015>\u0001\u0000\u0000\u0000\u0017@\u0001\u0000\u0000\u0000\u0019B"+
		"\u0001\u0000\u0000\u0000\u001bD\u0001\u0000\u0000\u0000\u001dF\u0001\u0000"+
		"\u0000\u0000\u001fH\u0001\u0000\u0000\u0000!Q\u0001\u0000\u0000\u0000"+
		"#a\u0001\u0000\u0000\u0000%k\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000"+
		"\u0000)*\u0005+\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005-\u0000"+
		"\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005*\u0000\u0000.\u0006\u0001"+
		"\u0000\u0000\u0000/0\u0005/\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005"+
		"=\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005!\u0000\u00004\f\u0001"+
		"\u0000\u0000\u000056\u0005<\u0000\u00006\u000e\u0001\u0000\u0000\u0000"+
		"78\u0005>\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005i\u0000\u0000"+
		":;\u0005f\u0000\u0000;\u0012\u0001\u0000\u0000\u0000<=\u0005(\u0000\u0000"+
		"=\u0014\u0001\u0000\u0000\u0000>?\u0005)\u0000\u0000?\u0016\u0001\u0000"+
		"\u0000\u0000@A\u0005{\u0000\u0000A\u0018\u0001\u0000\u0000\u0000BC\u0005"+
		"}\u0000\u0000C\u001a\u0001\u0000\u0000\u0000DE\u0005,\u0000\u0000E\u001c"+
		"\u0001\u0000\u0000\u0000FG\u0005;\u0000\u0000G\u001e\u0001\u0000\u0000"+
		"\u0000HI\u0005i\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005t\u0000\u0000"+
		"KM\u0001\u0000\u0000\u0000LN\u0007\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000P \u0001\u0000\u0000\u0000QR\u0005s\u0000\u0000RS\u0005t\u0000"+
		"\u0000ST\u0005r\u0000\u0000TU\u0005i\u0000\u0000UV\u0005n\u0000\u0000"+
		"VW\u0005g\u0000\u0000WX\u0005\"\u0000\u0000X\\\u0001\u0000\u0000\u0000"+
		"Y[\b\u0001\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\"\u0000\u0000`\"\u0001\u0000"+
		"\u0000\u0000ab\u0005v\u0000\u0000bc\u0005a\u0000\u0000cd\u0005r\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000eg\u0007\u0002\u0000\u0000fe\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000i$\u0001\u0000\u0000\u0000jl\u0007\u0003\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0006\u0012"+
		"\u0000\u0000p&\u0001\u0000\u0000\u0000qr\t\u0000\u0000\u0000r(\u0001\u0000"+
		"\u0000\u0000\u0005\u0000O\\hm\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}