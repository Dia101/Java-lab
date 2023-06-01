package ru.mirea.lab2;

import java.time.Period;
import java.time.LocalDate;

public class Human {
    public
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;

    Human (String firstName, String
            lastName, LocalDate birthDate, int weight){
        this.age = compareDate(birthDate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }
    private

    int compareDate(LocalDate first)
    {
        LocalDate last = LocalDate.now();
        return Period.between(first, last).getYears();
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + " " + age + " years old, " + birthDate + ", " + weight + "kg";
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
