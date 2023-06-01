package ru.mirea.lab6;

public class Smartphone {
    private String brand;
    private String director;

    public void buildBrand(String brand) {
        this.brand = brand;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void print() {
        System.out.println(director + " директор компании " + brand);
    }
}
