package com.demo;

import java.util.Scanner;

// Enter the three numbers and check the largest among them.
public class LargestNumber {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();
        System.out.print("Enter the third number: ");
        int third = in.nextInt();
        in.close();


        int maximum = first;
        if (maximum < second){
            maximum = second;
        }else if(maximum < third){
            maximum = third;
        }
        System.out.println("Maximum among three: "+maximum);
    }
}
