package ru.mirea.lab8.team;

public class Addition implements Command{
    private Calculate calculate = new Calculate();
    private History history;

    Addition(History history) {
        this.history = history;
    }

    @Override
    public Integer execute(Integer x, Integer y) {
        history.setResult(calculate.addition(x, y));
        history.addHist( x + " + " + y + " = " + history.getResult());
        return history.getResult();
    }
}
