package com.oop.excersise.lab5;

public class D extends C {
    protected String d;
    protected X x = new X("x2");

    public D(String d, X x) {
        super(d, x);
        this.d = d;
    }

    @Override
    public String toString() {
        return "D {"
                + "d = '" + d
                + "'| x = " + x.toString()
                + "}\n" + super.toString();
    }
}
