package com.telran.base.Lesson3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nextInt(); - чтения числа с консоли
        System.out.println("Please input your number: ");
        int dataFromConsole = scanner.nextInt();
        System.out.println("Your input = " + dataFromConsole / 2);

        //next(); читает слово с консоли, он вернет тип данных String
        System.out.println("Please input one word in console");
        String wordFromUser = scanner.next();
        System.out.println("String length = " + wordFromUser.length());
        scanner.nextLine();

        //nextLine(); читаем предложение с канцоли от 0 до конца
        System.out.println("Please input your name and surname in console");
        String userData = scanner.nextLine(); // \n, \r
        System.out.println("Hello ! " + userData);

        scanner.close();
    }
}
