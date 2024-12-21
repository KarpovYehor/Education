package com.telran.base.lesson9;

import java.util.Arrays;

public class BubbleSortTaskOne {

    public static void main(String[] args) {
        int[] array = {3, 0, 88, 32, -6, 12, 8, 34, 6, 3, 87, 23, 54, 8};
        int counter = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                int elementBefore = array[i];
                int elementAfter = array[i + 1];
                if (elementBefore <= elementAfter) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
                System.out.println(Arrays.toString(array));

                counter++;
            }
            System.out.println();
        }
    }
}
