package com.telran.base.Homework._05_12_2024;

public class Hw {


    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;

        System.out.println(canBuy(isEdekaOpen, isReweOpen));
    }

    private static String canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        String result = isEdekaOpen || isReweOpen ? "Я могу купить еду, это возможно" : "Я могу купить еду, это невозможно";
        return result;
    }
}
