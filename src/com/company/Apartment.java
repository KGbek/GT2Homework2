package com.company;

public class Apartment extends Building{

    private int rooms;
    private int roomsArea;

    public Apartment(String name, int price, int rooms, int roomsArea) {
        super(name, price);
        this.rooms = rooms;
        this.roomsArea = roomsArea;
    }


    @Override
    public int totalArea() {
        return rooms * roomsArea;
    }

    @Override
    public void print() {
        System.out.println(getName() + " Общая площадь: " + totalArea() + " Цена: $" + getPrice());
    }
}
