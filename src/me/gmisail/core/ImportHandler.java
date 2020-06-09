package me.gmisail.core;

import me.gmisail.parser.MoxBaseListener;
import me.gmisail.parser.MoxParser;

public class ImportHandler extends MoxBaseListener {

    @Override
    public void enterImportStatement(MoxParser.ImportStatementContext ctx) {
        super.enterImportStatement(ctx);

        System.out.println("importing " + ctx.STRING().getText());
    }

}
