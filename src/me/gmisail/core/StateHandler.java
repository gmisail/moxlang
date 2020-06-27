package me.gmisail.core;

import me.gmisail.codegen.Context;
import me.gmisail.codegen.ContextTypes;
import me.gmisail.codegen.Generator;
import me.gmisail.nodes.ClassNode;

import java.util.ArrayList;

public class StateHandler {

    ProgramStack program;
    VariableStack variables;

    FunctionHandler functions;
    ClassHandler classes;

    public StateHandler() {
        program = new ProgramStack();
        variables = new VariableStack();
        functions = new FunctionHandler();
        classes = new ClassHandler();

        Generator.enterContext(new Context("global", ContextTypes.GLOBAL));
    }

    public ProgramStack getProgram() {
        return program;
    }

    public VariableStack getVariables() {
        return variables;
    }

    public FunctionHandler getFunctions() { return functions; }
    public ClassHandler getClasses() { return classes; }

}
