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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Mox {

    public static StateHandler state;
    public static FileWriter file;
    public static CLI cli;
    public static Logger logger;

    public static void create(String[] arguments) throws IOException {
        state = new StateHandler();
        file = new FileWriter(getWorkingDirectory() + "/main.c");
        cli = new CLI(arguments);
        logger = new Logger();
    }

    public static String getFileType(String filename) throws IOException {
        if(new File(getWorkingDirectory() + "/" + filename).isFile()) {
            filename = getWorkingDirectory() + "/" + filename;
        }

        return getFileExtension(filename);
    }

    public static void execute(String filename) throws IOException {
        if(new File(getWorkingDirectory() + "/" + filename).isFile()) {
            filename = getWorkingDirectory() + "/" + filename;
        } else if(new File(filename).isFile() == false) {
            Mox.logger.error("Cannot locate file '" + filename + "'");

            return;
        }

        CharStream chars = CharStreams.fromFileName(filename);
        MoxLexer lexer = new MoxLexer(chars);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        MoxParser parser = new MoxParser(cts);

        ParseTreeWalker.DEFAULT.walk(new Listener(parser, file), parser.program());
    }

    public static String getLocality(String filename) throws IOException {
        if(new File(getWorkingDirectory() + "/" + filename).isFile()) {
            return "local";
        }

        return "global";
    }

    public static void export() {
        Node root = state.getProgram().pop();

        try {
            file.write(root.buffer.getCode());
            file.close();
        } catch (IOException e) {
            Mox.logger.error("Error writing to file.");
            e.printStackTrace();
        }
    }

    private static String getWorkingDirectory() {
        return System.getProperty("user.dir");
    }

    private static String getFileExtension(String fileName) {
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}
