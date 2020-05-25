package me.gmisail.core;

import me.gmisail.nodes.NodeTypes;
import me.gmisail.nodes.VariableNode;

import java.util.Stack;


public class VariableStack {

    // global scope = 0
    private int scope = 0;

    private Stack<VariableNode> stack;

    public VariableStack() {
        stack = new Stack<VariableNode>();
    }

    public void add(VariableNode node) {
        node.setScope(scope);
        stack.push(node);
    }

    public void enterScope() {
        scope++;
    }

    public void exitScope() {
        VariableNode node = null;

        if(stack.size() > 0)
            node = stack.peek();

        while(node != null && node.getScope() == scope) {
            if(stack.size() > 0)
                node = stack.pop();
            else
                break;
        }

        scope--;
    }

    public VariableNode getVariableWithName(String name) {
        for(int i = 0; i < stack.size(); i++) {
            if(stack.elementAt(i).getName().equals(name)) {
                return stack.elementAt(i);
            }
        }

        return null;
    }

    public String getTypeOf(String name) {
        for(int i = 0; i < stack.size(); i++) {
            if(stack.elementAt(i).getName().equals(name)) {
                return stack.elementAt(i).getType();
            }
        }

        return "void";
    }

    public boolean hasClassInstanceNamed(String name) {
        for(int i = 0; i < stack.size(); i++) {
            if(stack.elementAt(i).getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

}
