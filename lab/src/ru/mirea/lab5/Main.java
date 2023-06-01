package ru.mirea.lab5;

public class Main {
    public static void main(String[] args) {
        Singleton_1 singleton1 = Singleton_1.getInstance();
        Singleton_1 singleton1Copy = Singleton_1.getInstance();

        Singleton_2 singleton2 = Singleton_2.getInstance();
        Singleton_2 singleton2Copy = Singleton_2.getInstance();

        Singleton_3 singleton3 = Singleton_3.getInstance();
        Singleton_3 singleton3Copy = Singleton_3.getInstance();
        Singleton_3 singleton3AnotherCopy = Singleton_3.INSTANCE;

        Other_class object = new Other_class();
        Other_class objectCopy = new Other_class();

        System.out.print("\nSingleton1 hashCodes: ");
        System.out.print(singleton1.hashCode() + " ");
        System.out.println(singleton1Copy.hashCode());

        System.out.print("\nSingleton2 hashCodes: ");
        System.out.print(singleton2.hashCode() + " ");
        System.out.println(singleton2Copy.hashCode());

        System.out.print("\nSingleton3 hashCodes: ");
        System.out.print(singleton3.hashCode() + " ");
        System.out.print(singleton3Copy.hashCode() + " ");
        System.out.println(singleton3AnotherCopy.hashCode());

        System.out.print("\nMyClass hashCodes: ");
        System.out.print(object.hashCode() + " ");
        System.out.println(objectCopy.hashCode());
    }
}
