package com.telran.base.Lesson4;

public class MethodCallExampleFour {
    public static void main(String[] args) {
        int one =23;
        int two = 35;
        int result = calculator(one, two);
        System.out.println("Sum " + one + " and " + two + " = " +result);
    }

    //4 - Метод принимает параметры и возвращает что-то
    private static int calculator(int numberOne, int numberTwo){
        int sum = numberOne + numberTwo;
        return sum;
    }
}
