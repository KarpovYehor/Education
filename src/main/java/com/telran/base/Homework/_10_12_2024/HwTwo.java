package com.telran.base.Homework._10_12_2024;

import java.util.Scanner;

public class HwTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму на карте.\nОбъяснение:  N = ");
        int number = scanner.nextInt();
        withdrawAll(number);
    }

    public static void withdrawAll(int number) {
        while (number >= 0) {
            int divisor = findLargestDivisor(number);
            System.out.println("Снято: " + divisor + ", осталось = " + number);
            number -= divisor;
        }
    }

    public static int findLargestDivisor(int number) {
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
