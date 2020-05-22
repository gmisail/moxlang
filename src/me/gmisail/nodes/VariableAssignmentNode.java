package me.gmisail.nodes;

import me.gmisail.codegen.Buffer;

public class VariableAssignmentNode extends Node {

    String name;
    boolean hasName;

    public VariableAssignmentNode() {
        this.name = "";
        this.hasName = false;
        this.type = NodeTypes.VARIABLE_ASSIGNMENT;
    }

    public void setName(String name) { this.name = name; }
    public String getName() {
        return name;
    }
    public boolean hasName() { return hasName; }
    public void setHasName(boolean state) { this.hasName = state; }

    public Buffer getValue() {
        return buffer;
    }

}
