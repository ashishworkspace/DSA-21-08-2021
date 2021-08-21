package com.demo;

public class LinearSearch {
    public static void main(String[] args) {
        // Searching a string 

       System.out.println(searchingString("sdfknjsvkdjn", 'z'));
    }

    static boolean searchingString(String str, char target){
       for(int i=0;i<str.length()-1;i++){
           if(str.charAt(i) == target){
               return true;
           }
       }
       return false;
    }
}
