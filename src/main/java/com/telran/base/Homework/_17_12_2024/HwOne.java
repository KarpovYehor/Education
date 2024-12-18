package com.telran.base.Homework._17_12_2024;

import java.util.Arrays;
import java.util.Random;

public class HwOne {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 50);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));

    }
}
