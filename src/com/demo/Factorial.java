package com.demo;

import java.util.Scanner;


// Factorial of the number
public class Factorial{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
       try{
        System.out.print("Enter the number: ");
        int numb = userInput.nextInt();
        System.out.println(fact(numb));
       }
        finally{
            userInput.close();
        }

    }
    static int fact_store = 1;
    static int fact(int number){
        if(number != 0){
            fact_store =  number * fact_store;
            number = number - 1;
             
            fact(number);
        }
        return fact_store;
    }

}
