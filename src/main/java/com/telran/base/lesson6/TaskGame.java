package com.telran.base.lesson6;

import java.util.Scanner;

public class TaskGame {
    public static void main(String[] args) {
        System.out.println("Manu: ");
        System.out.println("1-Start, 2-Winners, 3-Exit");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        switch (input){
            case 1 -> startGame();
            case 2 -> printWinners();
            case 3 -> exitGame();
        }
    }

    public static void startGame(){
        System.out.println("Game start");
    }

    public static void exitGame(){
        System.out.println("Game Exit");
    }

    public static void printWinners(){
        System.out.println("Game Winners");
    }
}
