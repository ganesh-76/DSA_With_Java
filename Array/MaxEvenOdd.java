package com.example.test.Array;

public class MaxEvenOdd {
    /*
    //  Naive Solution
    public static int maximumEvenOdd(int arr[]){
        int n = arr.length;
        int res = 1;
        for (int i=0;i<n;i++){          // Time Complexity is :- "Big_O(n_square)"
            int curr=1;
            for (int j=i+1;j<n;j++){
                if ( (arr[j]%2!=0 && arr[j-1]%2==0) || (arr[j]%2==0 && arr[j-1]%2!=0) ){
                    curr++;
                }
                else
                    break;
            }
            res = Math.max(curr, res);
        }
        return res;
    }

     */
    //  Using Kadane's Algorithm
    public static int maximumEvenOdd(int arr[]){
        int n = arr.length;
        int res=1;
        int curr=1;
        for (int i=1;i<n;i++){
            if ( (arr[i]%2==0) && (arr[i-1]%2!=0) || (arr[i]%2!=0) && (arr[i-1]%2==0) ){
                curr++;
                res = Math.max(curr, res);
            }
            else
                curr = 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 6, 3, 8};       // O/P :- 3
        System.out.println(maximumEvenOdd(arr));
    }
}
