package me.gmisail.core;

import java.util.HashMap;
import java.util.HashSet;

public class ImportHandler  {

    private HashSet<String> imports;

    public ImportHandler() {
        imports = new HashSet<String>();
    }

    public boolean addImport(String filename) {
        return imports.add(filename);
    }

}
