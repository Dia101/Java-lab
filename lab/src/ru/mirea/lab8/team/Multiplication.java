package ru.mirea.lab8.team;

public class Multiplication implements Command{
    private Calculate calculate = new Calculate();
    private History history;

    Multiplication(History history) {
        this.history = history;
    }

    @Override
    public Integer execute(Integer x, Integer y) {
        history.setResult(calculate.multiplication(x, y));
        history.addHist( x + " * " + y + " = " + history.getResult());
        return history.getResult();
    }
}
