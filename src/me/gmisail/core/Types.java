package me.gmisail.core;

import java.util.HashSet;
import java.util.Set;

public class Types {

    private static Set<String> builtin;

    public static void create() {
        builtin = new HashSet<String>();

        // number types
        builtin.add("int");
        builtin.add("float");
        builtin.add("double");
        builtin.add("long");
        builtin.add("short");
        builtin.add("byte");

        // character
        builtin.add("char");

        //other
        builtin.add("bool");

    }

    /*
    *   If the variable's type is not one of the primitives, then it must be a custom class.
    * */
    public static boolean exists(String name) {
        return builtin.contains(name);
    }

}
