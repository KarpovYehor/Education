package com.telran.base.lesson9;

public class TaskOne {

    public static void main(String[] args) {
        int[] array = {3, 88, 32, 6, 12, 8, 34, 6, 3, 87, 23, 54, 8};

        System.out.println(getMax(array));
        System.out.println(getMin(array));

        int target = 8;
        printIndex(array, target);

    }

    private static int getMax(int[] array) {
        if (array.length != 0) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                int max1 = Math.max(max, array[i]);
                if (max <= array[i]) {
                    max = array[i];
                }
            }
            return max;
        }
        return -1;
    }

    private static int getMin(int[] array) {
        if (array.length != 0) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min >= array[i]) {
                    min = array[i];
                }
            }
            return min;
        }
        return -1;
    }

    private static void printIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.print(i + ", ");
            }
        }
    }
}
