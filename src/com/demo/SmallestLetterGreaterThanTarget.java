package com.demo;

public class SmallestLetterGreaterThanTarget {
   public static void main(String[] args) {
    char[] letters = {'c','f','j'};
    char target = 'g';
       System.out.println(nextGreatestLetter(letters, target));
   } 
   static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;
             if(target > letters[middle]){
                start = middle + 1;
            }else if(target < letters[middle]){
                end = middle - 1;
            }
        }return letters[start % letters.length]; 
}
}
