package me.gmisail.core;

public class Logger {

    public static void error(String message) {
        System.out.println("[moxc](E) " + message);
    }

    public static void warn(String message) {
        System.out.println("[moxc](W) " + message);
    }

    public static void write(String message) {
        System.out.println("[moxc] " + message);
    }

}
