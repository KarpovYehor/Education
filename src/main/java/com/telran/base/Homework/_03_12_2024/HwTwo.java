package com.telran.base.Homework._03_12_2024;

import java.util.Scanner;

public class HwTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете как вы хотите вводить: \nВ секодах(с)\nИли в часах(h)");
        String symbol = scanner.nextLine();

        int n;
        if (symbol.equals("c")){
            System.out.println("Введите число от 0 до 28800");
            n = scanner.nextInt();
            if (n < 0 || n > 28800) {
                System.out.println("Некорректное значение. Введите число от 0 до 28800.");
            } else {
                printTime(n);
            }
        } else if (symbol.equals("h")) {
            System.out.println("Введите число от 0 до 8");
            n = scanner.nextInt();
            if (n < 0 || n > 8) {
                System.out.println("Некорректное значение. Введите число от 0 до 8.");
            } else {
                printTime(n * 3600);
            }
        }else {
            System.out.println("Введите праильный символ!");
        }

        scanner.close();
    }


    public static void printTime(int seconds) {
        System.out.println("Осталось " + seconds + " секунд"); // Выводим в секундах

        // Рассчитываем полные часы
        int hours = seconds / 3600;

        if (hours > 1) {
            System.out.println("Осталось " + hours + " часов");
        } else if (hours == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }

    public static void getAnswer(int n){
        if (n == 8  || n == 28800){
            System.out.println("осталось 8 часов");
            System.out.println("осталось " + (n * 60 * 60) + " секунд");
        } else if (n == 7  || n == 25200){
            System.out.println("осталось 7 часов");
            System.out.println("осталось " + (n * 60 * 60) + " секунд");
        }else if (n == 6 || n == 21600){
            System.out.println("осталось 6 часов");
            System.out.println("осталось " + (n * 60 * 60) + " секунд");
        }else if (n == 5 || n == 18000){
            System.out.println("осталось 5 часов");
            System.out.println("осталось " + (n * 60 * 60) + " секунд");
        }else if (n == 4 || n == 14400){
            System.out.println("осталось 4 часов");
            System.out.println("осталось " + (n * 60 * 60) + " секунд");
        }else if (n == 3 || n == 10800){
            System.out.println("осталось 3 часов");
            System.out.println("осталось " + (n * 60 * 60) + " секунд");
        }else if (n == 2 || n == 7200){
            System.out.println("осталось 2 часов");
            System.out.println("осталось " + (n * 60 * 60) + " секунд");
        }else if (n == 1 || n == 3600){
            System.out.println("осталось 1 часов");
            System.out.println("осталось " + (n * 60 * 60) + " секунд");
        }else if (n == 0){
            System.out.println("осталось 0 часов");
            System.out.println("осталось " + n + " секунд");
        }
    }
}
