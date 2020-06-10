package me.gmisail;

import me.gmisail.core.StateHandler;

public class Mox {

    public static StateHandler state;

    public static void create() {
        state = new StateHandler();
    }

    public static void loadFile() {
        // load file, recursively load all imports
    }

}
