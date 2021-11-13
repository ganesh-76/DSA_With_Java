package com.example.test.Array;

public class InsertInArray {
    public static int insert(int arr[], int n, int x, int cap, int pos){
        if(n==cap){
            return n;
        }
        int idx = pos - 1;
        for(int i=n-1;i>=idx;i--){
            arr[i+1] = arr[i];
        }
        arr[idx] = x;
        return n+1;
    }
    public static void main(String[] args){
        int arr[] = new int[5];
        int cap = 5;    // Capacity of array.
        int n = 3;      // Number of elements.
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        System.out.print("Before Insertion :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println(" ");

        int x = 7;      // Number to be inserted.
        int pos = 2;    // Position where the number is inserted.
        n = insert(arr, n, x, cap, pos);    // n+1
        System.out.print("After Insertion  :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
