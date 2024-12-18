package com.telran.base.lesson8;

public class TaskOne {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        System.out.println(array[1]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(array[i]);
        }
    }
}
