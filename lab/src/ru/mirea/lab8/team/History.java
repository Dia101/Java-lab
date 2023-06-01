package ru.mirea.lab8.team;

public class History {
    private Integer result;
    private String hist;

    History(Integer result){
        this.result = result;
        this.hist = "";
    }
    public void addHist(String hist) {
        this.hist = this.hist + hist + "\n";
    }

    public String getHist() {
        return hist;
    }

    public void cleanHist(){
        this.hist = "";
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
