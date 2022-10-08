package ru.mirea.lab3;

public class Square extends Rectangle{
    public Square() {
        super.width=7;
        super.length=7;
        super.color="BLACK";
        super.filled=true;
    }
    public Square(double side) {
        super.width=side;
        super.length=side;
        super.color="BLACK";
        super.filled=true;
    }

    public Square(String color, boolean filled, double side) {
        super.color=color;
        super.filled=filled;
        super.length=side;
        super.width=side;
    }

    public double getSide(){
        return super.length;
    }

    public void setSide(double side){
        super.length=side;
        super.width=side;
    }

    public void setWidth(double side){
        super.length=side;
        super.width=side;
    }

    public void setLength(double side){
        super.length=side;
        super.width=side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + length +
                '}';
    }
}
