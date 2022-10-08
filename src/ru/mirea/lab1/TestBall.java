package ru.mirea.lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball ba1 = new Ball("Red", 400);
        Ball ba2 = new Ball("Pink", 700);
        Ball ba3 = new Ball("Black");
        ba3.setWeight(80);
        System.out.println(ba1);
        ba1.contentPages();
        ba2.contentPages();
        ba3.contentPages();
    }
}
