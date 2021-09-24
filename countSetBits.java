package com.example.test;

public class countSetBits {
    static int countingSetBits(int n){
        int res = 0;
        while(n>0){
            if (n%2 != 0){
                res++;
            }
            n = n/2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countingSetBits(13));
    }
}
