package com.oop.excersise.labtwo.box;

public class Box {
    private final double height;
    private final double width;
    private final double depth;

    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public Box(double size) {
        if (size <= 0)
            throw new ArithmeticException("Size should be bigger than 0");
        this.height = size;
        this.width = size;
        this.depth = size;

    }

    public Box(double height, double width, double depth) {
        if (height <= 0 || width <= 0 || depth <= 0)
            throw new ArithmeticException("Size should be bigger than 0");
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getVolume() {
        return this.height * this.width * this.depth;
    }

    public double getSurfaceArea() {
        double baseSurface = 2 * this.depth * this.width;
        double lateralSurface = 2 * this.depth * this.height + 2 * this.width * this.height;
        return baseSurface + lateralSurface;
    }

}
