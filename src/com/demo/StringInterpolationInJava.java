package com.demo;

import java.util.ArrayList;

public class StringInterpolationInJava {
    public static void main(String[] args) {
        String interpolation = "Hello i love no${}";
        char[] stringArray = interpolation.toCharArray();
        ArrayList<Character> stringDynamic = new ArrayList<>();
        for(char singleChar: stringArray){
            stringDynamic.add(singleChar);
        } 
        char targetChar = '$';
        System.out.print(BinarySearchFunc(stringDynamic, targetChar));
    }
    static String BinarySearchFunc(ArrayList<Character> stringDynamic, char targetChar){ 
        for(char ch: stringDynamic){
            if(targetChar == ch){
                return "present";

            }
        }return "not present";
    }

}
