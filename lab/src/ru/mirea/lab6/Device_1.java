package ru.mirea.lab6;

public class Device_1 implements DeviceFactory {
    @Override
    public Laptop create_laptop() {
        return new Laptop_1();
    }

    @Override
    public Tablet create_tablet() {
        return new Tablet_1();
    }
}
