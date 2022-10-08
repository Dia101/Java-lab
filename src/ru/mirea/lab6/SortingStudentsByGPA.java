package ru.mirea.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingStudentsByGPA {


    public void quickSort(List<Student> arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private int partition(List<Student> arr, int begin, int end) {
        double pivot = arr.get(end).mark;
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr.get(j).mark <= pivot) {
                i++;
                Collections.swap(arr, i, j);
            }
        }

        Collections.swap(arr, i+1, end);

        return i+1;
    }

    public static void main(String[] args) {
        List<Student> arrS = new ArrayList<Student>(10);
        String[] arrN = {"Бегун Диана", "Белослудцев Егор", "Ботоев Вячеслав", "Гусейнов Рамал", "Державин Владислав",
                "Доронин Константин", "Журавлев Константин", "Зенченко Илья", "Казанцев Никита", "Королёва Анастасия"};
        for (int j = 0; j < 10; j++) {
            Student obj = new Student(arrN[j], (int)(Math.random()*100), Math.random()*4+2);
            arrS.add(obj);
            System.out.println(obj);
        }
        System.out.println();

        SortingStudentsByGPA bn = new SortingStudentsByGPA();

        bn.quickSort(arrS, 0, arrS.size()-1);

        for (int i = 0; i < arrS.size(); i++) {
            System.out.println(arrS.get(i));
        }
    }
}
