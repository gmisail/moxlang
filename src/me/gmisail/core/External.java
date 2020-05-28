package me.gmisail.core;

import java.util.ArrayList;

import me.gmisail.nodes.VariableNode;

public class External {

    private static ArrayList<VariableNode> variables;

    public static void create() {
        variables = new ArrayList<VariableNode>();
    }

    public static void addVariable(VariableNode node) { variables.add(node); }

    public static boolean variableExists(String name) {
        for(int i = 0; i < variables.size(); i++) {
            if(variables.get(i).getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

}
