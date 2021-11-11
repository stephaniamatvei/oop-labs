package com.oop.excersise.lab1.averagemark;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {
    public static void main(String... args) {
        final var universities = List.of(
                new University("UTM", 1964, generateStudents()),
                new University("MIT", 1861, generateStudents()),
                new University("Harvard", 1636, generateStudents())
        );

        universities.forEach((u) -> {
            final var students = u.getStudents();
            final var averageMark = calculateStudentsAverageMark(students);
            final var log = String.format(
                    "University: %s\t\tFoundation Year: %d\t\tAverage Mark: %,.2f",
                    u.getName(),
                    u.getFoundationYear(),
                    averageMark
            );
            System.out.println(log);
        });

        final var average = calculateUniversitiesAverageMark(universities);
        System.out.println(average);
    }

    private static List<Student> generateStudents() {
        return IntStream.range(0, 5).mapToObj((n) -> {
            final var firstName = String.format("Name-%n");
            final var lastName = String.format("Surname-%n");
            return new Student(firstName, lastName, 20, generateRandomMark());
        }).collect(Collectors.toList());

    }

    private static double generateRandomMark() {
        final var r = new Random();
        final var min = 1;
        final var max = 10;
        return min + (max - min) * r.nextDouble();
    }

    private static double calculateUniversitiesAverageMark(List<University> universities) {
        return universities
                .stream()
                .mapToDouble((u) -> calculateStudentsAverageMark(u.getStudents()))
                .average()
                .orElse(0);
    }

    private static double calculateStudentsAverageMark(List<Student> students) {
        return students
                .stream()
                .mapToDouble(Student::getCourseMark)
                .average()
                .orElse(0.0);
    }
}
