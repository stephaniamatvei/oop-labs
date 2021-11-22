package com.oop.excersise.lab7;

public class Triangle extends Figure {
    private double sideOneLength;
    private double sideTwoLength;
    private double sideThreeLength;

    public Triangle(double sideOneLength, double sideTwoLength, double sideThreeLength) {
        this.sideOneLength = sideOneLength;
        this.sideTwoLength = sideTwoLength;
        this.sideThreeLength = sideThreeLength;
    }

    @Override
    public double getArea() {
        double semiperimeter = (sideOneLength + sideTwoLength + sideThreeLength) / 2;
        return Math.sqrt(semiperimeter
                * (semiperimeter - sideOneLength)
                * (semiperimeter - sideTwoLength)
                * (semiperimeter - sideThreeLength));
    }

    @Override
    public double getPerimeter() {
        return sideOneLength + sideTwoLength + sideThreeLength;
    }

    public double getSideOneLength() {
        return sideOneLength;
    }

    public void setSideOneLength(double sideOneLength) {
        this.sideOneLength = sideOneLength;
    }

    public double getSideTwoLength() {
        return sideTwoLength;
    }

    public void setSideTwoLength(double sideTwoLength) {
        this.sideTwoLength = sideTwoLength;
    }

    public double getSideThreeLength() {
        return sideThreeLength;
    }

    public void setSideThreeLength(double sideThreeLength) {
        this.sideThreeLength = sideThreeLength;
    }
}
