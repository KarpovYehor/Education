package com.telran.base.lesson9.carexample;

import java.util.Arrays;

public class CarBubbleSort {

    public static void main(String[] args) {
        Car carOne = new Car("Bmw", 2.5);
        Car carTwo = new Car("Audi", 3.7);
        Car carThree = new Car("VW", 1.8);
        Car carFour = new Car("Skoda", 2.1);
        Car carFive = new Car("Seat", 1.4);

        System.out.println(carFive.model + "_" + carFive.price);
        System.out.println(carThree.model + "_" + carThree.price);

        Car[] cars = {carOne, carTwo, carThree, carFour, carFive};
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Model " + car.model + " Price " + car.price);
        }


        System.out.println("\nHW - отсортировать массив автомобилей по цене - по возрастанию:\n");
        bubbleSortCarsByPrice(cars);

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Model " + car.model + " Price " + car.price);
        }


        System.out.println("\nHW* - отсортировать массив автомобилей по первой букве модели - по алфавиту:\n");
        getsdf(cars);

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Model " + car.model + " Price " + car.price);
        }
    }

    public static void bubbleSortCarsByPrice(Car[] cars) {

        for (int j = 0; j < cars.length - 1; j++) {

            for (int i = 0; i < cars.length - 1 - j; i++) {
                if (cars[i + 1].price < cars[i].price) {

                    Car temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                }
            }
        }
    }

    public static void getsdf(Car[] cars){

        for (int j = 0; j < cars.length - 1; j++) {

            for (int i = 0; i < cars.length - 1 - j; i++) {
                if (cars[i].model.compareTo(cars[i + 1].model) > 0) {

                    Car temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                }
            }
        }
    }
    /**
     *         for (int j = 0; j < cars.length - 1; j++) {
     *             for (int i = 0; i < cars.length - 1; i++) {
     *                 if (cars[i + 1].price <= cars[i].price) {
     *                     double temp = cars[i].price;
     *                     cars[i + 1].price = cars[i].price;
     *                     cars[i].price = temp;
     *                     System.out.println(cars[i].price);
     *                 }
     *             }
     *             System.out.println(Arrays.toString(cars));
     *         }
     */
}
