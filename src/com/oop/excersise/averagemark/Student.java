package com.oop.excersise.averagemark;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final double courseMark;

    public Student(String firstName, String lastName, int age, double courseMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.courseMark = courseMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getCourseMark() {
        return courseMark;
    }
}
