package com.example.test;

public class print_1ToN_usingRecursion {
    static void print1toN(int n){
        if (n==0) {
            return;
        }                               // Recurrence relation is:"T(n) = T(n-1)+Theta(1)"
        print1toN(n-1);              // Time Complexity is "Theta(n)"
        System.out.print(n+" ");         // Auxiliary space is: "Big_O(n)"
    }

    public static void main(String[] args) {
        int n = 5;
        print1toN(n);
    }
}
