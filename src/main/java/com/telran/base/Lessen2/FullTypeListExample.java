package com.telran.base.Lessen2;

public class FullTypeListExample {
    public static void main(String[] args) {
        //default value 0
        byte byteNumber = 100; // -128 to 127; 8 bits
        short shortNumber = 14567; // -32768 to 32767; 16 bits
        int intNumber = 343434324; // -2bill. to 2 bill.; 32 bits
        long longNumber = 34343534343L; // 64 bits

        //default value 0.0
        float floatNumber = 123456.43221f; // 8 before . 7 after; 32 bits
        double doubleNumber = 4637578758.57854587457;

        byte byteNumberTest = 10;
        byte byteNumberTestTwo = byteNumberTest;

        int intTest = byteNumberTest;
        long longTest = byteNumberTest;

        byte byteTest = (byte) longTest; // костамизация, приведения типа

        //default  value '\u0000'
        char charSym = 'A'; // 16 bits

        // default value false
        boolean booleanType = true; // 1 bit

        //default value null
        String text = "Hello world";
    }
}
