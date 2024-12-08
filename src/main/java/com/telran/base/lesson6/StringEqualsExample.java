package com.telran.base.lesson6;

import java.util.Scanner;

public class StringEqualsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word");
        String userWord = scanner.next();
        boolean equalsHallo = isEquals(userWord);
        if (equalsHallo){
            System.out.println("Hi User");
        }

    }

    private static boolean isEquals(String value){
        if ("Hallo".equals(value)){
            return true;
        }
        return false;
    }
}
