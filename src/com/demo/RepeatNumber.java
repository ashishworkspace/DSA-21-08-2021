package com.demo;

import java.util.Scanner;

public class RepeatNumber {
    // Find how much time the 7 occure in the 
    
    public static void main(String args []){
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int number = in.nextInt();
        System.out.print("Enter the number to check the number of occurance:  ");
        int occ = in.nextInt();
        in.close();
        
        while (number != 0){
            if(number%10 == occ){ //57477%10 = 7
                count += 1;
            }
            number = number/10; // 57477/10 = 57477
        } 
        System.out.println(count);
    }
}
