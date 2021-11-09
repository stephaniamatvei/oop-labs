package com.oop.excersise.lab5;

public class H extends G {
    protected String h;
    private final X x = new X("x3");

    public H(String h, X x) {
        super(h, x);
        this.h = h;
    }

    @Override
    public String toString() {
        return "H {"
                + "h = '" + h
                + "'| x = " + x
                + "}\n" + super.toString();
    }
}
