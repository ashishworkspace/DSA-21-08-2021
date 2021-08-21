package com.demo;

public class SwapArray {
    public static void main(String[] args) {
        //Swaping the Array
        // [10, 30, 188, 92, 20, 50] ---> [50, 20, 92, 188, 30, 10]
        // int[] arr = {10, 30, 188, 92, 20, 50}; // n = 6
        //            0   1   2    3   4   5
        int[] arr = {10, 30, 188, 92, 20, 50, 72}; // n = 7 
        // logic middle = n / 2 
        for(int i = 0; i < (arr.length/2); i++){
            int tmp = arr[i];
            arr[i] = arr[(arr.length-1)-i]; 
            arr[(arr.length-1)-i] = tmp;
        }
        for(int num: arr){
            System.out.print(num+ " ");
        }
    }
}
