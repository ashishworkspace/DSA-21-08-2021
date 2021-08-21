package com.demo;

import java.util.Scanner;

public class Functions {
    public static void main(String args[]){
        String name = printName();
        System.out.println(name);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second Number: ");
        int num2 = in.nextInt();
        System.out.println(addTwoNumbers(num1, num2));
        in.close();
    }
    static String printName(){
        return "My name is Ashish";
    }
    // Calculator
    static int addTwoNumbers(int n1, int n2){
        int num1 = n1;        
        int num2 = n2;
        return num1 + num2;
    }
}
