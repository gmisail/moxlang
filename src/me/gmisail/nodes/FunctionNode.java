package me.gmisail.nodes;

import me.gmisail.Mox;
import me.gmisail.codegen.Generator;
import me.gmisail.core.Types;

import java.util.ArrayList;

public class FunctionNode extends Node {

    private String name;
    private String localName;
    private String returnType;

    public FunctionNode(String name, String type) {
        super();

        this.name = name;
        this.type = NodeTypes.FUNCTION;
        this.returnType = type;
        this.params = new ArrayList<ParameterNode>();
    }

    public void setLocalName(String localName) { this.localName = localName; }
    public String getLocalName() { return localName; }
    public String getName() { return name; }
    public String getReturnType() { return returnType; }

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

            /*
            *   class Array<T> ...
            *
            *   function get(i : int) -> T
            *
            *   end
            *
            *   This will be true when the return type is a placeholder for the template class.
            *
            *   Macro is formatted in accordance to this web-page: http://arnold.uthar.net/index.php?n=Work.TemplatesC
            *   as well as here: http://blog.pkh.me/p/20-templating-in-c.html
            *
            * */
            if (parentTemplated && parent.getTemplateType().equals(returnType)) {
                /* SETUP FUNCTION MACRO HERE */

                
            }
        }

        String output = returnType + " " + name + "(";

        for(int i = 0; i < this.params.size(); i++) {
            if(i > 0) output += ", ";

            if(!this.params.get(i).name.equals("self") && !Types.exists(this.params.get(i).type)) {
                /*
                *   if the input is a pointer, then dereference and add another asterisk. It is kinda
                *   hacky but gets the correct result.
                * */
                output += Generator.dereference(this.params.get(i).type) + "* " + this.params.get(i).name;
            } else {
                if(this.params.get(i).type.equals("any")) {
                    output += "void*";
                } else {
                    output += this.params.get(i).type;
                }

                output += " " + this.params.get(i).name;
            }
        }

        output += ")";

        return output;
    }
}
