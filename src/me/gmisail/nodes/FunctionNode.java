package me.gmisail.nodes;

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
