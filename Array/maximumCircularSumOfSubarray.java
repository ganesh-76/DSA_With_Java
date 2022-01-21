package com.example.test.Array;

public class maximumCircularSumOfSubarray {
    /*
    //  Kadane's Algorithm
    public static int maximunCircularSumOfSubArray(int arr[]){
    }
        int n = arr.length;
        int res = arr[0];
        for (int i=0;i<n;i++){          //  Time Complexity is :- Big_O(n_square)
            int curr_max = arr[i];
            int curr_sum = arr[i];

            for (int j = 1; j < n; j++) {
                int index = (i+j)%n;
                curr_sum += arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }
            res = Math.max(res, curr_max);
        }
        return res;
    }
    */
    public static int normalMaxSum(int arr[], int n){
        int res = arr[0];
        int MaxEnding = arr[0];
        for(int i=1;i<n;i++){                               // Time Complexity is :- "Theta(n)".
            MaxEnding = Math.max(arr[i], MaxEnding+arr[i]);
            res = Math.max(res, MaxEnding);
        }
        return res;
    }

    public static int overallMaxSum(int arr[], int n){
        int max_normal = normalMaxSum(arr, n);              // Time Complexity is :- "Theta(n)".

        if (max_normal<0){
            return max_normal;
        }
        int arr_sum = 0;
        for (int i=0;i<n;i++){                              // Time Complexity is :- "Theta(n)".
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        /*
        Remove minimum sum of subarray to get maximum sum of circular subarray.
        So when you are finding out maximum sum in an inverted array, you are basically finding out minimum sum in
        our original array.
        Add maximum sum of inverted subarray to the total sum of normal subarray to get the maximum sum of circular
        subarray.
         */

        int max_circular = arr_sum + normalMaxSum(arr, n);  // Inverted array passed to normalMaxSum(); Time Complexity is :- "Theta(n)".
        //  System.out.println(max_circular+" & "+ max_normal);
        return Math.max(max_circular, max_normal);
    }   //  So the overall Time Complexity is :- "Theta(n)".

    public static void main(String[] args) {
            int arr[] = {8, -4, 3, -5, 4}, n = 5;          //  Output :- 12 i.e 4+8=12.
            //  int arr[] = {5, -2, 3, 4}, n = 4;          //  Output :- 12 i.e 3+4+5=12.
            //  int arr[] = {3, -4, 5, 6, -8, 7}, n = 6;   //  Output :- 17 i.e 7+3+(-4)+5+6=17.
            //  int arr[] = {-5, 4, 3, 2, -7}, n = 5;      //  Output :- 9 i.e 4+3+2=9.

            System.out.println(overallMaxSum(arr, n));

        /*

        int arr[] = {5, -2, 3, 4};
        System.out.println(maximunCircularSumOfSubArray(arr));

         */
    }
}
