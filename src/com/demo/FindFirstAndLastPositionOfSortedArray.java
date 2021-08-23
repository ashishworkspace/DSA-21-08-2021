package com.demo;

public class FindFirstAndLastPositionOfSortedArray {
    public static void main(String[] args) {
        int[] answer = {-1, -1};
        int[] userInputArray = {1, 2, 2, 2, 3,333};
        int targetNumber = 2; 
        answer[0] = fistLastPostion(userInputArray, targetNumber, true);
        answer[1] = fistLastPostion(userInputArray, targetNumber, false);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
    static int fistLastPostion(int[] userInputArray, int targetNumber, boolean findStartIndex){
        int start = 0;
        int end = userInputArray.length;
        int ans = -1;
        while(start <= end){
            int middle = start + (end-start) / 2; // 7
            if(userInputArray[middle] < targetNumber){  
                start = middle + 1; 
            }else if(userInputArray[middle] > targetNumber){ // 60 > 44
                end = middle - 1;  
            }else{
                ans = middle;
                if(findStartIndex){
                    end = middle - 1;
                }else{
                    start = middle + 1;
                }
            }
        }return ans;
    }
}
