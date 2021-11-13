package com.example.test.Bit_Magic;

public class powerOfTwo {
    /*
    static boolean powerOf2(int n){     // Naive Solution
        if (n == 0)
            return false;
        while(n != 1){
            if (n%2 != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }

    static boolean powerOf2(int n){     // Efficient Solution.
        if (n == 0)
            return false;
        return ( (n & (n-1)) == 0);     // Every power of two will have single set bit in binary representation.
    }

     */
    static boolean powerOf2(int n){
        return (n != 0 && (n & (n-1)) == 0);     // Every power of two will have single set bit in binary.
    }
    public static void main(String[] args) {
        System.out.println(powerOf2(64));  // PowerOfTwo's :- 1, 2, 4, 8, 16, 32, 64, ...
    }
}