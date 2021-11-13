package com.example.test;

public class generateSubset {
    static void printSub(String str, String curr, int index){
        if (index == str.length()){
            System.out.println(curr);
            return;
        }
        // Time complexity is :- Big_O(2_power_n)
        printSub(str, curr, index+1);                           // Does not include character.
        printSub(str, curr+str.charAt(index), index+1);     // Include character.
    }

    public static void main(String[] args) {
        String str = "ABC";
        printSub(str, "",0);
    }
}
