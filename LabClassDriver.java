package com.company;

public class LabClassDriver {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        LabClass labClass = new LabClass();

        System.out.println("Given array:");
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Name " + i + 1);
            System.out.print(students[i].getGrade() + " ");
        }
        labClass.sortStudents(students);
        System.out.println("\nSorted array:");
        for (Student student : students)
            System.out.print(student.getGrade() + " ");
        System.out.println();
        labClass.findStudent(students, "");
        labClass.findStudent(students, "some name");
    }
}
