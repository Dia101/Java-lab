package ru.mirea.lab1;

public class Book {
    private String name;
    private int page;

    public Book(String n, int p){
        name = n;
        page = p;
    }
    public Book(String n){
        name = n;
        page = 0;
    }
    public Book(){
        name = "Summer";
        page = 0;
    }
    public void setPage(int page){
        this.page = page;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPage(int page){
        return page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", page=" + page +
                '}';
    }

    public void contentPages(){
        System.out.println(name+" have "+(page-3)+" pages with useful content");
    }
}
