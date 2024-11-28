package com.telran.base.Lesson3;

public class StringExampleTwo {
    public static void main(String[] args) {
        String text = "Hello";
        //длина строки
        System.out.println(text);
        //вызов метода, который сообщит длину строки
        //text.length();
        int textLength = text.length();
        System.out.println("Text length = " + textLength);

        //метод получения символ из строки по номеру(индекс)
        //номер называется индекс
        //символы в строке нумеруются с 0
        //первый символ хронится под номером 0, последний под номером n - 1
        //где n это длина строки
        ////charAt(index)
        char symbol = text.charAt(0);
        System.out.println(symbol);
        char symbolEnd = text.charAt(4);
        System.out.println(symbolEnd);

    }
}
