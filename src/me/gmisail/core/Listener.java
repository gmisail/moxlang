package me.gmisail.core;

import me.gmisail.codegen.Context;
import me.gmisail.codegen.ContextTypes;
import me.gmisail.codegen.Generator;
import me.gmisail.codegen.Registry;
import me.gmisail.nodes.*;
import me.gmisail.parser.MoxBaseListener;
import me.gmisail.parser.MoxParser;

import java.util.Stack;

public class Listener extends MoxBaseListener
{
    private Stack<Node> program;
    private VariableStack variables;
    private MoxParser parser;

    public Listener(MoxParser parser) {
        super();

        this.parser = parser;
    }

    @Override
    public void enterProgram(MoxParser.ProgramContext ctx) {
        super.enterProgram(ctx);

        program = new Stack<Node>();
        program.push(new Node());

        variables = new VariableStack();

        Generator.enterContext(new Context("global", ContextTypes.GLOBAL));

        /* before generation, set up includes */
        System.out.println("#include <stdio.h>");
        System.out.println("#include <stdlib.h>");
    }

    @java.lang.Override
    public void exitProgram(MoxParser.ProgramContext ctx) {
        super.exitProgram(ctx);

        Node root = program.pop();

        /* if there is an error, then do *not* overwrite the original code */

        System.out.print(root.buffer.getCode());
    }

    @Override
    public void enterBlock(MoxParser.BlockContext ctx) {
        super.enterBlock(ctx);

        variables.enterScope();

        if(program.peek().type != NodeTypes.DEFAULT) program.peek().buffer.push("{\n");
    }

    @Override
    public void exitBlock(MoxParser.BlockContext ctx) {
        super.exitBlock(ctx);

        variables.exitScope();

        if(program.peek().type != NodeTypes.DEFAULT) program.peek().buffer.push("}\n");
    }

    /*
    *
    *   LITERALS
    *
    * */

    @Override
    public void enterBool(MoxParser.BoolContext ctx) {
        super.enterBool(ctx);

        program.peek().buffer.push(Generator.createBoolean(ctx.getText()));
    }


    /*
    *
    *   EXPRESSIONS
    *
    * */

    @Override
    public void enterExpr(MoxParser.ExprContext ctx) {
        super.enterExpr(ctx);


        if(ctx.NUM() != null)
            program.peek().buffer.push(ctx.NUM().getText());
        else if(ctx.STRING() != null)
            program.peek().buffer.push(ctx.STRING().getText());
    }

    @Override
    public void enterBoundedExpr(MoxParser.BoundedExprContext ctx) {
        super.enterBoundedExpr(ctx);

        program.peek().buffer.push("(");
    }

    @Override
    public void exitBoundedExpr(MoxParser.BoundedExprContext ctx) {
        super.exitBoundedExpr(ctx);

        program.peek().buffer.push(")");
    }

    @Override
    public void enterAddSub(MoxParser.AddSubContext ctx) {
        super.enterAddSub(ctx);

        program.peek().buffer.push(" " + ctx.getText() + " ");
    }

    @Override
    public void enterMulDivMod(MoxParser.MulDivModContext ctx) {
        super.enterMulDivMod(ctx);

        program.peek().buffer.push(" " + ctx.getText() + " ");
    }

    @Override
    public void enterConditionals(MoxParser.ConditionalsContext ctx) {
        super.enterConditionals(ctx);

        program.peek().buffer.push(" " + ctx.getText() + " ");
    }

    @Override
    public void enterOperatorAnd(MoxParser.OperatorAndContext ctx) {
        super.enterOperatorAnd(ctx);

        program.peek().buffer.push(" && ");
    }

    @Override
    public void enterOperatorOr(MoxParser.OperatorOrContext ctx) {
        super.enterOperatorOr(ctx);

        program.peek().buffer.push(" || ");
    }

    /*
    *
    *   FUNCTIONS
    *
    * */

    @Override
    public void enterFunction(MoxParser.FunctionContext ctx) {
        super.enterFunction(ctx);

        String type = "void";
        if(ctx.funcReturnType() != null) {
            type = ctx.funcReturnType().type().NAME().getText();
        }

        String name = ctx.NAME().getText();

        if(!Registry.saveFunction(Generator.currentContext().getName() + "_" + name + "_" + type)) {
            System.err.println("[moxc] Redefinition of function " + name);
        }

        FunctionNode func = new FunctionNode(Generator.createFunction(type, name), type);

        if(Generator.currentContext().getType().equals(ContextTypes.CLASS)) {
            func.addParam("self", Generator.currentContext().getName() + "*");

            if(program.peek().type == NodeTypes.CLASS)
            {
                ClassNode node = (ClassNode) program.peek();
                func.setLocalName(name);
                node.addFunction(func);
            }
        }

        program.push(func);
    }

