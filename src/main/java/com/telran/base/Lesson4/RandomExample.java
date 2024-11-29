package com.telran.base.Lesson4;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOne = random.nextInt();
        System.out.println("Random int = " + numberOne);

        int numberTwo = random.nextInt(-100, 100);
        System.out.println("Random int = " + numberTwo);

        Math.random();
    }
}
