package com.example.test;
//  Given an array arr[] of length n and an integer sum,
//  the task is to find the number of subsets with a sum equal to
//  sum.

public class countSubset {
    static int countingSubsets(int arr[], int n, int sum){
        if (n==0){
            return sum==0? 1:0;
        }                           // Time complexity is :- "Theta(2_Power_n)"
        return countingSubsets(arr, n-1, sum) + countingSubsets(arr, n-1, sum-arr[n-1]);
    }

    public static void main(String[] args) {
        int n = 3, arr[] = {10,15,20}, sum = 25;
        System.out.println(countingSubsets(arr, n, sum));
    }
}