    @Override
    public void exitFunction(MoxParser.FunctionContext ctx) {
        super.exitFunction(ctx);

        FunctionNode func = (FunctionNode) program.pop();

        program.peek().buffer.push(func.buffer.getCode());
    }

    @Override
    public void enterFunctionCall(MoxParser.FunctionCallContext ctx) {
        super.enterFunctionCall(ctx);

        String name = "";
        String delim = "_";
        int initial = 0;

        FunctionCallNode functionCallNode = new FunctionCallNode(name);

        // TODO: validate that the function is valid.

        if(Generator.currentContext().getType() == ContextTypes.CLASS) {
            // the first NAME being "self" implies that it is a call to itself
            if(ctx.NAME(0).getText().equals("self")) {
                initial = 1;
                name += Generator.currentContext().getName() + delim;
                functionCallNode.buffer.push("self, ");
            }
        }

        if(variables.hasClassInstanceNamed(ctx.NAME(0).getText())) {                    // if the first keyword is a class instance, then all following statements must also be pointers to classes.
            if(ctx.NAME().size() > 1) {
                name += Generator.dereference(variables.getTypeOf(ctx.NAME(0).getText())) + "_";
                initial++;

                functionCallNode.buffer.push(ctx.NAME(0).getText());
                functionCallNode.addParamCount();
            }
        }

        for (int i = initial; i < ctx.NAME().size(); i++) {
            if(i > initial) name += delim;

            name += ctx.NAME(i).getText();
        }

        functionCallNode.setName(name);
        program.push(functionCallNode);

    }

    @Override
    public void exitFunctionCall(MoxParser.FunctionCallContext ctx) {
        super.exitFunctionCall(ctx);

        FunctionCallNode functionCall = (FunctionCallNode) program.pop();

        /* when the function is called, is it called as a statement or expression? If it is a statement, the it must have a semicolon */
        if(parser.getRuleNames()[ctx.getParent().getRuleIndex()].equals("statement")) {
            program.peek().buffer.push(functionCall.getName() + "(" + functionCall.getBody() + ");\n");
        } else {
            /* if it is not a standalone statement, then it must be used within another expression. Thus, add it to the parent */
            program.peek().buffer.push(functionCall.getName() + "(" + functionCall.getBody() + ")");
        }
    }

    @Override
    public void enterFunctionCallParams(MoxParser.FunctionCallParamsContext ctx) {
        super.enterFunctionCallParams(ctx);
    }

    @Override
    public void enterFunctionCallParam(MoxParser.FunctionCallParamContext ctx) {
        super.enterFunctionCallParam(ctx);

        FunctionCallNode functionCall = (FunctionCallNode) program.peek();

        if(functionCall.getParamCount() > 0) {
            functionCall.buffer.push(", ");
        }

        functionCall.addParamCount();
    }

    @Override
    public void enterReturnStatement(MoxParser.ReturnStatementContext ctx) {
        super.enterReturnStatement(ctx);

        program.push(new ReturnNode());
    }

    @Override
    public void exitReturnStatement(MoxParser.ReturnStatementContext ctx) {
        super.exitReturnStatement(ctx);

        ReturnNode ret = (ReturnNode) program.pop();

        program.peek().buffer.push("return " + ret.buffer.getCode() + ";\n");
    }

    @Override
    public void enterFuncParam(MoxParser.FuncParamContext ctx) {
        super.enterFuncParam(ctx);

        String type = ctx.type().NAME().getText();

        if(type.equals("Pointer")) {
            String template = "void";

            if(ctx.type().templateType() != null)
                template = ctx.type().templateType().type().NAME().getText();

            type = template + "*";
        } else if(type.equals("Reference")) {
            String template = "void";

            if(ctx.type().templateType() != null)
                template = ctx.type().templateType().type().NAME().getText();

            type = template + "&";
        }

        FunctionNode func = (FunctionNode) program.peek();
        func.addParam(ctx.NAME().getText(), type);
    }

    @Override
    public void exitFuncParams(MoxParser.FuncParamsContext ctx) {
        super.exitFuncParams(ctx);

        FunctionNode func = (FunctionNode) program.peek();
        program.peek().buffer.push(func.code() + "\n");
    }

    /*
    *
    *   VARIABLES
    *
    * */

