package me.gmisail;

import me.gmisail.core.StateHandler;
import me.gmisail.core.VariableStack;
import me.gmisail.nodes.ClassNode;

import java.util.ArrayList;

public class Mox {

    public static StateHandler state;
    public static VariableStack variables;
    public static ArrayList<ClassNode> classes;

    public static void create() {
        state = new StateHandler();
        variables = new VariableStack();
        classes = new ArrayList<ClassNode>();
    }

    public static void loadFile() {
        // load file, recursively load all imports
    }

}
