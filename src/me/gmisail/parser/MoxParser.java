// Generated from Mox.g4 by ANTLR 4.7.1

    package me.gmisail.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoxParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_classBlock = 2, RULE_statement = 3, 
		RULE_expr = 4, RULE_boundedExpr = 5, RULE_classDecl = 6, RULE_moduleDecl = 7, 
		RULE_variable = 8, RULE_variableAssignmentStatement = 9, RULE_variableArrayAssignment = 10, 
		RULE_variableAssignment = 11, RULE_variableAccess = 12, RULE_variableCreate = 13, 
		RULE_variableDestructor = 14, RULE_variableDelete = 15, RULE_variableArrayAccess = 16, 
		RULE_function = 17, RULE_funcReturnType = 18, RULE_funcParam = 19, RULE_funcParams = 20, 
		RULE_builtInFunctions = 21, RULE_funcSize = 22, RULE_funcChar = 23, RULE_extern = 24, 
		RULE_funcExtern = 25, RULE_varExtern = 26, RULE_functionCall = 27, RULE_functionCallParam = 28, 
		RULE_functionCallParams = 29, RULE_paramList = 30, RULE_returnStatement = 31, 
		RULE_ifElseIf = 32, RULE_ifStatement = 33, RULE_elseIfStatement = 34, 
		RULE_elseStatement = 35, RULE_whileExpr = 36, RULE_whileLoop = 37, RULE_forLoop = 38, 
		RULE_forFromExpr = 39, RULE_forToExpr = 40, RULE_forRangeLoop = 41, RULE_importStatement = 42, 
		RULE_bitwise = 43, RULE_addSub = 44, RULE_operatorAnd = 45, RULE_operatorOr = 46, 
		RULE_mulDivMod = 47, RULE_bool = 48, RULE_equals = 49, RULE_conditionals = 50, 
		RULE_type = 51, RULE_templateType = 52, RULE_nameList = 53;
	public static final String[] ruleNames = {
		"program", "block", "classBlock", "statement", "expr", "boundedExpr", 
		"classDecl", "moduleDecl", "variable", "variableAssignmentStatement", 
		"variableArrayAssignment", "variableAssignment", "variableAccess", "variableCreate", 
		"variableDestructor", "variableDelete", "variableArrayAccess", "function", 
		"funcReturnType", "funcParam", "funcParams", "builtInFunctions", "funcSize", 
		"funcChar", "extern", "funcExtern", "varExtern", "functionCall", "functionCallParam", 
		"functionCallParams", "paramList", "returnStatement", "ifElseIf", "ifStatement", 
		"elseIfStatement", "elseStatement", "whileExpr", "whileLoop", "forLoop", 
		"forFromExpr", "forToExpr", "forRangeLoop", "importStatement", "bitwise", 
		"addSub", "operatorAnd", "operatorOr", "mulDivMod", "bool", "equals", 
		"conditionals", "type", "templateType", "nameList"
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

	@Override
	public String getGrammarFileName() { return "Mox.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MoxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MoxParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(108);
				importStatement();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			block();
			setState(115);
			match(EOF);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__10) | (1L << T__13) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__28) | (1L << NAME))) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
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

	public static class ClassBlockContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterClassBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitClassBlock(this);
		}
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__13) {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(123);
					variable();
					}
					break;
				case T__13:
					{
					setState(124);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(129);
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

	public static class StatementContext extends ParserRuleContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public ModuleDeclContext moduleDecl() {
			return getRuleContext(ModuleDeclContext.class,0);
		}
		public ExternContext extern() {
			return getRuleContext(ExternContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableDeleteContext variableDelete() {
			return getRuleContext(VariableDeleteContext.class,0);
		}
		public VariableAssignmentStatementContext variableAssignmentStatement() {
			return getRuleContext(VariableAssignmentStatementContext.class,0);
		}
		public VariableArrayAssignmentContext variableArrayAssignment() {
			return getRuleContext(VariableArrayAssignmentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfElseIfContext ifElseIf() {
			return getRuleContext(IfElseIfContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				classDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				moduleDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				extern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				variableDelete();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				variableAssignmentStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				variableArrayAssignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				functionCall();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(139);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(140);
				ifElseIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(141);
				whileLoop();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(142);
				forLoop();
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

	public static class ExprContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MoxParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(MoxParser.NUM, 0); }
		public TerminalNode CHAR() { return getToken(MoxParser.CHAR, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public VariableArrayAccessContext variableArrayAccess() {
			return getRuleContext(VariableArrayAccessContext.class,0);
		}
		public BuiltInFunctionsContext builtInFunctions() {
			return getRuleContext(BuiltInFunctionsContext.class,0);
		}
		public BoundedExprContext boundedExpr() {
			return getRuleContext(BoundedExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivModContext mulDivMod() {
			return getRuleContext(MulDivModContext.class,0);
		}
		public AddSubContext addSub() {
			return getRuleContext(AddSubContext.class,0);
		}
		public BitwiseContext bitwise() {
			return getRuleContext(BitwiseContext.class,0);
		}
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
		}
		public OperatorAndContext operatorAnd() {
			return getRuleContext(OperatorAndContext.class,0);
		}
		public OperatorOrContext operatorOr() {
			return getRuleContext(OperatorOrContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(146);
				bool();
				}
				break;
			case 2:
				{
				setState(147);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(148);
				match(NUM);
				}
				break;
			case 4:
				{
				setState(149);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(150);
				functionCall();
				}
				break;
			case 6:
				{
				setState(151);
				variableAccess();
				}
				break;
			case 7:
				{
				setState(152);
				variableArrayAccess();
				}
				break;
			case 8:
				{
				setState(153);
				builtInFunctions();
				}
				break;
			case 9:
				{
				setState(154);
				boundedExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(158);
						mulDivMod();
						setState(159);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						addSub();
						setState(163);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						bitwise();
						setState(167);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170);
						conditionals();
						setState(171);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						operatorAnd();
						setState(175);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(178);
						operatorOr();
						setState(179);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoundedExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoundedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterBoundedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitBoundedExpr(this);
		}
	}

	public final BoundedExprContext boundedExpr() throws RecognitionException {
		BoundedExprContext _localctx = new BoundedExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_boundedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__0);
			setState(187);
			expr(0);
			setState(188);
			match(T__1);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__2);
			setState(191);
			type();
			setState(192);
			classBlock();
			setState(193);
			match(T__3);
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

	public static class ModuleDeclContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public ModuleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterModuleDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitModuleDecl(this);
		}
	}

	public final ModuleDeclContext moduleDecl() throws RecognitionException {
		ModuleDeclContext _localctx = new ModuleDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__4);
			setState(196);
			match(NAME);
			setState(197);
			classBlock();
			setState(198);
			match(T__3);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__5);
			setState(201);
			match(NAME);
			setState(202);
			match(T__6);
			setState(203);
			type();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(204);
				variableAssignment();
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

	public static class VariableAssignmentStatementContext extends ParserRuleContext {
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VariableAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVariableAssignmentStatement(this);
		}
	}

	public final VariableAssignmentStatementContext variableAssignmentStatement() throws RecognitionException {
		VariableAssignmentStatementContext _localctx = new VariableAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			variableAccess();
			setState(208);
			variableAssignment();
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

	public static class VariableArrayAssignmentContext extends ParserRuleContext {
		public VariableArrayAccessContext variableArrayAccess() {
			return getRuleContext(VariableArrayAccessContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VariableArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableArrayAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVariableArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVariableArrayAssignment(this);
		}
	}

	public final VariableArrayAssignmentContext variableArrayAssignment() throws RecognitionException {
		VariableArrayAssignmentContext _localctx = new VariableArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableArrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			variableArrayAccess();
			setState(211);
			variableAssignment();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableCreateContext variableCreate() {
			return getRuleContext(VariableCreateContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			equals();
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__17:
			case T__18:
			case T__42:
			case T__43:
			case NAME:
			case STRING:
			case CHAR:
			case NUM:
				{
				setState(214);
				expr(0);
				}
				break;
			case T__8:
				{
				setState(215);
				variableCreate();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableAccessContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(MoxParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MoxParser.NAME, i);
		}
		public VariableAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVariableAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVariableAccess(this);
		}
	}

	public final VariableAccessContext variableAccess() throws RecognitionException {
		VariableAccessContext _localctx = new VariableAccessContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(NAME);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					match(T__7);
					setState(220);
					match(NAME);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class VariableCreateContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionCallParamsContext functionCallParams() {
			return getRuleContext(FunctionCallParamsContext.class,0);
		}
		public VariableCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableCreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVariableCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVariableCreate(this);
		}
	}

	public final VariableCreateContext variableCreate() throws RecognitionException {
		VariableCreateContext _localctx = new VariableCreateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableCreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__8);
			setState(227);
			type();
			setState(228);
			match(T__0);
			setState(229);
			functionCallParams();
			setState(230);
			match(T__1);
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

	public static class VariableDestructorContext extends ParserRuleContext {
		public VariableDestructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDestructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVariableDestructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVariableDestructor(this);
		}
	}

	public final VariableDestructorContext variableDestructor() throws RecognitionException {
		VariableDestructorContext _localctx = new VariableDestructorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDestructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__9);
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

	public static class VariableDeleteContext extends ParserRuleContext {
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public VariableDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDelete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVariableDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVariableDelete(this);
		}
	}

	public final VariableDeleteContext variableDelete() throws RecognitionException {
		VariableDeleteContext _localctx = new VariableDeleteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__10);
			setState(235);
			variableAccess();
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

	public static class VariableArrayAccessContext extends ParserRuleContext {
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableArrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVariableArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVariableArrayAccess(this);
		}
	}

	public final VariableArrayAccessContext variableArrayAccess() throws RecognitionException {
		VariableArrayAccessContext _localctx = new VariableArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableArrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			variableAccess();
			setState(238);
			match(T__11);
			setState(239);
			expr(0);
			setState(240);
			match(T__12);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncReturnTypeContext funcReturnType() {
			return getRuleContext(FuncReturnTypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__13);
			setState(243);
			match(NAME);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(244);
				match(T__14);
				setState(245);
				type();
				setState(246);
				match(T__15);
				}
			}

			setState(250);
			funcParams();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(251);
				funcReturnType();
				}
			}

			setState(254);
			block();
			setState(255);
			match(T__3);
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

	public static class FuncReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFuncReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFuncReturnType(this);
		}
	}

	public final FuncReturnTypeContext funcReturnType() throws RecognitionException {
		FuncReturnTypeContext _localctx = new FuncReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__16);
			setState(258);
			type();
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

	public static class FuncParamContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFuncParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFuncParam(this);
		}
	}

	public final FuncParamContext funcParam() throws RecognitionException {
		FuncParamContext _localctx = new FuncParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(NAME);
			setState(261);
			match(T__6);
			setState(262);
			type();
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

	public static class FuncParamsContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFuncParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFuncParams(this);
		}
	}

	public final FuncParamsContext funcParams() throws RecognitionException {
		FuncParamsContext _localctx = new FuncParamsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__0);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(265);
				paramList();
				}
			}

			setState(268);
			match(T__1);
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

	public static class BuiltInFunctionsContext extends ParserRuleContext {
		public FuncCharContext funcChar() {
			return getRuleContext(FuncCharContext.class,0);
		}
		public FuncSizeContext funcSize() {
			return getRuleContext(FuncSizeContext.class,0);
		}
		public BuiltInFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterBuiltInFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitBuiltInFunctions(this);
		}
	}

	public final BuiltInFunctionsContext builtInFunctions() throws RecognitionException {
		BuiltInFunctionsContext _localctx = new BuiltInFunctionsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_builtInFunctions);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				funcChar();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				funcSize();
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

	public static class FuncSizeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFuncSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFuncSize(this);
		}
	}

	public final FuncSizeContext funcSize() throws RecognitionException {
		FuncSizeContext _localctx = new FuncSizeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__17);
			setState(275);
			match(T__0);
			setState(276);
			type();
			setState(277);
			match(T__1);
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

	public static class FuncCharContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MoxParser.STRING, 0); }
		public FuncCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFuncChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFuncChar(this);
		}
	}

	public final FuncCharContext funcChar() throws RecognitionException {
		FuncCharContext _localctx = new FuncCharContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funcChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__18);
			setState(280);
			match(T__0);
			setState(281);
			match(STRING);
			setState(282);
			match(T__1);
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

	public static class ExternContext extends ParserRuleContext {
		public FuncExternContext funcExtern() {
			return getRuleContext(FuncExternContext.class,0);
		}
		public VarExternContext varExtern() {
			return getRuleContext(VarExternContext.class,0);
		}
		public ExternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitExtern(this);
		}
	}

	public final ExternContext extern() throws RecognitionException {
		ExternContext _localctx = new ExternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_extern);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				funcExtern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				varExtern();
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

	public static class FuncExternContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public FuncReturnTypeContext funcReturnType() {
			return getRuleContext(FuncReturnTypeContext.class,0);
		}
		public FuncExternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcExtern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFuncExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFuncExtern(this);
		}
	}

	public final FuncExternContext funcExtern() throws RecognitionException {
		FuncExternContext _localctx = new FuncExternContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcExtern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__19);
			setState(289);
			match(T__13);
			setState(290);
			match(NAME);
			setState(291);
			funcParams();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(292);
				funcReturnType();
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

	public static class VarExternContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarExternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExtern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterVarExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitVarExtern(this);
		}
	}

	public final VarExternContext varExtern() throws RecognitionException {
		VarExternContext _localctx = new VarExternContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_varExtern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__19);
			setState(296);
			match(NAME);
			setState(297);
			match(T__16);
			setState(298);
			type();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(MoxParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MoxParser.NAME, i);
		}
		public FunctionCallParamsContext functionCallParams() {
			return getRuleContext(FunctionCallParamsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(NAME);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(301);
				match(T__7);
				setState(302);
				match(NAME);
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(308);
				match(T__14);
				setState(309);
				type();
				setState(310);
				match(T__15);
				}
			}

			setState(314);
			match(T__0);
			setState(315);
			functionCallParams();
			setState(316);
			match(T__1);
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

	public static class FunctionCallParamContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFunctionCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFunctionCallParam(this);
		}
	}

	public final FunctionCallParamContext functionCallParam() throws RecognitionException {
		FunctionCallParamContext _localctx = new FunctionCallParamContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			expr(0);
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

	public static class FunctionCallParamsContext extends ParserRuleContext {
		public List<FunctionCallParamContext> functionCallParam() {
			return getRuleContexts(FunctionCallParamContext.class);
		}
		public FunctionCallParamContext functionCallParam(int i) {
			return getRuleContext(FunctionCallParamContext.class,i);
		}
		public FunctionCallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterFunctionCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitFunctionCallParams(this);
		}
	}

	public final FunctionCallParamsContext functionCallParams() throws RecognitionException {
		FunctionCallParamsContext _localctx = new FunctionCallParamsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionCallParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__17) | (1L << T__18) | (1L << T__42) | (1L << T__43) | (1L << NAME) | (1L << STRING) | (1L << CHAR) | (1L << NUM))) != 0)) {
				{
				setState(320);
				functionCallParam();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(321);
					match(T__20);
					setState(322);
					functionCallParam();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParamListContext extends ParserRuleContext {
		public List<FuncParamContext> funcParam() {
			return getRuleContexts(FuncParamContext.class);
		}
		public FuncParamContext funcParam(int i) {
			return getRuleContext(FuncParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			funcParam();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(331);
				match(T__20);
				setState(332);
				funcParam();
				}
				}
				setState(337);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__21);
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(339);
				expr(0);
				}
				break;
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

	public static class IfElseIfContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterIfElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitIfElseIf(this);
		}
	}

	public final IfElseIfContext ifElseIf() throws RecognitionException {
		IfElseIfContext _localctx = new IfElseIfContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifElseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			ifStatement();
			setState(343);
			block();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(344);
				elseIfStatement();
				setState(345);
				block();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(352);
				elseStatement();
				setState(353);
				block();
				}
			}

			setState(357);
			match(T__3);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__22);
			setState(360);
			match(T__0);
			setState(361);
			expr(0);
			setState(362);
			match(T__1);
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitElseIfStatement(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__23);
			setState(365);
			match(T__0);
			setState(366);
			expr(0);
			setState(367);
			match(T__1);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__24);
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

	public static class WhileExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitWhileExpr(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__0);
			setState(372);
			expr(0);
			setState(373);
			match(T__1);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__25);
			setState(376);
			whileExpr();
			setState(377);
			block();
			setState(378);
			match(T__3);
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

	public static class ForLoopContext extends ParserRuleContext {
		public ForRangeLoopContext forRangeLoop() {
			return getRuleContext(ForRangeLoopContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			forRangeLoop();
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

	public static class ForFromExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForFromExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forFromExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterForFromExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitForFromExpr(this);
		}
	}

	public final ForFromExprContext forFromExpr() throws RecognitionException {
		ForFromExprContext _localctx = new ForFromExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forFromExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__26);
			setState(383);
			expr(0);
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

	public static class ForToExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForToExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forToExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterForToExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitForToExpr(this);
		}
	}

	public final ForToExprContext forToExpr() throws RecognitionException {
		ForToExprContext _localctx = new ForToExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forToExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__27);
			setState(386);
			expr(0);
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

	public static class ForRangeLoopContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
		public ForFromExprContext forFromExpr() {
			return getRuleContext(ForFromExprContext.class,0);
		}
		public ForToExprContext forToExpr() {
			return getRuleContext(ForToExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForRangeLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterForRangeLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitForRangeLoop(this);
		}
	}

	public final ForRangeLoopContext forRangeLoop() throws RecognitionException {
		ForRangeLoopContext _localctx = new ForRangeLoopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forRangeLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(T__28);
			setState(389);
			match(T__0);
			setState(390);
			match(NAME);
			setState(391);
			forFromExpr();
			setState(392);
			forToExpr();
			setState(393);
			match(T__1);
			setState(394);
			block();
			setState(395);
			match(T__3);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MoxParser.STRING, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__29);
			setState(398);
			match(STRING);
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

	public static class BitwiseContext extends ParserRuleContext {
		public BitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitBitwise(this);
		}
	}

	public final BitwiseContext bitwise() throws RecognitionException {
		BitwiseContext _localctx = new BitwiseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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

	public static class AddSubContext extends ParserRuleContext {
		public AddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitAddSub(this);
		}
	}

	public final AddSubContext addSub() throws RecognitionException {
		AddSubContext _localctx = new AddSubContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_addSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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

	public static class OperatorAndContext extends ParserRuleContext {
		public OperatorAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterOperatorAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitOperatorAnd(this);
		}
	}

	public final OperatorAndContext operatorAnd() throws RecognitionException {
		OperatorAndContext _localctx = new OperatorAndContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__37);
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

	public static class OperatorOrContext extends ParserRuleContext {
		public OperatorOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterOperatorOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitOperatorOr(this);
		}
	}

	public final OperatorOrContext operatorOr() throws RecognitionException {
		OperatorOrContext _localctx = new OperatorOrContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__38);
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

	public static class MulDivModContext extends ParserRuleContext {
		public MulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitMulDivMod(this);
		}
	}

	public final MulDivModContext mulDivMod() throws RecognitionException {
		MulDivModContext _localctx = new MulDivModContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_mulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
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

	public static class EqualsContext extends ParserRuleContext {
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitEquals(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__44);
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

	public static class ConditionalsContext extends ParserRuleContext {
		public ConditionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterConditionals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitConditionals(this);
		}
	}

	public final ConditionalsContext conditionals() throws RecognitionException {
		ConditionalsContext _localctx = new ConditionalsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_conditionals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
		public TemplateTypeContext templateType() {
			return getRuleContext(TemplateTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(NAME);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(417);
				templateType();
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

	public static class TemplateTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TemplateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterTemplateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitTemplateType(this);
		}
	}

	public final TemplateTypeContext templateType() throws RecognitionException {
		TemplateTypeContext _localctx = new TemplateTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_templateType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__14);
			setState(421);
			type();
			setState(422);
			match(T__15);
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

	public static class NameListContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(MoxParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MoxParser.NAME, i);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).enterNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoxListener ) ((MoxListener)listener).exitNameList(this);
		}
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_nameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(NAME);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(425);
				match(T__20);
				setState(426);
				match(NAME);
				}
				}
				setState(431);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\3\2"+
		"\3\2\3\3\7\3y\n\3\f\3\16\3|\13\3\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0092\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u00b8\n\6\f\6\16\6\u00bb\13\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00d0\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00db\n\r\3\16\3\16\3\16\7\16\u00e0"+
		"\n\16\f\16\16\16\u00e3\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00fb\n\23\3\23\3\23\5\23\u00ff\n\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u010d\n\26\3\26\3\26\3\27\3\27\5\27"+
		"\u0113\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\5\32\u0121\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0128\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\7\35\u0132\n\35\f\35\16\35\u0135\13\35\3"+
		"\35\3\35\3\35\3\35\5\35\u013b\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\7\37\u0146\n\37\f\37\16\37\u0149\13\37\5\37\u014b\n\37\3 \3"+
		" \3 \7 \u0150\n \f \16 \u0153\13 \3!\3!\5!\u0157\n!\3\"\3\"\3\"\3\"\3"+
		"\"\7\"\u015e\n\"\f\"\16\"\u0161\13\"\3\"\3\"\3\"\5\"\u0166\n\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\5"+
		"\65\u01a5\n\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u01ae\n\67\f\67"+
		"\16\67\u01b1\13\67\3\67\2\3\n8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\7\3\2!%\3\2&\'\3\2"+
		"*,\3\2-.\4\2\21\22\60\63\2\u01ad\2q\3\2\2\2\4z\3\2\2\2\6\u0081\3\2\2\2"+
		"\b\u0091\3\2\2\2\n\u009d\3\2\2\2\f\u00bc\3\2\2\2\16\u00c0\3\2\2\2\20\u00c5"+
		"\3\2\2\2\22\u00ca\3\2\2\2\24\u00d1\3\2\2\2\26\u00d4\3\2\2\2\30\u00d7\3"+
		"\2\2\2\32\u00dc\3\2\2\2\34\u00e4\3\2\2\2\36\u00ea\3\2\2\2 \u00ec\3\2\2"+
		"\2\"\u00ef\3\2\2\2$\u00f4\3\2\2\2&\u0103\3\2\2\2(\u0106\3\2\2\2*\u010a"+
		"\3\2\2\2,\u0112\3\2\2\2.\u0114\3\2\2\2\60\u0119\3\2\2\2\62\u0120\3\2\2"+
		"\2\64\u0122\3\2\2\2\66\u0129\3\2\2\28\u012e\3\2\2\2:\u0140\3\2\2\2<\u014a"+
		"\3\2\2\2>\u014c\3\2\2\2@\u0154\3\2\2\2B\u0158\3\2\2\2D\u0169\3\2\2\2F"+
		"\u016e\3\2\2\2H\u0173\3\2\2\2J\u0175\3\2\2\2L\u0179\3\2\2\2N\u017e\3\2"+
		"\2\2P\u0180\3\2\2\2R\u0183\3\2\2\2T\u0186\3\2\2\2V\u018f\3\2\2\2X\u0192"+
		"\3\2\2\2Z\u0194\3\2\2\2\\\u0196\3\2\2\2^\u0198\3\2\2\2`\u019a\3\2\2\2"+
		"b\u019c\3\2\2\2d\u019e\3\2\2\2f\u01a0\3\2\2\2h\u01a2\3\2\2\2j\u01a6\3"+
		"\2\2\2l\u01aa\3\2\2\2np\5V,\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"rt\3\2\2\2sq\3\2\2\2tu\5\4\3\2uv\7\2\2\3v\3\3\2\2\2wy\5\b\5\2xw\3\2\2"+
		"\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\5\3\2\2\2|z\3\2\2\2}\u0080\5\22\n\2"+
		"~\u0080\5$\23\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\7\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0092\5\16\b\2\u0085\u0092\5\20\t\2\u0086\u0092\5\62\32\2\u0087\u0092"+
		"\5\22\n\2\u0088\u0092\5 \21\2\u0089\u0092\5\24\13\2\u008a\u0092\5\26\f"+
		"\2\u008b\u0092\5$\23\2\u008c\u0092\58\35\2\u008d\u0092\5@!\2\u008e\u0092"+
		"\5B\"\2\u008f\u0092\5L\'\2\u0090\u0092\5N(\2\u0091\u0084\3\2\2\2\u0091"+
		"\u0085\3\2\2\2\u0091\u0086\3\2\2\2\u0091\u0087\3\2\2\2\u0091\u0088\3\2"+
		"\2\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2\u0091"+
		"\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0090\3\2\2\2\u0092\t\3\2\2\2\u0093\u0094\b\6\1\2\u0094\u009e"+
		"\5b\62\2\u0095\u009e\7\65\2\2\u0096\u009e\7\67\2\2\u0097\u009e\7\66\2"+
		"\2\u0098\u009e\58\35\2\u0099\u009e\5\32\16\2\u009a\u009e\5\"\22\2\u009b"+
		"\u009e\5,\27\2\u009c\u009e\5\f\7\2\u009d\u0093\3\2\2\2\u009d\u0095\3\2"+
		"\2\2\u009d\u0096\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\u00b9\3\2\2\2\u009f\u00a0\f\b\2\2\u00a0\u00a1\5`\61\2\u00a1"+
		"\u00a2\5\n\6\t\u00a2\u00b8\3\2\2\2\u00a3\u00a4\f\7\2\2\u00a4\u00a5\5Z"+
		".\2\u00a5\u00a6\5\n\6\b\u00a6\u00b8\3\2\2\2\u00a7\u00a8\f\6\2\2\u00a8"+
		"\u00a9\5X-\2\u00a9\u00aa\5\n\6\7\u00aa\u00b8\3\2\2\2\u00ab\u00ac\f\5\2"+
		"\2\u00ac\u00ad\5f\64\2\u00ad\u00ae\5\n\6\6\u00ae\u00b8\3\2\2\2\u00af\u00b0"+
		"\f\4\2\2\u00b0\u00b1\5\\/\2\u00b1\u00b2\5\n\6\5\u00b2\u00b8\3\2\2\2\u00b3"+
		"\u00b4\f\3\2\2\u00b4\u00b5\5^\60\2\u00b5\u00b6\5\n\6\4\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u009f\3\2\2\2\u00b7\u00a3\3\2\2\2\u00b7\u00a7\3\2\2\2\u00b7"+
		"\u00ab\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\13\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bd\7\3\2\2\u00bd\u00be\5\n\6\2\u00be\u00bf\7\4\2\2\u00bf"+
		"\r\3\2\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\5h\65\2\u00c2\u00c3\5\6\4\2"+
		"\u00c3\u00c4\7\6\2\2\u00c4\17\3\2\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00c7"+
		"\7\64\2\2\u00c7\u00c8\5\6\4\2\u00c8\u00c9\7\6\2\2\u00c9\21\3\2\2\2\u00ca"+
		"\u00cb\7\b\2\2\u00cb\u00cc\7\64\2\2\u00cc\u00cd\7\t\2\2\u00cd\u00cf\5"+
		"h\65\2\u00ce\u00d0\5\30\r\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\23\3\2\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3\5\30\r\2\u00d3\25\3\2\2"+
		"\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\5\30\r\2\u00d6\27\3\2\2\2\u00d7\u00da"+
		"\5d\63\2\u00d8\u00db\5\n\6\2\u00d9\u00db\5\34\17\2\u00da\u00d8\3\2\2\2"+
		"\u00da\u00d9\3\2\2\2\u00db\31\3\2\2\2\u00dc\u00e1\7\64\2\2\u00dd\u00de"+
		"\7\n\2\2\u00de\u00e0\7\64\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2"+
		"\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\33\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e5\7\13\2\2\u00e5\u00e6\5h\65\2\u00e6\u00e7\7\3\2\2"+
		"\u00e7\u00e8\5<\37\2\u00e8\u00e9\7\4\2\2\u00e9\35\3\2\2\2\u00ea\u00eb"+
		"\7\f\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\7\r\2\2\u00ed\u00ee\5\32\16\2\u00ee"+
		"!\3\2\2\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\7\16\2\2\u00f1\u00f2\5\n\6"+
		"\2\u00f2\u00f3\7\17\2\2\u00f3#\3\2\2\2\u00f4\u00f5\7\20\2\2\u00f5\u00fa"+
		"\7\64\2\2\u00f6\u00f7\7\21\2\2\u00f7\u00f8\5h\65\2\u00f8\u00f9\7\22\2"+
		"\2\u00f9\u00fb\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fe\5*\26\2\u00fd\u00ff\5&\24\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\5\4\3\2\u0101\u0102\7\6"+
		"\2\2\u0102%\3\2\2\2\u0103\u0104\7\23\2\2\u0104\u0105\5h\65\2\u0105\'\3"+
		"\2\2\2\u0106\u0107\7\64\2\2\u0107\u0108\7\t\2\2\u0108\u0109\5h\65\2\u0109"+
		")\3\2\2\2\u010a\u010c\7\3\2\2\u010b\u010d\5> \2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\4\2\2\u010f+\3\2\2\2"+
		"\u0110\u0113\5\60\31\2\u0111\u0113\5.\30\2\u0112\u0110\3\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113-\3\2\2\2\u0114\u0115\7\24\2\2\u0115\u0116\7\3\2\2\u0116"+
		"\u0117\5h\65\2\u0117\u0118\7\4\2\2\u0118/\3\2\2\2\u0119\u011a\7\25\2\2"+
		"\u011a\u011b\7\3\2\2\u011b\u011c\7\65\2\2\u011c\u011d\7\4\2\2\u011d\61"+
		"\3\2\2\2\u011e\u0121\5\64\33\2\u011f\u0121\5\66\34\2\u0120\u011e\3\2\2"+
		"\2\u0120\u011f\3\2\2\2\u0121\63\3\2\2\2\u0122\u0123\7\26\2\2\u0123\u0124"+
		"\7\20\2\2\u0124\u0125\7\64\2\2\u0125\u0127\5*\26\2\u0126\u0128\5&\24\2"+
		"\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\65\3\2\2\2\u0129\u012a"+
		"\7\26\2\2\u012a\u012b\7\64\2\2\u012b\u012c\7\23\2\2\u012c\u012d\5h\65"+
		"\2\u012d\67\3\2\2\2\u012e\u0133\7\64\2\2\u012f\u0130\7\n\2\2\u0130\u0132"+
		"\7\64\2\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u013a\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137"+
		"\7\21\2\2\u0137\u0138\5h\65\2\u0138\u0139\7\22\2\2\u0139\u013b\3\2\2\2"+
		"\u013a\u0136\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d"+
		"\7\3\2\2\u013d\u013e\5<\37\2\u013e\u013f\7\4\2\2\u013f9\3\2\2\2\u0140"+
		"\u0141\5\n\6\2\u0141;\3\2\2\2\u0142\u0147\5:\36\2\u0143\u0144\7\27\2\2"+
		"\u0144\u0146\5:\36\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u0142\3\2\2\2\u014a\u014b\3\2\2\2\u014b=\3\2\2\2\u014c\u0151\5(\25\2"+
		"\u014d\u014e\7\27\2\2\u014e\u0150\5(\25\2\u014f\u014d\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152?\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0156\7\30\2\2\u0155\u0157\5\n\6\2\u0156\u0155\3"+
		"\2\2\2\u0156\u0157\3\2\2\2\u0157A\3\2\2\2\u0158\u0159\5D#\2\u0159\u015f"+
		"\5\4\3\2\u015a\u015b\5F$\2\u015b\u015c\5\4\3\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0165\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\5H%\2\u0163\u0164"+
		"\5\4\3\2\u0164\u0166\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\7\6\2\2\u0168C\3\2\2\2\u0169\u016a\7\31\2\2"+
		"\u016a\u016b\7\3\2\2\u016b\u016c\5\n\6\2\u016c\u016d\7\4\2\2\u016dE\3"+
		"\2\2\2\u016e\u016f\7\32\2\2\u016f\u0170\7\3\2\2\u0170\u0171\5\n\6\2\u0171"+
		"\u0172\7\4\2\2\u0172G\3\2\2\2\u0173\u0174\7\33\2\2\u0174I\3\2\2\2\u0175"+
		"\u0176\7\3\2\2\u0176\u0177\5\n\6\2\u0177\u0178\7\4\2\2\u0178K\3\2\2\2"+
		"\u0179\u017a\7\34\2\2\u017a\u017b\5J&\2\u017b\u017c\5\4\3\2\u017c\u017d"+
		"\7\6\2\2\u017dM\3\2\2\2\u017e\u017f\5T+\2\u017fO\3\2\2\2\u0180\u0181\7"+
		"\35\2\2\u0181\u0182\5\n\6\2\u0182Q\3\2\2\2\u0183\u0184\7\36\2\2\u0184"+
		"\u0185\5\n\6\2\u0185S\3\2\2\2\u0186\u0187\7\37\2\2\u0187\u0188\7\3\2\2"+
		"\u0188\u0189\7\64\2\2\u0189\u018a\5P)\2\u018a\u018b\5R*\2\u018b\u018c"+
		"\7\4\2\2\u018c\u018d\5\4\3\2\u018d\u018e\7\6\2\2\u018eU\3\2\2\2\u018f"+
		"\u0190\7 \2\2\u0190\u0191\7\65\2\2\u0191W\3\2\2\2\u0192\u0193\t\2\2\2"+
		"\u0193Y\3\2\2\2\u0194\u0195\t\3\2\2\u0195[\3\2\2\2\u0196\u0197\7(\2\2"+
		"\u0197]\3\2\2\2\u0198\u0199\7)\2\2\u0199_\3\2\2\2\u019a\u019b\t\4\2\2"+
		"\u019ba\3\2\2\2\u019c\u019d\t\5\2\2\u019dc\3\2\2\2\u019e\u019f\7/\2\2"+
		"\u019fe\3\2\2\2\u01a0\u01a1\t\6\2\2\u01a1g\3\2\2\2\u01a2\u01a4\7\64\2"+
		"\2\u01a3\u01a5\5j\66\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5i"+
		"\3\2\2\2\u01a6\u01a7\7\21\2\2\u01a7\u01a8\5h\65\2\u01a8\u01a9\7\22\2\2"+
		"\u01a9k\3\2\2\2\u01aa\u01af\7\64\2\2\u01ab\u01ac\7\27\2\2\u01ac\u01ae"+
		"\7\64\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2"+
		"\u01af\u01b0\3\2\2\2\u01b0m\3\2\2\2\u01b1\u01af\3\2\2\2\35qz\177\u0081"+
		"\u0091\u009d\u00b7\u00b9\u00cf\u00da\u00e1\u00fa\u00fe\u010c\u0112\u0120"+
		"\u0127\u0133\u013a\u0147\u014a\u0151\u0156\u015f\u0165\u01a4\u01af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}