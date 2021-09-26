package com.oop.excersise.averagemark;

import java.util.List;

public class University {
    private final String name;
    private final int foundationYear;
    private final List<Student> students;

    public University(String name, int foundationYear, List<Student> students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public List<Student> getStudents() {

        return students;
    }
}
