package ru.mirea.lab6;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void Construct() {
        builder.BuildBrand();
        builder.SetDirector();
    }
}
