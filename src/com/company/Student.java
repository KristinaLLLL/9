package com.company;

public class Student {
    public String name;
    public String surname;
    public double r;

    Student(String name, String surname, double r) {
        this.name = name;
        this.surname = surname;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", r=" + r +
                '}';
    }
}
