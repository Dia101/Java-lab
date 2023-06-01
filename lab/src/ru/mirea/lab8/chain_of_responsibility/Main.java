package ru.mirea.lab8.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Number_binary_five is_five = new Is_five(null);
        Number_binary_five is_binary = new Is_binary(is_five);
        Number_binary_five is_number = new Is_number(is_binary);

        System.out.println(is_number.doFilter("101"));
        System.out.println(is_number.doFilter("505"));
        System.out.println(is_number.doFilter("1010"));
    }
}
