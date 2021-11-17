package com.example.test.Array;

public class checkForSortedArray {
    /*
    public static boolean isSorted(int arr[]){
        for (int i=0;i<arr.length;i++){         // Time Complexity is :- "Big_O(n_Square)"
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
     */
    // My Own Solution
    /*
    public static boolean isSorted(int arr[]){
        int n = arr.length;
        int res = 0;
        for (int i=1;i<n;i++){                  // Time Complexity is :- "Big_O(n)"
            if (arr[res] <= arr[i]){            // Auxiliary Space is :- Constant --> "Big_O(1)"
                res = res + 1;
                // System.out.println(res);
            }
        }
        // System.out.println(res);
            if (res != n-1){
                // System.out.println(n);
                // System.out.println(res);
                return false;
            }
        return true;
    }
     */
    public static boolean isSorted(int arr[]){
        for (int i=1;i<arr.length;i++){         // Time Complexity is :- "Big_O(n)"
                if (arr[i] < arr[i-1]) {        // Auxiliary Space is :- Constant --> "Big_O(1)"
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {
        // int arr[] = {2, 5, 6, 12, 23};
         int arr[] = {1, 5, 6, 12, 12};
        // int arr[] = {1, 5, 6, 12, 9};
        // int arr[] = {1};
        // int arr[] = {1,1,1,1};
        System.out.println(isSorted(arr));
    }
}
