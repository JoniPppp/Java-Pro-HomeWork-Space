package com.hillel.homework5;

import java.time.Year;
import java.util.List;

public class CarFilter {
    protected static List<Car> getByBrand(List<Car> carsList, String brandName) {
        return carsList.stream()
                .filter(car -> car.getBrand().equals(brandName))
                .toList();
    }

    protected static List<Car> getByModelOlder(List<Car> carsList, String modelName, Year olderThenYear) {
        return carsList.stream()
                .filter(car -> car.getModel().equals(modelName))
                .filter(car -> car.getYear().isBefore(olderThenYear))
                .toList();
    }

    protected static List<Car> getByYearHigherPrice(List<Car> carsList, Year year, float higherThenPrice) {
        return carsList.stream()
                .filter(car -> car.getYear().equals(year))
                .filter(car -> car.getPrice() > higherThenPrice)
                .toList();
    }
}
