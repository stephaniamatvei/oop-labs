package com.oop.excersise.lab8;

public class Parallelepiped implements GeometricBody {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return 2 * (length * height + width * height + length * width);
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
