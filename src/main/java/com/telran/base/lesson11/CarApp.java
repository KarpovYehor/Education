package com.telran.base.lesson11;

public class CarApp {

    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();

        carOne.serialNumber = "SDDFD63490";
        carOne.color = "Black";

        carTwo.serialNumber = "FSODJFB314";
        carTwo.color = "Red";


        String serialNumberOne = carOne.serialNumber;
        String serialNumberTwo = carTwo.serialNumber;
        System.out.println("Serial number one is " + serialNumberOne);
        System.out.println("Serial number two is " + serialNumberTwo);

        System.out.println("Color one is " + carOne.color + " color two is " + carTwo.color);

        Car carThree = new Car("GUVHKJ", "White");
        System.out.println("Car three " + carThree.color + " " + carThree.serialNumber);

        Car carFour = new Car("VIHVCFIK");
        System.out.println("Car four " + carFour.serialNumber);

        carFour.drive();
        carOne.drive();
        carThree.drive();
        carTwo.drive();
    }
}
