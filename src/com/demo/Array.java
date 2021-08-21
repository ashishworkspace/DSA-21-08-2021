package com.demo;

import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int num  = 0; num < arr.length; num++){
            arr[num] = in.nextInt();
        }
        for(int num: arr){
            System.out.print(arr[num]);
        }
        //in.close();
    }
}
