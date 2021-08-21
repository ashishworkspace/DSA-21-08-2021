package com.demo;

public class GreaterThanCeilBinarySearch{
    public static void main(String[] args) {
        int[] arr = {12, 44, 78, 90, 101, 140, 182, 266};
        int[] arr2 = {256, 182, 140, 101, 90, 78, 44, 12};
        System.out.println(binarySearch(arr, 44));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isasc = arr[start] < arr[end];
        if(isasc){
        while(start < end){
            int middle = start + (end - start) / 2 ;
            if (arr[middle] == target){
                return arr[middle];
            }else if(arr[middle] < target){
                start = middle + 1;
            }else if(arr[middle] > target){
                end = middle - 1;
            }
        }
    }else{
        while(start < end){
            int middle = start + (end - start) / 2 ;
            if (arr[middle] == target){
                return arr[middle];
            }else if(arr[middle] < target){
                end = middle - 1;
            }else if(arr[middle] > target){
                start = middle + 1;
            }
         }
    }
    return -1;
    }
}

