package com.telran.base.Lesson3;

public class Variables {
    static int staticVar = 10;
    int instanceVar = 10;

    public static void main(String[] args) {
        int localVar = 12;
        staticVar++;
        localVar++;
        System.out.println(staticVar);
        System.out.println(localVar);
        print();

    }

    public static void print(){
        System.out.println(staticVar);
    }
}
