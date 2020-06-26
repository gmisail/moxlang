package me.gmisail.core;

import java.util.ArrayList;
import java.util.HashMap;

import me.gmisail.nodes.FunctionNode;
import me.gmisail.nodes.VariableNode;

public class External {

    private static HashMap<String, VariableNode> variables;
    private static HashMap<String, FunctionNode> functions;

    public static void create() {
        variables = new HashMap<String, VariableNode>();
        functions = new HashMap<String, FunctionNode>();
    }

    public static void addVariable(VariableNode node) { variables.put(node.getName(), node); }
    public static boolean variableExists(String name) { return variables.get(name) != null; }

    public static void addFunction(FunctionNode node) { functions.put(node.getName(), node); }
    public static boolean functionExists(String name) { return functions.get(name) != null; }

}
