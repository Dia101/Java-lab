package ru.mirea.lab6;

public class Device_2 implements DeviceFactory {
    @Override
    public Laptop create_laptop() {
        return new Laptop_2();
    }

    @Override
    public Tablet create_tablet() {
        return new Tablet_2();
    }
}