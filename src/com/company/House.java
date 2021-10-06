package com.company;

public class House extends Building{

    private int plotSize;
    private int rooms;
    private int roomsArea;

    public House(String name, int price, int plotSize, int rooms, int roomsArea) {
        super(name, price);
        this.plotSize = plotSize;
        this.rooms = rooms;
        this.roomsArea = roomsArea;
    }

    @Override
    public int totalArea() {
        return plotSize + (roomsArea * rooms);
    }

    @Override
    public void print() {
        System.out.println(getName() + " Общая площадь: " + totalArea() + " Цена: $" + getPrice());
    }
}
