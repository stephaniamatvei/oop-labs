package com.oop.excersise.lab5;

public class C extends B {
    protected String c;

    public C(String c, X x) {
        super(c, x);
        this.c = c;
    }

    @Override
    public String toString() {
        return "C {"
                + "c = '" + c + '\''
                + "'| x = " + x.toString()
                + "}\n" + super.toString();
    }
}
