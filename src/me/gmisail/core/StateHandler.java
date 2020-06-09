package me.gmisail.core;

public class StateHandler {

    ProgramStack program;
    VariableStack variables;

    public StateHandler() {
        program = new ProgramStack();
        variables = new VariableStack();
    }

    public ProgramStack getProgram() {
        return program;
    }

    public VariableStack getVariables() {
        return variables;
    }

}
