package com.example.test.Array;

public class frequenciesInASortedArray {

    public static void findFrequencies(int arr[]){
        int n = arr.length;
        int freq=1, i=1;
        while(i<n){                                 // Time Complexity is :- "Theta(n)"
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
        if (n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+" "+ 1);
        }
    }
    public static void main(String[] args){
//        int arr[] = {10, 10, 10, 25, 30, 30};
//        int arr[] = {40, 50, 50, 50};
        int arr[] = {10, 10, 10, 30, 30, 40};
//        int arr[] = {10, 10, 10, 10};
//        int arr[] = {10, 20, 30};
        findFrequencies(arr);
    }
}
