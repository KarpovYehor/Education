package com.telran.base.lesson7;

public class BreakContinueExample {

    public static void main(String[] args) {
        String test = "Hello Java Class!";

        for (int i = 0; i < test.length(); i++) {
            char temp = test.charAt(i);
            System.out.println("Get symbol " + temp + " and check it with J");
            if ('J' == temp){
                System.out.println("We found J in String");
                break;
            }
            //System.out.println(test.charAt(i));
        }

        for (int i = 0; i < 100; i++){
            if (i % 5 != 0){
                continue;
            }
            System.out.println("We found correct number " + i);
        }
    }
}
