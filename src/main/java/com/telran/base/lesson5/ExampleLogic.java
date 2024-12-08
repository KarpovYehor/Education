package com.telran.base.lesson5;

public class ExampleLogic {
    public static void main(String[] args) {
        int number = 7;
        if(number > 5 && number < 10){
            System.out.println("Out number from 5 to 10");
        }

        number = 4;
        if(number >= 5 || number <= 10){
            System.out.println("Out number from 5, or less then 10");
        }

        boolean isCorrect = false;
        if (!isCorrect){
            System.out.println("Is incorrect");
        }
    }

}
