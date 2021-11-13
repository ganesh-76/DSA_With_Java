package com.example.test;

public class reverseArray {
    static void reverseArray1(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[], int size){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArray(arr, 6);
        reverseArray1(arr,0, 5);
        System.out.println("Reversed array is: ");
        printArray(arr, 6);
    }
}