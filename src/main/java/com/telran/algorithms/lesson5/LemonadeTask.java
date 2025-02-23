package com.telran.algorithms.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class LemonadeTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listMoney = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            int bill = scanner.nextInt();
            if (bill == 0){
                break;
            }
            if (bill == 5 || bill == 10 || bill == 20){
                getList(listMoney, bill, i);
            }
        }

        scanner.close();
    }

    public static void getList(List<Integer> listMoney , int bill , int i){

        listMoney.add(bill);
        int count = 0;
        for (int b : listMoney){
            if (b == 5){
                count++;
            }
        }

        if (bill == 5){
            getSOUT(listMoney, bill, i);
        }
        if (bill == 10){
            if (listMoney.contains(5)){
                listMoney.remove(Integer.valueOf(5));
                getSOUT(listMoney, bill, i);
            } else {
                System.out.println("Ошибка: не хватает сдачи");
            }
        }
        if (bill == 20){
            if (listMoney.contains(10) && listMoney.contains(5)){
                listMoney.remove(Integer.valueOf(10));
                listMoney.remove(Integer.valueOf(5));
                getSOUT(listMoney, bill, i);
            } else if (count >= 3){
                for (int j = 0; j < 3; j++) {
                    listMoney.remove(Integer.valueOf(5));
                }
                getSOUT(listMoney, bill, i);
                count -= 3;
            } else {
                System.out.println("Ошибка: не хватает сдачи");
            }
        }
    }

    public static void getSOUT(List<Integer> listMoney , int bill, int i){
        System.out.println((i + 1) + " pay " + "$" + bill +  "   ||   " +  listMoney);
    }

    public static void checkMoney (List<Integer> listMoney, int number ){
        int num = 5;
        if (number == num){
            Scanner scanner = null;
            listMoney.add(scanner.nextInt());
        }
    }


}
