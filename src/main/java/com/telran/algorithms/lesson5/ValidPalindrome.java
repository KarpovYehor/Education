package com.telran.algorithms.lesson5;

public class ValidPalindrome {

    public static void main(String[] args) {
        String str = "abeccdeba";
        System.out.println("Is palindrome abeccdeba: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if( l == r){
                left++;
                right--;
            } else{
                return check (str, left + 1, right) || check (str, left, right - 1);
//                либо корректный цикл без буквы слева   //false
//                или
//                либо корректный цикл без буквы справа  //false
            }
        }
        return true;
    }

    public static boolean check(String str, int left, int right) {
        while(left < right){
            if(str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    //Space complexity 0(1)
    //Time complexity 0(n)
}
