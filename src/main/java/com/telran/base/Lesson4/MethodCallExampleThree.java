package com.telran.base.Lesson4;

public class MethodCallExampleThree {
    public static void main(String[] args) {
        String result = getGreetings();
        System.out.println("Greetings: " + result);
        int code = getCode();
        System.out.println(code);
    }

    //3 - метод ничего не принимет, но, что-то возвращает
    public static String getGreetings(){
        String text = "Hello! Hello!";
        return text;
    }

    public static int getCode(){
        return 523;
    }
}
