package com.telran.base.Homework._05_12_2024;

import java.util.Scanner;

public class HwThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        System.out.println("Максимальное число: " + getMax(numberOne, numberTwo, numberThree));
    }

    private static int getMax(int a, int b, int c) {
        int result = Math.max(a, Math.max(b, c));
        return result;
    }
}
