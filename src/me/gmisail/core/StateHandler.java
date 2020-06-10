package me.gmisail.core;

import me.gmisail.nodes.ClassNode;

import java.util.ArrayList;

public class StateHandler {

    ProgramStack program;
    VariableStack variables;

    ClassHandler classes;

    public StateHandler() {
        program = new ProgramStack();
        variables = new VariableStack();
        classes = new ClassHandler();
    }

    public ProgramStack getProgram() {
        return program;
    }

    public VariableStack getVariables() {
        return variables;
    }

    public ClassHandler getClasses() { return classes; }

}
