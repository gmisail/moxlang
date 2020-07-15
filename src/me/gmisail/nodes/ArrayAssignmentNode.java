package me.gmisail.nodes;

import me.gmisail.codegen.Generator;

public class ArrayAssignmentNode extends Node {

    private ArrayAccessNode variable;
    private boolean hasVariable;

    public ArrayAssignmentNode() {
        super();

        this.type = NodeTypes.ARRAY_ASSIGNMENT;
        this.hasVariable = false;
    }

    public void setVariable(ArrayAccessNode node) {
        this.variable = node;
        this.hasVariable = true;
    }

    public boolean hasVariableName() { return this.hasVariable; }

    @Override
    public String code() {
        return variable.code() + " = " + this.buffer.getCode() + Generator.newline();
    }

}
