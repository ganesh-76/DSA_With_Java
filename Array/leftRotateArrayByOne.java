package com.example.test.Array;

public class leftRotateArrayByOne {

    public static void leftRotateByOne(int arr[]){
        int n = arr.length;
        //  System.out.println(n);
        int temp = arr[0];
        for(int i=1;i<n;i++){       //  Time Compplexity is :- "Theta(n)"
            arr[i-1] = arr[i];      //  Auxiliary Space is  :- "Theta(1)"
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        leftRotateByOne(arr);

        System.out.print("After rotating array by one position :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
