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
		T__45=46, T__46=47, NAME=48, STRING=49, CHAR=50, NUM=51, INT=52, FLOAT=53, 
		NEWLINE=54, WS=55, LINE_COMMENT=56, BLOCK_COMMENT=57;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_classBlock = 2, RULE_statement = 3, 
		RULE_expr = 4, RULE_boundedExpr = 5, RULE_classDecl = 6, RULE_moduleDecl = 7, 
		RULE_variable = 8, RULE_variableAssignmentStatement = 9, RULE_variableArrayAssignment = 10, 
		RULE_variableAssignment = 11, RULE_variableAccess = 12, RULE_variableCreate = 13, 
		RULE_variableDelete = 14, RULE_variableArrayAccess = 15, RULE_function = 16, 
		RULE_funcReturnType = 17, RULE_funcParam = 18, RULE_funcParams = 19, RULE_funcSize = 20, 
		RULE_extern = 21, RULE_funcExtern = 22, RULE_varExtern = 23, RULE_functionCall = 24, 
		RULE_functionCallParam = 25, RULE_functionCallParams = 26, RULE_paramList = 27, 
		RULE_returnStatement = 28, RULE_ifElseIf = 29, RULE_ifStatement = 30, 
		RULE_elseIfStatement = 31, RULE_elseStatement = 32, RULE_whileExpr = 33, 
		RULE_whileLoop = 34, RULE_forLoop = 35, RULE_forFromExpr = 36, RULE_forToExpr = 37, 
		RULE_forRangeLoop = 38, RULE_importStatement = 39, RULE_bitwise = 40, 
		RULE_addSub = 41, RULE_operatorAnd = 42, RULE_operatorOr = 43, RULE_mulDivMod = 44, 
		RULE_bool = 45, RULE_conditionals = 46, RULE_type = 47, RULE_templateType = 48, 
		RULE_nameList = 49;
	public static final String[] ruleNames = {
		"program", "block", "classBlock", "statement", "expr", "boundedExpr", 
		"classDecl", "moduleDecl", "variable", "variableAssignmentStatement", 
		"variableArrayAssignment", "variableAssignment", "variableAccess", "variableCreate", 
		"variableDelete", "variableArrayAccess", "function", "funcReturnType", 
		"funcParam", "funcParams", "funcSize", "extern", "funcExtern", "varExtern", 
		"functionCall", "functionCallParam", "functionCallParams", "paramList", 
		"returnStatement", "ifElseIf", "ifStatement", "elseIfStatement", "elseStatement", 
		"whileExpr", "whileLoop", "forLoop", "forFromExpr", "forToExpr", "forRangeLoop", 
		"importStatement", "bitwise", "addSub", "operatorAnd", "operatorOr", "mulDivMod", 
		"bool", "conditionals", "type", "templateType", "nameList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'class'", "'end'", "'module'", "'var'", "':'", "' = '", 
		"'.'", "'new'", "'delete'", "'['", "']'", "'function'", "'->'", "'size'", 
		"'extern'", "','", "'return'", "'if'", "'else if'", "'else'", "'while'", 
		"'from'", "'to'", "'for'", "'import'", "'&'", "'|'", "'~'", "'<<'", "'>>'", 
		"'+'", "'-'", "'and'", "'or'", "'*'", "'/'", "'%'", "'true'", "'false'", 
		"'=='", "'>='", "'<='", "'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NAME", "STRING", "CHAR", "NUM", "INT", "FLOAT", "NEWLINE", "WS", "LINE_COMMENT", 
		"BLOCK_COMMENT"
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(100);
				importStatement();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			block();
			setState(107);
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
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__10) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__25) | (1L << NAME))) != 0)) {
				{
				{
				setState(109);
				statement();
				}
				}
				setState(114);
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__13) {
				{
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(115);
					variable();
					}
					break;
				case T__13:
					{
					setState(116);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(121);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				classDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				moduleDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				extern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				variableDelete();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				variableAssignmentStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				variableArrayAssignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				functionCall();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(132);
				ifElseIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(133);
				whileLoop();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(134);
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
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public VariableArrayAccessContext variableArrayAccess() {
			return getRuleContext(VariableArrayAccessContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncSizeContext funcSize() {
			return getRuleContext(FuncSizeContext.class,0);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(138);
				bool();
				}
				break;
			case 2:
				{
				setState(139);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(140);
				match(NUM);
				}
				break;
			case 4:
				{
				setState(141);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(142);
				variableAccess();
				}
				break;
			case 6:
				{
				setState(143);
				variableArrayAccess();
				}
				break;
			case 7:
				{
				setState(144);
				functionCall();
				}
				break;
			case 8:
				{
				setState(145);
				funcSize();
				}
				break;
			case 9:
				{
				setState(146);
				boundedExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150);
						mulDivMod();
						setState(151);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(154);
						addSub();
						setState(155);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(158);
						bitwise();
						setState(159);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(162);
						conditionals();
						setState(163);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(166);
						operatorAnd();
						setState(167);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(170);
						operatorOr();
						setState(171);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(177);
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
			setState(178);
			match(T__0);
			setState(179);
			expr(0);
			setState(180);
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
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
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
			setState(182);
			match(T__2);
			setState(183);
			match(NAME);
			setState(184);
			classBlock();
			setState(185);
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
			setState(187);
			match(T__4);
			setState(188);
			match(NAME);
			setState(189);
			classBlock();
			setState(190);
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
			setState(192);
			match(T__5);
			setState(193);
			match(NAME);
			setState(194);
			match(T__6);
			setState(195);
			type();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(196);
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
			setState(199);
			variableAccess();
			setState(200);
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
			setState(202);
			variableArrayAccess();
			setState(203);
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
			setState(205);
			match(T__7);
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__15:
			case T__39:
			case T__40:
			case NAME:
			case STRING:
			case CHAR:
			case NUM:
				{
				setState(206);
				expr(0);
				}
				break;
			case T__9:
				{
				setState(207);
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
			setState(210);
			match(NAME);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					match(T__8);
					setState(212);
					match(NAME);
					}
					} 
				}
				setState(217);
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
		public TerminalNode NAME() { return getToken(MoxParser.NAME, 0); }
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
			setState(218);
			match(T__9);
			setState(219);
			match(NAME);
			setState(220);
			match(T__0);
			setState(221);
			functionCallParams();
			setState(222);
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
		enterRule(_localctx, 28, RULE_variableDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__10);
			setState(225);
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
		enterRule(_localctx, 30, RULE_variableArrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			variableAccess();
			setState(228);
			match(T__11);
			setState(229);
			expr(0);
			setState(230);
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
		enterRule(_localctx, 32, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__13);
			setState(233);
			match(NAME);
			setState(234);
			funcParams();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(235);
				funcReturnType();
				}
			}

			setState(238);
			block();
			setState(239);
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
		enterRule(_localctx, 34, RULE_funcReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__14);
			setState(242);
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
		enterRule(_localctx, 36, RULE_funcParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(NAME);
			setState(245);
			match(T__6);
			setState(246);
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
		enterRule(_localctx, 38, RULE_funcParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__0);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(249);
				paramList();
				}
			}

			setState(252);
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
		enterRule(_localctx, 40, RULE_funcSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__15);
			setState(255);
			match(T__0);
			setState(256);
			type();
			setState(257);
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
		enterRule(_localctx, 42, RULE_extern);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				funcExtern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
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
		enterRule(_localctx, 44, RULE_funcExtern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__16);
			setState(264);
			match(T__13);
			setState(265);
			match(NAME);
			setState(266);
			funcParams();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(267);
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
		enterRule(_localctx, 46, RULE_varExtern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__16);
			setState(271);
			match(NAME);
			setState(272);
			match(T__14);
			setState(273);
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
		enterRule(_localctx, 48, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(NAME);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(276);
				match(T__8);
				setState(277);
				match(NAME);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(T__0);
			setState(284);
			functionCallParams();
			setState(285);
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
		enterRule(_localctx, 50, RULE_functionCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		enterRule(_localctx, 52, RULE_functionCallParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__15) | (1L << T__39) | (1L << T__40) | (1L << NAME) | (1L << STRING) | (1L << CHAR) | (1L << NUM))) != 0)) {
				{
				setState(289);
				functionCallParam();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(290);
					match(T__17);
					setState(291);
					functionCallParam();
					}
					}
					setState(296);
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
		enterRule(_localctx, 54, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			funcParam();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(300);
				match(T__17);
				setState(301);
				funcParam();
				}
				}
				setState(306);
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
		enterRule(_localctx, 56, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__18);
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(308);
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
		enterRule(_localctx, 58, RULE_ifElseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			ifStatement();
			setState(312);
			block();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(313);
				elseIfStatement();
				setState(314);
				block();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(321);
				elseStatement();
				setState(322);
				block();
				}
			}

			setState(326);
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
		enterRule(_localctx, 60, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__19);
			setState(329);
			match(T__0);
			setState(330);
			expr(0);
			setState(331);
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
		enterRule(_localctx, 62, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__20);
			setState(334);
			match(T__0);
			setState(335);
			expr(0);
			setState(336);
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
		enterRule(_localctx, 64, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__21);
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
		enterRule(_localctx, 66, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__0);
			setState(341);
			expr(0);
			setState(342);
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
		enterRule(_localctx, 68, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__22);
			setState(345);
			whileExpr();
			setState(346);
			block();
			setState(347);
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
		enterRule(_localctx, 70, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 72, RULE_forFromExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__23);
			setState(352);
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
		enterRule(_localctx, 74, RULE_forToExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__24);
			setState(355);
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
		enterRule(_localctx, 76, RULE_forRangeLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__25);
			setState(358);
			match(T__0);
			setState(359);
			match(NAME);
			setState(360);
			forFromExpr();
			setState(361);
			forToExpr();
			setState(362);
			match(T__1);
			setState(363);
			block();
			setState(364);
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
		enterRule(_localctx, 78, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__26);
			setState(367);
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
		enterRule(_localctx, 80, RULE_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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
		enterRule(_localctx, 82, RULE_addSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__33) ) {
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
		enterRule(_localctx, 84, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__34);
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
		enterRule(_localctx, 86, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__35);
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
		enterRule(_localctx, 88, RULE_mulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
		enterRule(_localctx, 90, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
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
		enterRule(_localctx, 92, RULE_conditionals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(NAME);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(384);
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
		enterRule(_localctx, 96, RULE_templateType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__45);
			setState(388);
			type();
			setState(389);
			match(T__46);
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
		enterRule(_localctx, 98, RULE_nameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(NAME);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(392);
				match(T__17);
				setState(393);
				match(NAME);
				}
				}
				setState(398);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0192\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\7\2"+
		"h\n\2\f\2\16\2k\13\2\3\2\3\2\3\2\3\3\7\3q\n\3\f\3\16\3t\13\3\3\4\3\4\7"+
		"\4x\n\4\f\4\16\4{\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u008a\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0096\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b0\n\6\f\6\16\6\u00b3\13\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00c8\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00d3\n\r\3\16"+
		"\3\16\3\16\7\16\u00d8\n\16\f\16\16\16\u00db\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\5\22\u00ef\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\5\25\u00fd\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27"+
		"\u0108\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u010f\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\7\32\u0119\n\32\f\32\16\32\u011c\13\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34\u0127\n\34\f\34\16\34\u012a"+
		"\13\34\5\34\u012c\n\34\3\35\3\35\3\35\7\35\u0131\n\35\f\35\16\35\u0134"+
		"\13\35\3\36\3\36\5\36\u0138\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u013f\n"+
		"\37\f\37\16\37\u0142\13\37\3\37\3\37\3\37\5\37\u0147\n\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\5\61\u0184\n\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\7\63\u018d\n\63\f\63\16\63\u0190\13\63\3\63"+
		"\2\3\n\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bd\2\7\3\2\36\"\3\2#$\3\2\')\3\2*+\3\2,\61\2\u018d"+
		"\2i\3\2\2\2\4r\3\2\2\2\6y\3\2\2\2\b\u0089\3\2\2\2\n\u0095\3\2\2\2\f\u00b4"+
		"\3\2\2\2\16\u00b8\3\2\2\2\20\u00bd\3\2\2\2\22\u00c2\3\2\2\2\24\u00c9\3"+
		"\2\2\2\26\u00cc\3\2\2\2\30\u00cf\3\2\2\2\32\u00d4\3\2\2\2\34\u00dc\3\2"+
		"\2\2\36\u00e2\3\2\2\2 \u00e5\3\2\2\2\"\u00ea\3\2\2\2$\u00f3\3\2\2\2&\u00f6"+
		"\3\2\2\2(\u00fa\3\2\2\2*\u0100\3\2\2\2,\u0107\3\2\2\2.\u0109\3\2\2\2\60"+
		"\u0110\3\2\2\2\62\u0115\3\2\2\2\64\u0121\3\2\2\2\66\u012b\3\2\2\28\u012d"+
		"\3\2\2\2:\u0135\3\2\2\2<\u0139\3\2\2\2>\u014a\3\2\2\2@\u014f\3\2\2\2B"+
		"\u0154\3\2\2\2D\u0156\3\2\2\2F\u015a\3\2\2\2H\u015f\3\2\2\2J\u0161\3\2"+
		"\2\2L\u0164\3\2\2\2N\u0167\3\2\2\2P\u0170\3\2\2\2R\u0173\3\2\2\2T\u0175"+
		"\3\2\2\2V\u0177\3\2\2\2X\u0179\3\2\2\2Z\u017b\3\2\2\2\\\u017d\3\2\2\2"+
		"^\u017f\3\2\2\2`\u0181\3\2\2\2b\u0185\3\2\2\2d\u0189\3\2\2\2fh\5P)\2g"+
		"f\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5\4\3\2"+
		"mn\7\2\2\3n\3\3\2\2\2oq\5\b\5\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2s\5\3\2\2\2tr\3\2\2\2ux\5\22\n\2vx\5\"\22\2wu\3\2\2\2wv\3\2\2\2x{\3"+
		"\2\2\2yw\3\2\2\2yz\3\2\2\2z\7\3\2\2\2{y\3\2\2\2|\u008a\5\16\b\2}\u008a"+
		"\5\20\t\2~\u008a\5,\27\2\177\u008a\5\22\n\2\u0080\u008a\5\36\20\2\u0081"+
		"\u008a\5\24\13\2\u0082\u008a\5\26\f\2\u0083\u008a\5\"\22\2\u0084\u008a"+
		"\5\62\32\2\u0085\u008a\5:\36\2\u0086\u008a\5<\37\2\u0087\u008a\5F$\2\u0088"+
		"\u008a\5H%\2\u0089|\3\2\2\2\u0089}\3\2\2\2\u0089~\3\2\2\2\u0089\177\3"+
		"\2\2\2\u0089\u0080\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u0089"+
		"\u0083\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\t\3\2\2\2\u008b\u008c"+
		"\b\6\1\2\u008c\u0096\5\\/\2\u008d\u0096\7\63\2\2\u008e\u0096\7\65\2\2"+
		"\u008f\u0096\7\64\2\2\u0090\u0096\5\32\16\2\u0091\u0096\5 \21\2\u0092"+
		"\u0096\5\62\32\2\u0093\u0096\5*\26\2\u0094\u0096\5\f\7\2\u0095\u008b\3"+
		"\2\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u008f\3\2\2\2\u0095"+
		"\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\u00b1\3\2\2\2\u0097\u0098\f\b\2\2\u0098"+
		"\u0099\5Z.\2\u0099\u009a\5\n\6\t\u009a\u00b0\3\2\2\2\u009b\u009c\f\7\2"+
		"\2\u009c\u009d\5T+\2\u009d\u009e\5\n\6\b\u009e\u00b0\3\2\2\2\u009f\u00a0"+
		"\f\6\2\2\u00a0\u00a1\5R*\2\u00a1\u00a2\5\n\6\7\u00a2\u00b0\3\2\2\2\u00a3"+
		"\u00a4\f\5\2\2\u00a4\u00a5\5^\60\2\u00a5\u00a6\5\n\6\6\u00a6\u00b0\3\2"+
		"\2\2\u00a7\u00a8\f\4\2\2\u00a8\u00a9\5V,\2\u00a9\u00aa\5\n\6\5\u00aa\u00b0"+
		"\3\2\2\2\u00ab\u00ac\f\3\2\2\u00ac\u00ad\5X-\2\u00ad\u00ae\5\n\6\4\u00ae"+
		"\u00b0\3\2\2\2\u00af\u0097\3\2\2\2\u00af\u009b\3\2\2\2\u00af\u009f\3\2"+
		"\2\2\u00af\u00a3\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\13\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5\n\6\2\u00b6\u00b7"+
		"\7\4\2\2\u00b7\r\3\2\2\2\u00b8\u00b9\7\5\2\2\u00b9\u00ba\7\62\2\2\u00ba"+
		"\u00bb\5\6\4\2\u00bb\u00bc\7\6\2\2\u00bc\17\3\2\2\2\u00bd\u00be\7\7\2"+
		"\2\u00be\u00bf\7\62\2\2\u00bf\u00c0\5\6\4\2\u00c0\u00c1\7\6\2\2\u00c1"+
		"\21\3\2\2\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\7\62\2\2\u00c4\u00c5\7\t\2"+
		"\2\u00c5\u00c7\5`\61\2\u00c6\u00c8\5\30\r\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\23\3\2\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\5\30"+
		"\r\2\u00cb\25\3\2\2\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\5\30\r\2\u00ce\27"+
		"\3\2\2\2\u00cf\u00d2\7\n\2\2\u00d0\u00d3\5\n\6\2\u00d1\u00d3\5\34\17\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d9"+
		"\7\62\2\2\u00d5\u00d6\7\13\2\2\u00d6\u00d8\7\62\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\33"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\7\62\2\2"+
		"\u00de\u00df\7\3\2\2\u00df\u00e0\5\66\34\2\u00e0\u00e1\7\4\2\2\u00e1\35"+
		"\3\2\2\2\u00e2\u00e3\7\r\2\2\u00e3\u00e4\5\32\16\2\u00e4\37\3\2\2\2\u00e5"+
		"\u00e6\5\32\16\2\u00e6\u00e7\7\16\2\2\u00e7\u00e8\5\n\6\2\u00e8\u00e9"+
		"\7\17\2\2\u00e9!\3\2\2\2\u00ea\u00eb\7\20\2\2\u00eb\u00ec\7\62\2\2\u00ec"+
		"\u00ee\5(\25\2\u00ed\u00ef\5$\23\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5\4\3\2\u00f1\u00f2\7\6\2\2\u00f2"+
		"#\3\2\2\2\u00f3\u00f4\7\21\2\2\u00f4\u00f5\5`\61\2\u00f5%\3\2\2\2\u00f6"+
		"\u00f7\7\62\2\2\u00f7\u00f8\7\t\2\2\u00f8\u00f9\5`\61\2\u00f9\'\3\2\2"+
		"\2\u00fa\u00fc\7\3\2\2\u00fb\u00fd\58\35\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\4\2\2\u00ff)\3\2\2\2\u0100"+
		"\u0101\7\22\2\2\u0101\u0102\7\3\2\2\u0102\u0103\5`\61\2\u0103\u0104\7"+
		"\4\2\2\u0104+\3\2\2\2\u0105\u0108\5.\30\2\u0106\u0108\5\60\31\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108-\3\2\2\2\u0109\u010a\7\23\2\2"+
		"\u010a\u010b\7\20\2\2\u010b\u010c\7\62\2\2\u010c\u010e\5(\25\2\u010d\u010f"+
		"\5$\23\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f/\3\2\2\2\u0110"+
		"\u0111\7\23\2\2\u0111\u0112\7\62\2\2\u0112\u0113\7\21\2\2\u0113\u0114"+
		"\5`\61\2\u0114\61\3\2\2\2\u0115\u011a\7\62\2\2\u0116\u0117\7\13\2\2\u0117"+
		"\u0119\7\62\2\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\7\3\2\2\u011e\u011f\5\66\34\2\u011f\u0120\7\4\2\2\u0120\63\3\2"+
		"\2\2\u0121\u0122\5\n\6\2\u0122\65\3\2\2\2\u0123\u0128\5\64\33\2\u0124"+
		"\u0125\7\24\2\2\u0125\u0127\5\64\33\2\u0126\u0124\3\2\2\2\u0127\u012a"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u012c\3\2\2\2\u012c\67\3\2\2"+
		"\2\u012d\u0132\5&\24\2\u012e\u012f\7\24\2\2\u012f\u0131\5&\24\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u01339\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\7\25\2\2\u0136\u0138"+
		"\5\n\6\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138;\3\2\2\2\u0139"+
		"\u013a\5> \2\u013a\u0140\5\4\3\2\u013b\u013c\5@!\2\u013c\u013d\5\4\3\2"+
		"\u013d\u013f\3\2\2\2\u013e\u013b\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0146\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\5B\"\2\u0144\u0145\5\4\3\2\u0145\u0147\3\2\2\2\u0146\u0143\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\6\2\2\u0149"+
		"=\3\2\2\2\u014a\u014b\7\26\2\2\u014b\u014c\7\3\2\2\u014c\u014d\5\n\6\2"+
		"\u014d\u014e\7\4\2\2\u014e?\3\2\2\2\u014f\u0150\7\27\2\2\u0150\u0151\7"+
		"\3\2\2\u0151\u0152\5\n\6\2\u0152\u0153\7\4\2\2\u0153A\3\2\2\2\u0154\u0155"+
		"\7\30\2\2\u0155C\3\2\2\2\u0156\u0157\7\3\2\2\u0157\u0158\5\n\6\2\u0158"+
		"\u0159\7\4\2\2\u0159E\3\2\2\2\u015a\u015b\7\31\2\2\u015b\u015c\5D#\2\u015c"+
		"\u015d\5\4\3\2\u015d\u015e\7\6\2\2\u015eG\3\2\2\2\u015f\u0160\5N(\2\u0160"+
		"I\3\2\2\2\u0161\u0162\7\32\2\2\u0162\u0163\5\n\6\2\u0163K\3\2\2\2\u0164"+
		"\u0165\7\33\2\2\u0165\u0166\5\n\6\2\u0166M\3\2\2\2\u0167\u0168\7\34\2"+
		"\2\u0168\u0169\7\3\2\2\u0169\u016a\7\62\2\2\u016a\u016b\5J&\2\u016b\u016c"+
		"\5L\'\2\u016c\u016d\7\4\2\2\u016d\u016e\5\4\3\2\u016e\u016f\7\6\2\2\u016f"+
		"O\3\2\2\2\u0170\u0171\7\35\2\2\u0171\u0172\7\63\2\2\u0172Q\3\2\2\2\u0173"+
		"\u0174\t\2\2\2\u0174S\3\2\2\2\u0175\u0176\t\3\2\2\u0176U\3\2\2\2\u0177"+
		"\u0178\7%\2\2\u0178W\3\2\2\2\u0179\u017a\7&\2\2\u017aY\3\2\2\2\u017b\u017c"+
		"\t\4\2\2\u017c[\3\2\2\2\u017d\u017e\t\5\2\2\u017e]\3\2\2\2\u017f\u0180"+
		"\t\6\2\2\u0180_\3\2\2\2\u0181\u0183\7\62\2\2\u0182\u0184\5b\62\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184a\3\2\2\2\u0185\u0186\7\60\2\2"+
		"\u0186\u0187\5`\61\2\u0187\u0188\7\61\2\2\u0188c\3\2\2\2\u0189\u018e\7"+
		"\62\2\2\u018a\u018b\7\24\2\2\u018b\u018d\7\62\2\2\u018c\u018a\3\2\2\2"+
		"\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018fe\3"+
		"\2\2\2\u0190\u018e\3\2\2\2\32irwy\u0089\u0095\u00af\u00b1\u00c7\u00d2"+
		"\u00d9\u00ee\u00fc\u0107\u010e\u011a\u0128\u012b\u0132\u0137\u0140\u0146"+
		"\u0183\u018e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}