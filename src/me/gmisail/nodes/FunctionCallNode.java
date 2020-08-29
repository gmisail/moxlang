package me.gmisail.nodes;

import me.gmisail.Mox;
import me.gmisail.codegen.Buffer;
import me.gmisail.core.Types;

public class FunctionCallNode extends Node {

    private String name;

    /* tracks the number of parameters */
    private int numParams;

    private boolean isTemplated;
    private String templateType;

    private ClassNode parent;

    public FunctionCallNode(String name) {
        super();

        this.numParams = 0;
        this.type = NodeTypes.FUNCTION_CALL;
        this.name = name;
        this.isTemplated = false;
        this.templateType = "";
        this.parent = null;
    }

    public String getBaseFunction() {
        int index = name.indexOf(templateType);
        if(index != -1) {
            String functionType = "_" + templateType;
            return name.substring(0, index) + name.substring(index + functionType.length());
        }

        return name;
    }

    public void addParamCount() { numParams++; }
    public int getParamCount() {
        return numParams;
    }

    public void makeTemplated(String templateType) {
        this.isTemplated = true;
        this.templateType = templateType;
    }

    public void setParent(ClassNode node) {
        this.parent = node;
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

            Mox.logger.write("--> " + this.name);

            FunctionNode functionNode = Mox.state.getFunctions().find(getBaseFunction());

            if(functionNode != null && functionNode.getTemplateType().equals(this.templateType)) {

            } else {
                if(!Mox.state.getTemplates().has(this.name + "_" + this.templateType)) {
                    Mox.state.getTemplates().add(this.name + "_" + this.templateType);

                    if (!Types.exists(this.templateType)) {
                        if (!Mox.state.getTemplates().hasTypedef(this.templateType + "_p")) {
                            Mox.state.getTemplates().addTypedef(this.templateType + "_p");
                            Mox.state.getProgram().getParentNodeOfType(NodeTypes.DEFAULT).buffer.push("typedef " + this.templateType + "* " + this.templateType + "_p;\n");

                            this.templateType += "_p";
                        }
                    }

                    /*
                    *   I know, I know, this is disgusting.
                    * */
                    if(Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS) == null) {
                        if(parent != null) {
                            if(functionNode != null) {
                                if(functionNode.isTemplated() && parent.isTemplated() && parent.getTemplateType().equals(functionNode.getTemplateType())) {
                                    Mox.state.getProgram().getParentNodeOfType(NodeTypes.DEFAULT).buffer.push("declare_" + getBaseFunction() + "(" + this.templateType + ", " + this.templateType + ")\n");
                                } else {
                                    Mox.logger.write("defining function for " + this.name);
                                }
                            } else {
                                Mox.state.getProgram().getParentNodeOfType(NodeTypes.DEFAULT).buffer.push("declare_" + getBaseFunction() + "(" + this.templateType + ")\n");
                            }
                        } else {
                            Mox.state.getProgram().getParentNodeOfType(NodeTypes.DEFAULT).buffer.push("declare_" + getBaseFunction() + "(" + this.templateType + ")\n");
                        }
                    } else {
                        Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS).buffer.push("declare_" + getBaseFunction() + "(" + this.templateType + ")\n");
                    }
                }

                this.name += "_" + this.templateType;
            }
        }

        return this.name + "(" + buffer.getCode() + ")";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
