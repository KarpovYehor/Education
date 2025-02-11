package com.telran.base.lesson12;

public class TaskOne {

    public static void main(String[] args) {
        int[] array = {5, 2, 7, 8, 26, 44, 24, 74, 45};


        TaskOne taskOne = new TaskOne();
        int number = taskOne.getMax(array);
        System.out.println(number);
        
    }

    public int getMax(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max =Math.max(max, array[i]);
        }

        return max;
    }
}
