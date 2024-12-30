package com.telran.base.lesson11.calc;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator("Eng");
        calc.printSum(5,34);
        calc.printSum(8, 2);
        calc.switchLanguage();
        calc.printSum(54, 2);
    }

}
