package me.gmisail.nodes;

import java.util.ArrayList;

public class FunctionNode extends Node {

    private String name;
    private String returnType;

    public FunctionNode(String name, String type) {
        super();

        this.name = name;
        this.type = NodeTypes.FUNCTION;
        this.returnType = type;
        this.params = new ArrayList<ParameterNode>();
    }

    @Override
    public String code() {
        String output = returnType + " " + name + "(";

        for(int i = 0; i < this.params.size(); i++) {
            if(i > 0) output += ", ";

            output += this.params.get(i).type + " " + this.params.get(i).name;
        }

        output += ")";

        return output;
    }
}
