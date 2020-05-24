package me.gmisail.codegen;

import java.util.Stack;

public class Generator
{
    private static Stack<Context> context;
    private static int indentation;

    public static void create() {
        indentation = 0;
        context = new Stack<Context>();
    }

    public static Context currentContext() {
        return context.peek();
    }

    public static String getIndentation() {
        String output = "";

        for(int i = 0; i < indentation; i++) output += "\t";

        return output;
    }

    public static Context enterContext(Context c) {
        indentation++;
        return context.push(c);
    }

    public static Context exitContext() {
        indentation--;
        return context.pop();
    }

    public static String createSemicolon() {
        return ";\n";
    }

    public static String createBoolean(String bool) {
        if(bool.equals("true")) return "1";
        return "0";
    }

    /*
    *   Create a global variable declaration.
    * */
    public static String createVariable(String type, String templateType, String name) {
        if(type.equals("Pointer")) {
            return templateType + "* " + name;
        } else if(type.equals("Reference")) {
            return templateType + "& " + name;
        }

        return type + " " + name;
    }

    /*
    *   Set up the first "chunk" of a function declaration. So, <type> <name> (. If
    *   it is in a function, add a pointer to the parent struct and modify the function's
    *   name with a prefix (the name of the class, lowercased.) So, if the class's name
    *   is 'String' and it contains a function named 'copy', then this function will
    *   return: void string_copy(String* _string
    * */
    public static String createFunction(String type, String name) {
        String prefix = "";
        String output = "";

        if(currentContext().getType().equals(ContextTypes.CLASS) || currentContext().getType().equals(ContextTypes.MODULE)) {
            prefix = currentContext().getName() + "_";
        }

        output += prefix + name;

        return output;
    }

    public static String createFunctionParameter(String type, String name) {
        String output = "";

        if(currentContext().getType().equals(ContextTypes.CLASS)) {
            output = ", ";
        }

        output += type + " " + name;

        return output;
    }

    public static String dereference(String pointer) {
        String out = "";
        out = pointer.replace("*", "");
        return out;
    }
}
