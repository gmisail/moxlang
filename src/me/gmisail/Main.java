package me.gmisail;

import me.gmisail.codegen.Generator;
import me.gmisail.codegen.Registry;
import me.gmisail.core.External;
import me.gmisail.core.Logger;
import me.gmisail.core.Types;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        setup();

        Mox.create(args);
        Mox.cli.run();

        if(Mox.cli.getActiveCommand().equals("build")) {
            Mox.state.getProgram().current().buffer.push(Generator.createInclude("stdio.h"));
            Mox.state.getProgram().current().buffer.push(Generator.createInclude("stdlib.h"));
            Mox.state.getProgram().current().buffer.push(Generator.createInclude("string.h"));

            Mox.execute("./" + Mox.cli.getActiveFile());

            Mox.export();
        } else {
            Mox.logger.error("Unrecognized or unimplemented command.");
        }
    }


    /*
    *   Setup all subsystems.
    * */
    private static void setup() {
        Registry.create();
        Generator.create();
        External.create();
        Types.create();
    }
}
