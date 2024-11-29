package com.telran.base.Homework._28_11_2024;

import java.util.Random;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hw math = new Hw();
        Random random = new Random();
        int num1 = random.nextInt(1, 100);
        System.out.println("Введите первое число: " + num1);

        System.out.print("Введите знак: ");
        String charR = scanner.nextLine();

        int num2 = random.nextInt(1, 100);
        System.out.println("Введите второе число: " + num2);

        switch (charR){
            case "+":
                System.out.println("Sum: " + math.getSum(num1, num2));
                break;
            case "-":
                System.out.println("Difference: " + math.getDiff(num1, num2));
                break;
            case "*":
                System.out.println("Multiplication: " + math.getMult(num1, num2));
                break;
            case "/":
                System.out.println("Division: " + math.getDiv(num1, num2));
                break;
            default:
                System.out.println("Вы ввели не верный знак!!!");
        }
    }

    public int getSum(int a, int b){
        return a + b;
    }
    public int getDiff(int a, int b){
        return a - b;
    }
    public int getMult(int a, int b){
        return a * b;
    }
    public int getDiv(int a, int b){
        return a / b;
    }


}
