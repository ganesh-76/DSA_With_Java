package com.example.test.Array;

public class SearchInArray {
    public static int search(int arr[], int n, int x){
        for(int i=0;i<n;i++){       // Time complexity is :- Big_O(n)
            if(arr[i]==x){          // n is the length of array.
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7}, x = 5;
        System.out.println(search(arr, arr.length,5));
    }
}
