package com.company;

import java.util.Random;

public class Student {
    private String fullName;
    private final int id;
    private final int grade;

    public Student(String fullName) {
        this.fullName = fullName;
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.grade = random.nextInt(101);
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("id: %d, grade: %d", id, grade);
    }

}
