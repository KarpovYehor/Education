package com.telran.algorithms.lesson7;

import java.util.Arrays;

public class PatternOne_TwoPointers_SquaresOfSortedArrays {

    public static void main(String[] args) {
        int[] numbers = {-4, -1, 0, 3, 10};
        int[] result = new int[numbers.length];
        int index = result.length - 1;

        int left = 0;
        int right = numbers.length - 1;

        System.out.println(Arrays.toString(numbers));
        while (index >= 0){
            int sl = numbers[left] * numbers[left];
            int sr = numbers[right] * numbers[right];

            if (sl < sr){
                result[index] = sr;
                right--;
            } else {
                result[index] = sl;
                left++;
            }
            index--;
        }
        System.out.println(Arrays.toString(result));
    }
}
