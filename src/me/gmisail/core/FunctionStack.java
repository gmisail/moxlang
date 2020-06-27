package me.gmisail.core;

import me.gmisail.Mox;
import me.gmisail.codegen.Scope;
import me.gmisail.nodes.VariableNode;

import java.util.Iterator;
import java.util.Map;

public class FunctionStack extends VariableStack {

    public FunctionStack() {
        super();
    }

    /*
    *   Pop functions that do NOT belong to a class. If they do, then they do not go
    *   out of scope (since most of the time, they are accessed outside of their class
    *   definition.)
    * */
    @Override
    public Scope exitScope() {
        Scope poppedScope = stack.pop();

        scope--;

        Iterator iterator = poppedScope.getVariables().entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry element = (Map.Entry) iterator.next();

            VariableNode variable = (VariableNode) element.getValue();

            if(variable.isMemberVariable())
                add(variable);
        }

        return poppedScope;
    }

}
