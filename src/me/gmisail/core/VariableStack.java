package me.gmisail.core;

import me.gmisail.Mox;
import me.gmisail.nodes.NodeTypes;
import me.gmisail.codegen.Scope;
import me.gmisail.nodes.VariableNode;

import java.util.Stack;


public class VariableStack {

    // global scope = 0
    protected int scope = 0;

    protected Stack<Scope> stack;

    public VariableStack() {
        stack = new Stack<Scope>();
    }

    public void add(VariableNode node) {
        node.setScope(scope);

        if(stack.size() == 0)
            stack.push(new Scope());

        stack.peek().addVariable(node);
    }

    public void enterScope() {
        scope++;

        stack.push(new Scope());
    }

    public Scope exitScope() {
        scope--;

        return stack.pop();
    }

    public void printVariablesInScope() {
        Mox.logger.write("--------------------");
        for(int i = 0; i < stack.size(); i++) {
            stack.elementAt(i).printVariables();
        }
    }

    public VariableNode getVariableWithName(String name) {
        for(int i = 0; i < stack.size(); i++) {
            VariableNode node = stack.elementAt(i).getVariable(name);
            if(node != null) {
                return node;
            }
        }

        return null;
    }

    public String getTypeOf(String name) {


        for(int i = 0; i < stack.size(); i++) {
            VariableNode node = stack.elementAt(i).getVariable(name);
            if(node != null) {
                return node.getType();
            }
        }

        return "void";
    }

    public boolean hasClassInstanceNamed(String name) {
        return getVariableWithName(name) != null;
    }

}
