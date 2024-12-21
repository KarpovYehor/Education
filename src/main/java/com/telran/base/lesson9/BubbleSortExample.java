package com.telran.base.lesson9;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,100);
        }
        int counter = 0;

        /**
         *         int ago = 0;
         *         for (int i = 0; i < array.length; i++) {
         *             for (int j = 0; j < array.length; j++) {
         *                 if (array[j] >= array[j + 1]) {
         *                     int temp =array[j + 1];
         *                     array[j + 1] = array[j];
         *                     array[j] = temp;
         *                     System.out.println(Arrays.toString(array));
         *                 }
         *             }
         *         }
         *         System.out.println(Arrays.toString(array));
         *         System.out.println();
         */


        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                int elementBefore = array[i];
                int elementAfter = array[i + 1];
                if (elementBefore >= elementAfter) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
                System.out.println(Arrays.toString(array));

                counter++;
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("It take " + counter);


    }
}
