package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Apartment").print();
        createObject("House").print();
        createObject("Office").print();

    }

    public static Building createObject(String className){
        switch (className){
            case "Apartment":
                return new Apartment("Квартира",70000,3,75);
            case "House":
                return new House("Дом",45000,5,3,10);
            case "Office":
                return new Office("Офис",700,5,25,5);
            default:
                return null;
        }

    }
}
