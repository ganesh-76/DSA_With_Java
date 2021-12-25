package com.example.test.Array;

public class maximumConsecutiveOnesInBinaryArray {
    /*
    public static int maximumConsecutiveOnes(int arr[]){
        int n = arr.length;
        int res = 0;
        for (int i=0;i<n;i++){              //  Time Complexity is :- Big_O(n_square)
            int curr = 0;
            for (int j=i;j<n;j++){          //  Auxiliary Space is :- Big_O(1)
                if (arr[j]==1){
                    curr++;
                }
                else {
                    break;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }

     */

    public static int maximumConsecutiveOnes(int arr[]){
        int n = arr.length;
        int res = 0, curr = 0;
        for (int i=0;i<n;i++){              //  Time Complexity is :- Big_O(n)
            if (arr[i]==0){                 //  Auxiliary Space is :- Big_O(1)
                curr=0;
            }
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 0};
        //  int arr[] = {0, 1, 1, 1, 1, 0, 1, 1};
        //  int arr[] = {1, 1, 1, 1};
        //  int arr[] = {0, 0, 0, 0};
        System.out.println("Maximum consecutive ones in an binary array is:- "+maximumConsecutiveOnes(arr));
    }
}