    @Override
    public void enterVariable(MoxParser.VariableContext ctx) {
        String name = ctx.NAME().getText();
        String type = ctx.type().NAME().getText();
        String templateType = null;

        if(ctx.type().templateType() != null)
            templateType = ctx.type().templateType().type().NAME().getText();

        if (!Registry.saveVariable(name)) {
            System.out.println("Redefinition of variable " + name + "!");
        }

        if(type.equals("Pointer")) {
            type = templateType + "* ";
        }

        VariableNode node = new VariableNode(name, type);

        variables.add(node);
        program.push(node);
    }

    @Override
    public void exitVariable(MoxParser.VariableContext ctx) {
        super.exitVariable(ctx);

        VariableNode variable = (VariableNode) program.pop();

        if(program.peek() != null && program.peek().type == NodeTypes.MODULE) {
            ModuleNode moduleNode = (ModuleNode) program.peek();
            moduleNode.addVariable(variable);
        } else if(program.peek() != null && program.peek().type == NodeTypes.CLASS) {
            ClassNode classNode = (ClassNode) program.peek();
            classNode.addVariable(variable);
        } else {
            // not a member function, so just spit it out.
            program.peek().buffer.push(variable.getType() + " " + variable.getName() + " = " + variable.getValue().getCode() + ";\n");
        }
    }

    @Override
    public void enterVariableAssignmentStatement(MoxParser.VariableAssignmentStatementContext ctx) {
        super.enterVariableAssignmentStatement(ctx);

        program.push(new VariableAssignmentNode());
    }

    @Override
    public void exitVariableAssignmentStatement(MoxParser.VariableAssignmentStatementContext ctx) {
        super.enterVariableAssignmentStatement(ctx);

        VariableAssignmentNode assignment = (VariableAssignmentNode) program.pop();

        program.peek().buffer.push(assignment.getName() + " = " + assignment.getValue().getCode() + ";\n");
    }

    @Override
    public void enterVariableAccess(MoxParser.VariableAccessContext ctx) {
        super.enterVariableAccess(ctx);

        int initial = 0;
        if(Generator.currentContext().getType() == ContextTypes.CLASS) {
            if(ctx.NAME(0).getText().equals("self")) {
                if(program.peek().type == NodeTypes.VARIABLE_ASSIGNMENT) {
                    VariableAssignmentNode node = (VariableAssignmentNode) program.peek();

                    if(node.hasName())
                        node.buffer.push("self->");
                    else
                        node.setName(node.getName() + "self->");
                } else {
                    program.peek().buffer.push("self->");
                }

                initial = 1;
            }
        }

        String delim = "_";

        for(int i = initial; i < ctx.NAME().size(); i++) {
            if(program.peek().type == NodeTypes.VARIABLE_ASSIGNMENT) {
                VariableAssignmentNode node = (VariableAssignmentNode) program.peek();

                if(i > initial) {
                    if(node.hasName())
                        node.buffer.push(delim);
                    else
                        node.setName(node.getName() + delim);
                } else if(i == initial) {
                    if(variables.hasClassInstanceNamed(ctx.NAME(i).getText())) {                    // if the first keyword is a class instance, then all following statements must also be pointers to classes.
                        if(ctx.NAME().size() > 1) {
                            delim = "->";
                        }
                    }
                }

                if(node.hasName())
                    node.buffer.push(ctx.NAME(i).getText());
                else
                    node.setName(node.getName() + ctx.NAME(i).getText());

                if(i == ctx.NAME().size() - 1)
                    node.setHasName(true);

            } else {
                if(i > initial)
                    program.peek().buffer.push(delim);
                else if(i == initial) {
                    if(variables.hasClassInstanceNamed(ctx.NAME(i).getText())) {
                        if(ctx.NAME().size() > 1) {
                            delim = "->";
                        }
                    }
                }

                program.peek().buffer.push(ctx.NAME(i).getText());
            }
        }
    }

    @Override
    public void enterVariableCreate(MoxParser.VariableCreateContext ctx) {
        super.enterVariableCreate(ctx);

        if(program.peek().type == NodeTypes.VARIABLE) {
            VariableNode node = (VariableNode) program.peek();
            node.makePointer();
        }

        // ensure that the type you are allocating is equal to the type that you are assigning it too. Also, change the type of the variable to a pointer of the original

        String name = ctx.NAME().getText() + "_alloc";
        FunctionCallNode createVariable = new FunctionCallNode(name);

        program.push(createVariable);
    }

    @Override
    public void exitVariableCreate(MoxParser.VariableCreateContext ctx) {
        super.exitVariableCreate(ctx);

        FunctionCallNode functionCall = (FunctionCallNode) program.pop();
        program.peek().buffer.push(functionCall.getName() + "(" + functionCall.getBody() + ")");
    }

