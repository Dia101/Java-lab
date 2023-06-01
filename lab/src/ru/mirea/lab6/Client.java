package ru.mirea.lab6;

public class Client {
    private final Laptop device_laptop;
    private final Tablet device_tablet;

    public Client(DeviceFactory factory) {
        device_laptop = factory.create_laptop();
        device_tablet = factory.create_tablet();
    }

    public void execute() {
        device_laptop.print();
        device_tablet.print();
    }
}
