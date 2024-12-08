package com.telran.base.Homework._03_12_2024;

public class Hw {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 9;
        double distance_m;
        double distance_n;
        getNearestNumber(m, n);


        //Подсмотрел в GPT
        if ((10 - m) > 0){
            distance_m = 10 - m;
        }else {
            distance_m = m - 10;
        }

        if ((10 - n) > 0){
            distance_n = 10 - n;
        }else {
            distance_n = n - 10;
        }


        if (distance_m > distance_n){
            System.out.println("Число " + m + " ближе к 10.");
        }else if(distance_n > distance_m){
            System.out.println("Число " + n + " ближе к 10.");
        }else {
            System.out.println("Числа " + m + " и " + n + " равноудалены от 10.");
        }


    }

    // Сделал сам
    public static void getNearestNumber(double m, double n){
        if (m >= 10 && n >= 10){
            if (m > 10 && n > m){
                System.out.println("Число " + m +" ближе к 10");
            }else if(n > 10 && m > n){
                System.out.println("Число " + n +" ближе к 10");
            }
        }
        if (m <= 10 && n <= 10) {
            if (m < 10 && n < m){
                System.out.println("Число " + m +" ближе к 10");
            }else if(n < 10 && m < n){
                System.out.println("Число " + n +" ближе к 10");
            }
        }

    }

}
