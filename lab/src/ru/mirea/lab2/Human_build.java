package ru.mirea.lab2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.Optional;
import java.lang.String;

public class Human_build {
    static Human[] HumanList = new Human[10];

    static  LocalDate data_counter = LocalDate.of(2000, 6, 24);


    public static void main(String[] args) {
        HumanList[0] = new Human("Alice", "Brown", LocalDate.of(2005, 11, 8) , 60);
        HumanList[1] = new Human( "Egor", "Abrashov", LocalDate.of(2001, 10, 22), 73);
        HumanList[2] = new Human( "Emma", "Kim", LocalDate.of(2007, 5, 29), 55);
        HumanList[3] = new Human( "Olivia", "Wilson", LocalDate.of(2008, 3, 8), 48);
        HumanList[4] = new Human( "Charlotte", "Jones", LocalDate.of(1990, 2, 12), 50);
        HumanList[5] = new Human( "Noah", "Lewis", LocalDate.of(1991, 7, 8), 65);
        HumanList[6] = new Human( "Liam", "Clark", LocalDate.of(1992, 1, 13), 75);
        HumanList[7] = new Human( "Oliver", "Tree", LocalDate.of(1993, 9, 5), 80);
        HumanList[8] = new Human( "James", "Lee", LocalDate.of(1994, 6, 28), 86);
        HumanList[9] = new Human( "William", "Harris", LocalDate.of(1995, 10, 3), 90);

        Stream<Human> FirstStream = Stream.of(HumanList[0], HumanList[1], HumanList[2],
                HumanList[3], HumanList[4],HumanList[5],HumanList[6],HumanList[7],HumanList[8],HumanList[9]);
        Stream<Human> SecondStream = Stream.of(HumanList[0], HumanList[1], HumanList[2],
                HumanList[3], HumanList[4],HumanList[5],HumanList[6],HumanList[7],HumanList[8],HumanList[9]);
        Stream<Human> ThirdStream = Stream.of(HumanList[0], HumanList[1], HumanList[2],
                HumanList[3], HumanList[4],HumanList[5],HumanList[6],HumanList[7],HumanList[8],HumanList[9]);
        Optional<Integer> sum = Stream.of(HumanList[0].getAge(), HumanList[1].getAge(), HumanList[2].getAge(),
                HumanList[3].getAge(), HumanList[4].getAge(),HumanList[5].getAge(),HumanList[6].getAge(),
                        HumanList[7].getAge(),HumanList[8].getAge(),HumanList[9].getAge())
                .reduce((a, b) -> a + b);

        System.out.println("First name sort:\n");
        FirstStream.sorted(new FirstNameComparator())
                .forEach(p->System.out.println(p.toString()));
        System.out.println("\n-------------------------------------------------------------\n");

        System.out.println("Filter birthday:\n");
        SecondStream.filter(p->p.getBirthDate().isBefore(data_counter)).forEach(p->System.out.println(p.toString()));

        System.out.println("\n-------------------------------------------------------------\n");

        System.out.println("Last name sort:\n");
        ThirdStream.sorted(new LastNameComparator())
                .forEach(p->System.out.println(p.toString()));

        System.out.println("\nSum of age:\n");
        System.out.println(sum);

        String s = sum.toString().replaceAll("[0-9]", "");

    }



}


class FirstNameComparator implements Comparator<Human> {

    public int compare(Human a, Human b) {

        return a.getFirstName().toUpperCase().compareTo(b.getFirstName().toUpperCase());
    }
}

class LastNameComparator implements Comparator<Human> {

    public int compare(Human a, Human b) {

        return a.getLastName().toUpperCase().compareTo(b.getLastName().toUpperCase());
    }
}