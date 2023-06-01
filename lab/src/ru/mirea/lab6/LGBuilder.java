package ru.mirea.lab6;

public class LGBuilder implements Builder {
    Smartphone smartphone = new Smartphone();

    @Override
    public void BuildBrand() {
        smartphone.buildBrand("LG");
    }

    @Override
    public void SetDirector() {
        smartphone.setDirector("Ку Кван Мо");
    }

    @Override
    public Smartphone GetResult() {
        return smartphone;
    }
}