package me.gmisail.nodes;

import me.gmisail.codegen.Buffer;

public class VariableNode extends Node {

    String returnType;
    String name;

    public VariableNode(String name, String type) {
        this.name = name;
        this.type = NodeTypes.VARIABLE;
        this.returnType = type;
    }

    public String getType() {
        return returnType;
    }

    public String getName() {
        return name;
    }

    public Buffer getValue() {
        return buffer;
    }
}
