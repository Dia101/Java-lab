package ru.mirea.lab7.bridge;

public class IceCreamFruitIce extends IceCreamCreate{
    public IceCreamFruitIce(Filling filling){
        super(filling);
        filling.fill();
    }

    @Override
    public void iceCreamCreate() {
        System.out.println("фруктовый лед создан");
    }
}
