package com.company;

public abstract class Building implements Printable{

    private String name;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Building(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract int totalArea();
}
