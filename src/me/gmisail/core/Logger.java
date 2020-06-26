package me.gmisail.core;

public class Logger {

    public Logger(){

    }

    public void error(String message) {
        System.out.println("[moxc](E) " + message);
    }

    public void warn(String message) {
        System.out.println("[moxc](W) " + message);
    }

    public void write(String message) {
        System.out.println("[moxc] " + message);
    }

    public void list(String[] messages) {
        for(int i = 0; i < messages.length; i++) {
            System.out.println(" - " + messages[i]);
        }
    }
}
