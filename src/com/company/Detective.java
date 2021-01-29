package com.company;

public class Detective extends Book{
    private String genre;

    public String getGenre() {
        return genre;
    }


    public Detective(String name, int numberOfPage,String genre) {
        this.genre = genre;
        super.setName(name);
        super.setNumberOfPage(numberOfPage);
    }

    public void print() {
        System.out.println("Name: " + getName() + " NumberOfPage: " + getNumberOfPage() + " Genre: " + getGenre());
    }
}
