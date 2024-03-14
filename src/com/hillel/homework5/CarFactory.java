package com.hillel.homework5;

import java.time.Year;

public class CarFactory {
    protected static Car newCar(String brand, String model, Year year, String color, float price, String regNum) {
        return new Car(brand, model, year, color, price, regNum);
    }

}
