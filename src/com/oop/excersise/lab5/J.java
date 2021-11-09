package com.oop.excersise.lab5;

public class J extends I {
    protected String j;

    public J(String j, X x) {
        super(j, x);
        this.j = j;
    }

    @Override
    public String toString() {
        return "J {"
                + "j = '" + j
                + "}\n" + super.toString();
    }
}
