package com.example.test.Array;

public class moveZerosToEnd {
/*
    public static void moveToEnd(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){                   // Time Complexity is :- "Big_O(n_Square)"
            if (arr[i]==0){
                for(int j=i+1;j<n;j++){
                    //  System.out.print(j+" ");
                    if(arr[j] != 0){      // int arr[] = {2,4,0,0,6,4};
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                    }
                }
            }
        }
        //  System.out.print(" <--> ");
    }

 */
    //  Efficient Solution

    public static void moveToEnd(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){               // Time Complexity is :- Big_O(n)
            if (arr[i]!=0){                 // Auxiliary Space is :- Big_O(1)
                // swap(arr[i],arr[count]);
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,0,0,6,4};
        moveToEnd(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
