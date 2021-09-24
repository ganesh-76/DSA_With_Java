package com.example.test;

public class countSetBits {
    /*
    static int countingSetBits(int n){
        int res = 0;
        while(n>0){
            if (n%2 != 0){          // Time Complexity = "Theta(Total bits in n)"
                res++;
            }
            n = n/2; // When we check right most bit we found that it is n/2 after eliminating n, bcoz of series.
        }               // ex:-13= 0...1101, 0...0110, 0...0011, 0...0001, 0...0000
        return res;     //             13        6         3         1
    }
     */
    static int countingSetBits(int n){
        int res = 0;
        while(n != 0){
            res = res + (n&1);
            n = n >> 1; // When we check right most bit we found that it is n/2 after eliminating n, bcoz of series.
        }               // ex:-13= 0...1101, 0...0110, 0...0011, 0...0001, 0...0000
        return res;     //             13        6         3         1
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(countingSetBits(n));
    }
}