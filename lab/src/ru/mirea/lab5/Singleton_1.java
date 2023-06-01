package ru.mirea.lab5;

public class Singleton_1 {
    @SuppressWarnings("InstantiationOfUtilityClass")
    private static final Singleton_1 INSTANCE = new Singleton_1();

    private Singleton_1() {}

    public static Singleton_1 getInstance() {
        return INSTANCE;
    }
}