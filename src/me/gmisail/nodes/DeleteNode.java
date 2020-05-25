package me.gmisail.nodes;

import me.gmisail.codegen.Generator;

public class DeleteNode extends Node {

    /*
    *   'target' is the variable that will be deleted
    * */
    private VariableNode target;

    public DeleteNode() {
        super();

        this.type = NodeTypes.DELETE;
    }

    public void setTarget(VariableNode target) { this.target = target; }
    public VariableNode getTarget() { return target; }

    @Override
    public String code() {
        String output = "";

        output += Generator.dereference(target.getType()) + "_destroy(" + target.getName() + ");\n";
        output += "free(" + buffer.getCode() + ");\n";

        return output;
    }
}
