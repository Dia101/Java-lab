package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Home", 20);
        Book b2 = new Book("Saturday", 7);
        Book b3 = new Book("Winter");
        b3.setPage(80);
        System.out.println(b1);
        b1.contentPages();
        b2.contentPages();
        b3.contentPages();
    }
}
