package com.example.test.Array;

public class leadersInArray {
        /*

    public static void leadersInAnArray(int arr[]){
        int n = arr.length;             // Auxiliary Space is :- "Theta(1)"
        for(int i=0;i<n;i++){           // Time Complexity is :- "Big_O(n_square)"
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if (arr[i]<=arr[j]){
                    flag = true;
                    break;
                }
            }
            if (flag==false){
                System.out.print(arr[i]+" ");
            }
        }

    }
    */

    /*
    public static void leadersInAnArray(int arr[]){
        int n = arr.length;
        int cur_ldr = arr[n-1];
        System.out.print(cur_ldr+" ");
        for (int i=n-2;i>=0;i--){               // Time Complexity is :- "Theta(n)"
            if(cur_ldr < arr[i]){
                cur_ldr = arr[i];
                System.out.print(cur_ldr+" ");
            }
        }
    }

     */
    public static void leadersInAnArray(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];                // Auxiliary Space is :- "Theta(n)"
        int cur_ldr = arr[n-1];
        temp[n-1] = cur_ldr;
        for (int i=n-2;i>=0;i--){               // Time Complexity is :- "Theta(n)"
            if(cur_ldr < arr[i]){
                cur_ldr = arr[i];
                // System.out.print(cur_ldr+" ");
                temp[i] = arr[i];
            }
        }
        /*
        for (int i=0;i<n;i++){                  // Time Complexity is :- "Theta(n)"
            if(temp[i]!=0){
                System.out.print(temp[i]+" ");
            }
        }
         */

        int low =0,high=n-1;
        while(low<high){                // This will reverse the temp array.
            int tempr = temp[low];
            temp[low] = temp[high];
            temp[high] = tempr;
            low++;
            high--;
        }
        for(int i=0;i<n;i++){                   // Time Complexity is :- "Theta(n)"
            if (temp[i]!=0){
                System.out.print(temp[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 10, 6, 5, 2};       // Output is :- 2 5 6 10
        leadersInAnArray(arr);                     // Prints output in reverse order
    }
}
