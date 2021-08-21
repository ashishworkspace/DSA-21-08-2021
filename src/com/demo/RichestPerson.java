package com.demo;

public class RichestPerson {
    public static void main(String[] args) {
        // Input : account = [[1,5], [7,3], []]
        // Output: 6
        int[][] twoDimensionArray = {
            {1, 5},
            {7, 3},
            {3, 5}
        };

        int max = 0;
        for(int rows=0; rows < twoDimensionArray.length; rows++){
            int sum = 0;
            for(int col=0; col < twoDimensionArray[rows].length; col++){
                sum = sum + twoDimensionArray[rows][col];
            }
            if (sum > max){
                max = sum;
            }
        } 
        System.out.println("Maximum: "+max);
    }
}
