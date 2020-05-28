package me.gmisail;

import me.gmisail.codegen.Generator;
import me.gmisail.codegen.Registry;
import me.gmisail.core.External;
import me.gmisail.core.Listener;
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
        CharStream chars = CharStreams.fromFileName("./main.mox");
        MoxLexer lexer = new MoxLexer(chars);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        MoxParser parser = new MoxParser(cts);

        Registry.create();
        Generator.create();
        External.create();

        FileWriter file = new FileWriter("./main.c");
        ParseTreeWalker.DEFAULT.walk(new Listener(parser, file), parser.program());
    }
}
