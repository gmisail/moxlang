// Generated from Mox.g4 by ANTLR 4.7.2

    package me.gmisail.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MoxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MoxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MoxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MoxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MoxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(MoxParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MoxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MoxParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#boundedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedExpr(MoxParser.BoundedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(MoxParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#moduleDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDecl(MoxParser.ModuleDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MoxParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignmentStatement(MoxParser.VariableAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(MoxParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess(MoxParser.VariableAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#variableCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableCreate(MoxParser.VariableCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#variableDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDelete(MoxParser.VariableDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MoxParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#funcReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturnType(MoxParser.FuncReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#funcParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParam(MoxParser.FuncParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#funcParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParams(MoxParser.FuncParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MoxParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#functionCallParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParam(MoxParser.FunctionCallParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#functionCallParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParams(MoxParser.FunctionCallParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(MoxParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MoxParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#ifElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseIf(MoxParser.IfElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MoxParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(MoxParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(MoxParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#whileExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(MoxParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MoxParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(MoxParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise(MoxParser.BitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(MoxParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#operatorAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAnd(MoxParser.OperatorAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#operatorOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOr(MoxParser.OperatorOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#mulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(MoxParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MoxParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#conditionals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionals(MoxParser.ConditionalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MoxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#templateType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateType(MoxParser.TemplateTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoxParser#nameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(MoxParser.NameListContext ctx);
}