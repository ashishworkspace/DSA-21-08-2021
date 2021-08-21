package com.demo;

public class PassValue {
    public static void main(String args[]){
        int arr[] = {10,20,40};
        changeArrayValue(arr);
        System.out.println(arr[0]);


        // Second Example
        int val = 20;
        changeValue(val);
        System.out.println(val);
    }
    static void changeArrayValue(int[] arr ){ // [10,20,40]
        arr[0] = 111;  // [111, 20, 40] // this will bring change in value of the reference varaible
    }

    static void changeValue(int val){ // val = 20
        val = 500; // val = 500 // this will not bring the change in 
    }
}
