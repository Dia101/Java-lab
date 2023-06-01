package ru.mirea.lab7.bridge;

public class IceCreamCone extends IceCreamCreate {
    public IceCreamCone(Filling filling){
        super(filling);
        filling.fill();
    }

    @Override
    public void iceCreamCreate() {
        System.out.println("рожок создан ");
    }
}
