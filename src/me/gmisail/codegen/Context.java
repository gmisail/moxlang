package me.gmisail.codegen;

public class Context {

    private String name;
    private ContextTypes type;

    public Context(String name, ContextTypes type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public ContextTypes getType() {
        return type;
    }

}
