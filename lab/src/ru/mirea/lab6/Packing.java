package ru.mirea.lab6;

public class Packing implements Cloneable {
    public void print() {
        System.out.println("Новый объект");
    }

    @Override
    public Packing clone() throws CloneNotSupportedException {
        return (Packing) super.clone();
    }
}