package ru.mirea.lab7.adapter;

import ru.mirea.lab7.adapter.Adapter;
import ru.mirea.lab7.adapter.IceCreamCreate;
import ru.mirea.lab7.adapter.IceCreamSail;
import ru.mirea.lab7.bridge.*;


class Main {
    public static void main(String[] args){
        IceCreamSail iceCreamSail = new Adapter(new IceCreamCreate());
        iceCreamSail.iceCreamProduction();

        IceCreamCone iceCreamCone = new IceCreamCone(new Vanilla());
        iceCreamCone.iceCreamCreate();

        IceCreamFruitIce iceCreamFruitIce = new IceCreamFruitIce(new Raspberry());
        iceCreamFruitIce.iceCreamCreate();

        IceCreamSherbet iceCreamSherbet = new IceCreamSherbet(new Blueberry());
        iceCreamSherbet.iceCreamCreate();

        IceCreamCone iceCreamCone1 = new IceCreamCone(new Chocolates());
        iceCreamCone1.iceCreamCreate();
    }
}
