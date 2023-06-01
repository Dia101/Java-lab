package ru.mirea.lab8.chain_of_responsibility;

public abstract class Number_binary_five {
    protected Number_binary_five next;

    public Number_binary_five(Number_binary_five next) {
        this.next = next;
    }

    public abstract boolean doFilter(String s);

    public Number_binary_five getNext() {
        return this.next;
    }
}