package me.gmisail.nodes;

import me.gmisail.Mox;
import me.gmisail.codegen.Buffer;

public class FunctionCallNode extends Node {

    private String name;

    /* tracks the number of parameters */
    private int numParams;

    private boolean isTemplated;
    private String templateType;

    public FunctionCallNode(String name) {
        super();

        this.numParams = 0;
        this.type = NodeTypes.FUNCTION_CALL;
        this.name = name;
        this.isTemplated = false;
        this.templateType = "";
    }

    public void addParamCount() { numParams++; }
    public int getParamCount() {
        return numParams;
    }

    public void makeTemplated(String templateType) {
        this.isTemplated = true;
        this.templateType = templateType;
    }

    public String getBody() {

        /*
        *   Check is templated.
        *
        *   If so, check if this function has been defined yet with the given type.
        *   If not, percolate up and define it globally.
        * */

        if(isTemplated) {

            /*
            *   TODO: Check if macro has been defined already. If not, declare it. If so, declaring it.
            * */

            if(!Mox.state.getTemplates().has(this.name + "_" + this.templateType)) {
                Mox.state.getTemplates().add(this.name + "_" + this.templateType);

                Mox.logger.write("registering function " + this.name + "_" + this.templateType);

                if(Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS) == null) {
                    Mox.state.getProgram().getParentNodeOfType(NodeTypes.DEFAULT).buffer.push("declare_" + this.name + "(" + this.templateType + ")\n");
                } else {
                    Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS).buffer.push("declare_" + this.name + "(" + this.templateType + ")\n");
                }
            }

            this.name += "_" + this.templateType;
        }

        return name + "(" + buffer.getCode() + ")";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