    @Override
    public void enterVariableDelete(MoxParser.VariableDeleteContext ctx) {
        super.enterVariableDelete(ctx);

        program.push(new DeleteNode());
    }

    @Override
    public void exitVariableDelete(MoxParser.VariableDeleteContext ctx) {
        super.exitVariableDelete(ctx);

        DeleteNode node = (DeleteNode) program.pop();

        System.out.println(variables.hasClassInstanceNamed(node.buffer.getCode()));

        if(variables.hasClassInstanceNamed(node.buffer.getCode())) {
            node.setTarget(variables.getVariableWithName(node.buffer.getCode()));
            program.peek().buffer.push(node.code());
        }
    }

    /*
    *
    *   MODULE
    *
    * */

    @Override
    public void enterModuleDecl(MoxParser.ModuleDeclContext ctx) {
        super.enterModuleDecl(ctx);

        if(!Registry.saveModule(ctx.NAME().getText())) {
            System.err.println("[moxc] Redefinition of module '" + ctx.NAME().getText() + "'");
        }

        Generator.enterContext(new Context(ctx.NAME().getText(), ContextTypes.MODULE));
        program.push(new ModuleNode(ctx.NAME().getText()));
    }

    @Override
    public void exitModuleDecl(MoxParser.ModuleDeclContext ctx) {
        super.exitModuleDecl(ctx);

        Generator.exitContext();

        ModuleNode moduleNode = (ModuleNode) program.pop();

        program.peek().buffer.push(moduleNode.code() + "\n");
    }

    /*
    *
    *   CLASSES
    *
    * */

    @Override
    public void enterClassDecl(MoxParser.ClassDeclContext ctx) {
        super.enterClassDecl(ctx);

        program.push(new ClassNode(ctx.NAME().getText()));
        Generator.enterContext(new Context(ctx.NAME().getText(), ContextTypes.CLASS));
    }

    @Override
    public void exitClassDecl(MoxParser.ClassDeclContext ctx) {
        super.exitClassDecl(ctx);

        ClassNode classNode = (ClassNode) program.pop();

        program.peek().buffer.push(classNode.code());

        Generator.exitContext();
    }

    /*
    *
    *   CONTROL FLOW
    *
    * */

    @Override
    public void enterIfStatement(MoxParser.IfStatementContext ctx) {
        super.enterIfStatement(ctx);

        program.peek().buffer.push("if (");
    }

    @Override
    public void exitIfStatement(MoxParser.IfStatementContext ctx) {
        super.exitIfStatement(ctx);

        program.peek().buffer.push(")");
    }

    @Override
    public void enterElseIfStatement(MoxParser.ElseIfStatementContext ctx) {
        super.enterElseIfStatement(ctx);

        program.peek().buffer.push("else if(");
    }


    @Override
    public void exitElseIfStatement(MoxParser.ElseIfStatementContext ctx) {
        super.exitElseIfStatement(ctx);

        program.peek().buffer.push(")");
    }

    @Override
    public void enterElseStatement(MoxParser.ElseStatementContext ctx) {
        super.enterElseStatement(ctx);

        program.peek().buffer.push("else");
    }

    @Override
    public void enterWhileLoop(MoxParser.WhileLoopContext ctx) {
        super.enterWhileLoop(ctx);

        program.peek().buffer.push("while");
    }

    @Override
    public void enterWhileExpr(MoxParser.WhileExprContext ctx) {
        super.enterWhileExpr(ctx);

        program.peek().buffer.push("(");
    }

    @Override
    public void exitWhileExpr(MoxParser.WhileExprContext ctx) {
        super.exitWhileExpr(ctx);

        program.peek().buffer.push(")");
    }

    @Override
    public void enterForRangeLoop(MoxParser.ForRangeLoopContext ctx) {
        super.enterForRangeLoop(ctx);

        String iterator = ctx.NAME().getText();

        program.push(new ForNode(iterator));
        program.peek().buffer.push("for(int " + iterator + " = ");
    }


    @Override
    public void exitForFromExpr(MoxParser.ForFromExprContext ctx) {
        super.exitForFromExpr(ctx);

        ForNode forNode = (ForNode) program.peek();

        program.peek().buffer.push("; " + forNode.getIterator() + " < ");
    }

    @Override
    public void exitForToExpr(MoxParser.ForToExprContext ctx) {
        super.exitForToExpr(ctx);

        ForNode forNode = (ForNode) program.pop();
        forNode.buffer.push("; " + forNode.getIterator() + "++)");
        program.peek().buffer.push(forNode.buffer.getCode());
    }
}
