package me.gmisail.nodes;

import me.gmisail.Mox;
import me.gmisail.codegen.Generator;
import me.gmisail.core.Types;

import java.util.ArrayList;

public class FunctionNode extends Node {

    private String name;
    private String localName;
    private String returnType;

    private boolean isTemplated;
    private String templateType;

    public FunctionNode(String name, String type) {
        super();

        this.name = name;
        this.type = NodeTypes.FUNCTION;
        this.returnType = type;
        this.params = new ArrayList<ParameterNode>();
        this.isTemplated = false;
        this.templateType = "";
    }

    public void setLocalName(String localName) { this.localName = localName; }
    public String getLocalName() { return localName; }
    public String getName() { return name; }
    public String getReturnType() { return returnType; }

    public void makeTemplated(String templateType) {
        this.isTemplated = true;

        setTemplateType(templateType);
    }

    public boolean isTemplated() {
        return isTemplated;
    }

    public void setTemplateType(String templateType){ this.templateType = templateType; }
    public String getTemplateType() { return templateType; }

    @Override
    public String code() {

        /*
        *   Okay, so here is the lowdown:
        *
        *   First, we are going to check if it is a ~templated~ function. In which case, we will generate the
        *   function as a macro, as opposed to a normal function. Before the function CALL however, we will need to
        *   #define TYPE WhateverType to ensure that the compiler is using the correct type.
        *
        *   If it is not, then we will check if it is a class function. If so, generate as normal. Same for normal functions.
        * */

        ClassNode parent = (ClassNode) Mox.state.getProgram().getParentNodeOfType(NodeTypes.CLASS);
        boolean parentTemplated = false;

        if(parent != null) {
            parentTemplated = parent.isTemplated();

            if(parentTemplated) {
                this.params.get(0).type = Generator.dereference(this.params.get(0).type) + "_##" + parent.getTemplateType() + "*";
            }
        }

        String output = "";

        if(isTemplated) {
            if(parentTemplated && !templateType.equals(parent.getTemplateType())) {
                output += "#define declare_" + name + "(" + parent.getTemplateType() + ", " + templateType + ") \\\n";
                output += returnType + " " + parent.getName() + "_##" + parent.getTemplateType() + "##_" + localName + "_##" + templateType + "(";
            } else {
                output += "#define declare_" + name + "(" + templateType + ") \\\n";
                output += returnType + " " + name + "_##" + templateType + "(";
            }
        } else {
            output += returnType + " " + name + "(";
        }

        for(int i = 0; i < this.params.size(); i++) {
            if(i > 0) output += ", ";

            String paramType = this.params.get(i).type;

            if(paramType.equals(templateType)) {
                paramType = templateType;
            }

            if(!this.params.get(i).name.equals("self") && !Types.exists(this.params.get(i).type)) {
                /*
                *   if the input is a pointer, then dereference and add another asterisk. It is kinda
                *   hacky but gets the correct result. As far as I know at least...
                * */
                if(!isTemplated)
                    output += Generator.dereference(paramType) + "* " + this.params.get(i).name;
                else
                    output += paramType + " " + this.params.get(i).name;

            } else {
                if(this.params.get(i).type.equals("any")) {
                    output += "void*";
                } else {
                    output += paramType;
                }

                output += " " + this.params.get(i).name;
            }
        }

        output += ")";

        if(isTemplated)
            output += " \\";

        return output;
    }
}
