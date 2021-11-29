package com.example.test.Array;

public class maximumDifferenceProblem {
/*
    public static int maximumDifference(int arr[]){
        int n = arr.length;
        int res;
        int finalres=-1000;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res = arr[j]-arr[i];
                if (res>finalres){
                    finalres = res;
                }
            }
        }
        return finalres;
    }

 */
    /*
    public static int maximumDifference(int arr[]){
        int n = arr.length;
        int res = arr[1]-arr[0];
        for (int i = 0; i < n; i++) {               // Time Complexity is :- "Theta(n_square)"
            for (int j=i+1;j<n;j++){
                res = Math.max(res, arr[j]-arr[i]);
            }
        }
        return res;
    }

     */
public static int maximumDifference(int arr[]){
    int n = arr.length;
    int res = arr[1]-arr[0];
    int minVal = arr[0];                            // Auxiliary Space is :- "Theta(1)"
        for (int j=1;j<n;j++){                      // Time Complexity is :- "Theta(n)"
            res = Math.max(res, arr[j]-minVal);
            minVal = Math.min(minVal, arr[j]);
        }
    return res;
}
    public static void main(String[] args){
//        int arr[] = {2, 3, 10, 6, 4, 8, 1};
//        int arr[] = {7, 9, 5, 6, 3, 2};
//        int arr[] = {10, 20, 30};
        int arr[] = {30, 10, 8, 2};
        System.out.println(maximumDifference(arr));
    }
}
