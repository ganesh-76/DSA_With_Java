package com.example.test.Array;

public class mejorityElements {

    /*
    // Naive Solution
    public static int checkMejorityElements(int arr[]){
        int n = arr.length;
        int IsMajor = (arr.length/2);
        //  System.out.println(IsMajor);
        for (int i=0;i<n;i++){              //  Time Complexity is - "Big_O(n_square)"
            int count=1;
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
                if (count>IsMajor){
                    System.out.print("Index of the number is :- ");
                    return i;
                }
            }
        }
        return -1;
    }
    */

    // Boyer-Moore Majority Voting Algorithm
    public static int checkMejorityElements(int arr[], int n){

        int count = 1, res = 0;
        for (int i=1;i<n;i++){              // Time Complexity is :- Big_O(n)
            if (arr[res]==arr[i]){
                count++;
            }
            else {
                count--;
            }
            if (count == 0){
                res = i;
                count=1;
            }
        }

        count=0;
        for (int i=0;i<n;i++) {             // Time Complexity is :- Big_O(n)
            if (arr[res] == arr[i]) {
                count++;
            }
        }
        if (count<=n/2){
            res = -1;
        }
        return  res;        //  // Time Complexity is :- Big_O(n) +Big_O(n) = "Big_O(n)"
    }

    public static void main(String[] args) {
        /*
        int arr[] = {1,2,3,4,4,4,4};
        int arr[] = {8, 3, 4, 8, 8};
        System.out.println(checkMejorityElements(arr));
        */

          int arr[] = {6, 8, 7, 6, 6};         // Output :- 3 (Index number)
        //  int arr[] = {8, 6, 8, 6, 8};         // Output :- 4 (Index number)
        //  int arr[] = {8, 8, 6, 6, 6, 4, 6};   //  Output :- 3 (Index number)
        int n = arr.length;
        System.out.println("The index number of Majority Element is :- "+checkMejorityElements(arr, n));
    }
}
