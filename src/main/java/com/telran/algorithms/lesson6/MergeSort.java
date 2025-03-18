package com.telran.algorithms.lesson6;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] one = {1, 3, 5, 6};
        int[] two = {2, 3, 4};

        System.out.println(Arrays.toString(merge(one, two)));

        int[] array = {38,27,43,3,9,82,10};
//        int[] sortedArray = mergeSort(array);
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    public static int[] merge(int[] one, int[] two) {
        int oneIndex = 0;
        int twoIndex = 0;
        int resultIndex = 0;
        int[] result = new int[one.length + two.length];
        while (oneIndex < one.length && twoIndex < two.length) {
            int oneElement = one[oneIndex];
            int twoElement = two[twoIndex];
            if (oneElement < twoElement) {
                result[resultIndex] = oneElement;
                oneIndex++; //1 2
            } else {
                result[resultIndex] = twoElement;
                twoIndex++; //1 2 3
            }
            resultIndex++;
        }

        while(oneIndex < one.length){
            result[resultIndex] = one[oneIndex];
            oneIndex++;
            resultIndex++;
        }

        while(twoIndex < two.length){
            result[resultIndex] = two[twoIndex];
            twoIndex++;
            resultIndex++;
        }
        return result;
    }

    public static int[] mergeSort(int[] array){
        if (array.length == 1){
            return array;
        }
        //находим середину нашего массива
        int mid = array.length/2;
        //создать два новых массива с (0 до mid - 1) и с (mid до array.length - 1)
        int[] left = Arrays.copyOfRange(array,0, mid);  //38,27,43,3   //38,27  // 38
        int[] right = Arrays.copyOfRange(array, mid, array.length);    //9,82,10      //43,3   // 27

        int[] resultLeft = mergeSort(left);   //38,27,43,3

        int[] resultRight = mergeSort(right); //9,82,10

        return merge(resultLeft, resultRight);
    }
}
