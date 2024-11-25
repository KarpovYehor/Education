package com.telran.base.Lessen2;

import org.w3c.dom.ls.LSOutput;

public class MathOparationExemple {
    public static void main(String[] args) {
        // +, -, *, /, %
        int numberOne = 10;
        int numberTwo = 7;
        int sum = numberOne + numberTwo;
        System.out.println("Sum 10 and 7 = " + sum);

        int sub = numberOne - numberTwo;
        System.out.println("Sub 10 and 7 = " + sub);

        int result = sub + sum;
        System.out.println("Result = " + result);

        int mult = numberOne * numberTwo;
        System.out.println("Mult 10 * 7 = " + mult);
    }

}
