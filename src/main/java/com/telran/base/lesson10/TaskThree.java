package com.telran.base.lesson10;

public class TaskThree {

    public static void main(String[] args) {
        String text = "Hello Java";
        System.out.println(reversText(text));

    }

    private static String reversText(String text) {
        StringBuilder sbOne = new StringBuilder();
        StringBuilder sbTwo = new StringBuilder();
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            if (temp != ' ') {
                sbOne.append(temp);
            } else {
                index = i + 1;
                break;
            }
        }

        for (int i = index; i < text.length(); i++) {
            char temp = text.charAt(i);
            sbTwo.append(temp);
        }

        return sbTwo.append(" ").toString() + sbOne.toString();
    }
}
