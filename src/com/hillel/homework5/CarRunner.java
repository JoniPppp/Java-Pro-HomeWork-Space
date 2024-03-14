package com.hillel.homework5;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car car1 = CarFactory.newCar("Mitsubishi", "Outlander", Year.of(2022),
                "Black", 10000.00f, "ВА2314АА");
        Car car2 = CarFactory.newCar("Toyota", "RAV4", Year.of(2019),
                "Gray", 15000.00f, "ОО1745КА");
        Car car3 = CarFactory.newCar("BMW", "X7", Year.of(2021),
                "Gray", 20000.00f, "ЛК1276ТР");
        Car car4 = CarFactory.newCar("Hyundai", "Santafe", Year.of(2020),
                "Red", 12000.00f, "ЗС7815ТЛ");
        Car car5 = CarFactory.newCar("BMW", "X5", Year.of(2022),
                "Black", 14000.00f, "СТ4560ДЛ");
        Car car6 = CarFactory.newCar("KIA", "Sportage", Year.of(2022),
                "Black", 14000.00f, "СТ4590ДЛ");
        Car car7 = CarFactory.newCar("Toyota", "Highlander", Year.of(2021),
                "Blue", 21000.00f, "МВ4590ДЛ");
        Car car8 = CarFactory.newCar("KIA", "Sportage", Year.of(2021),
                "Red", 14000.00f, "СТ1111ДЛ");
        Car car9 = CarFactory.newCar("KIA", "Sportage", Year.of(2020),
                "Red", 14000.00f, "СТ1111ДЛ");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);


        System.out.println("All cars:");
        cars.forEach(System.out::println);

        System.out.println();
        List<Car> carsByBrand = CarFilter.getByBrand(cars, "Toyota");
        System.out.println("Cars by brand:");
        carsByBrand.forEach(System.out::println);

        System.out.println();
        List<Car> carsByModelOlder = CarFilter.getByModelOlder(cars, "Sportage", Year.of(2022));
        System.out.println("Cars by model and year:");
        carsByModelOlder.forEach(System.out::println);

        System.out.println();
        List<Car> carsByYearHigherPrice = CarFilter.getByYearHigherPrice(cars, Year.of(2022), 12000.00f);
        System.out.println("Cars by year and higher price:");
        carsByYearHigherPrice.forEach(System.out::println);

    }
}
