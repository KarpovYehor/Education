package com.telran.base.lesson7;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//            System.out.println("hi");
//        }
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printNumber(number);
        printNumberTwo(number);
        printRevers(number);

    }

    public static void printNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);

        }
    }

    public static void printNumberTwo(int number) {
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    public static void printRevers(int number) {
        for (int i = number; i >= 0; i--){
            System.out.println(i);
        }
    }
}
