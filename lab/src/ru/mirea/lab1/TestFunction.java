package ru.mirea.lab1;
import java.util.function.Function;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestFunction {
    public static void main(String[] args) {
        int[] test1 = {2, 4, 1, 2, 1, 2, 4, 5};
        int[] test2 = {1, 3, 1};

        //Стандартный функциональный интерфейс
        Function<int[], String> function = (int[] arr) -> {
            //Удаление дубликатов в массиве
            arr = Arrays.stream(arr).distinct().toArray();
            //Сортировка массива
            Arrays.sort(arr);
            String s = Arrays.toString(arr);
            //Преобразование массива в строку, состоящую из его элементов
            String result = Arrays.stream(arr)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(""));
            return result;
        };
        System.out.println(function.apply(test1));
        System.out.println(function.apply(test2));
    }
}