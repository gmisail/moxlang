package me.gmisail.nodes;

import me.gmisail.codegen.Buffer;

public class VariableAssignmentNode extends Node {

    String name;

    public VariableAssignmentNode(String name) {
        this.name = name;
        this.type = NodeTypes.VARIABLE_ASSIGNMENT;
    }

    public String getName() {
        return name;
    }
    public Buffer getValue() {
        return buffer;
    }

}
