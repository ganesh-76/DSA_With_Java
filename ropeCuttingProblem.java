package com.example.test;

public class ropeCuttingProblem {
    static int maxCuts(int n, int a, int b, int c){
        if (n == 0){
            return 0;
        }
        if (n <= -1){
            return -1;
        }
        int res = Math.max(maxCuts(n-a, a, b, c),   // Time complexity is :- "Big_O(3_power_n)"
                  Math.max(maxCuts(n-b, a, b, c),
                          maxCuts(n-c, a, b, c)));
        if (n == -1){
            return -1;
        }
        return res + 1;
    }

    public static void main(String[] args) {
        // int n = 5, a = 2, b = 1, c = 5;
        int n = 9, a = 2, b = 2, c = 2;
        System.out.println(maxCuts(n, a, b, c));
    }
}
