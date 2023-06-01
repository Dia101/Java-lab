package ru.mirea.lab8.team;

public class Subtraction implements Command{
    private Calculate calculate = new Calculate();
    private History history;

    Subtraction(History history) {
        this.history = history;
    }

    @Override
    public Integer execute(Integer x, Integer y) {
        history.setResult(calculate.subtraction(x, y));
        history.addHist( x + " - " + y + " = " + history.getResult());
        return history.getResult();
    }
}
