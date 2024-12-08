package com.telran.base.lesson5;

/**
 * сщздаем переменные я,ч,с,м,
 * <p>
 * используя блок if нужно составить логические выражения:
 * 1- истина, если я<ч и ч==с
 * 2- истинно, если я > x или с ==м
 * 3- истинно, если я не равно ч
 */
public class Practice {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int c = 10;
        int d = 10;

        if (a < b && b == c) {
            System.out.println("Первый вариант");
        }
        if (a > b || c == d) {
            System.out.println("Второй вариант");
        }
        if (a != b) {
            System.out.println("Третий вариант");
        }
    }
}
