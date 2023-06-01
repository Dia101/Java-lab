package ru.mirea.lab5;

public class Singleton_2 {
    private static Singleton_2 INSTANCE = null;
    private Singleton_2() {}

    @SuppressWarnings("InstantiationOfUtilityClass")
    public static synchronized Singleton_2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton_2();
        }
        return INSTANCE;
    }
}