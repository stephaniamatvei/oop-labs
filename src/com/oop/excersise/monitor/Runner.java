package com.oop.excersise.monitor;

public class Runner {

    public static void main(String[] args) {
        final var monitor1 = new Monitor("blue", 30, 20, "1920x1080");
        final var monitor2 = new Monitor("black", 40, 30, "1680x1050");
        System.out.println(monitor1.equals(monitor2));
    }
}
