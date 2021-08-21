package com.demo;

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userInput = in.nextInt();
        in.close();
        if (getArmstrong(userInput, getPower(userInput)) ==  userInput){
            System.out.print("It is a Armstrong Number");
        }else{
            System.out.print("It is not a Armstrong Number");
        }
    }
    static int getPower(int num){
        int count = 0;
        while(num != 0){
            int last_digit = num % 10;
            count = count + 1;
            num = num / 10;
        }
        return count;
    }
    static double getArmstrong(int num, int power){
        double val = 0;
        while(num != 0){
            int last_digit = num % 10;
            val = val + Math.pow(last_digit, power);
            num = num / 10;
        }
        return val;
    }
}
