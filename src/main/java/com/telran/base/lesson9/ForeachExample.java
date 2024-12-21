package com.telran.base.lesson9;

public class ForeachExample {

    public static void main(String[] args) {
        int[] array = {3, 88, 32, 6, 12, 8, 34, 6, 3, 87, 23, 54, 8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int value : array){
            System.out.print(value + " ");
        }

    }
}
