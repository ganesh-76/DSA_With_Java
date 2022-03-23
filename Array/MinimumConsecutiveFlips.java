package com.example.test.Array;

public class MinimumConsecutiveFlips {

    public static void minimumGroupFlips(int arr[]){
        int n = arr.length;
         /*
                1. Check if current element is different from previous element.
                2. Then check if it is different from the first element "(arr[0])" as
                    2.1] if it is different from the first element then it is the starting of the
                        first group "{1,1,'0',0,0,0}" where we need to flip the bits. So we print "(i)".
                    2.2] if it is same as the first element then it is the ending of the group "(1,1,0,0,0,0,'1')" which
                        we need to flip bits. So we print "(i-1)".
         */
        for (int i=1; i<n; i++){          // we are starting from 2nd position (i.e i=1) here.
            if (arr[i] != arr[i-1]){
                if (arr[i] != arr[0]){
                    System.out.print("Flip from "+ i + " to ");
                }
                else {
                    System.out.println(i-1);
                }
            }
        }
        if (arr[n-1] != arr[0]){          // When we come to the last element which is supposed to flip we come out of
            System.out.println(n-1);    // for loop because of "(i<n)" condition and we cannot end it, for that we need
        }                               // this if condition here.
    }
    public static void main(String[] args) {

        int arr[] = {1,1,0,0,0,1,1,0,0,0,1,0};
        minimumGroupFlips(arr);
    }
}
