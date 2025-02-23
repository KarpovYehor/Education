package com.telran.algorithms.lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BoatTask {

    public static void main(String[] args) {
        int[] people = {10,55,70,20,90,85};
        int[] people2 = {10,10,51,90,90};
        System.out.println(getNumberOfBoats(people, 100));
        System.out.println(getNumberOfBoats(people2, 100));
    }

    public static int getNumberOfBoats(int[] people, int limit){
        Arrays.sort(people);       // 0(n log n)
        int left = 0;
        int right = people.length - 1;
        int boat = 0;
        //{10,20,55,70,85,90}
        int currentWeight = 0;
        while (left <= right){
            currentWeight = people[left] + people[right];
            while (currentWeight <= limit && left < right){        // 0(n)
                left++;
                currentWeight = currentWeight + people[left];
            }
            boat++;
            right--;
        }
//        if (left = right){
//            boat++;
//        }
        return boat;
        // Time complexity = 0(n log n)
        // Space complexity = 0(1) ,
    }
}
