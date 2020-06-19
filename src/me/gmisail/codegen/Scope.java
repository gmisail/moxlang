package me.gmisail.codegen;

import me.gmisail.nodes.VariableNode;

import java.util.ArrayList;
import java.util.HashMap;

public class Scope {

    private HashMap<String, VariableNode> variables;

    public Scope() {
        variables = new HashMap<String, VariableNode>();
    }

    public int size() { return variables.size(); }

    public void addVariable(VariableNode node) {
        variables.put(node.getName(), node);
    }

    public void printVariables() {
        // dep
    }

    public VariableNode getVariable(String name) {
        return variables.get(name);
    }

    public HashMap<String, VariableNode> getVariables() {
        return variables;
    }

    public boolean hasVariable(String name) {
        return getVariable(name) != null;
    }

}
