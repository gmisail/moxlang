package me.gmisail.nodes;

import me.gmisail.Mox;
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

    public String getBody() {

        /*
        *   Check is templated.
        *
        *   If so, check if this function has been defined yet with the given type.
        *   If not, percolate up and define it globally.
        * */

        if(Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS) == null)
            Mox.state.getProgram().getParentNodeOfType(NodeTypes.DEFAULT).buffer.push("declare_add(int)\n");
        else
            Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS).buffer.push("declare_add(int)\n");

        return buffer.getCode();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
