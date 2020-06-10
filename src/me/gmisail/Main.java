package me.gmisail;

import me.gmisail.codegen.Generator;
import me.gmisail.codegen.Registry;
import me.gmisail.core.External;
import me.gmisail.core.Listener;
import me.gmisail.core.Types;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import me.gmisail.parser.*;

import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileWriter;
import java.io.IOException;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Mox.create();

        setup();

        Mox.state.getProgram().current().buffer.push(Generator.createInclude("stdio.h"));
        Mox.state.getProgram().current().buffer.push(Generator.createInclude("stdlib.h"));
        Mox.state.getProgram().current().buffer.push(Generator.createInclude("string.h"));

        Mox.execute("./main.mox");

        Mox.export();
    }


    /*
    *   Setup all subsystems.
    * */
    private static void setup()
    {
        Registry.create();
        Generator.create();
        External.create();
        Types.create();
    }
}
