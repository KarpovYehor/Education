package com.telran.base.lesson12;

public class AppExample {

    public static void main(String[] args) {
        int ticketPriceOne = 5;
        int ticketPriceTwo = 10;
        int sum = getSum(ticketPriceOne, ticketPriceTwo);
        int people = 5;
        int fullPrice = getSumPrice(sum, people);
        System.out.println("Full trip price is " + (sum * people));
    }

    public static int getSum(int a, int b){
        int sum = a + b;
        //System.out.println("Sum a = " + a + " + b = " + b + " = " + sum);
        return sum;
    }

    public static int getSumPrice(int tripPrice, int numberOfPerson){
        return tripPrice * numberOfPerson;
    }
}
