package com.example.test;

public class trailingZerosInFactorial {
    // static int fact(int n){
//        int factorial = 1;            // Time complexity is theta(n)
//        for (int i=2;i<=n;i++){
//            factorial = factorial*i;
//        }
//        int count=0;
//        while(factorial%10==0){
//            count++;
//            factorial=factorial/10;
//        }
//        return count;
//    }
        // Efficient Solution
        static int trailingZeros(int n){
            int res=0;
            for (int i=5;i<=n;i=i*5){   // Time complexity is theta(Log_n)
                res = res+n/i;
            }
            return res;
        }
    public static void main(String[] args) {
        // System.out.println(fact(10));
        System.out.println(trailingZeros(251));
    }
}