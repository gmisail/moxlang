package me.gmisail.nodes;

public class ArrayAccessNode extends Node {

    String name;
    String offset;
    boolean hasName;

    public ArrayAccessNode() {
        super();

        this.type = NodeTypes.ARRAY_ACCESS;
        this.hasName = false;
    }

    /*
    *   Convert buffer to the name attribute
    * */
    public void saveName() {
        if(this.hasName) return;

        this.name = this.buffer.getCode();
        this.hasName = true;
        this.buffer.erase();
    }

    public void saveOffset() {
        this.offset = this.buffer.getCode();
        this.buffer.erase();
    }

    @Override
    public String code() {
        this.saveOffset();

        return this.name + "[" + this.offset + "]";
    }

}
