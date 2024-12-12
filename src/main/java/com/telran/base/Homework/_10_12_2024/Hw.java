package com.telran.base.Homework._10_12_2024;

import java.util.Scanner;

public class Hw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два значения:");
        int temperature1 = scanner.nextInt();
        int temperature2 = scanner.nextInt();
        count(temperature1, temperature2);

    }

    public static void count(int temperature1, int temperature2){
        if (temperature1 > 100 && temperature2 < 100){
            System.out.println("Прибор работает корректно");
        }else {
            System.out.println("Прибор работает некорректно");
        }
    }
}
