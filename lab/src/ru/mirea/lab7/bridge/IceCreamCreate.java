package ru.mirea.lab7.bridge;

public abstract class IceCreamCreate {
    public Filling filling;

    public IceCreamCreate(Filling filling){
        this.filling = filling;
    }
    public abstract void iceCreamCreate();
}
