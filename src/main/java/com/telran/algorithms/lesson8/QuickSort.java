package com.telran.algorithms.lesson8;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = {7, -2, 4, 1, 6, 5, 0, -4, 2};
        System.out.println(Arrays.toString(numbers));
        quickSort(numbers, 0, numbers.length -1);
        System.out.println(Arrays.toString(numbers));

//        int index = quickSort(numbers, 0, numbers.length -1);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("Index of element = " + index);
//        quickSort(numbers, 0, index - 1);
//        quickSort(numbers, index + 1, numbers.length -1);
//        System.out.println(Arrays.toString(numbers));

    }

    private static void quickSort(int[] number, int start, int end){
        if (start < end){
            int index = change(number, start, end);
            quickSort(number, start, index - 1);
            quickSort(number, index + 1, end);
        }
    }

    private static int change(int[] number, int start, int end) {
        int index = start;
        int value = number[end];
        for (int i = start; i <= end - 1; i++) {
            if (number[i] < value) {
                int temp = number[index];
                number[index] = number[i];
                number[i] = temp;
                index++;
            }
        }
        int temp = number[index];
        number[index] = number[end];
        number[end] = temp;
        return index;
    }
}
