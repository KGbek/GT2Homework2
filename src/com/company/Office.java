package com.company;

public class Office extends Building{

    private int rooms;
    private int area;
    private int floor;

    public Office(String name, int price, int rooms, int area, int floor) {
        super(name, price);
        this.rooms = rooms;
        this.area = area;
        this.floor = floor;
    }

    @Override
    public int totalArea() {
        return area * rooms;
    }

    @Override
    public void print() {
        System.out.println(getName() + " Общая площадь: " + totalArea() + " Аренда за мес: $" + getPrice());
    }
}
