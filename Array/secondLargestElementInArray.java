package com.example.test.Array;

public class secondLargestElementInArray {
    /*
    public static int firstLargestElement(int arr[]){
        int n = arr.length;
        int largest = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                largest = i;
            }
        }
        return largest;
    }
    public static int getSecondLargest(int arr[]){
        int n = arr.length;
        int largest = firstLargestElement(arr);
        int res = -1;
        for(int i=0;i<n;i++){
            if(arr[i] != arr[largest]){
                if(res == -1){
                    res = i;
                }
                else if (arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res+1;
    }

     */
    // Efficient Solution :-

    public static int getSecondLargestElement(int arr[]){
        int n = arr.length;
        int res = -1, largest = 0;

        for(int i=1;i<n;i++)            // Time Complexity is :- "Theta(n)"
        {                               // Auxiliary Space is :- "Theta(1)"
            if (arr[i]>arr[largest])
            {
                res = largest;
                largest = i;
            }
            else if (arr[i] != arr[largest])
            {
                if (res == -1 || arr[i]>arr[res]){
                    res = i;
                }
            }
        }

        return res;
    }
    public static void main(String[] args){
        //  int arr[] = {10,20,12,20,7};
        //  int arr[] = {10,10,10};
        //  System.out.println(getSecondLargest(arr));

        int arr[] = {5, 20, 12, 20, 8};
        System.out.println(getSecondLargestElement(arr));
    }
}
