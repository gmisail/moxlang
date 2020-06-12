package me.gmisail.nodes;

import me.gmisail.codegen.Buffer;

public class VariableNode extends Node {

    String returnType;
    String name;

    /*
    *   Is this variable a pointer?     e.g.         Vector* vec...
    * */
    boolean isPointer = false;

    /*
     *  Does this variable belong to a class?       e.g.            vec.x, vec.y, etc.
     */
    boolean isMemberVariable = false;

    boolean isAutomaticallyDestroyed = false;

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

    public void makeMemberVariable() {
        isMemberVariable = true;
    }
    public void makeAutomaticallyDestroyed() { isAutomaticallyDestroyed = true; }

    public boolean isPointer() {
        return isPointer;
    }
    public boolean isMemberVariable() { return isMemberVariable; }
    public boolean isAutomaticallyDestroyed(){ return isAutomaticallyDestroyed; }

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
