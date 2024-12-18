package com.telran.base.lesson8;

import java.util.Random;

public class TaskThree {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
