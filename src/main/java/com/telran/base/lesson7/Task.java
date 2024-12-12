package com.telran.base.lesson7;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 для старта, 2 для загрузки, 3 для вывода, 4 для выхода");

        boolean run = true;
        while (run) {
            int number = scanner.nextInt();
            switch (number){
                case 1 -> start();
                case 2 -> dounlauds();
                case 3 -> printResult();
                case 4 -> run = false;
            }

        }

        scanner.close();
    }

    public static void start() {
        System.out.println("Start");
    }

    public static void dounlauds() {
        System.out.println("Dounlauds");
    }

    public static void printResult() {
        System.out.println("Result");
    }

    public static void exit() {

    }
}
