package ru.mirea.lab7.bridge;

public class IceCreamSherbet extends IceCreamCreate{
    public IceCreamSherbet(Filling filling){
        super(filling);
        filling.fill();
    }

    @Override
    public void iceCreamCreate() {
        System.out.println("щербет создан");
    }
}
