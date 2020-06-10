package me.gmisail.core;

import me.gmisail.nodes.ClassNode;

import java.util.ArrayList;

public class StateHandler {

    ProgramStack program;
    VariableStack variables;

    ArrayList<ClassNode> classes;

    public StateHandler() {
        program = new ProgramStack();
        variables = new VariableStack();
        classes = new ArrayList<ClassNode>();
    }

    public ProgramStack getProgram() {
        return program;
    }

    public VariableStack getVariables() {
        return variables;
    }

    public ArrayList<ClassNode> getClasses() { return classes; }

}
