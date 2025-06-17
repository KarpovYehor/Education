package com.telran.algorithms.lesson7;

import java.util.Arrays;

public class PatternOne_TwoPointers_RemoveDuplicatesHW {

    public static void main(String[] args) {
        int[] numbers = {0,1,1,1,1,2,2,3,4,5,5};

        int slow = 0;
        int remove = numbers[slow++];

        for (int fast = 0; fast < numbers.length; fast++) {
            if (numbers[fast] != remove){
                numbers[slow++] = numbers[fast];
                remove++;
            }
        }

        System.out.println(Arrays.toString(numbers) + " we have " + slow + " element");
        for (int i = slow; i < numbers.length; i++) {
            numbers[i] = -0;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
