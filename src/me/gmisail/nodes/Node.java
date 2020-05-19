package me.gmisail.nodes;

import me.gmisail.codegen.Buffer;

import java.util.ArrayList;

public class Node {

    protected ArrayList<ParameterNode> params;

    public Buffer buffer;
    public NodeTypes type;

    public Node() {
        buffer = new Buffer();
        type = NodeTypes.DEFAULT;
    }

    public void addParam(String name, String type) {
        this.params.add(new ParameterNode(name, type));
    }
    public String code(){
        return "";
    }
}
