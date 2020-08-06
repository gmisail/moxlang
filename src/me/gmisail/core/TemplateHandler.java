package me.gmisail.core;

import me.gmisail.Mox;
import me.gmisail.codegen.Generator;
import me.gmisail.nodes.ClassNode;

import java.util.HashSet;
import java.util.Set;

public class TemplateHandler {

    Set<String> templates;
    Set<String> typedefs;

    public TemplateHandler() {
        templates = new HashSet<String>();
        typedefs = new HashSet<String>();
    }

    public void add(String node) {
        templates.add(node);
    }

    public void addTypedef(String type) {
        typedefs.add(type);
    }

    public boolean hasTypedef(String type) {
        return typedefs.contains(type);
    }

    public boolean has(String name) {
        return templates.contains(name);
    }

}
