package com.demo;

import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] userInputArray = {9, 2, 5, 63, 11, 44, 4, 60, 22, 69};
        int[] userInputArray2 = {67, 43, 21, 11, 1, 0};
        System.out.print("Find the number in the array: ");
        int getNumber = in.nextInt();
        in.close();
        //System.out.println(BinarySearchAscendingFunc(userInputArray, getNumber));
        System.out.println(BinarySearchDescendingFunc(userInputArray2, getNumber));
    }
    static String BinarySearchAscendingFunc(int[] userInputArray, int targetNumber){ // userInputArray must be sorted
        int start = 0;  // 5 
        System.out.println(targetNumber);
        int end = userInputArray.length - 1; // 9
        //System.out.println(end);
        String output = "";
        int count = 0 ;

        while(start <= end){
            count = count + 1;
            int middle = start + (end-start) / 2; // 7
            if (userInputArray[middle] == targetNumber){
                 return "Item found!😀";
            }else if(userInputArray[middle] < targetNumber){  
                start = middle + 1; // 5
            }else if(userInputArray[middle] > targetNumber){ // 60 > 44
                end = middle - 1;  // 6
            }else{
                return "No the Item is not fount!😌";
            }
        }
        return output;
    }
    static String BinarySearchDescendingFunc(int[] userInputArray, int targetNumber){ // userInputArray must be sorted
        int start = 0;  // 5 
        //System.out.println(targetNumber);
        int end = userInputArray.length - 1; // 9
        //System.out.println(end);
        String output = "";
        int count = 0 ;

        while(start <= end){
            count = count + 1;
            int middle = start + (end-start) / 2; // 7
            // [67, 43, 21, 11, 1, 0]  
            if (userInputArray[middle] == targetNumber){
                 return "Item found!😀";
            }else if(userInputArray[middle] < targetNumber){  
                 end = middle - 1;  // 6
            }else if(userInputArray[middle] > targetNumber){ // 60 > 44
                 start = middle + 1;
            }else{
                return "No the Item is not fount!😌";
            }
        }
        return output;
    }
}