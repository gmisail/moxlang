package me.gmisail.codegen;

/*
*
*   Buffer is a utility class (for readability, mostly) that creates a blank string and allows the user
*   to push strings to the end. Provides the core functionality for the code generation.
*
* */

public class Buffer {

    private String code;

    public Buffer() {
        this.code = "";
    }

    public void push(String code) {
        this.code += code;
    }

    public void erase() { this.code = ""; }

    public void cut(int index) {
        code = code.substring(0, index);
    }

    public String getCode() { return code; };

}
