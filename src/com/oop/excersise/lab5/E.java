package com.oop.excersise.lab5;

public class E extends D {
    protected String e;

    public E(String e, X x) {
        super(e, x);
        this.e = e;
    }

    @Override
    public String toString() {
        return "E {"
                + "e = '" + e
                + "'| x = " + x.toString()
                + "}\n" + super.toString();
    }
}
