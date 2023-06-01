package ru.mirea.lab3;

import java.util.ArrayList;
import java.lang.Thread;
import java.util.concurrent.Semaphore;

public class List_semaphore {
    static int key = 0;
    static ArrayList<String> list = new ArrayList<String>();
    private static final Semaphore semaphore = new Semaphore(2);
    static void set_list( String message) {
        try {
            semaphore.acquire();
            list.add(message);
            System.out.println(list);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    static void set_key() {


        try {
            semaphore.acquire();
            key++;
            System.out.println(key);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        Thread one = new Thread(()->{
            set_key();
            set_list("This is first thread");

        });

        Thread two = new Thread(()->{
            set_key();
            set_list("This is second thread");
        });
        one.start();
        two.start();
    }
}
