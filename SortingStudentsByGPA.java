package com.company;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {
    private int partition(Student arr[], int low, int high) {
        Student pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (compare(arr[j], pivot) > 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void quickSort(Student arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public int compare(Object o1, Object o2) {
        return ((Student) o1).getGrade() - ((Student) o2).getGrade();
    }
}
