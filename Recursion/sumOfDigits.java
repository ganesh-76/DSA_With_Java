package com.example.test.Recursion;

public class sumOfDigits {
    static int digitsSum(int n){
        if (n<=9){
            return 0;
        }                                   // d is number of digits in n
        return (n%10)+digitsSum(n/10);    // Time Complexity is :- "Theta_(d)"
    }                                       // Auxiliary space is :- "Theta_(d)"

    public static void main(String[] args) {
        int n = 9987;
        System.out.println(digitsSum(n));   // 9+9+8+7 = 33
    }
}
