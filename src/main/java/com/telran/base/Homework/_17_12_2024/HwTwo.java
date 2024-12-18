package com.telran.base.Homework._17_12_2024;

import java.util.Arrays;
import java.util.Random;

public class HwTwo {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(array));

        // Сделал с подсказкой от GPT!!!
//        boolean returnTorF = true;
//        for (int i = 1; i < array.length; i++) {
//            int arrays = array[i - 1];
//            if (arrays >= array[i]){
//                returnTorF = false;
//                break;
//            }
//        }

        boolean returnTorF = printTrueOrFalse(array);

        if (returnTorF){
            System.out.println("Массив строго возрастающийся");
        }else {
            System.out.println("Массив не возрастающийся");
        }
    }
    private static boolean printTrueOrFalse(int[] array){
        for (int i = 1; i < array.length; i++) {
            int arrays = array[i - 1];
            if (arrays >= array[i]){
                return false;
            }
        }
        return true;
    }
    /**
     *     Сделал сам!!!
     *
     *         boolean returnTorF = true;
     *         while (returnTorF){
     *             for (int i = 1; i < array.length; i++) {
     *                 int ints = array[i - 1];
     *
     *                 if (ints < array[i]){
     *                     returnTorF = true;
     *                 }else {
     *                     returnTorF = false;
     *                     break;
     *                 }
     *             }
     *
     *             if (returnTorF == true){
     *                 System.out.println("Массив строго возрастающийся");
     *             }else {
     *                 System.out.println("Массив не возрастающийся");
     *             }
     *             break;
     *         }
     */
}
