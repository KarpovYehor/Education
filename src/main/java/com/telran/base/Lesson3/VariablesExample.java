package com.telran.base.Lesson3;

public class VariablesExample {
    public static void main(String[] args) {
        //локальная переменная
        //внутри метода
        int number = 10; //переменная метода main
        number = 20;
        System.out.println(number);
    }

    public static void print(String[] args) {
        int number = 5;
    }
}
