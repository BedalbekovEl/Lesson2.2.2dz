package com.company;

public class Book implements Printable{
    private String name;
    private int numberOfPage;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }


    @Override
    public void print() {

    }
}
