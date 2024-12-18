package com.telran.base.lesson8;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExample {

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 4, 4, 23, 1, 4, 6, 7, 2, 54, 24, 96,};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] ints = {4, 4, 4, 4, 4, 23, 1, 4, 6, 7, 2, 54, 24, 96,};
        Arrays.sort(ints, Comparator.reverseOrder());
        System.out.println(Arrays.toString(ints));
    }
}
