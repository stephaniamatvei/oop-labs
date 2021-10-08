package com.oop.excersise.labtwo.box;

public class Runner {

    public static void main(String[] args) {

        final var box1 = new Box();
        System.out.println("Box1: \nArea = " + box1.getSurfaceArea() + "\nVolume = " + box1.getVolume() + "\n");

        final var box2 = new Box(5);
        System.out.println("Box2: \nArea = " + box2.getSurfaceArea() + "\nVolume = " + box2.getVolume() + "\n");

        final var box3 = new Box(5,6,7);
        System.out.println("Box3: \nArea = " + box3.getSurfaceArea() + "\nVolume = " + box3.getVolume());

    }

}
