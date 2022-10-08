package ru.mirea.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> arrS = new ArrayList<Student>(10);
        String[] arrN = {"Бегун Диана", "Белослудцев Егор", "Ботоев Вячеслав", "Гусейнов Рамал", "Державин Владислав",
                "Доронин Константин", "Журавлев Константин", "Зенченко Илья", "Казанцев Никита", "Королёва Анастасия"};
        for (int j = 0; j < 10; j++) {
            Student obj = new Student(arrN[j], (int)(Math.random()*100), 5);
            arrS.add(obj);
            System.out.println(obj);
        }
        System.out.println();
        for (int left = 0; left < arrS.size(); left++) {
            // Вытаскиваем значение элемента
            int value = arrS.get(left).iDNumber;
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < arrS.get(i).iDNumber) {
                    Collections.swap(arrS, i+1, i);
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
        }
        for (int i = 0; i < arrS.size(); i++) {
            System.out.println(arrS.get(i));
        }
    }
}
