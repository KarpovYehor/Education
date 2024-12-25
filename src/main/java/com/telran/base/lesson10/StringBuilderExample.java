package com.telran.base.lesson10;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.append(" ").append("class!!").append(" Ok!");
        sb.delete(3, 6);
        sb.reverse();
        String result = sb.toString();
        System.out.println(result);

        String[] strings = {"Hello", "problem one", "result one", "error", "result"};
        String answer = getAnswer(strings);
        System.out.println(answer);
    }

    private static String getAnswer(String[] strings) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            answer.append(strings[i]).append(" ");
        }
        return answer.toString();
    }
}
