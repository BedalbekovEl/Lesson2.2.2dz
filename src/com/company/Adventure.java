package com.company;

public class Adventure extends Book{
    private String color;

    public String getColor() {
        return color;
    }


    public Adventure(String name, int numberOfPage,String color) {
        this.color = color;
        super.setName(name);
        super.setNumberOfPage(numberOfPage);
    }
    public void print(){
        System.out.println("Name: " + getName() + " NumberOfPage: " + getNumberOfPage() + " Color: " + getColor());
    }
}
