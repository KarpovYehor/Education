package com.telran.base.lesson5;

import java.util.Scanner;

public class ExampleElseIf {
    public static void main(String[] args) {
        System.out.print("Please input number under 5: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        if (data == 1) {
            System.out.println("Your input is 1");
        } else if (data == 2) {
            System.out.println("Your input is 2");
        } else if (data == 3) {
            System.out.println("Your input is 3");
        } else if (data == 4) {
            System.out.println("Your input is 4");
        } else if (data == 5) {
            System.out.println("Your input is 5");
        } else {
            System.out.println("Your input is incorrect!");
        }
    }
}
