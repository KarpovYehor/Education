package com.telran.base.lesson9;

public class LinearSearchExample {

    public static void main(String[] args) {
        int[] array = {3,5,32,6,12,8,34,6,3,87,23,54};
        int target = 35;
        //getFound(target, array);
        //target = 50;
        //getFound(target, array);

        boolean isFoundTwo = LinearSearch(target, array);
        System.out.println("Is element " + target + " found in array ? " + isFoundTwo);
        target = 50;
        isFoundTwo = LinearSearch(target, array);
        System.out.println("Is element " + target + " found in array ? " + isFoundTwo);

    }

    private static boolean LinearSearch(int target, int[] array){
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp == target){
                return true;
            }
        }
        return false;
    }

    private static void getFound(int target, int[] array){
        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp == target){
                isFound = true;
                break;
            }
        }
        System.out.println("Is element " + target + " found in array ? " + isFound);
    }
}
