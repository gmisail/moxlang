package me.gmisail.codegen;

import java.util.HashSet;
import java.util.Set;

/*
*   In order to maintain a record of what is going on in our code, we use a Registry, which
*   simply maintains a record of what has been declared so far. Thus, we can check if a function / variable / class / etc. has
*   already been declared.
* */

public class Registry
{
    private static Set<String> variables;
    private static Set<String> modules;
    private static Set<String> classes;
    private static Set<String> functions;

    public static void create()
    {
        variables = new HashSet<String>();
        modules = new HashSet<String>();
        classes = new HashSet<String>();
        functions = new HashSet<String>();
    }

    public static boolean saveVariable(String name)
    {
        if(variables.contains(name))
        {
            return false;
        }

        variables.add(name);

        return true;
    }

    public static boolean saveModule(String name)
    {
        if(modules.contains(name))
        {
            return false;
        }

        modules.add(name);

        return true;
    }

    public static boolean saveFunction(String name)
    {
        if(functions.contains(name))
        {
            return false;
        }

        functions.add(name);

        return true;
    }

}
