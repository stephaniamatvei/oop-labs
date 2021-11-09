package com.oop.excersise.lab5;

public class G extends F {
    protected String g;

    public G(String g, X x) {
        super(g, x);
        this.g = g;
    }

    @Override
    public String toString() {
        return "G {"
                + "g = '" + g
                + "'| x = " + x.toString()
                + "}\n" + super.toString();
    }
}
