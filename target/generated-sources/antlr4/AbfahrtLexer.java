// Generated from AbfahrtLexer.g4 by ANTLR 4.13.2

package org.example.aufgabe1;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AbfahrtLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIME=1, VEHICLE=2, VEHICLENUMBER=3, TO=4, WEEKDAY=5, UNTIL=6, EXCEPT=7, 
		DAY=8, MONTH=9, COMMA=10, SEMICOLON=11, TARGET=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIME", "VEHICLE", "VEHICLENUMBER", "TO", "WEEKDAY", "UNTIL", "EXCEPT", 
			"DAY", "MONTH", "COMMA", "SEMICOLON", "TARGET", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'nach'", null, "'-'", "'nicht'", null, null, 
			"','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIME", "VEHICLE", "VEHICLENUMBER", "TO", "WEEKDAY", "UNTIL", "EXCEPT", 
			"DAY", "MONTH", "COMMA", "SEMICOLON", "TARGET", "WS"
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


	public AbfahrtLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AbfahrtLexer.g4"; }

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
		"\u0004\u0000\r\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000 \b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0004"+
		"\u00021\b\u0002\u000b\u0002\f\u00022\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004"+
		"\u0001\u0004\u0003\u0004K\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004T\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007_\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0088\b\b\u0001\b\u0003\b\u008b\b\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u0092\b\u000b"+
		"\u000b\u000b\f\u000b\u0093\u0001\f\u0004\f\u0097\b\f\u000b\f\f\f\u0098"+
		"\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u0001\u0000\u0007\u0001\u000001\u0001\u000009\u0001\u0000"+
		"22\u0001\u000003\u0001\u000005\f\u0000(),,//AZaz\u00c4\u00c4\u00d6\u00d6"+
		"\u00dc\u00dc\u00df\u00df\u00e4\u00e4\u00f6\u00f6\u00fc\u00fc\u0003\u0000"+
		"\t\n\r\r  \u00b6\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000"+
		"\u0000\u0003-\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u0007"+
		"4\u0001\u0000\u0000\u0000\tS\u0001\u0000\u0000\u0000\u000bU\u0001\u0000"+
		"\u0000\u0000\rW\u0001\u0000\u0000\u0000\u000f^\u0001\u0000\u0000\u0000"+
		"\u0011\u0087\u0001\u0000\u0000\u0000\u0013\u008c\u0001\u0000\u0000\u0000"+
		"\u0015\u008e\u0001\u0000\u0000\u0000\u0017\u0091\u0001\u0000\u0000\u0000"+
		"\u0019\u0096\u0001\u0000\u0000\u0000\u001b\u001c\u0007\u0000\u0000\u0000"+
		"\u001c \u0007\u0001\u0000\u0000\u001d\u001e\u0007\u0002\u0000\u0000\u001e"+
		" \u0007\u0003\u0000\u0000\u001f\u001b\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005:\u0000\u0000"+
		"\"#\u0007\u0004\u0000\u0000#$\u0007\u0001\u0000\u0000$\u0002\u0001\u0000"+
		"\u0000\u0000%&\u0005B\u0000\u0000&\'\u0005u\u0000\u0000\'.\u0005s\u0000"+
		"\u0000()\u0005R\u0000\u0000).\u0005E\u0000\u0000*+\u0005K\u0000\u0000"+
		"+,\u0005A\u0000\u0000,.\u0005T\u0000\u0000-%\u0001\u0000\u0000\u0000-"+
		"(\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000.\u0004\u0001\u0000"+
		"\u0000\u0000/1\u0007\u0001\u0000\u00000/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"3\u0006\u0001\u0000\u0000\u000045\u0005n\u0000\u000056\u0005a\u0000\u0000"+
		"67\u0005c\u0000\u000078\u0005h\u0000\u00008\b\u0001\u0000\u0000\u0000"+
		"9:\u0005M\u0000\u0000:H\u0005o\u0000\u0000;<\u0005D\u0000\u0000<H\u0005"+
		"i\u0000\u0000=>\u0005M\u0000\u0000>H\u0005i\u0000\u0000?@\u0005D\u0000"+
		"\u0000@H\u0005o\u0000\u0000AB\u0005F\u0000\u0000BH\u0005r\u0000\u0000"+
		"CD\u0005S\u0000\u0000DH\u0005a\u0000\u0000EF\u0005S\u0000\u0000FH\u0005"+
		"o\u0000\u0000G9\u0001\u0000\u0000\u0000G;\u0001\u0000\u0000\u0000G=\u0001"+
		"\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000"+
		"GC\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IK\u0005,\u0000\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KT\u0001\u0000\u0000\u0000LM\u0005t\u0000\u0000MN\u0005\u00e4\u0000"+
		"\u0000NO\u0005g\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005i\u0000\u0000"+
		"QR\u0005c\u0000\u0000RT\u0005h\u0000\u0000SG\u0001\u0000\u0000\u0000S"+
		"L\u0001\u0000\u0000\u0000T\n\u0001\u0000\u0000\u0000UV\u0005-\u0000\u0000"+
		"V\f\u0001\u0000\u0000\u0000WX\u0005n\u0000\u0000XY\u0005i\u0000\u0000"+
		"YZ\u0005c\u0000\u0000Z[\u0005h\u0000\u0000[\\\u0005t\u0000\u0000\\\u000e"+
		"\u0001\u0000\u0000\u0000]_\u0007\u0003\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0007\u0001"+
		"\u0000\u0000ab\u0005.\u0000\u0000b\u0010\u0001\u0000\u0000\u0000cd\u0005"+
		"J\u0000\u0000de\u0005a\u0000\u0000e\u0088\u0005n\u0000\u0000fg\u0005F"+
		"\u0000\u0000gh\u0005e\u0000\u0000h\u0088\u0005b\u0000\u0000ij\u0005M\u0000"+
		"\u0000jk\u0005\u00e4\u0000\u0000k\u0088\u0005r\u0000\u0000lm\u0005A\u0000"+
		"\u0000mn\u0005p\u0000\u0000n\u0088\u0005r\u0000\u0000op\u0005M\u0000\u0000"+
		"pq\u0005a\u0000\u0000q\u0088\u0005i\u0000\u0000rs\u0005J\u0000\u0000s"+
		"t\u0005u\u0000\u0000t\u0088\u0005n\u0000\u0000uv\u0005J\u0000\u0000vw"+
		"\u0005u\u0000\u0000w\u0088\u0005l\u0000\u0000xy\u0005A\u0000\u0000yz\u0005"+
		"u\u0000\u0000z\u0088\u0005g\u0000\u0000{|\u0005S\u0000\u0000|}\u0005e"+
		"\u0000\u0000}\u0088\u0005p\u0000\u0000~\u007f\u0005O\u0000\u0000\u007f"+
		"\u0080\u0005k\u0000\u0000\u0080\u0088\u0005t\u0000\u0000\u0081\u0082\u0005"+
		"N\u0000\u0000\u0082\u0083\u0005o\u0000\u0000\u0083\u0088\u0005v\u0000"+
		"\u0000\u0084\u0085\u0005D\u0000\u0000\u0085\u0086\u0005e\u0000\u0000\u0086"+
		"\u0088\u0005z\u0000\u0000\u0087c\u0001\u0000\u0000\u0000\u0087f\u0001"+
		"\u0000\u0000\u0000\u0087i\u0001\u0000\u0000\u0000\u0087l\u0001\u0000\u0000"+
		"\u0000\u0087o\u0001\u0000\u0000\u0000\u0087r\u0001\u0000\u0000\u0000\u0087"+
		"u\u0001\u0000\u0000\u0000\u0087x\u0001\u0000\u0000\u0000\u0087{\u0001"+
		"\u0000\u0000\u0000\u0087~\u0001\u0000\u0000\u0000\u0087\u0081\u0001\u0000"+
		"\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0005,\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0012\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005,\u0000\u0000\u008d\u0014\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005;\u0000\u0000\u008f\u0016\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0007\u0005\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0018\u0001\u0000\u0000\u0000\u0095"+
		"\u0097\u0007\u0006\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0006\f\u0000\u0000\u009b\u001a\u0001\u0000\u0000\u0000\f\u0000"+
		"\u001f-2GJS^\u0087\u008a\u0093\u0098\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}