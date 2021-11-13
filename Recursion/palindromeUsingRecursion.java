package com.example.test;

public class palindromeUsingRecursion {
    static boolean isPalindrome(String str,  int start, int end){ // start=0;end=n-1;
        if (start >= end){          // Time complixity is :- "Theta_(n)"
            return true;            // Auxiliary space is :- "Theta_(n)"
        }                           // Recusive relation  :- "T(n = T(n-2) + Theta_(1)"
        return ( ( str.charAt(start) == str.charAt(end) ) && isPalindrome(str, start+1, end-1) );
    }

    public static void main(String[] args) {
        String s = "ganeshsenag";
        int start = 0;
        int end = s.length() - 1;
        System.out.println( isPalindrome(s, start, end) );
    }
}
