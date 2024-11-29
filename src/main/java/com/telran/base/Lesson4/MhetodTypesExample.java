package com.telran.base.Lesson4;

public class MhetodTypesExample {

    //1 - метод ничего не принемает и ничего не возвращает
    public static void print(){
        //body
    }

    //2 - метод принимет параметры и ничего не возвращает
    public static void printInfo(String text, int number){
        //body
    }

    //3 - метод ничего не принимет, но, что-то возвращает
    public static int getAge(){

        return 35;
    }

    //4 - Метод принимает параметры и возвращает что-то
    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
