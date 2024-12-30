package com.telran.base.lesson11;

public class Car {

    //Элементы данных
    //Свойства объекта, Характеристики объекта, поля класса - это все одно и тоже
    String serialNumber;

    String color;

    public Car(){
        System.out.println("Create new car");
    }
    public  Car(String serialNumber, String color){
        this.serialNumber = serialNumber;
        this.color = color;
    }
    public Car(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public void drive(){
        System.out.println("Car with color " + this.color + " and serial number "+ this.serialNumber + " is driving");
    }

}
