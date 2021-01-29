package com.company;

public class Psychology extends Book{
    private int people;

    public int getPeople() {
        return people;
    }


    public Psychology(String name, int numberOfPage, int people) {
        this.people = people;
        super.setName(name);
        super.setNumberOfPage(numberOfPage);
    }

    public void print() {
        System.out.println("Name: " + getName() + " NumberOfPage: " + getNumberOfPage() + " People: " + getPeople());

    }
}
