package com.telran.algorithms.lesson3;

public class RecursionTask {

    public static void main(String[] args) {
        System.out.println(sumIteration(5));
        System.out.println(rec(5));
    }

    public static int sumIteration(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static int rec(int n){
         // 5
        //base case
        if(n == 1){
            return 1;
        }
        //recurrent case
        int sum = n + rec(n - 1);
        return sum;
    }
}
