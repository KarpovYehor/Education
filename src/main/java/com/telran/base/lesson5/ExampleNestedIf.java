package com.telran.base.lesson5;

import java.util.Scanner;

public class ExampleNestedIf {
    public static void main(String[] args) {
        int number = 10;
        System.out.print("Please input number : ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data < 10){
            System.out.println("Your input is correct!");
            if (data % 2 == 0){
                System.out.println("Your input is even");
            }else {
                System.out.println("Your input is odd");
            }
        }else {
            System.out.println("Your input is incorrect!");
        }

        scanner.close();
    }
}
