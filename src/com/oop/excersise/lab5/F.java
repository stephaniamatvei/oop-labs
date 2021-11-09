package com.oop.excersise.lab5;

public class F extends E {
    protected String f;

    public F(String f, X x) {
        super(f, x);
        this.f = f;
    }

    @Override
    public String toString() {
        return "F {"
                + "f = '" + f
                + "'| x = " + x.toString()
                + "}\n" + super.toString();
    }
}
