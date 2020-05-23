package me.gmisail.nodes;

import me.gmisail.core.Logger;

import java.util.ArrayList;

public class ClassNode extends Node {

    String name;
    ArrayList<VariableNode> memberVariables;
    ArrayList<FunctionNode> functions;

    public ClassNode(String name) {
        super();

        this.name = name;
        this.type = NodeTypes.CLASS;

        memberVariables = new ArrayList<VariableNode>();
        functions = new ArrayList<FunctionNode>();
    }

    public void addVariable(VariableNode var) {
        memberVariables.add(var);
    }
    public void addFunction(FunctionNode func) { functions.add(func); }

    @Override
    public String code() {
        String output = "";

        /*
        *   Create a struct with all of the member variable definitions
        * */
        output += "typedef struct {\n";
        for(int i = 0; i < memberVariables.size(); i++) {
            output += memberVariables.get(i).getType() + " " + memberVariables.get(i).getName() + ";\n";
        }
        output += "} " + this.name + ";\n";

        /*
        *   Class methods
        * */
        output += this.buffer.getCode();

        /*
        *   Create an implicit constructor which allocates space for the class,
        *   assigns all variables to their default types, and then
        *   calls the init function. Then, it returns a pointer to the newly created
        *   class instance.
        * */

        FunctionNode initFunc = null;

        for(int i = 0; i < functions.size(); i++)
        {
            /*
             *   Ensure that the class has a function with the name init.
             * */
            if(functions.get(i).getLocalName().equals("init")) {
                initFunc = functions.get(i);
                break;
            }
        }

        output += name + "* " + name + "_alloc(";

        if(initFunc != null) {
            for(int i = 1; i < initFunc.getParams().size(); i++) {
                if(i > 1) output += ", ";

                output += initFunc.getParams().get(i).type + " " + initFunc.getParams().get(i).name;
            }
        }

        output += ") {\n";
        output += name + "*" + " self = malloc(sizeof(" + name + "));\n";
        for(int i = 0; i < memberVariables.size(); i++) {
            if(!memberVariables.get(i).getValue().getCode().equals(""))
                output += "self->" + memberVariables.get(i).getName() + " = " + memberVariables.get(i).getValue().getCode() + ";\n";
        }
        output += name + "_init" + "(self";
        
        for(int i = 0; i < functions.size(); i++)
        {
            /*
            *   Ensure that the class has a function with the name init.
            * */
            if(functions.get(i).getLocalName().equals("init")) {
                initFunc = functions.get(i);
                break;
            }
        }

        if(initFunc == null) {
            Logger.error("Class '" + this.name + "' does not have an initializer function (init).");
        } else {
            for(int i = 1; i < initFunc.getParams().size(); i++) {              // the first value of the function declaration should be a pointer to self, which we already included. So, skip it.
                output += ", " + initFunc.getParams().get(i).name;
            }
        }

        output += ");\n";
        output += "return self;\n";
        output += "}\n";

        return output;
    }
}
