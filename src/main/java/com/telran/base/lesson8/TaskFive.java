package com.telran.base.lesson8;

public class TaskFive {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 5};
        int[] array = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            array[temp - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("\nWe found: " + (i + 1));
                array[i] = i + 1;
            }
        }
    }
}
