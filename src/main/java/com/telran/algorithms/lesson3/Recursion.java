package com.telran.algorithms.lesson3;

public class Recursion {

    public static void main(String[] args) {
        //print digits from 1 to 5
        System.out.println("Iterate approach");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("Recurrent approach");
        printDigit(1);

        System.out.println("Recurrent revers approach");
        printDigitRevers(5);

        System.out.println("Recurrent revers two approach");
        printDigitReversTwo(5);
    }

    public static void printDigit(int n){
        // base case
        if (n == 6){
            return;
        }
        //recurrent case
        System.out.println(n);
        printDigit(n + 1);
    }

    public static void printDigitRevers(int n){
        // base case
        if (n == 0){
            return;
        }
        //recurrent case
        System.out.println(n);
        printDigitRevers(n - 1);
    }

    public static void printDigitReversTwo(int n){
        // base case
        if (n == 0){
            return;
        }
        //recurrent case
        printDigitReversTwo(n - 1);
        System.out.println(n);
    }
}
