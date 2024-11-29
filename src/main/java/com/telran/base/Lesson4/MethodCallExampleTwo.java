package com.telran.base.Lesson4;

public class MethodCallExampleTwo {
    public static void main(String[] args) {
        printNumber(5);
        printNumber(12);
        printNumber(-234);
        printSum(32, 43);

        int number = 55;
        printNumber(number);
    }

    //2 - метод принимет параметры и ничего не возвращает
    public static void printNumber(int number){
        System.out.println(number);
    }

    public static void printSum(int a, int b){
        System.out.println(a + b);
    }

}
