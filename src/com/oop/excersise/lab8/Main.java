package com.oop.excersise.lab8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricBody> geometricBodies = new ArrayList<>();

        geometricBodies.add(new Sphere(27));
        geometricBodies.add(new Cube(12.7));
        geometricBodies.add(new Parallelepiped(25.5, 10.1, 14.4));

        GeometricBody biggestSurface = GeometricBodyController.getBiggestSurface(geometricBodies);
        GeometricBody biggestVolume = GeometricBodyController.getBiggestVolume(geometricBodies);

        System.out.println("Biggest surface: " + biggestSurface.getClass().getName());
        System.out.println("Biggest volume: " + biggestVolume.getClass().getName());
    }
}
