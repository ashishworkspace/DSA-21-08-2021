package com.demo;

import java.util.Scanner;

public class Fibonacchi{
    // 0 , 1 , 1, 2, 3, 5, 8 ...
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of term: ");
        int userInput = in.nextInt(); // 5
        in.close();
        int arr[] = new int[userInput];             
        int first = 0; 
        int second = 1; 
        arr[0] = first;
        arr[1] = second;
        for(int value = 2; value < userInput; value++){
            int sum = first + second;
            arr[value] = sum;
            first = second;  
            second = sum; 
        }
        for(int i=0; i< userInput; i++){
            System.out.print(arr[i] + " "); 
        }
        
    }

}
