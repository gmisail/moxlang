package me.gmisail.core;

import me.gmisail.nodes.Node;
import me.gmisail.nodes.NodeTypes;

import java.util.Stack;

public class ProgramStack {

    private Stack<Node> program;

    public ProgramStack() {
        program = new Stack<Node>();

        // root node
        push(new Node());
    }

    public void push(Node node) {
        program.push(node);
    }
    public Node pop() {
        return program.pop();
    }
    public Node at(int index) {
        return program.elementAt(index);
    }
    public Node current() {
        return program.peek();
    }
    public NodeTypes currentType() {
        return program.peek().type;
    }
    public int size() {
        return program.size();
    }

    public Node getParentNodeOfType(NodeTypes type) {
        for(int i = 0; i < program.size(); i++) {
            if(at(i).type == type)
                return at(i);
        }

        return null;
    }
}
