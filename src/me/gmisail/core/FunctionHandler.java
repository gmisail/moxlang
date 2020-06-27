package me.gmisail.core;

import me.gmisail.Mox;
import me.gmisail.codegen.Generator;
import me.gmisail.nodes.ClassNode;
import me.gmisail.nodes.FunctionNode;

import java.util.ArrayList;
import java.util.HashMap;

public class FunctionHandler {

    HashMap<String, FunctionNode> functions;

    public FunctionHandler() {
        functions = new HashMap<String, FunctionNode>();
    }

    public void add(FunctionNode node) {
        functions.put(node.getName(), node);
    }

    public FunctionNode find(String name) {
        return functions.get(name);
    }

}
