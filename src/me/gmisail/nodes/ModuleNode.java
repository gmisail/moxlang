package me.gmisail.nodes;

import java.util.ArrayList;

public class ModuleNode extends Node{

    String name;
    ArrayList<VariableNode> memberVariables;

    public ModuleNode(String name) {
        super();

        memberVariables = new ArrayList<VariableNode>();

        this.name = name;
        this.type = NodeTypes.MODULE;
    }

    public void addVariable(VariableNode var) {
        memberVariables.add(var);
    }

    @Override
    public String code() {
        String output = "";

        for(int i = 0; i < memberVariables.size(); i++) {
            output += memberVariables.get(i).getType() + " " + name + "_" + memberVariables.get(i).getName();

            if(!memberVariables.get(i).getValue().getCode().equals(""))
                output += " = " + memberVariables.get(i).getValue().getCode();

            output += ";\n";
        }

        output += this.buffer.getCode();

        return output;
    }
}
