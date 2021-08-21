package com.demo;


public class AscendingDescendingBinarySearch {
    public static void main(String[] args) {
       //            0   1   2   3   4    5    6     7  
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 20, 21, 30};
        // int[] arr2 = {256, 182, 140, 101, 90, 78, 44, 12};
        System.out.println(binarySearch(arr, 17));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isasc = arr[start] < arr[end];
        int temp = 0 ;
        if(isasc){
        while(start <= end){
            int middle = start + (end - start) / 2 ;
            temp = middle;
            if (arr[middle] == target){
                return arr[middle];
            }else if(arr[middle] < target){
                start = middle + 1;
            }else if(arr[middle] > target){
                end = middle - 1;
            }
            System.out.println(temp);
        }if(target <= arr[temp]){
            return arr[temp]; // arr[start]
        }else{
            return arr[temp + 1];
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
