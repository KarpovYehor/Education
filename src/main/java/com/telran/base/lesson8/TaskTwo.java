package com.telran.base.lesson8;

public class TaskTwo {

    public static void main(String[] args) {
        int[] array = new int[50];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = count;
            count += 2;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
