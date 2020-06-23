package me.gmisail.nodes;

import me.gmisail.codegen.Buffer;

public class VariableNode extends Node {

    String returnType;
    String templateType;

    String name;

    /*
    *   Is this variable a pointer?     e.g.         Vector* vec...
    * */
    boolean isPointer = false;

    /*
     *  Does this variable belong to a class?       e.g.            vec.x, vec.y, etc.
     */
    boolean isMemberVariable = false;

    /*
    *  Is this variable automatically destroyed?
    */
    boolean isAutomaticallyDestroyed = false;

    /*
    *   Does this variable have a template type?
    * */
    boolean isTemplated = false;

    int scope = 0;

    public VariableNode(String name, String type) {
        this.name = name;
        this.type = NodeTypes.VARIABLE;
        this.returnType = type;
        this.templateType = "void*";
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

    public void makeTemplated(String templateType) {
        this.isTemplated = true;
        this.templateType = templateType;
    }

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

    public String getTemplateType() { return templateType; }
}
