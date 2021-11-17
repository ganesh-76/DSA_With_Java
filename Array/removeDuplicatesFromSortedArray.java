package com.example.test.Array;

public class removeDuplicatesFromSortedArray {
    /*
    public static int remDups(int arr[]){       // Naive Solution
        int n = arr.length;
        int temp[] = new int[n];                // Auxiliary Space required is "Theta(n)"
        temp[0] = arr[0];
        int res  = 1;

        for(int i=1;i<n;i++){                   // <-- Time Complexity is "Theta(n)"
            if(temp[res-1] != arr[i]){
                temp[res] = arr[i];
                res++;                          // So Overall the Time Complexity is :- "Theta(n)" or "Big_O(n)"
            }                                   // Theta(n) + Big_O(n) = Theta(n)
        }

        for(int i=0;i<res;i++){                 // <-- Time Complexity is "Big_O(n)"
            arr[i] = temp[i];
        }
        return res;
    }
     */
    public static int remDups(int arr[]){       // Efficient Solution
        int res = 1, n = arr.length;

        for(int i=1;i<n;i++){                   // Time Complexity is :- "Big_O(n)"
            if (arr[res-1] != arr[i]){          // Auxiliary Space is :- "O(1)"
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30, 30};

        System.out.println("Before Removal");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int n = remDups(arr);

        System.out.println("After Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
