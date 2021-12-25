package com.example.test.Array;

public class maximumSumSubarray {
    /*
    public static int maximumSumOfSubArray(int arr[]){
        int n = arr.length;
        int res = arr[0];
        for (int i=0;i<n;i++){                  // Time Complexity is :- Big_O(n_square)
            int curr = 0;
            for (int j=i;j<n;j++){
                curr = curr+arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }

     */
    //   Kadane's algorithm
    public static int maximumSumOfSubArray(int arr[]){
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < n; i++) {                       // Time Complexity is :- Big_O(n)
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
          int arr[] = {1, -2, 3, -1, 2};                    //  o/p :- 4
        //  int arr[] = {2, 3, -8, 7, -1, 2, 3};            //  o/p :- 11
        //  int arr[] = {5, 8, 3};                          //  o/p :-16
        //  int arr[] = {-6, -1, -8};                       //  o/p :- -1
        System.out.println(maximumSumOfSubArray(arr));
    }
}
