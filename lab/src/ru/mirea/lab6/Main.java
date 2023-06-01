package ru.mirea.lab6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Фабричный метод: ");
        CakeMaker[] waffleMakers = { new CoffeeCakeMaker(), new MilkCakeMaker() };
        for (CakeMaker waffleMaker : waffleMakers) {
            Cake cake = waffleMaker.factoryMethod();
            cake.print();
        }
        System.out.println();

        System.out.println("Абстрактная фабрика: ");
        DeviceFactory[] deviceFactories = { new Device_1(), new Device_2() };
        for (DeviceFactory deviceFactory : deviceFactories) {
            Client client = new Client(deviceFactory);
            client.execute();
        }
        System.out.println();

        System.out.println("Строитель: ");
        Builder[] builders = { new SamsungBuilder(), new LGBuilder() };
        for (Builder builder : builders) {
            Director director = new Director(builder);
            director.Construct();
            Smartphone smartphone = builder.GetResult();
            smartphone.print();
        }
        System.out.println();

        System.out.println("Прототип: ");
        Packing originalPacking = new Packing();
        Packing[] packingArray = new Packing[5];
        for (int i = 0; i < 3; i++) {
            try {
                packingArray[i] = originalPacking.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            packingArray[0].print();
        }
        System.out.println();
    }
}