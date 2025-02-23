package com.telran.algorithms.lesson4;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] arr = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        int x = 114;
        int left = 0;
        int right = arr.length - 1;
        System.out.println("Index of 114 = " + binarySearch(arr, x));

        System.out.println("Index of 114 = " + recursionBinarySearch(arr, x, left, right));
    }
    //Time complexity 0(log n)
    //Space complexity 0(1)
    //Если вы видите алгоритм в котором в каждой итерации цикла исходные данные делятся
    //пополам и потом берется в работу одна из половин, то сложность такого алгоритма
    // Time complexity 0(log n)
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int element = arr[mid];
            if (element == x) {
                return mid;
            }
            if (element < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int recursionBinarySearch(int[] arr, int x, int left, int right){
        int mid = left + (right - left) / 2;
        int element = arr[mid];

        //base case
        if (element == x) {
            return mid;
        }
        if (left > right){
            return -1;
        }

        if (element < x) {
            return recursionBinarySearch(arr, x, left, mid + 1);
        } else {
            return recursionBinarySearch(arr, x, left, mid - 1);
        }
    }
}
