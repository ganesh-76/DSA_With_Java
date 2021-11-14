package com.example.test.Array;

public class LargestElementInArray {
/*
    public static int getLargest(int arr[])
    {
        int n = arr.length;             // Best case Time Complexity is :- Theta(n) if first element in largest.
        for (int i = 0; i < n; i++)     // Worst case Time Complexity is :- Theta(n_Square) if Last element is largest.
        {                               // In general, it's Time Complexity is :- Big_O(n_Square).
            boolean flag = true;
            for (int j=0;j<n;j++)
            {
                if (arr[j]>arr[i])
                {
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                return i+1;
            }
        }
        return -1;
    }

 */
    public static int getLargest(int arr[]){
        int res = 0;
        for(int i=1;i<arr.length;i++){      // Time Complexity is :- Theta(n)
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        return res+1;
    }
    public static void main(String[] args){
        int arr[] = {2, 5, 12, 7, 9};
        // System.out.println(getLargest(arr));
        System.out.println("Position number "+getLargest(arr)+" have the largest element in Array.");
    }
}
