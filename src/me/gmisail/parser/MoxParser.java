// Generated from Mox.g4 by ANTLR 4.7.2

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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, NAME=43, STRING=44, NUM=45, INT=46, 
		FLOAT=47, NEWLINE=48, WS=49;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_classBlock = 2, RULE_statement = 3, 
		RULE_expr = 4, RULE_boundedExpr = 5, RULE_classDecl = 6, RULE_moduleDecl = 7, 
		RULE_variable = 8, RULE_variableAssignmentStatement = 9, RULE_variableAssignment = 10, 
		RULE_variableAccess = 11, RULE_variableCreate = 12, RULE_variableDelete = 13, 
		RULE_function = 14, RULE_funcReturnType = 15, RULE_funcParam = 16, RULE_funcParams = 17, 
		RULE_functionCall = 18, RULE_functionCallParam = 19, RULE_functionCallParams = 20, 
		RULE_paramList = 21, RULE_returnStatement = 22, RULE_ifElseIf = 23, RULE_ifStatement = 24, 
		RULE_elseIfStatement = 25, RULE_elseStatement = 26, RULE_whileExpr = 27, 
		RULE_whileLoop = 28, RULE_forLoop = 29, RULE_forFromExpr = 30, RULE_forToExpr = 31, 
		RULE_forRangeLoop = 32, RULE_bitwise = 33, RULE_addSub = 34, RULE_operatorAnd = 35, 
		RULE_operatorOr = 36, RULE_mulDivMod = 37, RULE_bool = 38, RULE_conditionals = 39, 
		RULE_type = 40, RULE_templateType = 41, RULE_nameList = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "classBlock", "statement", "expr", "boundedExpr", 
			"classDecl", "moduleDecl", "variable", "variableAssignmentStatement", 
			"variableAssignment", "variableAccess", "variableCreate", "variableDelete", 
			"function", "funcReturnType", "funcParam", "funcParams", "functionCall", 
			"functionCallParam", "functionCallParams", "paramList", "returnStatement", 
			"ifElseIf", "ifStatement", "elseIfStatement", "elseStatement", "whileExpr", 
			"whileLoop", "forLoop", "forFromExpr", "forToExpr", "forRangeLoop", "bitwise", 
			"addSub", "operatorAnd", "operatorOr", "mulDivMod", "bool", "conditionals", 
			"type", "templateType", "nameList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'class'", "'end'", "'moduleNode'", "'var'", "':'", 
			"' = '", "'.'", "'new'", "'delete'", "'function'", "'->'", "','", "'return'", 
			"'if'", "'else if'", "'else'", "'while'", "'from'", "'to'", "'for'", 
			"'&'", "'|'", "'~'", "'<<'", "'>>'", "'+'", "'-'", "'and'", "'or'", "'*'", 
			"'/'", "'%'", "'true'", "'false'", "'=='", "'>='", "'<='", "'!='", "'<'", 
			"'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NAME", "STRING", "NUM", "INT", 
			"FLOAT", "NEWLINE", "WS"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			block();
			setState(87);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << NAME))) != 0)) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__11) {
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(95);
					variable();
					}
					break;
				case T__11:
					{
					setState(96);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableDeleteContext variableDelete() {
			return getRuleContext(VariableDeleteContext.class,0);
		}
		public VariableAssignmentStatementContext variableAssignmentStatement() {
			return getRuleContext(VariableAssignmentStatementContext.class,0);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				classDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				moduleDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				variableDelete();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				variableAssignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				ifElseIf();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				whileLoop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
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
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(116);
				bool();
				}
				break;
			case 2:
				{
				setState(117);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(118);
				match(NUM);
				}
				break;
			case 4:
				{
				setState(119);
				variableAccess();
				}
				break;
			case 5:
				{
				setState(120);
				functionCall();
				}
				break;
			case 6:
				{
				setState(121);
				boundedExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(125);
						mulDivMod();
						setState(126);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(129);
						addSub();
						setState(130);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						bitwise();
						setState(134);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(137);
						conditionals();
						setState(138);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141);
						operatorAnd();
						setState(142);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(145);
						operatorOr();
						setState(146);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(153);
			match(T__0);
			setState(154);
			expr(0);
			setState(155);
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
			setState(157);
			match(T__2);
			setState(158);
			match(NAME);
			setState(159);
			classBlock();
			setState(160);
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
			setState(162);
			match(T__4);
			setState(163);
			match(NAME);
			setState(164);
			classBlock();
			setState(165);
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
			setState(167);
			match(T__5);
			setState(168);
			match(NAME);
			setState(169);
			match(T__6);
			setState(170);
			type();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(171);
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
			setState(174);
			variableAccess();
			setState(175);
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
		enterRule(_localctx, 20, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__7);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__34:
			case T__35:
			case NAME:
			case STRING:
			case NUM:
				{
				setState(178);
				expr(0);
				}
				break;
			case T__9:
				{
				setState(179);
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
		enterRule(_localctx, 22, RULE_variableAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(NAME);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					match(T__8);
					setState(184);
					match(NAME);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 24, RULE_variableCreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__9);
			setState(191);
			match(NAME);
			setState(192);
			match(T__0);
			setState(193);
			functionCallParams();
			setState(194);
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
		enterRule(_localctx, 26, RULE_variableDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__10);
			setState(197);
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
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__11);
			setState(200);
			match(NAME);
			setState(201);
			funcParams();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(202);
				funcReturnType();
				}
			}

			setState(205);
			block();
			setState(206);
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
		enterRule(_localctx, 30, RULE_funcReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__12);
			setState(209);
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
		enterRule(_localctx, 32, RULE_funcParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(NAME);
			setState(212);
			match(T__6);
			setState(213);
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
		enterRule(_localctx, 34, RULE_funcParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__0);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(216);
				paramList();
				}
			}

			setState(219);
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
		enterRule(_localctx, 36, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(NAME);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(222);
				match(T__8);
				setState(223);
				match(NAME);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(T__0);
			setState(230);
			functionCallParams();
			setState(231);
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
		enterRule(_localctx, 38, RULE_functionCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 40, RULE_functionCallParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__34) | (1L << T__35) | (1L << NAME) | (1L << STRING) | (1L << NUM))) != 0)) {
				{
				setState(235);
				functionCallParam();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(236);
					match(T__13);
					setState(237);
					functionCallParam();
					}
					}
					setState(242);
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
		enterRule(_localctx, 42, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			funcParam();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(246);
				match(T__13);
				setState(247);
				funcParam();
				}
				}
				setState(252);
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
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__14);
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(254);
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
		enterRule(_localctx, 46, RULE_ifElseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			ifStatement();
			setState(258);
			block();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(259);
				elseIfStatement();
				setState(260);
				block();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(267);
				elseStatement();
				setState(268);
				block();
				}
			}

			setState(272);
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
		enterRule(_localctx, 48, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__15);
			setState(275);
			match(T__0);
			setState(276);
			expr(0);
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
		enterRule(_localctx, 50, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__16);
			setState(280);
			match(T__0);
			setState(281);
			expr(0);
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
		enterRule(_localctx, 52, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__17);
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
		enterRule(_localctx, 54, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__0);
			setState(287);
			expr(0);
			setState(288);
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
		enterRule(_localctx, 56, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__18);
			setState(291);
			whileExpr();
			setState(292);
			block();
			setState(293);
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
		enterRule(_localctx, 58, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 60, RULE_forFromExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__19);
			setState(298);
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
		enterRule(_localctx, 62, RULE_forToExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__20);
			setState(301);
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
		enterRule(_localctx, 64, RULE_forRangeLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__21);
			setState(304);
			match(T__0);
			setState(305);
			match(NAME);
			setState(306);
			forFromExpr();
			setState(307);
			forToExpr();
			setState(308);
			match(T__1);
			setState(309);
			block();
			setState(310);
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
		enterRule(_localctx, 66, RULE_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_addSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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
		enterRule(_localctx, 70, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__29);
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
		enterRule(_localctx, 72, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__30);
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
		enterRule(_localctx, 74, RULE_mulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__35) ) {
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
		enterRule(_localctx, 78, RULE_conditionals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(NAME);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(327);
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
		enterRule(_localctx, 82, RULE_templateType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__40);
			setState(331);
			type();
			setState(332);
			match(T__41);
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
		enterRule(_localctx, 84, RULE_nameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(NAME);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(335);
				match(T__13);
				setState(336);
				match(NAME);
				}
				}
				setState(341);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0159\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\7\3]\n\3\f\3\16\3`\13\3\3\4\3\4\7\4d\n\4\f\4\16\4"+
		"g\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0097\n\6\f"+
		"\6\16\6\u009a\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00af\n\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f"+
		"\u00b7\n\f\3\r\3\r\3\r\7\r\u00bc\n\r\f\r\16\r\u00bf\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00ce\n\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00dc\n\23"+
		"\3\23\3\23\3\24\3\24\3\24\7\24\u00e3\n\24\f\24\16\24\u00e6\13\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u00f1\n\26\f\26\16\26\u00f4"+
		"\13\26\5\26\u00f6\n\26\3\27\3\27\3\27\7\27\u00fb\n\27\f\27\16\27\u00fe"+
		"\13\27\3\30\3\30\5\30\u0102\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u0109\n"+
		"\31\f\31\16\31\u010c\13\31\3\31\3\31\3\31\5\31\u0111\n\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3*\3*\5*\u014b\n*\3+\3+\3+\3+\3,\3,\3,\7,\u0154\n,\f,\16,\u0157\13"+
		",\3,\2\3\n-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTV\2\7\3\2\31\35\3\2\36\37\3\2\"$\3\2%&\3\2\'*\2\u0153\2"+
		"X\3\2\2\2\4^\3\2\2\2\6e\3\2\2\2\bs\3\2\2\2\n|\3\2\2\2\f\u009b\3\2\2\2"+
		"\16\u009f\3\2\2\2\20\u00a4\3\2\2\2\22\u00a9\3\2\2\2\24\u00b0\3\2\2\2\26"+
		"\u00b3\3\2\2\2\30\u00b8\3\2\2\2\32\u00c0\3\2\2\2\34\u00c6\3\2\2\2\36\u00c9"+
		"\3\2\2\2 \u00d2\3\2\2\2\"\u00d5\3\2\2\2$\u00d9\3\2\2\2&\u00df\3\2\2\2"+
		"(\u00eb\3\2\2\2*\u00f5\3\2\2\2,\u00f7\3\2\2\2.\u00ff\3\2\2\2\60\u0103"+
		"\3\2\2\2\62\u0114\3\2\2\2\64\u0119\3\2\2\2\66\u011e\3\2\2\28\u0120\3\2"+
		"\2\2:\u0124\3\2\2\2<\u0129\3\2\2\2>\u012b\3\2\2\2@\u012e\3\2\2\2B\u0131"+
		"\3\2\2\2D\u013a\3\2\2\2F\u013c\3\2\2\2H\u013e\3\2\2\2J\u0140\3\2\2\2L"+
		"\u0142\3\2\2\2N\u0144\3\2\2\2P\u0146\3\2\2\2R\u0148\3\2\2\2T\u014c\3\2"+
		"\2\2V\u0150\3\2\2\2XY\5\4\3\2YZ\7\2\2\3Z\3\3\2\2\2[]\5\b\5\2\\[\3\2\2"+
		"\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\5\3\2\2\2`^\3\2\2\2ad\5\22\n\2bd\5"+
		"\36\20\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2"+
		"ge\3\2\2\2ht\5\16\b\2it\5\20\t\2jt\5\22\n\2kt\5\34\17\2lt\5\24\13\2mt"+
		"\5\36\20\2nt\5&\24\2ot\5.\30\2pt\5\60\31\2qt\5:\36\2rt\5<\37\2sh\3\2\2"+
		"\2si\3\2\2\2sj\3\2\2\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2"+
		"\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\t\3\2\2\2uv\b\6\1\2v}\5N(\2w}\7.\2\2"+
		"x}\7/\2\2y}\5\30\r\2z}\5&\24\2{}\5\f\7\2|u\3\2\2\2|w\3\2\2\2|x\3\2\2\2"+
		"|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\u0098\3\2\2\2~\177\f\b\2\2\177\u0080\5"+
		"L\'\2\u0080\u0081\5\n\6\t\u0081\u0097\3\2\2\2\u0082\u0083\f\7\2\2\u0083"+
		"\u0084\5F$\2\u0084\u0085\5\n\6\b\u0085\u0097\3\2\2\2\u0086\u0087\f\6\2"+
		"\2\u0087\u0088\5D#\2\u0088\u0089\5\n\6\7\u0089\u0097\3\2\2\2\u008a\u008b"+
		"\f\5\2\2\u008b\u008c\5P)\2\u008c\u008d\5\n\6\6\u008d\u0097\3\2\2\2\u008e"+
		"\u008f\f\4\2\2\u008f\u0090\5H%\2\u0090\u0091\5\n\6\5\u0091\u0097\3\2\2"+
		"\2\u0092\u0093\f\3\2\2\u0093\u0094\5J&\2\u0094\u0095\5\n\6\4\u0095\u0097"+
		"\3\2\2\2\u0096~\3\2\2\2\u0096\u0082\3\2\2\2\u0096\u0086\3\2\2\2\u0096"+
		"\u008a\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\13\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009c\7\3\2\2\u009c\u009d\5\n\6\2\u009d\u009e\7\4\2\2\u009e"+
		"\r\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\7-\2\2\u00a1\u00a2\5\6\4\2"+
		"\u00a2\u00a3\7\6\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6"+
		"\7-\2\2\u00a6\u00a7\5\6\4\2\u00a7\u00a8\7\6\2\2\u00a8\21\3\2\2\2\u00a9"+
		"\u00aa\7\b\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ac\7\t\2\2\u00ac\u00ae\5R*"+
		"\2\u00ad\u00af\5\26\f\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\23\3\2\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\5\26\f\2\u00b2\25\3\2\2\2"+
		"\u00b3\u00b6\7\n\2\2\u00b4\u00b7\5\n\6\2\u00b5\u00b7\5\32\16\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\27\3\2\2\2\u00b8\u00bd\7-\2\2\u00b9"+
		"\u00ba\7\13\2\2\u00ba\u00bc\7-\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\7-\2\2\u00c2\u00c3\7\3\2\2\u00c3"+
		"\u00c4\5*\26\2\u00c4\u00c5\7\4\2\2\u00c5\33\3\2\2\2\u00c6\u00c7\7\r\2"+
		"\2\u00c7\u00c8\5\30\r\2\u00c8\35\3\2\2\2\u00c9\u00ca\7\16\2\2\u00ca\u00cb"+
		"\7-\2\2\u00cb\u00cd\5$\23\2\u00cc\u00ce\5 \21\2\u00cd\u00cc\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\4\3\2\u00d0\u00d1\7\6"+
		"\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d4\5R*\2\u00d4!\3"+
		"\2\2\2\u00d5\u00d6\7-\2\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\5R*\2\u00d8"+
		"#\3\2\2\2\u00d9\u00db\7\3\2\2\u00da\u00dc\5,\27\2\u00db\u00da\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\4\2\2\u00de%\3"+
		"\2\2\2\u00df\u00e4\7-\2\2\u00e0\u00e1\7\13\2\2\u00e1\u00e3\7-\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\3\2\2\u00e8"+
		"\u00e9\5*\26\2\u00e9\u00ea\7\4\2\2\u00ea\'\3\2\2\2\u00eb\u00ec\5\n\6\2"+
		"\u00ec)\3\2\2\2\u00ed\u00f2\5(\25\2\u00ee\u00ef\7\20\2\2\u00ef\u00f1\5"+
		"(\25\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00ed\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6+\3\2\2\2\u00f7\u00fc\5\"\22\2\u00f8\u00f9"+
		"\7\20\2\2\u00f9\u00fb\5\"\22\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd-\3\2\2\2\u00fe\u00fc\3"+
		"\2\2\2\u00ff\u0101\7\21\2\2\u0100\u0102\5\n\6\2\u0101\u0100\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102/\3\2\2\2\u0103\u0104\5\62\32\2\u0104\u010a\5\4\3"+
		"\2\u0105\u0106\5\64\33\2\u0106\u0107\5\4\3\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0105\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u0110\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5\66\34\2\u010e"+
		"\u010f\5\4\3\2\u010f\u0111\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\6\2\2\u0113\61\3\2\2\2\u0114\u0115"+
		"\7\22\2\2\u0115\u0116\7\3\2\2\u0116\u0117\5\n\6\2\u0117\u0118\7\4\2\2"+
		"\u0118\63\3\2\2\2\u0119\u011a\7\23\2\2\u011a\u011b\7\3\2\2\u011b\u011c"+
		"\5\n\6\2\u011c\u011d\7\4\2\2\u011d\65\3\2\2\2\u011e\u011f\7\24\2\2\u011f"+
		"\67\3\2\2\2\u0120\u0121\7\3\2\2\u0121\u0122\5\n\6\2\u0122\u0123\7\4\2"+
		"\2\u01239\3\2\2\2\u0124\u0125\7\25\2\2\u0125\u0126\58\35\2\u0126\u0127"+
		"\5\4\3\2\u0127\u0128\7\6\2\2\u0128;\3\2\2\2\u0129\u012a\5B\"\2\u012a="+
		"\3\2\2\2\u012b\u012c\7\26\2\2\u012c\u012d\5\n\6\2\u012d?\3\2\2\2\u012e"+
		"\u012f\7\27\2\2\u012f\u0130\5\n\6\2\u0130A\3\2\2\2\u0131\u0132\7\30\2"+
		"\2\u0132\u0133\7\3\2\2\u0133\u0134\7-\2\2\u0134\u0135\5> \2\u0135\u0136"+
		"\5@!\2\u0136\u0137\7\4\2\2\u0137\u0138\5\4\3\2\u0138\u0139\7\6\2\2\u0139"+
		"C\3\2\2\2\u013a\u013b\t\2\2\2\u013bE\3\2\2\2\u013c\u013d\t\3\2\2\u013d"+
		"G\3\2\2\2\u013e\u013f\7 \2\2\u013fI\3\2\2\2\u0140\u0141\7!\2\2\u0141K"+
		"\3\2\2\2\u0142\u0143\t\4\2\2\u0143M\3\2\2\2\u0144\u0145\t\5\2\2\u0145"+
		"O\3\2\2\2\u0146\u0147\t\6\2\2\u0147Q\3\2\2\2\u0148\u014a\7-\2\2\u0149"+
		"\u014b\5T+\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014bS\3\2\2\2\u014c"+
		"\u014d\7+\2\2\u014d\u014e\5R*\2\u014e\u014f\7,\2\2\u014fU\3\2\2\2\u0150"+
		"\u0155\7-\2\2\u0151\u0152\7\20\2\2\u0152\u0154\7-\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"W\3\2\2\2\u0157\u0155\3\2\2\2\27^ces|\u0096\u0098\u00ae\u00b6\u00bd\u00cd"+
		"\u00db\u00e4\u00f2\u00f5\u00fc\u0101\u010a\u0110\u014a\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}