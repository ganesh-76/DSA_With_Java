package com.example.test.Array;

public class leftRotateArrayByDTimes {
/*
    public static void leftRotateByD(int arr[]){
        int n = arr.length;
        int temp = arr[0];

        for (int i=1;i<n;i++){              //  Time Complexity is :- "Theta(n*d)"
            arr[i-1] = arr[i];              //  Auxiliary space is :- "Theta(1)"
        }
        arr[n-1] = temp;
    }
    public static void leftRotate(int arr[],int d){
        for (int i = 0; i < d; i++) {
            leftRotateByD(arr);
        }
    }

    public static void leftRotate(int arr[], int d){
        int n = arr.length;
        int temp[] = new int[d];    //  Auxiliary Space is :- "Theta(d)"

        for (int i=0;i<d;i++){  //  Time Complexity is :- "Theta(d)"
            temp[i] = arr[i];
        }
        for (int j=d;j<n;j++){  //  Time Complexity is :- "Theta(n-d)"
            arr[j-d] = arr[j];
        }
        for (int i=0;i<d;i++){  //  Time Complexity is :- "Theta(d)"
            arr[n-d+i] = temp[i];
        }                       //   Overall Time Complexity is :- Theta(d+(n-d)+d) == Theta(n+d) == "Theta(n)"
    }

 */
    public static void leftRotate(int[] arr, int d){
        int n = arr.length;              //  Auxiliary Space is :- "Theta(1)"

        reverse(arr, 0, d-1);   //  Reverse the element from 0 to d-1;  Time Complexity is :- "Theta(d)"
        reverse(arr, d, n-1);       //  Reverse the element from d to n-1;  Time Complexity is :- "Theta(n-d)"
        reverse(arr, 0, n-1);   //  Reverse the element from 0 to n  ;  Time Complexity is :- "Theta(n)"
    }                                    //  Overall Time Complexity is :- Theta(d+(n-d)+n) == Theta(2n) == "Theta(n)"
    public static void reverse(int arr[], int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        low++;
        high--;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int d = 2;  //  Rotate by 2 position

        leftRotate(arr,d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
