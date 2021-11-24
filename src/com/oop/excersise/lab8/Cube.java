package com.oop.excersise.lab8;

public class Cube implements GeometricBody {
    private double edgeLength;

    public Cube(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public double getSurface() {
        return 6 * Math.pow(edgeLength, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(edgeLength, 3);
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }
}
