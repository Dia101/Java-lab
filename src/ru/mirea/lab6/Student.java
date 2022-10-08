package ru.mirea.lab6;

public class Student {
    public int iDNumber;
    public String name;

    public double mark;

    public Student(String n, int i, double m){
        name = n;
        iDNumber = i;
        mark = m;
    }

    @Override
    public String toString() {
        return "id: " + iDNumber + ", имя:'" + name + '\'' + ", средний балл: " + (double)(Math.round(mark*100))/100;

    }
}
