package com.demo;

import java.util.Scanner;

public class PrimeNumber {
    // Check wether the Number is Prime or Not
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userInput = in.nextInt();
        in.close();
        

    }


    static boolean isPrime(int number){
        int c = 2;
        if (number == 1){
            return false;
        }
        while (c*c <= number){
            if(number % c == 0){
                return false;
            }
            c++;
        }
        return c*c > number; // true 
    }

}
