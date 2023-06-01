package ru.mirea.lab8.team;

public class Division implements Command{
    private Calculate calculate = new Calculate();
    private History history;

    Division(History history) {
        this.history = history;
    }

    @Override
    public Integer execute(Integer x, Integer y) {
        history.setResult(calculate.division(x, y));
        history.addHist( x + " / " + y + " = " + history.getResult());
        return history.getResult();
    }
}
