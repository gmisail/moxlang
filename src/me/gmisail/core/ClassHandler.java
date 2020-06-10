package me.gmisail.core;

import me.gmisail.Mox;
import me.gmisail.codegen.Generator;
import me.gmisail.nodes.ClassNode;

import java.util.ArrayList;

public class ClassHandler {

    ArrayList<ClassNode> classes;

    public ClassHandler() {
        classes = new ArrayList<ClassNode>();
    }

    public void add(ClassNode node) {
        classes.add(node);
    }

    public ClassNode find(String name) {
        name = Generator.dereference(name);

        for(int i = 0; i < classes.size(); i++)
        {
            if(classes.get(i).getName().equals(name))
            {
                return classes.get(i);
            }
        }

        return null;
    }

}
