package me.gmisail.core;

import me.gmisail.Mox;
import me.gmisail.codegen.Generator;
import me.gmisail.nodes.ClassNode;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassHandler {

    HashMap<String, ClassNode> classes;

    public ClassHandler() {
        classes = new HashMap<String, ClassNode>();
    }

    public void add(ClassNode node) {
        classes.put(node.getName(), node);
    }

    public ClassNode find(String name) {
        name = Generator.dereference(name);

        return classes.get(name);
    }

}
