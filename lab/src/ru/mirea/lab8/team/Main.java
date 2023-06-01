package ru.mirea.lab8.team;

public class Main {
    public static void main(String[] args) {
        CalculateInvoker calculateInvoker = new CalculateInvoker(7);
        calculateInvoker.add(7);
        calculateInvoker.div(3);
        calculateInvoker.mul(4);
        calculateInvoker.sub(3);
        calculateInvoker.history_show();
        calculateInvoker.history_clean();
        calculateInvoker.change_number(3);
        calculateInvoker.add(5);
        calculateInvoker.history_show();
    }
}
