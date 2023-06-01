package ru.mirea.lab8.chain_of_responsibility;

public class Is_number extends Number_binary_five{
    public Is_number(Number_binary_five next) {
        super(next);
    }
    public boolean doFilter(String s) {
        if ( s != "101"){
            return false;
        }else if(next == null) {
            return false;
        }
        return true;
    }
}
