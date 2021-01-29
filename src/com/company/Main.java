package com.company;

public class Main {


    public static void main(String[] args) {
        createObject("Adventure").print();
        createObject("Detective").print();
        createObject("Psychology").print();

    }
    public static Book createObject(String className){
        Book printable = null;

        switch (className){

            case "Adventure":
                printable = new Adventure("Treasure island", 350, "Blue");
                break;
            case "Detective":
                printable = new Detective("Sherlock Holmes", 495, "Risiko");
                break;
            case "Psychology":
                printable = new Psychology("People", 85, 5);
                break;

        }

        return printable;


    }



}
