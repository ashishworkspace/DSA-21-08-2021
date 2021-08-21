package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(10);
        System.out.println(list);


        ArrayList<Integer> intList = new ArrayList<Integer>(3);
        for(int i = 0; i <= 5 ; i++){
            System.out.print("Enter the Number: ");
            intList.add(in.nextInt());
        }
        for(int num: intList){
            System.out.print(num+ " ");
        }
    }
}
