package ru.mirea.lab3;

import java.lang.Thread;
import java.util.Map;
import java.util.HashMap;

public class Example_map {
    static volatile int key = 0;

    static Map<Integer, String> states = new HashMap<Integer, String>();

    synchronized static void set_map(int key, String message) {

        states.put(key, message);
        System.out.println(states);

    }
    synchronized static void set_key() {
        key++;
        System.out.println(key);
    }



    public static void main(String[] args) {


        Thread one = new Thread(()->{
            set_key();
            set_map( key, "This is first thread");

        });

        Thread two = new Thread(()->{
            set_key();
            set_map( key, "This is second thread");
        });
        one.start();
        two.start();
    }
}
