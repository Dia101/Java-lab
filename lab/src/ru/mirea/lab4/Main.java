package ru.mirea.lab4;


public class Main {
    public static void main(String[] args) {
        New_ExecutorService executorService = new New_ExecutorService(2);
        executorService.execute(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("One (Second)");
        });

        executorService.execute(() -> System.out.println("Two (first)"));
        executorService.shutdown();
    }
}
