package com.oop.excersise.lab1.monitor;

import com.oop.excersise.lab1.monitor.Monitor;

public class Runner {

    public static void main(String[] args) {
        final var monitor1 = new Monitor("blue", 30, 20, "1920x1080");
        final var monitor2 = new Monitor("black", 40, 30, "1680x1050");
        System.out.println(monitor1.equals(monitor2));
    }
}
