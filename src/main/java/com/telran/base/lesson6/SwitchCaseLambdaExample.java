package com.telran.base.lesson6;

import java.util.Scanner;

public class SwitchCaseLambdaExample {
    public static void main(String[] args) {
        System.out.print("Please input number from 0 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        scanner.close();

        switch (data) {
            case 1 -> System.out.println("Your input 1");
            case 3 -> System.out.println("Your input 3");
            case 2, 4 -> System.out.println("You are the best!");
            case 5, 0 -> System.out.println("It is a corner number");
            default -> System.out.println("Your input not in 0 to 5");
        }
    }
}
