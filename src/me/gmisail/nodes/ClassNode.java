package me.gmisail.nodes;

import me.gmisail.Mox;
import me.gmisail.codegen.Generator;
import me.gmisail.core.Logger;
import me.gmisail.core.Types;

import java.util.ArrayList;

public class ClassNode extends Node {

    String name;

    String templateType;
    boolean templated;

    ArrayList<VariableNode> memberVariables;
    ArrayList<FunctionNode> functions;

    public ClassNode(String name) {
        super();

        this.name = name;
        this.type = NodeTypes.CLASS;

        memberVariables = new ArrayList<VariableNode>();
        functions = new ArrayList<FunctionNode>();
    }

    public String getName() { return name; }
    public String getTemplateType() { return templateType; }

    public boolean isTemplated() { return templated; }

    public void makeTemplated(String templateType) {
        this.templateType = templateType;
        this.templated = true;
    }

    public boolean hasVariable(String name)
    {
        return getVariable(name) != null;
    }

    public VariableNode getVariable(String name)
    {
        for(int i = 0; i < memberVariables.size(); i++) {
            if(memberVariables.get(i).getName().equals(name))
                return memberVariables.get(i);
        }

        return null;
    }

    public void addVariable(VariableNode var) {
        if(hasVariable(var.name)) {
            Mox.logger.error("Redefinition of variable '" + var.name + "' in class '" + name + "'");
        } else {
            memberVariables.add(var);
        }
    }

    public ArrayList<VariableNode> getMemberVariables() { return memberVariables; }
    public void addFunction(FunctionNode func) { functions.add(func); }

    @Override
    public String code() {
        String output = "";

        /*
        *   Create a struct with all of the member variable definitions. This solution is kinda wack. So basically, we
        *   are defining a struct with name X and then making a typedef for it with the same name. This will allow
        *   us to drop the 'struct' keyword when referencing it, but it also allows the user to have references to itself
        *   within each class.
        * */

        if(isTemplated()){
            output += "#define declare_class_" + this.name + "(" + this.templateType + ") \\\n";
        }

        output += "typedef struct " + this.name;

        if(templated) output += "_##" + this.templateType + " ";

        output += " {";

        if(templated) output += "\\\n";
        else output += "\n";

        for(int i = 0; i < memberVariables.size(); i++) {
            String variableName = memberVariables.get(i).getName();

            if(!Types.exists(memberVariables.get(i).getType())) {
                /* pointer to itself. Since the name isn't defined, add a struct keyword. */
                if(memberVariables.get(i).getType().equals(this.name))
                    output += "struct ";

                if(!memberVariables.get(i).isPointer)
                    memberVariables.get(i).makePointer();
            }

            output += memberVariables.get(i).getType() + " " + variableName + ";";

            if(templated) output += "\\\n";
            else output += "\n";
        }
        output += "} " + this.name + Generator.newline();

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
        FunctionNode destroyFunc = null;

        for(int i = 0; i < functions.size(); i++) {
            /*
             *   Ensure that the class has a function with the name init.
             * */
            if(functions.get(i).getLocalName().equals("init")) {
                initFunc = functions.get(i);
            }

            if(functions.get(i).getLocalName().equals("destroy")) {
                destroyFunc = functions.get(i);
            }
        }

        if(initFunc == null)
        {
            output += "void " + name + "_init(" + name + "* self){}\n";
        }

        if(destroyFunc == null)
        {
            output += "void " + name + "_destroy(" + name + "* self){}\n";
        }

        output += name + "* " + name + "_alloc(";

        if(initFunc != null) {
            for(int i = 1; i < initFunc.getParams().size(); i++) {
                if(i > 1) output += ", ";

                output += initFunc.getParams().get(i).type + " " + initFunc.getParams().get(i).name;
            }
        }

        output += ") {\n";
        output += name + "*" + " self = malloc(sizeof(" + name + "))" + Generator.newline();
        for(int i = 0; i < memberVariables.size(); i++) {
            if(!memberVariables.get(i).getValue().getCode().equals(""))
                output += "self->" + memberVariables.get(i).getName() + " = " + memberVariables.get(i).getValue().getCode() + Generator.newline();
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

        if(initFunc != null) {
            for(int i = 1; i < initFunc.getParams().size(); i++) {              // the first value of the function declaration should be a pointer to self, which we already included. So, skip it.
                output += ", " + initFunc.getParams().get(i).name;
            }
        }

        output += ")" + Generator.newline();
        output += "return self" + Generator.newline();
        output += "}\n";

        return output;
    }
}
