// Generated from Mox.g4 by ANTLR 4.7.1

    package me.gmisail.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MoxParser}.
 */
public interface MoxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MoxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MoxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MoxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MoxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MoxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(MoxParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(MoxParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MoxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MoxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MoxParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MoxParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#boundedExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoundedExpr(MoxParser.BoundedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#boundedExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoundedExpr(MoxParser.BoundedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(MoxParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(MoxParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#moduleDecl}.
	 * @param ctx the parse tree
	 */
	void enterModuleDecl(MoxParser.ModuleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#moduleDecl}.
	 * @param ctx the parse tree
	 */
	void exitModuleDecl(MoxParser.ModuleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MoxParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MoxParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(MoxParser.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(MoxParser.VariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#variableArrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayAssignment(MoxParser.VariableArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#variableArrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayAssignment(MoxParser.VariableArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MoxParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MoxParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(MoxParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(MoxParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#variableCreate}.
	 * @param ctx the parse tree
	 */
	void enterVariableCreate(MoxParser.VariableCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#variableCreate}.
	 * @param ctx the parse tree
	 */
	void exitVariableCreate(MoxParser.VariableCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#variableDelete}.
	 * @param ctx the parse tree
	 */
	void enterVariableDelete(MoxParser.VariableDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#variableDelete}.
	 * @param ctx the parse tree
	 */
	void exitVariableDelete(MoxParser.VariableDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#variableArrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayAccess(MoxParser.VariableArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#variableArrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayAccess(MoxParser.VariableArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MoxParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MoxParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#funcReturnType}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturnType(MoxParser.FuncReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#funcReturnType}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturnType(MoxParser.FuncReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#funcParam}.
	 * @param ctx the parse tree
	 */
	void enterFuncParam(MoxParser.FuncParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#funcParam}.
	 * @param ctx the parse tree
	 */
	void exitFuncParam(MoxParser.FuncParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncParams(MoxParser.FuncParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncParams(MoxParser.FuncParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#extern}.
	 * @param ctx the parse tree
	 */
	void enterExtern(MoxParser.ExternContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#extern}.
	 * @param ctx the parse tree
	 */
	void exitExtern(MoxParser.ExternContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#funcExtern}.
	 * @param ctx the parse tree
	 */
	void enterFuncExtern(MoxParser.FuncExternContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#funcExtern}.
	 * @param ctx the parse tree
	 */
	void exitFuncExtern(MoxParser.FuncExternContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#varExtern}.
	 * @param ctx the parse tree
	 */
	void enterVarExtern(MoxParser.VarExternContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#varExtern}.
	 * @param ctx the parse tree
	 */
	void exitVarExtern(MoxParser.VarExternContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MoxParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MoxParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParam(MoxParser.FunctionCallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParam(MoxParser.FunctionCallParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParams(MoxParser.FunctionCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParams(MoxParser.FunctionCallParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(MoxParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(MoxParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MoxParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MoxParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#ifElseIf}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIf(MoxParser.IfElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#ifElseIf}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIf(MoxParser.IfElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MoxParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MoxParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(MoxParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(MoxParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(MoxParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(MoxParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(MoxParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(MoxParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MoxParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MoxParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MoxParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MoxParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#forFromExpr}.
	 * @param ctx the parse tree
	 */
	void enterForFromExpr(MoxParser.ForFromExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#forFromExpr}.
	 * @param ctx the parse tree
	 */
	void exitForFromExpr(MoxParser.ForFromExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#forToExpr}.
	 * @param ctx the parse tree
	 */
	void enterForToExpr(MoxParser.ForToExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#forToExpr}.
	 * @param ctx the parse tree
	 */
	void exitForToExpr(MoxParser.ForToExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#forRangeLoop}.
	 * @param ctx the parse tree
	 */
	void enterForRangeLoop(MoxParser.ForRangeLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#forRangeLoop}.
	 * @param ctx the parse tree
	 */
	void exitForRangeLoop(MoxParser.ForRangeLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(MoxParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(MoxParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MoxParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MoxParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAnd(MoxParser.OperatorAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAnd(MoxParser.OperatorAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void enterOperatorOr(MoxParser.OperatorOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void exitOperatorOr(MoxParser.OperatorOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#mulDivMod}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(MoxParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#mulDivMod}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(MoxParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MoxParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MoxParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void enterConditionals(MoxParser.ConditionalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void exitConditionals(MoxParser.ConditionalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MoxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MoxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#templateType}.
	 * @param ctx the parse tree
	 */
	void enterTemplateType(MoxParser.TemplateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#templateType}.
	 * @param ctx the parse tree
	 */
	void exitTemplateType(MoxParser.TemplateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoxParser#nameList}.
	 * @param ctx the parse tree
	 */
	void enterNameList(MoxParser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoxParser#nameList}.
	 * @param ctx the parse tree
	 */
	void exitNameList(MoxParser.NameListContext ctx);
}