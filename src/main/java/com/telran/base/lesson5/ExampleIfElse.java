package com.telran.base.lesson5;

import java.util.Scanner;

public class ExampleIfElse {
    public static void main(String[] args) {
        System.out.print("Please input number 1: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data == 1) {
            System.out.println("Your input is correct!");
        } else {
            System.out.println("Your input is incorrect!");
        }
        scanner.close();
    }
}
