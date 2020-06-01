package me.gmisail.nodes;

import me.gmisail.codegen.Buffer;

public class VariableNode extends Node {

    String returnType;
    String name;
    boolean isPointer = false;

    int scope = 0;

    public VariableNode(String name, String type) {
        this.name = name;
        this.type = NodeTypes.VARIABLE;
        this.returnType = type;
    }

    /*
    *   Let the variable be a pointer to the variable type
    * */
    public void makePointer() {
        isPointer = true;
        returnType += "*";
    }

    public boolean isPointer() {
        return isPointer;
    }


    public void setScope(int scope) { this.scope = scope; }
    public int getScope() { return scope; }

    public String getType() {
        return returnType;
    }

    public String getName() {
        return name;
    }

    public Buffer getValue() {
        return buffer;
    }

}
