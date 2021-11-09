package com.oop.excersise.lab5;

public class I extends H {
    protected String i;

    public I(String i, X x) {
        super(i, x);
        this.i = i;
    }

    @Override
    public String toString() {
        return "I {"
                + "i = '" + i
                + "}\n" + super.toString();
    }
}
