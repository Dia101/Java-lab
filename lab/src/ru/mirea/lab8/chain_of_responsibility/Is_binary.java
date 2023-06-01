package ru.mirea.lab8.chain_of_responsibility;

public class Is_binary extends Number_binary_five{
    public Is_binary(Number_binary_five next) {
        super(next);
    }
    public boolean doFilter(String s) {
        if (!s.matches("[01]+")){
            return false;
        }else if(next == null) {
            return false;
        }
        return true;
    }
}
