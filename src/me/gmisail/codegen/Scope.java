package me.gmisail.codegen;

import me.gmisail.Mox;
import me.gmisail.nodes.DeleteNode;
import me.gmisail.nodes.VariableNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
        Iterator iterator = variables.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry element = (Map.Entry) iterator.next();

            VariableNode variable = (VariableNode) element.getValue();

            System.out.println(variable.getName() + " -> " + variable.getType());
        }
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
