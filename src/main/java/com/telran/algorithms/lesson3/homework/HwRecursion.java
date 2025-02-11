package com.telran.algorithms.lesson3.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HwRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input text: ");
        String string = scanner.nextLine();
        System.out.println(reversString(string));
        printDisorganization(1);

        Random random = new Random();
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 20);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max: " + searchMax(array, array.length - 1));
        printDisorganization(2);

        int number = 123456;
        System.out.println(findSumAllNumber(number));
        printDisorganization(3);

        int a = 2;
        int b = 6;
        System.out.println(printInDegree(a, b));
        printDisorganization(4);

        System.out.println(checkPalindrome("Olololo"));
        printDisorganization(5);
    }

    public static String reversString(String text) {
        if (text == null || text.length() == 0) {
            return text;
        }
        return reversString(text.substring(1)) + text.charAt(0);
    }

    public static int searchMax(int[] array, int i) {
        if (i == 0) {
            return array[0];
        }

        return Math.max(array[i], searchMax(array, i - 1));
    }

    public static int findSumAllNumber(int number) {
        if (number == 0) {
            return 0;
        }

        return number % 10 + findSumAllNumber(number / 10);
    }

    public static double printInDegree(double a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b > 0) {
            return a * printInDegree(a, b - 1);
        }
        if (b < 0) {
            return 1 / printInDegree(a, -b);
        }
        return a;
    }

    public static boolean checkPalindrome(String word) {
        word = word.toLowerCase();
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }
        return checkPalindrome(word.substring(1, word.length() - 1));
    }

    public static void printDisorganization(int number) {
        System.out.println("------------------------------------" + number + "-------------------------------------------------");
    }
}
