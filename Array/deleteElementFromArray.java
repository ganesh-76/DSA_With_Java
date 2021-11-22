package com.example.test.Array;

public class deleteElementFromArray {

    public static int deleteElementInArray(int arr[], int x, int n){
        int i;
        for(i=0;i<n;i++) {
            if (arr[i] == x) {      // Time complexity is :- Theta(n)
                break;              // First for loop traverse till we get the element which we want to delete.
            }
        }
            if(i==n){
                return n;
            }

            for (int j=i;j<n-1;j++){    // Second loop will traverse from the first loop's ending to n-1.
                arr[j] = arr[j+1];      // So both loops will cover n elements hence Time Complexity is Theta(n).
            }
        return n-1;
    }
    public static void main(String[] args){
        int arr[] = {2,3,4,9,7};
        int x = 9;
        int n = 5;
        n = deleteElementInArray(arr, x, n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
