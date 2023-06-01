package ru.mirea.lab7.bridge;

class Main {
    public static void main(String[] args){
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
