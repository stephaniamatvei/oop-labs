package com.oop.excersise.lab8;

public class Sphere implements GeometricBody {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4/3F * Math.PI * Math.pow(radius, 3);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
