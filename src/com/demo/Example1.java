package com.demo;
public class Example1{
    public static void main(String[] args) {
        int[] arr = {10, 200, 9 , 8000, 1, 9, 9999};
        System.out.print(evenDigitTotal(arr));
    }
    static int countDigit(int num){
        int count = 0 ;
        while (num != 0){
        int tmp = num % 10;
        count++;
        num = num / 10;
        }
        return count;
    }
    // [10, 200, 9 , 8000]
    static int evenDigitTotal(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(countDigit(arr[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}