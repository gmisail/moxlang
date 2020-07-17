package me.gmisail.core;

import me.gmisail.Mox;
import me.gmisail.codegen.*;
import me.gmisail.nodes.*;
import me.gmisail.parser.MoxBaseListener;
import me.gmisail.parser.MoxParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class Listener extends MoxBaseListener
{
    private MoxParser parser;
    private FileWriter file;

    public Listener(MoxParser parser, FileWriter file) {
        super();

        this.parser = parser;
        this.file = file;
    }

    @Override
    public void enterProgram(MoxParser.ProgramContext ctx) {
        super.enterProgram(ctx);
    }

    @Override
    public void enterBlock(MoxParser.BlockContext ctx) {
        super.enterBlock(ctx);

        Mox.state.getVariables().enterScope();

        /*
        *   When a function is defined, add all of the arguments to scope.
        * */
        if(Mox.state.getProgram().currentType() == NodeTypes.FUNCTION) {
            FunctionNode node = (FunctionNode) Mox.state.getProgram().current();

            for(int i = 0; i < node.getParams().size(); i++) {
                ParameterNode param = node.getParams().get(i);

                Mox.state.getVariables().add(new VariableNode(param.name, param.type));
            }

        }

        if(Mox.state.getProgram().currentType() != NodeTypes.DEFAULT) {
            Mox.state.getProgram().current().buffer.push("{");

            if(Mox.state.getProgram().currentType() == NodeTypes.FUNCTION ) {
                FunctionNode node = (FunctionNode) Mox.state.getProgram().current();

                if(node.isTemplated()) {
                    Mox.state.getProgram().current().buffer.push("\\\n");
                } else {
                    Mox.state.getProgram().current().buffer.push("\n");
                }
            } else {
                Mox.state.getProgram().current().buffer.push("\n");
            }
        }
    }

    @Override
    public void enterClassBlock(MoxParser.ClassBlockContext ctx) {
        super.exitClassBlock(ctx);

        Mox.state.getVariables().enterScope();
    }

    @Override
    public void exitClassBlock(MoxParser.ClassBlockContext ctx) {
        super.exitClassBlock(ctx);

        Mox.state.getVariables().exitScope();
    }

    @Override
    public void exitBlock(MoxParser.BlockContext ctx) {
        super.exitBlock(ctx);

        Scope outOfScopeVars = Mox.state.getVariables().exitScope();

        /*
         *   The 'destroy' function is contained within a class. Append all variables that are marked to be automatically
         *   destroyed   i.e.   var v : Vector = new Vector()!
         * */
        ClassNode parentClass = (ClassNode) Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS);
        FunctionNode parentFunc = (FunctionNode) Mox.state.getProgram().getParentNodeOfType(NodeTypes.FUNCTION);

        /*
        *   Ensure that this is a function block, a parent class and function exist, and the function's name is destroy
        * */
        if(Mox.state.getProgram().currentType() == NodeTypes.FUNCTION && parentClass != null && parentFunc != null
                && parentFunc.getLocalName().equals("destroy")) {

            /* create a destructor for every class that is marked with a auto-destructor  */
            for(int i = 0; i < parentClass.getMemberVariables().size(); i++) {
                VariableNode variable = parentClass.getMemberVariables().get(i);

                if(variable.isAutomaticallyDestroyed()) {
                    /*
                    *   this exploits the fact that since these are all member variables,
                    *   we can prefix it with self->.
                    * */
                    DeleteNode node = new DeleteNode();
                    node.buffer.push("self->" + variable.getName());
                    node.setTarget(new VariableNode("self->" + variable.getName(), variable.getType()));

                    parentFunc.buffer.push(node.code());
                }
            }
        } else {
            Iterator iterator = outOfScopeVars.getVariables().entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry element = (Map.Entry) iterator.next();

                VariableNode variable = (VariableNode) element.getValue();

                if(variable.isAutomaticallyDestroyed()) {
                    DeleteNode node = new DeleteNode();
                    node.buffer.push(variable.getName());
                    node.setTarget(variable);

                    Mox.state.getProgram().current().buffer.push(node.code());
                }
            }
        }

        if(Mox.state.getProgram().currentType() != NodeTypes.DEFAULT) {
            Mox.state.getProgram().current().buffer.push("}");

            if(Generator.isMacro()) {
                Mox.state.getProgram().current().buffer.push("\\\n");
            } else {
                Mox.state.getProgram().current().buffer.push("\n");
            }
        }
    }

    /*
    *
    *   LITERALS
    *
    * */

    @Override
    public void enterBool(MoxParser.BoolContext ctx) {
        super.enterBool(ctx);

        Mox.state.getProgram().current().buffer.push(Generator.createBoolean(ctx.getText()));
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
            Mox.state.getProgram().current().buffer.push(ctx.NUM().getText());
        else if(ctx.STRING() != null)
            Mox.state.getProgram().current().buffer.push(ctx.STRING().getText());
        else if(ctx.CHAR() != null) {
            Mox.state.getProgram().current().buffer.push(ctx.CHAR().getText());
        }
    }

    @Override
    public void enterBoundedExpr(MoxParser.BoundedExprContext ctx) {
        super.enterBoundedExpr(ctx);

        Mox.state.getProgram().current().buffer.push("(");
    }

    @Override
    public void exitBoundedExpr(MoxParser.BoundedExprContext ctx) {
        super.exitBoundedExpr(ctx);

        Mox.state.getProgram().current().buffer.push(")");
    }

    @Override
    public void enterAddSub(MoxParser.AddSubContext ctx) {
        super.enterAddSub(ctx);

        String sign = ctx.getText();

        Mox.state.getProgram().current().buffer.push(" " + sign + " ");
    }

    @Override
    public void enterMulDivMod(MoxParser.MulDivModContext ctx) {
        super.enterMulDivMod(ctx);

        Mox.state.getProgram().current().buffer.push(" " + ctx.getText() + " ");
    }

    @Override
    public void enterConditionals(MoxParser.ConditionalsContext ctx) {
        super.enterConditionals(ctx);

        Mox.state.getProgram().current().buffer.push(" " + ctx.getText() + " ");
    }

    @Override
    public void enterOperatorAnd(MoxParser.OperatorAndContext ctx) {
        super.enterOperatorAnd(ctx);

        Mox.state.getProgram().current().buffer.push(" && ");
    }

    @Override
    public void enterOperatorOr(MoxParser.OperatorOrContext ctx) {
        super.enterOperatorOr(ctx);

        Mox.state.getProgram().current().buffer.push(" || ");
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

            if(ctx.funcReturnType().type().templateType() != null) {
                boolean isPointer = false;

                if(type.equals("Pointer")) {
                    isPointer = true;
                }

                type = ctx.funcReturnType().type().templateType().type().NAME().getText();

                if(isPointer)
                    type += "*";

            } else if(type.equals("any")) {
                type = "void*";
            }
        }

        if(Generator.currentContext().getType() == ContextTypes.CLASS) {
            ClassNode parent = (ClassNode) Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS);

            if(parent == null) {
                Mox.logger.error("Could not find class named " + Generator.currentContext().getName());
            } else {
                if(parent.isTemplated() && type.equals(parent.getTemplateType())) {
                    type = "void*";
                }
            }
        }

        String name = ctx.NAME().getText();

        if(!Registry.saveFunction(Generator.currentContext().getName() + "_" + name + "_" + type)) {
            Mox.logger.error("Redefinition of function " + name);
        }

        FunctionNode func = new FunctionNode(Generator.createFunction(type, name), type);

        if(ctx.type() != null) {
            func.makeTemplated(ctx.type().NAME().getText());

            Generator.enterMacro();
        }

        if(Generator.currentContext().getType().equals(ContextTypes.CLASS)) {
            func.addParam("self", Generator.currentContext().getName() + "*");

            if(Mox.state.getProgram().currentType() == NodeTypes.CLASS) {
                ClassNode node = (ClassNode) Mox.state.getProgram().current();
                func.setLocalName(name);
                node.addFunction(func);
            }
        }

        Mox.state.getProgram().push(func);
        Mox.state.getFunctions().add(func);
    }

    @Override
    public void exitFunction(MoxParser.FunctionContext ctx) {
        super.exitFunction(ctx);

        FunctionNode func = (FunctionNode) Mox.state.getProgram().pop();

        /*
        * hacky, I know. Since we don't *really* know when the macro is supposed to end,
        * chop off the last \ and re-add the newline.
        * */

        String code = func.buffer.getCode();

        if(func.isTemplated()) {
            code = code.substring(0, code.length() - 2);
            code += "\n";
        }

        Mox.state.getProgram().current().buffer.push(code);

        Generator.exitMacro();
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


        /* function call has a template type */
        if(ctx.type() != null) {
            functionCallNode.makeTemplated(ctx.type().getText());
        }

        // TODO: validate that the function is valid.

        if(Generator.currentContext().getType() == ContextTypes.CLASS && ctx.NAME(0).getText().equals("self")) {
            // the first NAME being "self" implies that it is a call to itself
            // self.print()
            if(ctx.NAME(0).getText().equals("self") && numberOfElements <= 2) {
                initial = 1;
                name += Generator.currentContext().getName() + delim;
                functionCallNode.buffer.push("self");
                functionCallNode.addParamCount();
            }

            // calling a function from a member class object
            // so, var foo : Foo = new Foo()
            //     self.foo.sayHello()     # <------ 3 elements!
            // should be:
            //     Foo_sayHello(self->foo);
            else if(ctx.NAME(0).getText().equals("self") && numberOfElements > 2) {
                // find class def in the program stack
                ClassNode parentClassNode = null;
                for(int i = 0; i < Mox.state.getProgram().size(); i++) {
                    if (Mox.state.getProgram().at(i).type == NodeTypes.CLASS) {
                        classNode = (ClassNode) Mox.state.getProgram().at(i);
                        parentClassNode = classNode;
                    }
                }

                for(int i = 1; i < numberOfElements - 1; i++) {
                    VariableNode subclassVariable = classNode.getVariable(ctx.NAME(i).getText());

                    if(subclassVariable == null) {
                        Mox.logger.error("Cannot find variable '" + ctx.NAME(i).getText() + "' in type '" + classNode.getName() + "'");
                        return;
                    }

                    String subclassType = Generator.dereference(subclassVariable.getType());

                    // if we are accessing the class in which it is defined, then it will
                    // not show up in Mox.state.getClasses().find(). So, we save the parent class and then
                    // check to see if they match. If so, then set it to classNode.
                    if(subclassType.equals(parentClassNode.getName()))
                        classNode = parentClassNode;
                    else
                        classNode = Mox.state.getClasses().find(subclassType);
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
        if(initial == 0 && Mox.state.getVariables().hasClassInstanceNamed(ctx.NAME(0).getText())) {                    // if the first keyword is a class instance, then all following statements must also be pointers to Mox.state.getClasses().
            if(numberOfElements > 1) {
                classNode = Mox.state.getClasses().find(Mox.state.getVariables().getTypeOf(ctx.NAME(0).getText()));

                if(classNode == null) {
                    classNode = (ClassNode) Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS);
                }

                for(int i = 1; i < numberOfElements - 1; i++) {
                    VariableNode subclassVariable = classNode.getVariable(ctx.NAME(i).getText());

                    if(subclassVariable == null) {
                        Mox.logger.error("Cannot find variable '" + ctx.NAME(i).getText() + "' in type '" + classNode.getName() + "'");
                        return;
                    }

                    String subclassType = Generator.dereference(subclassVariable.getType());

                    classNode = Mox.state.getClasses().find(subclassType);
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

        if(Mox.state.getFunctions().find(name) == null && !External.functionExists(name)) {
            Mox.logger.error("Cannot find function of name '" + name + "'");
        }

        Mox.state.getProgram().push(functionCallNode);
    }

    @Override
    public void exitFunctionCall(MoxParser.FunctionCallContext ctx) {
        super.exitFunctionCall(ctx);

        FunctionCallNode functionCall = (FunctionCallNode) Mox.state.getProgram().pop();

        /* when the function is called, is it called as a statement or expression? If it is a statement, the it must have a semicolon */
        if(parser.getRuleNames()[ctx.getParent().getRuleIndex()].equals("statement")) {
            Mox.state.getProgram().current().buffer.push(functionCall.getBody() + Generator.newline());

        } else {
            /* if it is not a standalone statement, then it must be used within another expression. Thus, add it to the parent */
            Mox.state.getProgram().current().buffer.push(functionCall.getBody());
        }
    }

    @Override
    public void enterFunctionCallParam(MoxParser.FunctionCallParamContext ctx) {
        super.enterFunctionCallParam(ctx);

        FunctionCallNode functionCall = (FunctionCallNode) Mox.state.getProgram().current();

        if(functionCall.getParamCount() > 0) {
            functionCall.buffer.push(", ");
        }

        functionCall.addParamCount();
    }

    @Override
    public void enterReturnStatement(MoxParser.ReturnStatementContext ctx) {
        super.enterReturnStatement(ctx);

        Mox.state.getProgram().push(new ReturnNode());
    }

    @Override
    public void exitReturnStatement(MoxParser.ReturnStatementContext ctx) {
        super.exitReturnStatement(ctx);

        ReturnNode ret = (ReturnNode) Mox.state.getProgram().pop();

        Mox.state.getProgram().current().buffer.push("return " + ret.buffer.getCode() + Generator.newline());
    }

    @Override
    public void enterFuncParam(MoxParser.FuncParamContext ctx) {
        super.enterFuncParam(ctx);

        String type = ctx.type().NAME().getText();

        if(type.equals("Pointer")) {
            String template = "void";

            if(ctx.type().templateType() != null) {
                template = ctx.type().templateType().type().NAME().getText();
            }

            type = template + "*";
        } else if(type.equals("Reference")) {
            String template = "void";

            if(ctx.type().templateType() != null)
                template = ctx.type().templateType().type().NAME().getText();

            type = template + "&";
        }

        FunctionNode func = (FunctionNode) Mox.state.getProgram().current();
        func.addParam(ctx.NAME().getText(), type);
    }

    @Override
    public void exitFuncParams(MoxParser.FuncParamsContext ctx) {
        super.exitFuncParams(ctx);

        FunctionNode func = (FunctionNode) Mox.state.getProgram().current();
        Mox.state.getProgram().current().buffer.push(func.code() + "\n");
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

        if (!Registry.saveVariable(name) && Mox.state.getVariables().hasClassInstanceNamed(name)) {
            Mox.logger.error("Redefinition of variable " + name + "!");
        }

        boolean isPointer = false;

        if(type.equals("Pointer")) {
            type = templateType;
            isPointer = true;

            //Generator.createTypeFromPointer(ctx.type());

            if(templateType.equals("any")) {
                // any is equivalent to a void*
                type = "void*";
            }
        } else if(type.equals("any")) {
            // any is equivalent to a void*

            type = "void";
            isPointer = true;
        }

        VariableNode node = new VariableNode(name, type);

        if(isPointer)
            node.makePointer();

        Mox.state.getVariables().add(node);
        Mox.state.getProgram().push(node);
    }

    @Override
    public void exitVariable(MoxParser.VariableContext ctx) {
        super.exitVariable(ctx);

        VariableNode variable = (VariableNode) Mox.state.getProgram().pop();
        
        if(Mox.state.getProgram().current() != null && Mox.state.getProgram().currentType() == NodeTypes.MODULE) {
            ModuleNode moduleNode = (ModuleNode) Mox.state.getProgram().current();
            moduleNode.addVariable(variable);
        } else if(Mox.state.getProgram().current() != null && Mox.state.getProgram().currentType() == NodeTypes.CLASS) {
            ClassNode classNode = (ClassNode) Mox.state.getProgram().current();
            variable.makeMemberVariable();

            classNode.addVariable(variable);
        } else {
            // not a member function, so just spit it out.

            if(!Types.exists(variable.getType()) && !variable.isPointer()) {
                FunctionNode func = (FunctionNode) Mox.state.getProgram().getParentNodeOfType(NodeTypes.FUNCTION);

                if(func != null && func.isTemplated() && !variable.getType().equals(func.getTemplateType())) {
                    variable.makePointer();
                }
            }

            // var <name> : <type> = <value>. If value is undefined, then do not output it.
            if(variable.getValue().getCode().length() > 0)
                Mox.state.getProgram().current().buffer.push(variable.getType() + " " + variable.getName() + " = " + variable.getValue().getCode() + Generator.newline());
            else
                Mox.state.getProgram().current().buffer.push(variable.getType() + " " + variable.getName() + Generator.newline());
        }
    }

    @Override
    public void enterVariableAssignmentStatement(MoxParser.VariableAssignmentStatementContext ctx) {
        super.enterVariableAssignmentStatement(ctx);

        Mox.state.getProgram().push(new VariableAssignmentNode());
    }

    @Override
    public void exitVariableAssignmentStatement(MoxParser.VariableAssignmentStatementContext ctx) {
        super.enterVariableAssignmentStatement(ctx);

        VariableAssignmentNode assignment = (VariableAssignmentNode) Mox.state.getProgram().pop();

        Mox.state.getProgram().current().buffer.push(assignment.getName() + " = " + assignment.getValue().getCode() + Generator.newline());
    }

    @Override
    public void enterVariableAccess(MoxParser.VariableAccessContext ctx) {
        super.enterVariableAccess(ctx);

        String type = "";

        int initial = 0;
        if(Generator.currentContext().getType() == ContextTypes.CLASS) {
            if(ctx.NAME(0).getText().equals("self")) {
                if(Mox.state.getProgram().currentType() == NodeTypes.VARIABLE_ASSIGNMENT) {
                    VariableAssignmentNode node = (VariableAssignmentNode) Mox.state.getProgram().current();

                    if(node.hasName())
                        node.buffer.push("self->");
                    else
                        node.setName(node.getName() + "self->");
                } else {
                    Mox.state.getProgram().current().buffer.push("self->");
                }

                initial = 1;
            }
        }

        String delim = "_";

        boolean inScope = false;
        for(int i = 0; i < Mox.state.getProgram().size(); i++) {
            if(Mox.state.getProgram().at(i).type == NodeTypes.CLASS) {
                ClassNode classNode = (ClassNode) Mox.state.getProgram().at(i);

                for(int j = 0; j < classNode.getMemberVariables().size(); j++) {
                    if(classNode.getMemberVariables().get(j).getName().equals(ctx.NAME(initial).getText())) {
                        inScope = true;
                        break;
                    }
                }
            }
        }

        if(!inScope && !Mox.state.getVariables().hasClassInstanceNamed(ctx.NAME(initial).getText())
                && !External.variableExists(ctx.NAME(initial).getText())) {

            Mox.logger.error("Cannot find variable '" + ctx.NAME(initial).getText() + "'!");
        }

        for(int i = initial; i < ctx.NAME().size(); i++) {
            if(Mox.state.getProgram().currentType() == NodeTypes.VARIABLE_ASSIGNMENT) {
                VariableAssignmentNode node = (VariableAssignmentNode) Mox.state.getProgram().current();

                if(i > initial) {
                    if(node.hasName())
                        node.buffer.push(delim);
                    else
                        node.setName(node.getName() + delim);
                } else if(i == initial) {
                    if(Mox.state.getVariables().hasClassInstanceNamed(ctx.NAME(i).getText())) {                    // if the first keyword is a class instance, then all following statements must also be pointers to Mox.state.getClasses().
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
                    Mox.state.getProgram().current().buffer.push(delim);
                else if(i == initial) {
                    if(Mox.state.getVariables().hasClassInstanceNamed(ctx.NAME(i).getText())) {
                        if(ctx.NAME().size() > 1) {
                            delim = "->";
                        }
                    }
                }

                Mox.state.getProgram().current().buffer.push(ctx.NAME(i).getText());
            }
        }


        if(Mox.state.getProgram().currentType() == NodeTypes.DELETE) {
            DeleteNode delete = (DeleteNode) Mox.state.getProgram().current();

            /*
            * get the type of the first element. If it is self, then the type is the current class.
            * for every string, check if it is the current class. If there are more strings, set the
            * current class to that variables type. Continue...
            * */

            ClassNode classNode = null;
            if(ctx.NAME(0).getText().equals("self")) {
                for(int i = 0; i < Mox.state.getProgram().size(); i++) {
                    if (Mox.state.getProgram().at(i).type == NodeTypes.CLASS) {
                        classNode = (ClassNode) Mox.state.getProgram().at(i);
                        break;
                    }
                }
            } else {
                /*
                *   Get the root node variable (ROOT.variable.variable...) --> get type --> get class definition
                * */
                VariableNode rootNode = Mox.state.getVariables().getVariableWithName(ctx.NAME(0).getText());
                String rootNodeType = rootNode.getType();
                classNode = Mox.state.getClasses().find(rootNodeType);
            }

            for(int i = 1; i < ctx.NAME().size(); i++) {
                VariableNode subclassVariable = classNode.getVariable(ctx.NAME(i).getText());

                if(subclassVariable == null) {
                    Mox.logger.error("Cannot find variable '" + ctx.NAME(i).getText() + "' in type '" + classNode.getName() + "'");
                    return;
                }

                String subclassType = Generator.dereference(subclassVariable.getType());
                classNode = Mox.state.getClasses().find(subclassType);
            }

            delete.setTarget(new VariableNode(Mox.state.getProgram().current().buffer.getCode(), classNode.getName()));
        }
    }

    @Override
    public void exitVariableAccess(MoxParser.VariableAccessContext ctx) {
        super.exitVariableAccess(ctx);

        if(Mox.state.getProgram().currentType() == NodeTypes.ARRAY_ACCESS) {
            ArrayAccessNode node = (ArrayAccessNode) Mox.state.getProgram().current();
            node.saveName();
        }
    }


    public void enterVariableArrayAssignment(MoxParser.VariableArrayAssignmentContext ctx) {
        super.enterVariableArrayAssignment(ctx);

        Mox.state.getProgram().push(new ArrayAssignmentNode());
    }

    public void exitVariableArrayAssignment(MoxParser.VariableArrayAssignmentContext ctx) {
        super.exitVariableArrayAssignment(ctx);

        ArrayAssignmentNode node = (ArrayAssignmentNode) Mox.state.getProgram().pop();
        Mox.state.getProgram().current().buffer.push(node.code());
    }

    @Override
    public void enterVariableCreate(MoxParser.VariableCreateContext ctx) {
        super.enterVariableCreate(ctx);

        // ensure that the type you are allocating is equal to the type that you are assigning it too. Also, change the type of the variable to a pointer of the original

        String name = ctx.type().NAME().getText() + "_alloc";
        FunctionCallNode createVariable = new FunctionCallNode(name);

        if(ctx.type().templateType() != null) {
            String templateType = ctx.type().templateType().type().NAME().getText();

            VariableNode node = (VariableNode) Mox.state.getProgram().getParentNodeOfType(NodeTypes.VARIABLE);
            node.makeTemplated(templateType);
        }

        /*
        *   The current variable is set to be automatically destructed when it goes out
        *   of scope. So, we must mark it as self-destructing.
        * */

        /*
        if(ctx.variableDestructor() != null) {
            for(int i = 0; i < Mox.state.getProgram().size(); i++) {
                if(Mox.state.getProgram().at(i).type == NodeTypes.VARIABLE) {
                    ((VariableNode) Mox.state.getProgram().at(i)).makeAutomaticallyDestroyed();

                    break;
                } else if(Mox.state.getProgram().at(i).type == NodeTypes.VARIABLE_ASSIGNMENT) {
                    VariableAssignmentNode assignmentNode = (VariableAssignmentNode) Mox.state.getProgram().at(i);

                    VariableNode target = Mox.state.getVariables().getVariableWithName(assignmentNode.getName());


                    if(target == null) {
                        Mox.logger.error("Can't mark variable '" + assignmentNode.getName() + "' as self-destructing.");
                        break;
                    }

                    target.makeAutomaticallyDestroyed();

                    break;
                }
            }
        }
        */

        Mox.state.getProgram().push(createVariable);
    }

    @Override
    public void exitVariableCreate(MoxParser.VariableCreateContext ctx) {
        super.exitVariableCreate(ctx);

        FunctionCallNode functionCall = (FunctionCallNode) Mox.state.getProgram().pop();
        Mox.state.getProgram().current().buffer.push(functionCall.getBody());
    }

    @Override
    public void enterVariableDelete(MoxParser.VariableDeleteContext ctx) {
        super.enterVariableDelete(ctx);

        Mox.state.getProgram().push(new DeleteNode());
    }

    @Override
    public void exitVariableDelete(MoxParser.VariableDeleteContext ctx) {
        super.exitVariableDelete(ctx);

        DeleteNode node = (DeleteNode) Mox.state.getProgram().pop();

        if(Mox.state.getVariables().hasClassInstanceNamed(node.buffer.getCode()) && node.getTarget() != null) {
            node.setTarget(Mox.state.getVariables().getVariableWithName(node.buffer.getCode()));
            Mox.state.getProgram().current().buffer.push(node.code());
        } else {
            Mox.state.getProgram().current().buffer.push(node.code());
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
            Mox.logger.error("Redefinition of module '" + ctx.NAME().getText() + "'");
        }

        Generator.enterContext(new Context(ctx.NAME().getText(), ContextTypes.MODULE));
        Mox.state.getProgram().push(new ModuleNode(ctx.NAME().getText()));
    }

    @Override
    public void exitModuleDecl(MoxParser.ModuleDeclContext ctx) {
        super.exitModuleDecl(ctx);

        Generator.exitContext();

        ModuleNode moduleNode = (ModuleNode) Mox.state.getProgram().pop();

        Mox.state.getProgram().current().buffer.push(moduleNode.code() + "\n");
    }

    /*
    *
    *   CLASS
    *
    * */

    @Override
    public void enterClassDecl(MoxParser.ClassDeclContext ctx) {
        super.enterClassDecl(ctx);

        String className = ctx.type().NAME().getText();

        if(Mox.state.getClasses().find(className) != null) {
            Mox.logger.error("Redefinition of class '" + className + "'");
        }

        ClassNode classNode = new ClassNode(className);

        if(ctx.type().templateType() != null)
            classNode.makeTemplated(ctx.type().templateType().type().NAME().getText());

        Mox.state.getProgram().push(classNode);
        Generator.enterContext(new Context(className, ContextTypes.CLASS));
    }

    @Override
    public void exitClassDecl(MoxParser.ClassDeclContext ctx) {
        super.exitClassDecl(ctx);

        ClassNode classNode = (ClassNode) Mox.state.getProgram().pop();

        Mox.state.getClasses().add(classNode);
        Mox.state.getProgram().current().buffer.push(classNode.code());

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

        Mox.state.getProgram().current().buffer.push("if (");
    }

    @Override
    public void exitIfStatement(MoxParser.IfStatementContext ctx) {
        super.exitIfStatement(ctx);

        Mox.state.getProgram().current().buffer.push(")");
    }

    @Override
    public void enterElseIfStatement(MoxParser.ElseIfStatementContext ctx) {
        super.enterElseIfStatement(ctx);

        Mox.state.getProgram().current().buffer.push("else if(");
    }


    @Override
    public void exitElseIfStatement(MoxParser.ElseIfStatementContext ctx) {
        super.exitElseIfStatement(ctx);

        Mox.state.getProgram().current().buffer.push(")");
    }

    @Override
    public void enterElseStatement(MoxParser.ElseStatementContext ctx) {
        super.enterElseStatement(ctx);

        Mox.state.getProgram().current().buffer.push("else");
    }

    @Override
    public void enterWhileLoop(MoxParser.WhileLoopContext ctx) {
        super.enterWhileLoop(ctx);

        Mox.state.getProgram().current().buffer.push("while");
    }

    @Override
    public void enterWhileExpr(MoxParser.WhileExprContext ctx) {
        super.enterWhileExpr(ctx);

        Mox.state.getProgram().current().buffer.push("(");
    }

    @Override
    public void exitWhileExpr(MoxParser.WhileExprContext ctx) {
        super.exitWhileExpr(ctx);

        Mox.state.getProgram().current().buffer.push(")");
    }

    @Override
    public void enterForRangeLoop(MoxParser.ForRangeLoopContext ctx) {
        super.enterForRangeLoop(ctx);

        String iterator = ctx.NAME().getText();

        Mox.state.getProgram().push(new ForNode(iterator));
        Mox.state.getProgram().current().buffer.push("for(int " + iterator + " = ");

        Mox.state.getVariables().add(new VariableNode(iterator, "int"));
    }


    @Override
    public void exitForFromExpr(MoxParser.ForFromExprContext ctx) {
        super.exitForFromExpr(ctx);

        ForNode forNode = (ForNode) Mox.state.getProgram().current();

        Mox.state.getProgram().current().buffer.push("; " + forNode.getIterator() + " < ");
    }

    @Override
    public void exitForToExpr(MoxParser.ForToExprContext ctx) {
        super.exitForToExpr(ctx);

        ForNode forNode = (ForNode) Mox.state.getProgram().pop();
        forNode.buffer.push("; " + forNode.getIterator() + "++)");
        Mox.state.getProgram().current().buffer.push(forNode.buffer.getCode());
    }

    /*
    *  EXTERNS
    */

    @Override
    public void enterFuncExtern(MoxParser.FuncExternContext ctx) {
        super.enterFuncExtern(ctx);

        Mox.state.getProgram().push(new FunctionNode(ctx.NAME().getText(), ctx.funcReturnType().type().NAME().getText()));
    }

    @Override
    public void exitFuncExtern(MoxParser.FuncExternContext ctx) {
        super.exitFuncExtern(ctx);

        FunctionNode node = (FunctionNode) Mox.state.getProgram().pop();

        /*
        *  TODO: sanitize the arguments
        * */

        External.addFunction(node);
    }

    @Override
    public void enterVariableArrayAccess(MoxParser.VariableArrayAccessContext ctx) {
        super.enterVariableArrayAccess(ctx);

        ArrayAccessNode node = new ArrayAccessNode();
        Mox.state.getProgram().push(node);
    }

    @Override
    public void exitVariableArrayAccess(MoxParser.VariableArrayAccessContext ctx) {
        super.exitVariableArrayAccess(ctx);

        ArrayAccessNode node = (ArrayAccessNode) Mox.state.getProgram().pop();

        if(Mox.state.getProgram().currentType() == NodeTypes.ARRAY_ASSIGNMENT) {
            ArrayAssignmentNode assignmentNode = (ArrayAssignmentNode) Mox.state.getProgram().current();

            if(!assignmentNode.hasVariableName()) {
                assignmentNode.setVariable(node);
            } else {
                Mox.state.getProgram().current().buffer.push(node.code());
            }
        } else {
            Mox.state.getProgram().current().buffer.push(node.code());
        }
    }

    @Override
    public void enterVarExtern(MoxParser.VarExternContext ctx) {
        super.enterVarExtern(ctx);

        String name = ctx.NAME().getText();
        String type = ctx.type().NAME().getText();

        External.addVariable(new VariableNode(name, type));
    }

    @Override
    public void enterFuncSize(MoxParser.FuncSizeContext ctx) {
        super.enterFuncSize(ctx);

        String type = ctx.type().NAME().getText();

        Mox.state.getProgram().current().buffer.push("sizeof(");

        if(type.equals("Pointer")) {
            String template = ctx.type().templateType().type().NAME().getText();

            if(template.equals("any")) {
                template = "void*";
            }

            type = template + "*";
        } else {
            if(type.equals("any")) {
                type = "void*";
            }
        }

        Mox.state.getProgram().current().buffer.push(type);
        Mox.state.getProgram().current().buffer.push(")");
    }

    @Override
    public void enterFuncChar(MoxParser.FuncCharContext ctx) {
        super.enterFuncChar(ctx);

        String character = Generator.createDataFromString(ctx.STRING().getText());

        if(character.equals("\n") || character.equals("\r") || character.equals("\0")) {
            Mox.state.getProgram().current().buffer.push("'" + character + "'");
        } else if(character.length() == 1) {
            Mox.state.getProgram().current().buffer.push("'" + character + "'");
        } else {
            Mox.logger.error("Invalid character '" + character + "'");
        }
    }

    @Override
    public void enterImportStatement(MoxParser.ImportStatementContext ctx) {
        super.enterImportStatement(ctx);

        String path = Generator.createDataFromString(ctx.STRING().getText());

        if(!Mox.state.getImports().addImport(path)) {
            Mox.logger.warn("File '" + path + "' already imported. Ignoring.");

            return;
        }

        try {
            if(Mox.getFileType(path).equals("mox"))
                Mox.execute(path);
            else if(Mox.getFileType(path).equals("h")) {
                if(Mox.getLocality(path).equals("global")){
                    Mox.state.getProgram().current().buffer.push("#include <" + path + ">\n");
                } else {
                    Mox.state.getProgram().current().buffer.push(Generator.createInclude(path));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
