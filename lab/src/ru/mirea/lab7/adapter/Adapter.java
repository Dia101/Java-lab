package ru.mirea.lab7.adapter;

public class Adapter implements IceCreamSail{
    public IceCreamCreate iceCreamCreate;
    public Adapter (IceCreamCreate iceCreamCreate){
        this.iceCreamCreate = iceCreamCreate;
    }
    @Override
    public void iceCreamProduction(){
        iceCreamCreate.addIceCreamCone();
        iceCreamCreate.addIceCreamFilling();
    }
}
