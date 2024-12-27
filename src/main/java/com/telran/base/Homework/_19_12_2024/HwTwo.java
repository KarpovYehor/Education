package com.telran.base.Homework._19_12_2024;

import java.util.Arrays;

public class HwTwo {

    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int[] array = new int[10];
        bubbleSort(arr);
        getFind(arr, array);

    }

    private static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] >= arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void getFind(int[] arr, int[] array){
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            array[temp - 1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                System.out.println("\nWe find: " + (i + 1));
                array[i] = array[i - 1] + 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
