package me.gmisail;

import me.gmisail.core.Listener;
import me.gmisail.core.Logger;
import me.gmisail.core.StateHandler;
import me.gmisail.nodes.Node;
import me.gmisail.parser.MoxLexer;
import me.gmisail.parser.MoxParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileWriter;
import java.io.IOException;

public class Mox {

    public static StateHandler state;
    public static FileWriter file;

    public static void create() throws IOException {
        state = new StateHandler();
        file = new FileWriter("./main.c");
    }

    public static void execute(String filename) throws IOException {
        CharStream chars = CharStreams.fromFileName(filename);
        MoxLexer lexer = new MoxLexer(chars);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        MoxParser parser = new MoxParser(cts);

        ParseTreeWalker.DEFAULT.walk(new Listener(parser, file), parser.program());
    }

    public static void export() throws IOException {
        Node root = state.getProgram().pop();

        try {
            file.write(root.buffer.getCode());
            file.close();

            Process compilation = Runtime.getRuntime().exec("gcc main.c -o main");

        } catch (IOException e) {
            Logger.error("Error writing to file.");
            e.printStackTrace();
        }
    }
}
