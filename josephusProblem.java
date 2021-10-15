package com.example.test;

public class josephusProblem {
    static int jos(int n, int k){
        if (n==1){
            return 0;
        }                                  // Time complexity is :- "Theta(n)"
        return (jos(n-1, k) + k) % n;   // Recursive relation is :- "T(n) = T(n-1)+ C"
    }
    static int myJos(int n, int k){
        return jos(n, k) + 1;
    }

    public static void main(String[] args) {
        //System.out.println( jos(7,3));      // If position begins from 0.
        System.out.println( myJos(7,3));    // If position begins from 1.
    }
}
