package com.telran.base.lesson8;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[4];

        int[] ints;
        ints = new int[5];

        array[0] = 5;
        array[3] = 7;

        int temp = array[0];
        System.out.println(temp);

        for (int i = 0; i <= 3; i++) {
            System.out.println(array[i]);
        }


        int[] arrayOne = {5,62,43,6,1,46,74,24,2,9};
        System.out.println(arrayOne.length);
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " ");
        }

    }
}
