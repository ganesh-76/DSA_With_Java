package com.example.test;

public class Try2 {
    static boolean checkKthBit(int n, int k) {
        // Your code here
        if (((n & (1 << k)) != 0) && n != 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkKthBit(1, 0));
    }
}
