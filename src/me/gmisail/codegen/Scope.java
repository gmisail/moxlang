package me.gmisail.codegen;

import me.gmisail.nodes.VariableNode;

import java.util.ArrayList;

public class Scope {

    private ArrayList<VariableNode> variables;

    public Scope() {
        variables = new ArrayList<VariableNode>();
    }

    public int size() { return variables.size(); }

    public void addVariable(VariableNode node) {
        variables.add(node);
    }

    public void printVariables() {
        for(int i = 0; i < variables.size(); i++) {
            System.out.println("variable: " + variables.get(i).getName());
        }
    }

    public VariableNode getVariable(String name) {
        for(int i = 0; i < variables.size(); i++) {
            if(variables.get(i).getName().equals(name))
                return variables.get(i);
        }

        return null;
    }

    public VariableNode getVariableAt(int i) {
        return variables.get(i);
    }

    public boolean hasVariable(String name) {
        return getVariable(name) != null;
    }

}
