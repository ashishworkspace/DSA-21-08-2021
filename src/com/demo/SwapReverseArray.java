package com.demo;

public class SwapReverseArray {
    // Swap the numbers in the array
    public static void main(String[] args) {
        int[] arr = {1,3,1,33,4,0};
        reverseArray(arr);
    }
    static void swapParticularIndex(int[] arr, int initial,int last){
        int temp = arr[initial];
        arr[initial] = arr[last];
        arr[last] = temp;
    }
    // start                 end
    // [10, 30, 188, 92, 20, 50]
    //   0   1    2   3   4   5
    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swapParticularIndex(arr, start, end);
            start++;
            end--;
        }
        for(int num: arr)
        System.out.print(num + " ");
    }
}
