package com.example.test.Array;

public class reverseAnArray {
    public static void reverseArray(int arr[]) {
        int n = arr.length, low = 0, high = n - 1;
        while(low<high){
            int temp = arr[low];        // Time Complexity is :- "Theta(n)"
            arr[low] = arr[high];       // Auxiliary Space is :- "Theta(1)"
            arr[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 3, 32, 10, 30};

        System.out.print("Before Reverse :- ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println(" ");
        reverseArray(arr);

        System.out.print("After Reverse  :- ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
