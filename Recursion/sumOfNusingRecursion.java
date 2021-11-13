package com.example.test.Recursion;

public class sumOfNusingRecursion {
    static int getSumofN(int n){
        if (n<=1){
            return n;
        }                               // Recursive relation is T(n) = T(n-1) + Theta_(1)
        return n + getSumofN(n-1);   // Time complexity is "Theta_(n)"
    }                                   // Auxiliary space is "Theta_(n)"

    public static void main(String[] args) {
        int n = 4;
        System.out.println(getSumofN(n));
    }
}
