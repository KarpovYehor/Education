package com.telran.base.Lesson4.Example;

public class MathRandomExample {
    public static void main(String[] args) {
        int min = -20;
        int max = 20;
        double result1 = Math.random()*(max - min + 1) + min;
        int result = (int) (Math.random()*(max - min + 1) + min);
        System.out.println(result);
        System.out.println(result1);
    }
}
