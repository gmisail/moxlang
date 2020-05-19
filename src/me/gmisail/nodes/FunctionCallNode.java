package me.gmisail.nodes;

import me.gmisail.codegen.Buffer;

public class FunctionCallNode extends Node {

    private String name;

    /* tracks the number of parameters */
    private int numParams;

    public FunctionCallNode(String name) {
        super();

        this.numParams = 0;
        this.type = NodeTypes.FUNCTION_CALL;
        this.name = name;
    }

    public void addParamCount() { numParams++; }
    public int getParamCount() {
        return numParams;
    }
    public String getBody() { return buffer.getCode(); }
    public String getName() { return name; }
}
