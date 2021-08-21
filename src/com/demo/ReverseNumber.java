package com.demo;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int userInput = in.nextInt();
        in.close();
        int answer = 0;
        while(userInput != 0){
            int lastDigit = userInput % 10 ;
            userInput /= 10;
            answer = answer * 10 + lastDigit;
        }
        System.out.println(answer);
    }
}
 // 56729
 // 9
 // 9*10 + 2  = 92
 // 92*10 + 7 = 927 
