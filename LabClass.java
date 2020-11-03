package com.company;

public class LabClass implements LabClassUI {
    @Override
    public void sortStudents(Student[] students) {
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.quickSort(students, 0, students.length - 1);
    }

    @Override
    public int findStudent(Student[] students, String name) {
        try {
            if (name.equals("")) throw new EmptyStringException("Name input is empty!");
            for (int i = 0; i < students.length; i++) {
                if (students[i].getFullName().equals(name)) {
                    return students[i].getId();
                }
            }
            throw new StudentNotFoundException(String.format("Student %s was not found!", name));
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.err.println(e);
        }
        return -1;
    }
}
