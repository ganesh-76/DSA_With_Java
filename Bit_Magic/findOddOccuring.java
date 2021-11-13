package com.example.test.Bit_Magic;
public class findOddOccuring {
    /*
    static int findOdd(int arr[],int n){
        for (int i=0;i<n;i++){              // Time Complexity is "Big_O(n_square)"
            int count=0;
            for (int j=0;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count%2 != 0){
                return arr[i];
            }
        }
        return 0;
    }

     */

    static int findOdd(int arr[],int n){        // Efficient Solution
        int res = 0;
        for (int i=0;i<n;i++){      // Time Complexity is "Big_O(n) and Auxiliary Space is "Big_o(1)".
            res = res ^ arr[i];     // XOR is denoted by " ^ ".
        }                           // Some Properties of XOR = x^0=x, x^y=y^x, x^(y^z)=(x^y)^z, x^x=0.
        return res;
    }

    /*
     public static int missingNumber(int[] arr, int n){
        int res = 0;
        for (int i=0;i<=n-1;i++) {
            res = res ^ arr[i];         // (arr[0]^arr[1]^arr[2]^arr[3]...arr[n-1]) = n elements of array.
        }

        for (int i=1;i<=n+1;i++){
            res = res ^ i;              // (1^2^3^4...^(n+1)) = n elements of number n.
        }
        return res;                     // The XOR of " (1 to n+1) ^ (arr[0] to arr[n-1])" will give us missing number.
    }

     */

    public static void main(String[] args){

        int arr[] = {4, 3, 4, 4, 4, 5, 5, 3, 3}, n = 9;
        System.out.println(findOdd(arr,n));

        /*
         int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10 }, n = 9;
         int arr[] = {1, 4, 3 }, n = 3;
         int arr[] = {1, 5, 3, 2 }, n = 9;
         System.out.println("The Missing number is "+missingNumber(arr,n));
        */

    }
}
