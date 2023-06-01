package ru.mirea.lab8.team;

public class CalculateInvoker {
    public History history;
    private Command addition;
    private Command division;
    private Command multiplication;
    private Command subtraction ;
    CalculateInvoker(Integer y){
        history = new History(y);
        addition = new Addition(history);
        division = new Division(history);
        multiplication = new Multiplication(history);
        subtraction = new Subtraction(history);
    }
    public void add(Integer x){
        System.out.println(addition.execute(history.getResult(), x));
    }
    public void div(Integer x){
        System.out.println(division.execute(history.getResult(), x));
    }
    public void mul(Integer x){
        System.out.println(multiplication.execute(history.getResult(), x));
    }
    public void sub(Integer x){
        System.out.println(subtraction.execute(history.getResult(), x));
    }
    public void history_show(){
        System.out.println(history.getHist());
    }
    public void history_clean(){
        history.cleanHist();
    }

    public void change_number(Integer x){
        history.setResult(x);
    }

}
