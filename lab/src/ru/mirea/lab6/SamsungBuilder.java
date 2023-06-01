package ru.mirea.lab6;

public class SamsungBuilder implements Builder {
    Smartphone smartphone = new Smartphone();

    @Override
    public void BuildBrand() {
        smartphone.buildBrand("Samsung");
    }

    @Override
    public void SetDirector() {
        smartphone.setDirector("Ин Су Ким");
    }

    @Override
    public Smartphone GetResult() {
        return smartphone;
    }
}