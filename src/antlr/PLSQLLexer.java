package antlr;// Generated from /home/bino/workspace/plsql_parser/src/PLSQL.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, AS=3, AUTHID=4, BETWEEN=5, BODY=6, BULK=7, BULK_ROWCOUNT=8, 
		BY=9, CASE=10, CREATE=11, COLLECT=12, COMMIT=13, CURRENT_USER=14, DEFAULT=15, 
		DEFINER=16, DELETE=17, ELSE=18, ELSIF=19, EXTERNAL=20, FALSE=21, FETCH=22, 
		FOR=23, FORALL=24, GOTO=25, IF=26, IN=27, INDEX=28, INSERT=29, INTO=30, 
		IS=31, LANGUAGE=32, LIKE=33, LIMIT=34, LOCK=35, NOT=36, NOTFOUND=37, NULL=38, 
		OPEN=39, OR=40, PACKAGE=41, RAISE=42, ROLLBACK=43, SAVEPOINT=44, SELECT=45, 
		SET=46, SQL=47, TABLE=48, TRANSACTION=49, TRUE=50, THEN=51, UPDATE=52, 
		WHILE=53, INSERTING=54, UPDATING=55, DELETING=56, ISOPEN=57, EXISTS=58, 
		BEGIN=59, CLOSE=60, CONSTANT=61, CONTINUE=62, CURSOR=63, DECLARE=64, DETERMINISTIC=65, 
		END=66, EXCEPTION=67, EXECUTE=68, EXIT=69, FUNCTION=70, IMMEDIATE=71, 
		LOOP=72, NOCOPY=73, OTHERS=74, OUT=75, PARALLEL_ENABLE=76, PIPELINED=77, 
		PRAGMA=78, PROCEDURE=79, RECORD=80, REF=81, RESULT_CACHE=82, RETURN=83, 
		RETURNING=84, ROWTYPE=85, SUBTYPE=86, USING=87, VARRAY=88, VARYING=89, 
		WHEN=90, QUOTED_STRING=91, ID=92, SEMI=93, COLON=94, DOUBLEDOT=95, DOT=96, 
		COMMA=97, EXPONENT=98, ASTERISK=99, AT_SIGN=100, RPAREN=101, LPAREN=102, 
		RBRACK=103, LBRACK=104, PLUS=105, MINUS=106, DIVIDE=107, EQ=108, PERCENT=109, 
		LLABEL=110, RLABEL=111, ASSIGN=112, ARROW=113, VERTBAR=114, DOUBLEVERTBAR=115, 
		NOT_EQ=116, LTH=117, LEQ=118, GTH=119, GEQ=120, INTEGER=121, REAL_NUMBER=122, 
		WS=123, SL_COMMENT=124, ML_COMMENT=125;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "ARRAY", "AS", "AUTHID", "BETWEEN", "BODY", "BULK", "BULK_ROWCOUNT", 
		"BY", "CASE", "CREATE", "COLLECT", "COMMIT", "CURRENT_USER", "DEFAULT", 
		"DEFINER", "DELETE", "ELSE", "ELSIF", "EXTERNAL", "FALSE", "FETCH", "FOR", 
		"FORALL", "GOTO", "IF", "IN", "INDEX", "INSERT", "INTO", "IS", "LANGUAGE", 
		"LIKE", "LIMIT", "LOCK", "NOT", "NOTFOUND", "NULL", "OPEN", "OR", "PACKAGE", 
		"RAISE", "ROLLBACK", "SAVEPOINT", "SELECT", "SET", "SQL", "TABLE", "TRANSACTION", 
		"TRUE", "THEN", "UPDATE", "WHILE", "INSERTING", "UPDATING", "DELETING", 
		"ISOPEN", "EXISTS", "BEGIN", "CLOSE", "CONSTANT", "CONTINUE", "CURSOR", 
		"DECLARE", "DETERMINISTIC", "END", "EXCEPTION", "EXECUTE", "EXIT", "FUNCTION", 
		"IMMEDIATE", "LOOP", "NOCOPY", "OTHERS", "OUT", "PARALLEL_ENABLE", "PIPELINED", 
		"PRAGMA", "PROCEDURE", "RECORD", "REF", "RESULT_CACHE", "RETURN", "RETURNING", 
		"ROWTYPE", "SUBTYPE", "USING", "VARRAY", "VARYING", "WHEN", "QUOTED_STRING", 
		"ID", "SEMI", "COLON", "DOUBLEDOT", "DOT", "POINT", "COMMA", "EXPONENT", 
		"ASTERISK", "AT_SIGN", "RPAREN", "LPAREN", "RBRACK", "LBRACK", "PLUS", 
		"MINUS", "DIVIDE", "EQ", "PERCENT", "LLABEL", "RLABEL", "ASSIGN", "ARROW", 
		"VERTBAR", "DOUBLEVERTBAR", "NOT_EQ", "LTH", "LEQ", "GTH", "GEQ", "INTEGER", 
		"REAL_NUMBER", "NUMBER_VALUE", "N", "DOUBLEQUOTED_STRING", "WS", "SL_COMMENT", 
		"ML_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'array'", "'as'", "'authid'", "'between'", "'body'", "'bulk'", 
		"'bulk_rowcount'", "'by'", "'case'", "'create'", "'collect'", "'commit'", 
		"'current_user'", "'default'", "'definer'", "'delete'", "'else'", "'elsif'", 
		"'external'", "'false'", "'fetch'", "'for'", "'forall'", "'goto'", "'if'", 
		"'in'", "'index'", "'insert'", "'into'", "'is'", "'language'", "'like'", 
		"'limit'", "'lock'", "'not'", "'notfound'", "'null'", "'open'", "'or'", 
		"'package'", "'raise'", "'rollback'", "'savepoint'", "'select'", "'set'", 
		"'sql'", "'table'", "'transaction'", "'true'", "'then'", "'update'", "'while'", 
		"'inserting'", "'updating'", "'deleting'", "'isopen'", "'exists'", "'begin'", 
		"'close'", "'constant'", "'continue'", "'cursor'", "'declare'", "'deterministic'", 
		"'end'", "'exception'", "'execute'", "'exit'", "'function'", "'immediate'", 
		"'loop'", "'nocopy'", "'others'", "'out'", "'parallel_enable'", "'pipelined'", 
		"'pragma'", "'procedure'", "'record'", "'ref'", "'result_cache'", "'return'", 
		"'returning'", "'rowtype'", "'subtype'", "'using'", "'varray'", "'varying'", 
		"'when'", null, null, "';'", "':'", null, null, "','", "'**'", "'*'", 
		"'@'", "')'", "'('", "']'", "'['", "'+'", "'-'", "'/'", "'='", "'%'", 
		"'<<'", "'>>'", "':='", "'=>'", "'|'", "'||'", null, "'<'", "'<='", "'>'", 
		"'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "ARRAY", "AS", "AUTHID", "BETWEEN", "BODY", "BULK", "BULK_ROWCOUNT", 
		"BY", "CASE", "CREATE", "COLLECT", "COMMIT", "CURRENT_USER", "DEFAULT", 
		"DEFINER", "DELETE", "ELSE", "ELSIF", "EXTERNAL", "FALSE", "FETCH", "FOR", 
		"FORALL", "GOTO", "IF", "IN", "INDEX", "INSERT", "INTO", "IS", "LANGUAGE", 
		"LIKE", "LIMIT", "LOCK", "NOT", "NOTFOUND", "NULL", "OPEN", "OR", "PACKAGE", 
		"RAISE", "ROLLBACK", "SAVEPOINT", "SELECT", "SET", "SQL", "TABLE", "TRANSACTION", 
		"TRUE", "THEN", "UPDATE", "WHILE", "INSERTING", "UPDATING", "DELETING", 
		"ISOPEN", "EXISTS", "BEGIN", "CLOSE", "CONSTANT", "CONTINUE", "CURSOR", 
		"DECLARE", "DETERMINISTIC", "END", "EXCEPTION", "EXECUTE", "EXIT", "FUNCTION", 
		"IMMEDIATE", "LOOP", "NOCOPY", "OTHERS", "OUT", "PARALLEL_ENABLE", "PIPELINED", 
		"PRAGMA", "PROCEDURE", "RECORD", "REF", "RESULT_CACHE", "RETURN", "RETURNING", 
		"ROWTYPE", "SUBTYPE", "USING", "VARRAY", "VARYING", "WHEN", "QUOTED_STRING", 
		"ID", "SEMI", "COLON", "DOUBLEDOT", "DOT", "COMMA", "EXPONENT", "ASTERISK", 
		"AT_SIGN", "RPAREN", "LPAREN", "RBRACK", "LBRACK", "PLUS", "MINUS", "DIVIDE", 
		"EQ", "PERCENT", "LLABEL", "RLABEL", "ASSIGN", "ARROW", "VERTBAR", "DOUBLEVERTBAR", 
		"NOT_EQ", "LTH", "LEQ", "GTH", "GEQ", "INTEGER", "REAL_NUMBER", "WS", 
		"SL_COMMENT", "ML_COMMENT"
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


	public PLSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PLSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 126:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 127:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 128:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setChannel(HIDDEN);
			break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setChannel(HIDDEN);
			break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			setChannel(HIDDEN);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\177\u0422\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39\39"+
		"\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<"+
		"\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K"+
		"\3K\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\5\\\u037c"+
		"\n\\\3\\\3\\\3\\\3\\\7\\\u0382\n\\\f\\\16\\\u0385\13\\\3\\\3\\\3]\3]\7"+
		"]\u038b\n]\f]\16]\u038e\13]\3]\5]\u0391\n]\3^\3^\3_\3_\3`\3`\3`\3a\3a"+
		"\3b\3b\3c\3c\3d\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l"+
		"\3m\3m\3n\3n\3o\3o\3p\3p\3p\3q\3q\3q\3r\3r\3r\3s\3s\3s\3t\3t\3u\3u\3u"+
		"\3v\3v\3v\3v\3v\3v\3v\3v\5v\u03d2\nv\3w\3w\3x\3x\3x\3y\3y\3z\3z\3z\3{"+
		"\3{\3|\3|\3|\3|\5|\u03e4\n|\3|\5|\u03e7\n|\3}\3}\3}\3}\3}\3}\3}\3}\5}"+
		"\u03f1\n}\3~\3~\7~\u03f5\n~\f~\16~\u03f8\13~\3\177\3\177\7\177\u03fc\n"+
		"\177\f\177\16\177\u03ff\13\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u040a\n\u0081\f\u0081\16\u0081\u040d"+
		"\13\u0081\3\u0081\5\u0081\u0410\n\u0081\3\u0081\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\7\u0082\u0419\n\u0082\f\u0082\16\u0082\u041c"+
		"\13\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u041a\2\u0083\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7"+
		"]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3\2\u00c5c\u00c7d\u00c9e\u00cb"+
		"f\u00cdg\u00cfh\u00d1i\u00d3j\u00d5k\u00d7l\u00d9m\u00dbn\u00ddo\u00df"+
		"p\u00e1q\u00e3r\u00e5s\u00e7t\u00e9u\u00ebv\u00edw\u00efx\u00f1y\u00f3"+
		"z\u00f5{\u00f7|\u00f9\2\u00fb\2\u00fd\2\u00ff}\u0101~\u0103\177\3\2\7"+
		"\3\2))\6\2%&\62;aac|\3\2$$\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u042f\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2"+
		"\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1"+
		"\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2"+
		"\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3"+
		"\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2"+
		"\2\2\u0103\3\2\2\2\3\u0105\3\2\2\2\5\u0109\3\2\2\2\7\u010f\3\2\2\2\t\u0112"+
		"\3\2\2\2\13\u0119\3\2\2\2\r\u0121\3\2\2\2\17\u0126\3\2\2\2\21\u012b\3"+
		"\2\2\2\23\u0139\3\2\2\2\25\u013c\3\2\2\2\27\u0141\3\2\2\2\31\u0148\3\2"+
		"\2\2\33\u0150\3\2\2\2\35\u0157\3\2\2\2\37\u0164\3\2\2\2!\u016c\3\2\2\2"+
		"#\u0174\3\2\2\2%\u017b\3\2\2\2\'\u0180\3\2\2\2)\u0186\3\2\2\2+\u018f\3"+
		"\2\2\2-\u0195\3\2\2\2/\u019b\3\2\2\2\61\u019f\3\2\2\2\63\u01a6\3\2\2\2"+
		"\65\u01ab\3\2\2\2\67\u01ae\3\2\2\29\u01b1\3\2\2\2;\u01b7\3\2\2\2=\u01be"+
		"\3\2\2\2?\u01c3\3\2\2\2A\u01c6\3\2\2\2C\u01cf\3\2\2\2E\u01d4\3\2\2\2G"+
		"\u01da\3\2\2\2I\u01df\3\2\2\2K\u01e3\3\2\2\2M\u01ec\3\2\2\2O\u01f1\3\2"+
		"\2\2Q\u01f6\3\2\2\2S\u01f9\3\2\2\2U\u0201\3\2\2\2W\u0207\3\2\2\2Y\u0210"+
		"\3\2\2\2[\u021a\3\2\2\2]\u0221\3\2\2\2_\u0225\3\2\2\2a\u0229\3\2\2\2c"+
		"\u022f\3\2\2\2e\u023b\3\2\2\2g\u0240\3\2\2\2i\u0245\3\2\2\2k\u024c\3\2"+
		"\2\2m\u0252\3\2\2\2o\u025c\3\2\2\2q\u0265\3\2\2\2s\u026e\3\2\2\2u\u0275"+
		"\3\2\2\2w\u027c\3\2\2\2y\u0282\3\2\2\2{\u0288\3\2\2\2}\u0291\3\2\2\2\177"+
		"\u029a\3\2\2\2\u0081\u02a1\3\2\2\2\u0083\u02a9\3\2\2\2\u0085\u02b7\3\2"+
		"\2\2\u0087\u02bb\3\2\2\2\u0089\u02c5\3\2\2\2\u008b\u02cd\3\2\2\2\u008d"+
		"\u02d2\3\2\2\2\u008f\u02db\3\2\2\2\u0091\u02e5\3\2\2\2\u0093\u02ea\3\2"+
		"\2\2\u0095\u02f1\3\2\2\2\u0097\u02f8\3\2\2\2\u0099\u02fc\3\2\2\2\u009b"+
		"\u030c\3\2\2\2\u009d\u0316\3\2\2\2\u009f\u031d\3\2\2\2\u00a1\u0327\3\2"+
		"\2\2\u00a3\u032e\3\2\2\2\u00a5\u0332\3\2\2\2\u00a7\u033f\3\2\2\2\u00a9"+
		"\u0346\3\2\2\2\u00ab\u0350\3\2\2\2\u00ad\u0358\3\2\2\2\u00af\u0360\3\2"+
		"\2\2\u00b1\u0366\3\2\2\2\u00b3\u036d\3\2\2\2\u00b5\u0375\3\2\2\2\u00b7"+
		"\u037b\3\2\2\2\u00b9\u0390\3\2\2\2\u00bb\u0392\3\2\2\2\u00bd\u0394\3\2"+
		"\2\2\u00bf\u0396\3\2\2\2\u00c1\u0399\3\2\2\2\u00c3\u039b\3\2\2\2\u00c5"+
		"\u039d\3\2\2\2\u00c7\u039f\3\2\2\2\u00c9\u03a2\3\2\2\2\u00cb\u03a4\3\2"+
		"\2\2\u00cd\u03a6\3\2\2\2\u00cf\u03a8\3\2\2\2\u00d1\u03aa\3\2\2\2\u00d3"+
		"\u03ac\3\2\2\2\u00d5\u03ae\3\2\2\2\u00d7\u03b0\3\2\2\2\u00d9\u03b2\3\2"+
		"\2\2\u00db\u03b4\3\2\2\2\u00dd\u03b6\3\2\2\2\u00df\u03b8\3\2\2\2\u00e1"+
		"\u03bb\3\2\2\2\u00e3\u03be\3\2\2\2\u00e5\u03c1\3\2\2\2\u00e7\u03c4\3\2"+
		"\2\2\u00e9\u03c6\3\2\2\2\u00eb\u03d1\3\2\2\2\u00ed\u03d3\3\2\2\2\u00ef"+
		"\u03d5\3\2\2\2\u00f1\u03d8\3\2\2\2\u00f3\u03da\3\2\2\2\u00f5\u03dd\3\2"+
		"\2\2\u00f7\u03df\3\2\2\2\u00f9\u03f0\3\2\2\2\u00fb\u03f2\3\2\2\2\u00fd"+
		"\u03f9\3\2\2\2\u00ff\u0402\3\2\2\2\u0101\u0405\3\2\2\2\u0103\u0414\3\2"+
		"\2\2\u0105\u0106\7c\2\2\u0106\u0107\7p\2\2\u0107\u0108\7f\2\2\u0108\4"+
		"\3\2\2\2\u0109\u010a\7c\2\2\u010a\u010b\7t\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\7c\2\2\u010d\u010e\7{\2\2\u010e\6\3\2\2\2\u010f\u0110\7c\2\2\u0110"+
		"\u0111\7u\2\2\u0111\b\3\2\2\2\u0112\u0113\7c\2\2\u0113\u0114\7w\2\2\u0114"+
		"\u0115\7v\2\2\u0115\u0116\7j\2\2\u0116\u0117\7k\2\2\u0117\u0118\7f\2\2"+
		"\u0118\n\3\2\2\2\u0119\u011a\7d\2\2\u011a\u011b\7g\2\2\u011b\u011c\7v"+
		"\2\2\u011c\u011d\7y\2\2\u011d\u011e\7g\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7p\2\2\u0120\f\3\2\2\2\u0121\u0122\7d\2\2\u0122\u0123\7q\2\2\u0123\u0124"+
		"\7f\2\2\u0124\u0125\7{\2\2\u0125\16\3\2\2\2\u0126\u0127\7d\2\2\u0127\u0128"+
		"\7w\2\2\u0128\u0129\7n\2\2\u0129\u012a\7m\2\2\u012a\20\3\2\2\2\u012b\u012c"+
		"\7d\2\2\u012c\u012d\7w\2\2\u012d\u012e\7n\2\2\u012e\u012f\7m\2\2\u012f"+
		"\u0130\7a\2\2\u0130\u0131\7t\2\2\u0131\u0132\7q\2\2\u0132\u0133\7y\2\2"+
		"\u0133\u0134\7e\2\2\u0134\u0135\7q\2\2\u0135\u0136\7w\2\2\u0136\u0137"+
		"\7p\2\2\u0137\u0138\7v\2\2\u0138\22\3\2\2\2\u0139\u013a\7d\2\2\u013a\u013b"+
		"\7{\2\2\u013b\24\3\2\2\2\u013c\u013d\7e\2\2\u013d\u013e\7c\2\2\u013e\u013f"+
		"\7u\2\2\u013f\u0140\7g\2\2\u0140\26\3\2\2\2\u0141\u0142\7e\2\2\u0142\u0143"+
		"\7t\2\2\u0143\u0144\7g\2\2\u0144\u0145\7c\2\2\u0145\u0146\7v\2\2\u0146"+
		"\u0147\7g\2\2\u0147\30\3\2\2\2\u0148\u0149\7e\2\2\u0149\u014a\7q\2\2\u014a"+
		"\u014b\7n\2\2\u014b\u014c\7n\2\2\u014c\u014d\7g\2\2\u014d\u014e\7e\2\2"+
		"\u014e\u014f\7v\2\2\u014f\32\3\2\2\2\u0150\u0151\7e\2\2\u0151\u0152\7"+
		"q\2\2\u0152\u0153\7o\2\2\u0153\u0154\7o\2\2\u0154\u0155\7k\2\2\u0155\u0156"+
		"\7v\2\2\u0156\34\3\2\2\2\u0157\u0158\7e\2\2\u0158\u0159\7w\2\2\u0159\u015a"+
		"\7t\2\2\u015a\u015b\7t\2\2\u015b\u015c\7g\2\2\u015c\u015d\7p\2\2\u015d"+
		"\u015e\7v\2\2\u015e\u015f\7a\2\2\u015f\u0160\7w\2\2\u0160\u0161\7u\2\2"+
		"\u0161\u0162\7g\2\2\u0162\u0163\7t\2\2\u0163\36\3\2\2\2\u0164\u0165\7"+
		"f\2\2\u0165\u0166\7g\2\2\u0166\u0167\7h\2\2\u0167\u0168\7c\2\2\u0168\u0169"+
		"\7w\2\2\u0169\u016a\7n\2\2\u016a\u016b\7v\2\2\u016b \3\2\2\2\u016c\u016d"+
		"\7f\2\2\u016d\u016e\7g\2\2\u016e\u016f\7h\2\2\u016f\u0170\7k\2\2\u0170"+
		"\u0171\7p\2\2\u0171\u0172\7g\2\2\u0172\u0173\7t\2\2\u0173\"\3\2\2\2\u0174"+
		"\u0175\7f\2\2\u0175\u0176\7g\2\2\u0176\u0177\7n\2\2\u0177\u0178\7g\2\2"+
		"\u0178\u0179\7v\2\2\u0179\u017a\7g\2\2\u017a$\3\2\2\2\u017b\u017c\7g\2"+
		"\2\u017c\u017d\7n\2\2\u017d\u017e\7u\2\2\u017e\u017f\7g\2\2\u017f&\3\2"+
		"\2\2\u0180\u0181\7g\2\2\u0181\u0182\7n\2\2\u0182\u0183\7u\2\2\u0183\u0184"+
		"\7k\2\2\u0184\u0185\7h\2\2\u0185(\3\2\2\2\u0186\u0187\7g\2\2\u0187\u0188"+
		"\7z\2\2\u0188\u0189\7v\2\2\u0189\u018a\7g\2\2\u018a\u018b\7t\2\2\u018b"+
		"\u018c\7p\2\2\u018c\u018d\7c\2\2\u018d\u018e\7n\2\2\u018e*\3\2\2\2\u018f"+
		"\u0190\7h\2\2\u0190\u0191\7c\2\2\u0191\u0192\7n\2\2\u0192\u0193\7u\2\2"+
		"\u0193\u0194\7g\2\2\u0194,\3\2\2\2\u0195\u0196\7h\2\2\u0196\u0197\7g\2"+
		"\2\u0197\u0198\7v\2\2\u0198\u0199\7e\2\2\u0199\u019a\7j\2\2\u019a.\3\2"+
		"\2\2\u019b\u019c\7h\2\2\u019c\u019d\7q\2\2\u019d\u019e\7t\2\2\u019e\60"+
		"\3\2\2\2\u019f\u01a0\7h\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7t\2\2\u01a2"+
		"\u01a3\7c\2\2\u01a3\u01a4\7n\2\2\u01a4\u01a5\7n\2\2\u01a5\62\3\2\2\2\u01a6"+
		"\u01a7\7i\2\2\u01a7\u01a8\7q\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa\7q\2\2"+
		"\u01aa\64\3\2\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7h\2\2\u01ad\66\3\2\2"+
		"\2\u01ae\u01af\7k\2\2\u01af\u01b0\7p\2\2\u01b08\3\2\2\2\u01b1\u01b2\7"+
		"k\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7f\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6"+
		"\7z\2\2\u01b6:\3\2\2\2\u01b7\u01b8\7k\2\2\u01b8\u01b9\7p\2\2\u01b9\u01ba"+
		"\7u\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7v\2\2\u01bd"+
		"<\3\2\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7v\2\2\u01c1"+
		"\u01c2\7q\2\2\u01c2>\3\2\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5\7u\2\2\u01c5"+
		"@\3\2\2\2\u01c6\u01c7\7n\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7p\2\2\u01c9"+
		"\u01ca\7i\2\2\u01ca\u01cb\7w\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7i\2\2"+
		"\u01cd\u01ce\7g\2\2\u01ceB\3\2\2\2\u01cf\u01d0\7n\2\2\u01d0\u01d1\7k\2"+
		"\2\u01d1\u01d2\7m\2\2\u01d2\u01d3\7g\2\2\u01d3D\3\2\2\2\u01d4\u01d5\7"+
		"n\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d7\7o\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9"+
		"\7v\2\2\u01d9F\3\2\2\2\u01da\u01db\7n\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd"+
		"\7e\2\2\u01dd\u01de\7m\2\2\u01deH\3\2\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1"+
		"\7q\2\2\u01e1\u01e2\7v\2\2\u01e2J\3\2\2\2\u01e3\u01e4\7p\2\2\u01e4\u01e5"+
		"\7q\2\2\u01e5\u01e6\7v\2\2\u01e6\u01e7\7h\2\2\u01e7\u01e8\7q\2\2\u01e8"+
		"\u01e9\7w\2\2\u01e9\u01ea\7p\2\2\u01ea\u01eb\7f\2\2\u01ebL\3\2\2\2\u01ec"+
		"\u01ed\7p\2\2\u01ed\u01ee\7w\2\2\u01ee\u01ef\7n\2\2\u01ef\u01f0\7n\2\2"+
		"\u01f0N\3\2\2\2\u01f1\u01f2\7q\2\2\u01f2\u01f3\7r\2\2\u01f3\u01f4\7g\2"+
		"\2\u01f4\u01f5\7p\2\2\u01f5P\3\2\2\2\u01f6\u01f7\7q\2\2\u01f7\u01f8\7"+
		"t\2\2\u01f8R\3\2\2\2\u01f9\u01fa\7r\2\2\u01fa\u01fb\7c\2\2\u01fb\u01fc"+
		"\7e\2\2\u01fc\u01fd\7m\2\2\u01fd\u01fe\7c\2\2\u01fe\u01ff\7i\2\2\u01ff"+
		"\u0200\7g\2\2\u0200T\3\2\2\2\u0201\u0202\7t\2\2\u0202\u0203\7c\2\2\u0203"+
		"\u0204\7k\2\2\u0204\u0205\7u\2\2\u0205\u0206\7g\2\2\u0206V\3\2\2\2\u0207"+
		"\u0208\7t\2\2\u0208\u0209\7q\2\2\u0209\u020a\7n\2\2\u020a\u020b\7n\2\2"+
		"\u020b\u020c\7d\2\2\u020c\u020d\7c\2\2\u020d\u020e\7e\2\2\u020e\u020f"+
		"\7m\2\2\u020fX\3\2\2\2\u0210\u0211\7u\2\2\u0211\u0212\7c\2\2\u0212\u0213"+
		"\7x\2\2\u0213\u0214\7g\2\2\u0214\u0215\7r\2\2\u0215\u0216\7q\2\2\u0216"+
		"\u0217\7k\2\2\u0217\u0218\7p\2\2\u0218\u0219\7v\2\2\u0219Z\3\2\2\2\u021a"+
		"\u021b\7u\2\2\u021b\u021c\7g\2\2\u021c\u021d\7n\2\2\u021d\u021e\7g\2\2"+
		"\u021e\u021f\7e\2\2\u021f\u0220\7v\2\2\u0220\\\3\2\2\2\u0221\u0222\7u"+
		"\2\2\u0222\u0223\7g\2\2\u0223\u0224\7v\2\2\u0224^\3\2\2\2\u0225\u0226"+
		"\7u\2\2\u0226\u0227\7s\2\2\u0227\u0228\7n\2\2\u0228`\3\2\2\2\u0229\u022a"+
		"\7v\2\2\u022a\u022b\7c\2\2\u022b\u022c\7d\2\2\u022c\u022d\7n\2\2\u022d"+
		"\u022e\7g\2\2\u022eb\3\2\2\2\u022f\u0230\7v\2\2\u0230\u0231\7t\2\2\u0231"+
		"\u0232\7c\2\2\u0232\u0233\7p\2\2\u0233\u0234\7u\2\2\u0234\u0235\7c\2\2"+
		"\u0235\u0236\7e\2\2\u0236\u0237\7v\2\2\u0237\u0238\7k\2\2\u0238\u0239"+
		"\7q\2\2\u0239\u023a\7p\2\2\u023ad\3\2\2\2\u023b\u023c\7v\2\2\u023c\u023d"+
		"\7t\2\2\u023d\u023e\7w\2\2\u023e\u023f\7g\2\2\u023ff\3\2\2\2\u0240\u0241"+
		"\7v\2\2\u0241\u0242\7j\2\2\u0242\u0243\7g\2\2\u0243\u0244\7p\2\2\u0244"+
		"h\3\2\2\2\u0245\u0246\7w\2\2\u0246\u0247\7r\2\2\u0247\u0248\7f\2\2\u0248"+
		"\u0249\7c\2\2\u0249\u024a\7v\2\2\u024a\u024b\7g\2\2\u024bj\3\2\2\2\u024c"+
		"\u024d\7y\2\2\u024d\u024e\7j\2\2\u024e\u024f\7k\2\2\u024f\u0250\7n\2\2"+
		"\u0250\u0251\7g\2\2\u0251l\3\2\2\2\u0252\u0253\7k\2\2\u0253\u0254\7p\2"+
		"\2\u0254\u0255\7u\2\2\u0255\u0256\7g\2\2\u0256\u0257\7t\2\2\u0257\u0258"+
		"\7v\2\2\u0258\u0259\7k\2\2\u0259\u025a\7p\2\2\u025a\u025b\7i\2\2\u025b"+
		"n\3\2\2\2\u025c\u025d\7w\2\2\u025d\u025e\7r\2\2\u025e\u025f\7f\2\2\u025f"+
		"\u0260\7c\2\2\u0260\u0261\7v\2\2\u0261\u0262\7k\2\2\u0262\u0263\7p\2\2"+
		"\u0263\u0264\7i\2\2\u0264p\3\2\2\2\u0265\u0266\7f\2\2\u0266\u0267\7g\2"+
		"\2\u0267\u0268\7n\2\2\u0268\u0269\7g\2\2\u0269\u026a\7v\2\2\u026a\u026b"+
		"\7k\2\2\u026b\u026c\7p\2\2\u026c\u026d\7i\2\2\u026dr\3\2\2\2\u026e\u026f"+
		"\7k\2\2\u026f\u0270\7u\2\2\u0270\u0271\7q\2\2\u0271\u0272\7r\2\2\u0272"+
		"\u0273\7g\2\2\u0273\u0274\7p\2\2\u0274t\3\2\2\2\u0275\u0276\7g\2\2\u0276"+
		"\u0277\7z\2\2\u0277\u0278\7k\2\2\u0278\u0279\7u\2\2\u0279\u027a\7v\2\2"+
		"\u027a\u027b\7u\2\2\u027bv\3\2\2\2\u027c\u027d\7d\2\2\u027d\u027e\7g\2"+
		"\2\u027e\u027f\7i\2\2\u027f\u0280\7k\2\2\u0280\u0281\7p\2\2\u0281x\3\2"+
		"\2\2\u0282\u0283\7e\2\2\u0283\u0284\7n\2\2\u0284\u0285\7q\2\2\u0285\u0286"+
		"\7u\2\2\u0286\u0287\7g\2\2\u0287z\3\2\2\2\u0288\u0289\7e\2\2\u0289\u028a"+
		"\7q\2\2\u028a\u028b\7p\2\2\u028b\u028c\7u\2\2\u028c\u028d\7v\2\2\u028d"+
		"\u028e\7c\2\2\u028e\u028f\7p\2\2\u028f\u0290\7v\2\2\u0290|\3\2\2\2\u0291"+
		"\u0292\7e\2\2\u0292\u0293\7q\2\2\u0293\u0294\7p\2\2\u0294\u0295\7v\2\2"+
		"\u0295\u0296\7k\2\2\u0296\u0297\7p\2\2\u0297\u0298\7w\2\2\u0298\u0299"+
		"\7g\2\2\u0299~\3\2\2\2\u029a\u029b\7e\2\2\u029b\u029c\7w\2\2\u029c\u029d"+
		"\7t\2\2\u029d\u029e\7u\2\2\u029e\u029f\7q\2\2\u029f\u02a0\7t\2\2\u02a0"+
		"\u0080\3\2\2\2\u02a1\u02a2\7f\2\2\u02a2\u02a3\7g\2\2\u02a3\u02a4\7e\2"+
		"\2\u02a4\u02a5\7n\2\2\u02a5\u02a6\7c\2\2\u02a6\u02a7\7t\2\2\u02a7\u02a8"+
		"\7g\2\2\u02a8\u0082\3\2\2\2\u02a9\u02aa\7f\2\2\u02aa\u02ab\7g\2\2\u02ab"+
		"\u02ac\7v\2\2\u02ac\u02ad\7g\2\2\u02ad\u02ae\7t\2\2\u02ae\u02af\7o\2\2"+
		"\u02af\u02b0\7k\2\2\u02b0\u02b1\7p\2\2\u02b1\u02b2\7k\2\2\u02b2\u02b3"+
		"\7u\2\2\u02b3\u02b4\7v\2\2\u02b4\u02b5\7k\2\2\u02b5\u02b6\7e\2\2\u02b6"+
		"\u0084\3\2\2\2\u02b7\u02b8\7g\2\2\u02b8\u02b9\7p\2\2\u02b9\u02ba\7f\2"+
		"\2\u02ba\u0086\3\2\2\2\u02bb\u02bc\7g\2\2\u02bc\u02bd\7z\2\2\u02bd\u02be"+
		"\7e\2\2\u02be\u02bf\7g\2\2\u02bf\u02c0\7r\2\2\u02c0\u02c1\7v\2\2\u02c1"+
		"\u02c2\7k\2\2\u02c2\u02c3\7q\2\2\u02c3\u02c4\7p\2\2\u02c4\u0088\3\2\2"+
		"\2\u02c5\u02c6\7g\2\2\u02c6\u02c7\7z\2\2\u02c7\u02c8\7g\2\2\u02c8\u02c9"+
		"\7e\2\2\u02c9\u02ca\7w\2\2\u02ca\u02cb\7v\2\2\u02cb\u02cc\7g\2\2\u02cc"+
		"\u008a\3\2\2\2\u02cd\u02ce\7g\2\2\u02ce\u02cf\7z\2\2\u02cf\u02d0\7k\2"+
		"\2\u02d0\u02d1\7v\2\2\u02d1\u008c\3\2\2\2\u02d2\u02d3\7h\2\2\u02d3\u02d4"+
		"\7w\2\2\u02d4\u02d5\7p\2\2\u02d5\u02d6\7e\2\2\u02d6\u02d7\7v\2\2\u02d7"+
		"\u02d8\7k\2\2\u02d8\u02d9\7q\2\2\u02d9\u02da\7p\2\2\u02da\u008e\3\2\2"+
		"\2\u02db\u02dc\7k\2\2\u02dc\u02dd\7o\2\2\u02dd\u02de\7o\2\2\u02de\u02df"+
		"\7g\2\2\u02df\u02e0\7f\2\2\u02e0\u02e1\7k\2\2\u02e1\u02e2\7c\2\2\u02e2"+
		"\u02e3\7v\2\2\u02e3\u02e4\7g\2\2\u02e4\u0090\3\2\2\2\u02e5\u02e6\7n\2"+
		"\2\u02e6\u02e7\7q\2\2\u02e7\u02e8\7q\2\2\u02e8\u02e9\7r\2\2\u02e9\u0092"+
		"\3\2\2\2\u02ea\u02eb\7p\2\2\u02eb\u02ec\7q\2\2\u02ec\u02ed\7e\2\2\u02ed"+
		"\u02ee\7q\2\2\u02ee\u02ef\7r\2\2\u02ef\u02f0\7{\2\2\u02f0\u0094\3\2\2"+
		"\2\u02f1\u02f2\7q\2\2\u02f2\u02f3\7v\2\2\u02f3\u02f4\7j\2\2\u02f4\u02f5"+
		"\7g\2\2\u02f5\u02f6\7t\2\2\u02f6\u02f7\7u\2\2\u02f7\u0096\3\2\2\2\u02f8"+
		"\u02f9\7q\2\2\u02f9\u02fa\7w\2\2\u02fa\u02fb\7v\2\2\u02fb\u0098\3\2\2"+
		"\2\u02fc\u02fd\7r\2\2\u02fd\u02fe\7c\2\2\u02fe\u02ff\7t\2\2\u02ff\u0300"+
		"\7c\2\2\u0300\u0301\7n\2\2\u0301\u0302\7n\2\2\u0302\u0303\7g\2\2\u0303"+
		"\u0304\7n\2\2\u0304\u0305\7a\2\2\u0305\u0306\7g\2\2\u0306\u0307\7p\2\2"+
		"\u0307\u0308\7c\2\2\u0308\u0309\7d\2\2\u0309\u030a\7n\2\2\u030a\u030b"+
		"\7g\2\2\u030b\u009a\3\2\2\2\u030c\u030d\7r\2\2\u030d\u030e\7k\2\2\u030e"+
		"\u030f\7r\2\2\u030f\u0310\7g\2\2\u0310\u0311\7n\2\2\u0311\u0312\7k\2\2"+
		"\u0312\u0313\7p\2\2\u0313\u0314\7g\2\2\u0314\u0315\7f\2\2\u0315\u009c"+
		"\3\2\2\2\u0316\u0317\7r\2\2\u0317\u0318\7t\2\2\u0318\u0319\7c\2\2\u0319"+
		"\u031a\7i\2\2\u031a\u031b\7o\2\2\u031b\u031c\7c\2\2\u031c\u009e\3\2\2"+
		"\2\u031d\u031e\7r\2\2\u031e\u031f\7t\2\2\u031f\u0320\7q\2\2\u0320\u0321"+
		"\7e\2\2\u0321\u0322\7g\2\2\u0322\u0323\7f\2\2\u0323\u0324\7w\2\2\u0324"+
		"\u0325\7t\2\2\u0325\u0326\7g\2\2\u0326\u00a0\3\2\2\2\u0327\u0328\7t\2"+
		"\2\u0328\u0329\7g\2\2\u0329\u032a\7e\2\2\u032a\u032b\7q\2\2\u032b\u032c"+
		"\7t\2\2\u032c\u032d\7f\2\2\u032d\u00a2\3\2\2\2\u032e\u032f\7t\2\2\u032f"+
		"\u0330\7g\2\2\u0330\u0331\7h\2\2\u0331\u00a4\3\2\2\2\u0332\u0333\7t\2"+
		"\2\u0333\u0334\7g\2\2\u0334\u0335\7u\2\2\u0335\u0336\7w\2\2\u0336\u0337"+
		"\7n\2\2\u0337\u0338\7v\2\2\u0338\u0339\7a\2\2\u0339\u033a\7e\2\2\u033a"+
		"\u033b\7c\2\2\u033b\u033c\7e\2\2\u033c\u033d\7j\2\2\u033d\u033e\7g\2\2"+
		"\u033e\u00a6\3\2\2\2\u033f\u0340\7t\2\2\u0340\u0341\7g\2\2\u0341\u0342"+
		"\7v\2\2\u0342\u0343\7w\2\2\u0343\u0344\7t\2\2\u0344\u0345\7p\2\2\u0345"+
		"\u00a8\3\2\2\2\u0346\u0347\7t\2\2\u0347\u0348\7g\2\2\u0348\u0349\7v\2"+
		"\2\u0349\u034a\7w\2\2\u034a\u034b\7t\2\2\u034b\u034c\7p\2\2\u034c\u034d"+
		"\7k\2\2\u034d\u034e\7p\2\2\u034e\u034f\7i\2\2\u034f\u00aa\3\2\2\2\u0350"+
		"\u0351\7t\2\2\u0351\u0352\7q\2\2\u0352\u0353\7y\2\2\u0353\u0354\7v\2\2"+
		"\u0354\u0355\7{\2\2\u0355\u0356\7r\2\2\u0356\u0357\7g\2\2\u0357\u00ac"+
		"\3\2\2\2\u0358\u0359\7u\2\2\u0359\u035a\7w\2\2\u035a\u035b\7d\2\2\u035b"+
		"\u035c\7v\2\2\u035c\u035d\7{\2\2\u035d\u035e\7r\2\2\u035e\u035f\7g\2\2"+
		"\u035f\u00ae\3\2\2\2\u0360\u0361\7w\2\2\u0361\u0362\7u\2\2\u0362\u0363"+
		"\7k\2\2\u0363\u0364\7p\2\2\u0364\u0365\7i\2\2\u0365\u00b0\3\2\2\2\u0366"+
		"\u0367\7x\2\2\u0367\u0368\7c\2\2\u0368\u0369\7t\2\2\u0369\u036a\7t\2\2"+
		"\u036a\u036b\7c\2\2\u036b\u036c\7{\2\2\u036c\u00b2\3\2\2\2\u036d\u036e"+
		"\7x\2\2\u036e\u036f\7c\2\2\u036f\u0370\7t\2\2\u0370\u0371\7{\2\2\u0371"+
		"\u0372\7k\2\2\u0372\u0373\7p\2\2\u0373\u0374\7i\2\2\u0374\u00b4\3\2\2"+
		"\2\u0375\u0376\7y\2\2\u0376\u0377\7j\2\2\u0377\u0378\7g\2\2\u0378\u0379"+
		"\7p\2\2\u0379\u00b6\3\2\2\2\u037a\u037c\7p\2\2\u037b\u037a\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0383\7)\2\2\u037e\u037f\7)\2"+
		"\2\u037f\u0382\7)\2\2\u0380\u0382\n\2\2\2\u0381\u037e\3\2\2\2\u0381\u0380"+
		"\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u0386\3\2\2\2\u0385\u0383\3\2\2\2\u0386\u0387\7)\2\2\u0387\u00b8\3\2"+
		"\2\2\u0388\u038c\4c|\2\u0389\u038b\t\3\2\2\u038a\u0389\3\2\2\2\u038b\u038e"+
		"\3\2\2\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u0391\3\2\2\2\u038e"+
		"\u038c\3\2\2\2\u038f\u0391\5\u00fd\177\2\u0390\u0388\3\2\2\2\u0390\u038f"+
		"\3\2\2\2\u0391\u00ba\3\2\2\2\u0392\u0393\7=\2\2\u0393\u00bc\3\2\2\2\u0394"+
		"\u0395\7<\2\2\u0395\u00be\3\2\2\2\u0396\u0397\5\u00c3b\2\u0397\u0398\5"+
		"\u00c3b\2\u0398\u00c0\3\2\2\2\u0399\u039a\5\u00c3b\2\u039a\u00c2\3\2\2"+
		"\2\u039b\u039c\7\60\2\2\u039c\u00c4\3\2\2\2\u039d\u039e\7.\2\2\u039e\u00c6"+
		"\3\2\2\2\u039f\u03a0\7,\2\2\u03a0\u03a1\7,\2\2\u03a1\u00c8\3\2\2\2\u03a2"+
		"\u03a3\7,\2\2\u03a3\u00ca\3\2\2\2\u03a4\u03a5\7B\2\2\u03a5\u00cc\3\2\2"+
		"\2\u03a6\u03a7\7+\2\2\u03a7\u00ce\3\2\2\2\u03a8\u03a9\7*\2\2\u03a9\u00d0"+
		"\3\2\2\2\u03aa\u03ab\7_\2\2\u03ab\u00d2\3\2\2\2\u03ac\u03ad\7]\2\2\u03ad"+
		"\u00d4\3\2\2\2\u03ae\u03af\7-\2\2\u03af\u00d6\3\2\2\2\u03b0\u03b1\7/\2"+
		"\2\u03b1\u00d8\3\2\2\2\u03b2\u03b3\7\61\2\2\u03b3\u00da\3\2\2\2\u03b4"+
		"\u03b5\7?\2\2\u03b5\u00dc\3\2\2\2\u03b6\u03b7\7\'\2\2\u03b7\u00de\3\2"+
		"\2\2\u03b8\u03b9\7>\2\2\u03b9\u03ba\7>\2\2\u03ba\u00e0\3\2\2\2\u03bb\u03bc"+
		"\7@\2\2\u03bc\u03bd\7@\2\2\u03bd\u00e2\3\2\2\2\u03be\u03bf\7<\2\2\u03bf"+
		"\u03c0\7?\2\2\u03c0\u00e4\3\2\2\2\u03c1\u03c2\7?\2\2\u03c2\u03c3\7@\2"+
		"\2\u03c3\u00e6\3\2\2\2\u03c4\u03c5\7~\2\2\u03c5\u00e8\3\2\2\2\u03c6\u03c7"+
		"\7~\2\2\u03c7\u03c8\7~\2\2\u03c8\u00ea\3\2\2\2\u03c9\u03ca\7>\2\2\u03ca"+
		"\u03d2\7@\2\2\u03cb\u03cc\7#\2\2\u03cc\u03d2\7?\2\2\u03cd\u03ce\7\u0080"+
		"\2\2\u03ce\u03d2\7?\2\2\u03cf\u03d0\7`\2\2\u03d0\u03d2\7?\2\2\u03d1\u03c9"+
		"\3\2\2\2\u03d1\u03cb\3\2\2\2\u03d1\u03cd\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2"+
		"\u00ec\3\2\2\2\u03d3\u03d4\7>\2\2\u03d4\u00ee\3\2\2\2\u03d5\u03d6\7>\2"+
		"\2\u03d6\u03d7\7?\2\2\u03d7\u00f0\3\2\2\2\u03d8\u03d9\7@\2\2\u03d9\u00f2"+
		"\3\2\2\2\u03da\u03db\7@\2\2\u03db\u03dc\7?\2\2\u03dc\u00f4\3\2\2\2\u03dd"+
		"\u03de\5\u00fb~\2\u03de\u00f6\3\2\2\2\u03df\u03e6\5\u00f9}\2\u03e0\u03e3"+
		"\7g\2\2\u03e1\u03e4\5\u00d5k\2\u03e2\u03e4\5\u00d7l\2\u03e3\u03e1\3\2"+
		"\2\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5"+
		"\u03e7\5\u00fb~\2\u03e6\u03e0\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u00f8"+
		"\3\2\2\2\u03e8\u03e9\5\u00fb~\2\u03e9\u03ea\5\u00c3b\2\u03ea\u03eb\5\u00fb"+
		"~\2\u03eb\u03f1\3\2\2\2\u03ec\u03ed\5\u00c3b\2\u03ed\u03ee\5\u00fb~\2"+
		"\u03ee\u03f1\3\2\2\2\u03ef\u03f1\5\u00fb~\2\u03f0\u03e8\3\2\2\2\u03f0"+
		"\u03ec\3\2\2\2\u03f0\u03ef\3\2\2\2\u03f1\u00fa\3\2\2\2\u03f2\u03f6\4\62"+
		";\2\u03f3\u03f5\4\62;\2\u03f4\u03f3\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6"+
		"\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u00fc\3\2\2\2\u03f8\u03f6\3\2"+
		"\2\2\u03f9\u03fd\7$\2\2\u03fa\u03fc\n\4\2\2\u03fb\u03fa\3\2\2\2\u03fc"+
		"\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2"+
		"\2\2\u03ff\u03fd\3\2\2\2\u0400\u0401\7$\2\2\u0401\u00fe\3\2\2\2\u0402"+
		"\u0403\t\5\2\2\u0403\u0404\b\u0080\2\2\u0404\u0100\3\2\2\2\u0405\u0406"+
		"\7/\2\2\u0406\u0407\7/\2\2\u0407\u040b\3\2\2\2\u0408\u040a\n\6\2\2\u0409"+
		"\u0408\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2"+
		"\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0410\7\17\2\2\u040f"+
		"\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\7\f"+
		"\2\2\u0412\u0413\b\u0081\3\2\u0413\u0102\3\2\2\2\u0414\u0415\7\61\2\2"+
		"\u0415\u0416\7,\2\2\u0416\u041a\3\2\2\2\u0417\u0419\13\2\2\2\u0418\u0417"+
		"\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u041b\3\2\2\2\u041a\u0418\3\2\2\2\u041b"+
		"\u041d\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u041e\7,\2\2\u041e\u041f\7\61"+
		"\2\2\u041f\u0420\3\2\2\2\u0420\u0421\b\u0082\4\2\u0421\u0104\3\2\2\2\21"+
		"\2\u037b\u0381\u0383\u038c\u0390\u03d1\u03e3\u03e6\u03f0\u03f6\u03fd\u040b"+
		"\u040f\u041a\5\3\u0080\2\3\u0081\3\3\u0082\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}