package com.oop.excersise.lab5;

public class B extends A {
    protected String b;

    public B(String b, X x) {
        super(b, x);
        this.b = b;
    }

    @Override
    public String toString() {
        return "B {"
                + "b = '" + b + '\''
                + "'| x = " + x.toString()
                + "}\n" + super.toString();
    }
}
