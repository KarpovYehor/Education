package com.telran.base.Homework._05_12_2024;

import java.util.Scanner;

public class HwLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год для проверки высокосный ли он: ");
        int year = scanner.nextInt();

        getLeapYear(year);

    }
    private static void getLeapYear(int year){
        System.out.println(year % 4 == 0 ? "Год высокосный!" : "Этот год не высокосный!");
    }
}
