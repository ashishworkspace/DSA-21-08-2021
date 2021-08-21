
package com.demo;

public class DynamicArray {

    public static void main(String[] args) {
        int arr [][] = {
            {1,2,4},
            {4,9},
            {3,7,8,0,2}
        }; 
        for(int rows=0; rows < arr.length; rows++){
            for(int col=0; col < arr[rows].length; col++){
                System.out.print(arr[rows][col]+ " " );
            }
            System.out.println();
        }
    }
}
