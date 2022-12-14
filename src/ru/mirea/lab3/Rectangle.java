package ru.mirea.lab3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this.length = 5;
        this.width = 5;
        this.color = "white";
        this.filled=false;
    }

    public Rectangle(double width,double length) {
        this.length = length;
        this.width = width;
        this.color = "white";
        this.filled=false;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
