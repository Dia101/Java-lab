package ru.mirea.lab1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Garry", 13);
        Dog d2 = new Dog("Dorry", 5);
        Dog d3 = new Dog("Kate");
        d3.setAge(2);
        System.out.println(d1);
        d1.contentPages();
        d2.contentPages();
        d3.contentPages();
    }
}
