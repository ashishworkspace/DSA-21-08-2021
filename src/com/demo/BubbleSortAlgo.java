package com.demo;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {6, 4, 0, 9, 7, 1};
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length - 1; j++){                
                if(arr[j] > arr[j+1]){
                    int max = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = max; 
                }
            }
        }
        for(int num: arr){
            System.out.print(num+ " ");
        }
        

    }
}
