package com.telran.base.lesson6;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день нидели: ");
        String day = scanner.next().toLowerCase();

        checkDay(day);
        System.out.println(getTernary(day));
    }

    private static void checkDay(String day) {
        switch (day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("Не выходной");
            case "sunday", "saturday" -> System.out.println("Выходной");
        }
    }

    private static String getTernary(String day){
        String returnResult = "sunday".equals(day) || "saturday".equals(day) ? "Relax" : "Не выходной";
        return returnResult;
    }
}
