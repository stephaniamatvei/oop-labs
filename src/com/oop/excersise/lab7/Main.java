package com.oop.excersise.lab7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Task 1: ----------");

        ArrayList<Figure> figures = new ArrayList<>();

        figures.add(new Square(12.7));
        figures.add(new Rectangle(7.7, 4.3));
        figures.add(new Triangle(3.3, 4.4, 5.5));

        System.out.println(FigureController.getBiggestArea(figures).getClass().getName());
        System.out.println(FigureController.getBiggestPerimeter(figures).getClass().getName());

        System.out.println("\n---------- Task 2: ----------");

        Figure circle = new Figure() {
            private final double radius = 7;

            @Override
            public double getArea() {
                return Math.PI * Math.pow(radius, 2);
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }
        };

        System.out.println("Circle's Area = " + circle.getArea());
        System.out.println("Circle's Perimeter = " + circle.getPerimeter());

        figures.add(circle);

        System.out.println(FigureController.getBiggestArea(figures).getClass().getName());
        System.out.println(FigureController.getBiggestPerimeter(figures).getClass().getName());
    }
}
