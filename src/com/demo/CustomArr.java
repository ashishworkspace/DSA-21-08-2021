package com.demo;

import java.util.Scanner;

public class CustomArr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
}
