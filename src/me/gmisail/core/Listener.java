package me.gmisail.core;

import me.gmisail.codegen.Context;
import me.gmisail.codegen.ContextTypes;
import me.gmisail.codegen.Generator;
import me.gmisail.codegen.Registry;
import me.gmisail.nodes.*;
import me.gmisail.parser.MoxBaseListener;
import me.gmisail.parser.MoxParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Listener extends MoxBaseListener
{
    private Stack<Node> program;

    private VariableStack variables;
    private MoxParser parser;

    ArrayList<ClassNode> classes;

    private FileWriter file;

    public Listener(MoxParser parser, FileWriter file) {
        super();

        this.parser = parser;
        this.file = file;
    }

    public ClassNode findClass(String name)
    {
        name = Generator.dereference(name);

        for(int i = 0; i < classes.size(); i++)
        {
            if(classes.get(i).getName().equals(name))
            {
                return classes.get(i);
            }
        }

        return null;
    }


    @Override
    public void enterProgram(MoxParser.ProgramContext ctx) {
        super.enterProgram(ctx);

        Node root = new Node();

        program = new Stack<Node>();
        program.push(root);

        variables = new VariableStack();

        classes = new ArrayList<ClassNode>();

        Generator.enterContext(new Context("global", ContextTypes.GLOBAL));

        /* before generation, set up includes */
        root.buffer.push(Generator.createInclude("stdio.h"));
        root.buffer.push(Generator.createInclude("stdlib.h"));
        root.buffer.push(Generator.createInclude("string.h"));
    }

    @java.lang.Override
    public void exitProgram(MoxParser.ProgramContext ctx) {
        super.exitProgram(ctx);

        Node root = program.pop();

        /* if there is an error, then do *not* overwrite the original code */

        try {
            file.write(root.buffer.getCode());
            file.close();

            Process compilation = Runtime.getRuntime().exec("gcc main.c -o main");

        } catch (IOException e) {
            Logger.error("Error writing to file.");
            e.printStackTrace();
        }
    }

    @Override
    public void enterBlock(MoxParser.BlockContext ctx) {
        super.enterBlock(ctx);

        variables.enterScope();

        /*
        *   When a function is defined, add all of the arguments to scope.
        * */
        if(program.peek().type == NodeTypes.FUNCTION) {
            FunctionNode node = (FunctionNode) program.peek();

            for(int i = 0; i < node.getParams().size(); i++) {
                ParameterNode param = node.getParams().get(i);

                variables.add(new VariableNode(param.name, param.type));
            }

        }

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
        else if(ctx.CHAR() != null) {
            program.peek().buffer.push(ctx.CHAR().getText());
            Logger.write(ctx.CHAR().getText().length() + "");
        }
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

        String sign = ctx.getText();

        program.peek().buffer.push(" " + sign + " ");
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
            Logger.error("Redefinition of function " + name);
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

    /*
    *   Let's say we have the function call self.parent.print()
    *   This should be equal to: Parent_print(self->parent);
    *   So, we have the find the highest order object, which is
    *   parent. Then, we must find the object type, which is Parent.
    *   So, at this point we know and can confirm that print() is a
    *   function within Parent; the statement so far is Parent_print(.
    *   Since we are calling this function on the self->parent object,
    *   we must pass it as the first parameter. So: Parent_print(self->parent);
    * */
    @Override
    public void enterFunctionCall(MoxParser.FunctionCallContext ctx) {
        super.enterFunctionCall(ctx);

        String name = "";
        String delim = "_";
        int initial = 0;

        ClassNode classNode = null;

        int numberOfElements = ctx.NAME().size();

        FunctionCallNode functionCallNode = new FunctionCallNode(name);

        // TODO: validate that the function is valid.

        if(Generator.currentContext().getType() == ContextTypes.CLASS) {
            // the first NAME being "self" implies that it is a call to itself
            // self.print()
            if(ctx.NAME(0).getText().equals("self") && numberOfElements <= 2) {
                initial = 1;
                name += Generator.currentContext().getName() + delim;
                functionCallNode.buffer.push("self, ");
            }

            // calling a function from a member class object
            // so, var foo : Foo = new Foo()
            //     self.foo.sayHello()     # <------ 3 elements!
            // should be:
            //     Foo_sayHello(self->foo);
            if(ctx.NAME(0).getText().equals("self") && numberOfElements > 2) {
                // find class def in the program stack
                ClassNode parentClassNode = null;
                for(int i = 0; i < program.size(); i++) {
                    if (program.elementAt(i).type == NodeTypes.CLASS) {
                        classNode = (ClassNode) program.elementAt(i);
                        parentClassNode = classNode;
                    }
                }

                for(int i = 1; i < numberOfElements - 1; i++) {
                    VariableNode subclassVariable = classNode.getVariable(ctx.NAME(i).getText());
                    String subclassType = Generator.dereference(subclassVariable.getType());

                    // if we are accessing the class in which it is defined, then it will
                    // not show up in findClass. So, we save the parent class and then
                    // check to see if they match. If so, then set it to classNode.
                    if(subclassType.equals(parentClassNode.getName()))
                        classNode = parentClassNode;
                    else
                        classNode = findClass(subclassType);
                }

                name = classNode.getName() + delim;

                // the calling object is every element followed by '->', minus the function
                for(int i = 0; i < numberOfElements - 1; i++) {
                    if(i > 0) functionCallNode.buffer.push("->");
                    functionCallNode.buffer.push(ctx.NAME(i).getText());
                }

                initial = numberOfElements - 1;

                functionCallNode.addParamCount();
            }
        }

        // doesn't start with self., and the first keyword is a class instance.
        if(initial == 0 && variables.hasClassInstanceNamed(ctx.NAME(0).getText())) {                    // if the first keyword is a class instance, then all following statements must also be pointers to classes.
            if(numberOfElements > 1) {
                classNode = findClass(variables.getTypeOf(ctx.NAME(0).getText()));

                for(int i = 1; i < numberOfElements - 1; i++) {
                    VariableNode subclassVariable = classNode.getVariable(ctx.NAME(i).getText());

                    if(subclassVariable == null) {
                        Logger.error("Cannot find '" + ctx.NAME(i).getText() + "' in " + classNode.getName());
                        return;
                    }

                    String subclassType = Generator.dereference(subclassVariable.getType());

                    classNode = findClass(subclassType);
                }

                name = classNode.getName() + delim;

                // the calling object is every element followed by '->', minus the function
                for(int i = 0; i < numberOfElements - 1; i++) {
                    if(i > 0) functionCallNode.buffer.push("->");
                    functionCallNode.buffer.push(ctx.NAME(i).getText());
                }

                functionCallNode.addParamCount();

                initial = numberOfElements - 1;
            }
        }

        for (int i = initial; i < numberOfElements; i++) {
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
            Logger.error("Redefinition of variable " + name + "!");
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

            if(!Types.exists(variable.getType()))
                variable.makePointer();

            // var <name> : <type> = <value>. If value is undefined, then do not output it.
            if(variable.getValue().getCode().length() > 0)
                program.peek().buffer.push(variable.getType() + " " + variable.getName() + " = " + variable.getValue().getCode() + ";\n");
            else
                program.peek().buffer.push(variable.getType() + " " + variable.getName() + ";\n");
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

        String type = "";

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

        boolean inScope = false;
        for(int i = 0; i < program.size(); i++) {
            if(program.elementAt(i).type == NodeTypes.CLASS) {
                ClassNode classNode = (ClassNode) program.elementAt(i);

                for(int j = 0; j < classNode.getMemberVariables().size(); j++) {
                    if(classNode.getMemberVariables().get(j).getName().equals(ctx.NAME(initial).getText())) {
                        inScope = true;
                        break;
                    }
                }
            }
        }

        if(!inScope && !variables.hasClassInstanceNamed(ctx.NAME(initial).getText())
                && !External.variableExists(ctx.NAME(initial).getText())) {

            Logger.write(program.peek().type.toString());
            Logger.error("Cannot find variable '" + ctx.NAME(initial).getText() + "'!");
        }

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


        if(program.peek().type == NodeTypes.DELETE) {
            DeleteNode delete = (DeleteNode) program.peek();

            //delete.setTarget(new VariableNode("", );

            /*
            * get the type of the first element. If it is self, then the type is the current class.
            * for every string, check if it is the current class. If there are more strings, set the
            * current class to that variables type. Continue...
            * */
        }
    }

    @Override
    public void exitVariableAccess(MoxParser.VariableAccessContext ctx) {
        super.exitVariableAccess(ctx);

        if(program.peek().type == NodeTypes.ARRAY_ACCESS) {
            ArrayAccessNode node = (ArrayAccessNode) program.peek();
            node.saveName();
        }
    }


    public void enterVariableArrayAssignment(MoxParser.VariableArrayAssignmentContext ctx) {
        super.enterVariableArrayAssignment(ctx);

        program.push(new ArrayAssignmentNode());
    }

    public void exitVariableArrayAssignment(MoxParser.VariableArrayAssignmentContext ctx) {
        super.exitVariableArrayAssignment(ctx);

        ArrayAssignmentNode node = (ArrayAssignmentNode) program.pop();
        program.peek().buffer.push(node.code());
    }

    @Override
    public void enterVariableCreate(MoxParser.VariableCreateContext ctx) {
        super.enterVariableCreate(ctx);

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
            Logger.error("Redefinition of module '" + ctx.NAME().getText() + "'");
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
        classes.add(classNode);

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

        variables.add(new VariableNode(iterator, "int"));
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

    /*
    *  EXTERNS
    */

    @Override
    public void enterFuncExtern(MoxParser.FuncExternContext ctx) {
        super.enterFuncExtern(ctx);

        program.push(new FunctionNode(ctx.NAME().getText(), ctx.funcReturnType().type().NAME().getText()));
    }

    @Override
    public void exitFuncExtern(MoxParser.FuncExternContext ctx) {
        super.exitFuncExtern(ctx);

        FunctionNode node = (FunctionNode) program.pop();

        // register function
    }

    @Override
    public void enterVariableArrayAccess(MoxParser.VariableArrayAccessContext ctx) {
        super.enterVariableArrayAccess(ctx);

        ArrayAccessNode node = new ArrayAccessNode();
        program.push(node);
    }

    @Override
    public void exitVariableArrayAccess(MoxParser.VariableArrayAccessContext ctx) {
        super.exitVariableArrayAccess(ctx);

        ArrayAccessNode node = (ArrayAccessNode) program.pop();

        if(program.peek().type == NodeTypes.ARRAY_ASSIGNMENT) {
            ArrayAssignmentNode assignmentNode = (ArrayAssignmentNode) program.peek();

            if(!assignmentNode.hasVariableName()) {
                assignmentNode.setVariable(node);
            } else {
                program.peek().buffer.push(node.code());
            }
        } else {
            program.peek().buffer.push(node.code());
        }
    }

    @Override
    public void enterVarExtern(MoxParser.VarExternContext ctx) {
        super.enterVarExtern(ctx);

        String name = ctx.NAME().getText();
        String type = ctx.type().NAME().getText();

        External.addVariable(new VariableNode(name, type));
    }
}
