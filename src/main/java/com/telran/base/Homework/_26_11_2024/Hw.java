package com.telran.base.Homework._26_11_2024;

import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {

        //Part 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String wordOne = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String wordTwo = scanner.nextLine();

        System.out.println("String length :" + wordOne.length());
        System.out.println("String length :" + wordTwo.length());


        int middleOne = wordOne.length() / 2;
        int middleTwo = wordTwo.length() / 2;

        String partOne = wordOne.substring(0, middleOne);
        String partTwo = wordTwo.substring(middleTwo);

        String sumParts = partOne + partTwo;

        System.out.println(sumParts);


        //Part2
        String string = new String("I study Basic Java!");

        processString(sumParts);
    }

    public static void processString(String string){
        char lastChar = string.charAt(string.length() - 1);
        System.out.println(lastChar);

        boolean containsJava = string.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);

        String replace = string.replace('a', 'o');
        System.out.println("Строка после замены: " + replace);

        String upperCase = string.toUpperCase();
        System.out.println("Текст с верхним регистром: " + upperCase);

        String lowerCase = string.toLowerCase();
        System.out.println("Текст с нижним регистром: " + lowerCase);

        String javaSubstring = string.substring( string.length() - string.indexOf("Java"));
        System.out.println(javaSubstring);
    }


    /**
     * пытался сделать через циклы и методы
     * но на этапе с цикклами у меня возникли проблемы
     */
//    public static void main(String[] args) {
//
//
//        for (int i = 0; i < 2; i++) {
//            System.out.print("Введите "+ (i + 1) + "-e слово: ");
//            String word = scanner.nextLine();
//
//            if (word.length() % 2 == 0) {
//                int middle = getMiddle(word);
//                System.out.println("String length : " + word.length());
//
//
//                String part = word.substring(0, middle);
//
//            }
//            else{
//                System.out.println("Неправильное слово, введите еще раз!");
//            }
//
//        }
//
//    }
//    public static int getMiddle(String word){
//        return word.length() / 2;
//    }
}
