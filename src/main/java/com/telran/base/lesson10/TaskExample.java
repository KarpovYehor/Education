package com.telran.base.lesson10;

public class TaskExample {

    public static void main(String[] args) {
        String one = "Hello";
        String two = "World!!!";

        System.out.println(concatReversString(one, two));

        char[] arr = {'I', 'L', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        System.out.println(reverseCharAndPrintString(arr));
    }

    private static String concatReversString(String one, String two) {
        StringBuilder sb = new StringBuilder();
        sb.append(one).append(" ").append(two);
        sb.reverse();
        return sb.toString();
    }

    private static String reverseCharAndPrintString(char[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?'){
                arr[i] = 'e';
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == '?'){
//                sb.append('e');
//            }else {
//                sb.append(arr[i]);
//            }
//        }

        return sb.toString();
    }
}
