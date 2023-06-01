package ru.mirea.lab6;

public class MilkCakeMaker implements CakeMaker {
    @Override
    public Cake factoryMethod() {
        return new MilkCake();
    }
}
