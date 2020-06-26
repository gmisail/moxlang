package me.gmisail;

import me.gmisail.core.Logger;

public class CLI {

    private String[] commands = {
            "build <file.mox>   =>  compile project using default settings",
            "run <file.mox>     =>  compile & run project using default settings"
    };

    private String[] arguments;

    private String activeCommand = "";
    private String activeFile = "";

    public CLI(String[] arguments) {
        this.arguments = arguments;
    }

    public boolean isValid() {
        return this.arguments.length > 0;
    }

    public void run() {
        if(!isValid()) {
            Mox.logger.write("Mox Programming Language");
            Mox.logger.list(commands);

            return;
        }

        activeCommand = arguments[0];

        if(arguments.length > 1)
            activeFile = arguments[1];
    }

    public String getActiveCommand() {
        return activeCommand;
    }

    public String getActiveFile() {
        return activeFile;
    }
}
