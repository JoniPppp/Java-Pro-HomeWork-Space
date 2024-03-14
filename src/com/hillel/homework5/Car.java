package com.hillel.homework5;

import java.time.Year;
import java.util.UUID;

public class Car {
    private final String uuid = UUID.randomUUID().toString();
    private final int id;
    private static int nextId = 7000;
    private final String brand;
    private final String model;
    private final Year year;
    private final String color;
    private final float price;
    private final String regNum;

    protected Car(String brand, String model, Year year, String color, float price, String regNum) {
        this.id = nextId++;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNum = regNum;
    }

    protected int getId() {
        return id;
    }

    protected String getBrand() {
        return brand;
    }

    protected String getModel() {
        return model;
    }

    protected Year getYear() {
        return year;
    }

    protected String getColor() {
        return color;
    }

    protected float getPrice() {
        return price;
    }

    protected String getRegNum() {
        return regNum;
    }

    @Override
    public String toString() {
        return "Car: {" +
                "UUID='" + uuid + '\'' +
                "ID='" + id + '\'' +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regNum='" + regNum + '\'' +
                '}';
    }

}
