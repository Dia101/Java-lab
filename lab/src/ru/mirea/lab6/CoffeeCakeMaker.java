package ru.mirea.lab6;

public class CoffeeCakeMaker implements CakeMaker {
    @Override
    public Cake factoryMethod() {
        return new CoffeeCake();
    }
}