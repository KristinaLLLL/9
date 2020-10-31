package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Student[] IDNumber = new Student[5];
        Scanner myScanner = new Scanner(System.in);
        IDNumber[0] = new Student("Kristina","Lopatina", 4.5);
        IDNumber[1] = new Student("Polina","Lopatina", 5.0);
        IDNumber[2] = new Student("Margorita","Cheglakova", 4);
        IDNumber[3] = new Student("Dary", "Kopcova", 4.6);
        IDNumber[4] = new Student("Vladimir","Kolomarov", 3.9);
        insertionSort(IDNumber);

        System.out.print("Введите Фамилию : ");
        String surname  = myScanner.next();
        boolean isFound = false;

        for (Student student : IDNumber) {
            if (student.surname.equals(surname)) {
                isFound = true;
                System.out.println(student.toString());
            }
        }

        if(!isFound) System.out.println("Не найдено.");


        /*try (Student student : IDNumber){
            if (surname.hasNextLine()) {
                System.out.println(file.toString());
            }
        } catch (NullPointerException n) {
            System.err.println("Такого файла не существует");
        }*/

    }
    static void insertionSort(Student[] array)
    {
        for (int l = 0; l < array.length; l++) {
            var value = array[l];
            int i = l - 1;
            for (; i >= 0; i--) {
                if (value.getR() < array[i].getR()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

}
