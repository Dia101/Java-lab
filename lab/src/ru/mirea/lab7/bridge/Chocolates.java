package ru.mirea.lab7.bridge;

public class Chocolates implements Filling{
    @Override
    public void fill() {
        System.out.print("Вкус шоколада ");
    }
}
