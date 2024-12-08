package com.telran.base.lesson6;

import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {
        System.out.println("1- Say Hello, 2- Say bye");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        String result = getWordWithTernaryOperator(data);
        System.out.println(result);
        System.out.println(getWordWithTernaryOperator(data));

    }

    private static String getWort(int data){
        if (data == 1){
            return "Hello";
        }else {
            return "Bye";
        }
    }

    private static String getWordWithTernaryOperator(int data){
        String answer = data == 1 ? "Hello" : "Bye";
        return answer;
        //или
        //return data == 1 ? "Hello" : "Bye";
    }
}
