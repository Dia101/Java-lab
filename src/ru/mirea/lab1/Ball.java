package ru.mirea.lab1;

public class Ball {
    private String color;
    private double weight;

    public Ball(String n, double w){
        color = n;
        weight = w;
    }
    public Ball(String c){
        color = c;
        weight = 0;
    }
    public Ball(){
        color = "Blue";
        weight = 0;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public double getWeight(double weight){
        return weight;
    }
    public String toString(){
        return this.color+" weighs "+this.weight+" g";
    }
    public void contentPages(){
        System.out.println(color+" weighs "+(weight/1000)+"kg");
    }
}
