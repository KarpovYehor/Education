package com.telran.base.Homework._19_12_2024;

public class Hw {

    public static void main(String[] args) {
        int[] arrOne = {1,2,3,5};
        int[] arrTwo = new int[5];

        for (int i = 0; i < arrOne.length; i++) {
            int temp = arrOne[i];
            arrTwo[temp - 1] = temp;
        }
        for (int i = 0; i < arrTwo.length; i++) {
            if (arrTwo[i] == 0) {
                System.out.println("\nWe found: " + (i + 1));
                arrTwo[i] = i + 1;
            }
        }
    }
}
