package me.gmisail.nodes;

import java.util.ArrayList;

public class ClassNode extends Node {

    String name;
    ArrayList<VariableNode> memberVariables;

    public ClassNode(String name) {
        super();

        this.name = name;
        this.type = NodeTypes.CLASS;

        memberVariables = new ArrayList<VariableNode>();
    }

    public void addVariable(VariableNode var) {
        memberVariables.add(var);
    }

    @Override
    public String code() {
        String output = "";

        output += "typedef struct {\n";
        for(int i = 0; i < memberVariables.size(); i++) {
            output += memberVariables.get(i).getType() + " " + memberVariables.get(i).getName() + ";\n";
        }
        output += "} " + this.name + ";\n";

        output += this.buffer.getCode();

        output += name + "* " + name + "_constructor() {\n";
        output += name + "*" + " self = malloc(sizeof(" + name + "));\n";
        for(int i = 0; i < memberVariables.size(); i++) {
            if(!memberVariables.get(i).getValue().getCode().equals(""))
                output += "self->" + memberVariables.get(i).getName() + " = " + memberVariables.get(i).getValue().getCode() + ";\n";
        }
        output += name + "_new(self);\n";
        output += "return self;\n";
        output += "}\n";

        return output;
    }
}
