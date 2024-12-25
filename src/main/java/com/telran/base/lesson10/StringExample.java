package com.telran.base.lesson10;

public class StringExample {

    public static void main(String[] args) {

        String[] strings = {"Hello", "problem one", "result one", "error", "result"};

        String answer = getAnswer(strings);
        System.out.println(answer);
    }

    private static String getAnswer(String[] strings){
        String answer = "";
        for (int i = 0; i < strings.length; i++) {
            answer = answer + " " + strings[i];
        }
        return answer;
    }
}
