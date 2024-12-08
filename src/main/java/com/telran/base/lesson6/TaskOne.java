package com.telran.base.lesson6;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели!");
        String day = scanner.next().toLowerCase();
        scanner.close();

        switch (day) {
            case "monday" -> System.out.println("Сложный день!");
            case "tuesday", "wednesday", "thursday" -> System.out.println("Робочий день!");
            case "friday" -> System.out.println("Веселый день!");
            case "saturday", "sunday" -> System.out.println("Чилим");
            default -> System.out.println("Неправильно");
        }
    }
}
