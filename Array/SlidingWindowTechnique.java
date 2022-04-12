package com.example.test.Array;

public class SlidingWindowTechnique {

    /*
    //  Naive Solution

    public static int maxSum(int arr[], int k){
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;
        for (int i=0; i+k-1<n; i++){        // Time Complexity is :- "Big_O((n-k)
            int sum = 0;
            for (int j=0; j<k; j++){        // Time Complexity is :- "Big_O(K)"
                sum += arr[i+j];
            }                               // So overall Time Complexity is :- "Big_O((n-k) * K)"
            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;
    }
     */

    /*
    // Efficient Solution
    public static int maxSum(int arr[], int k){
        int n = arr.length;
        int curr_sum = 0;
        for (int i=0; i<k; i++){        // "Big_O(k)" Work is done here.
            curr_sum += arr[i];
        }
        int max_sum = curr_sum;
        for (int i=k;i<n;i++){          // "Big_O(n-k)" Work is done here.
            curr_sum += (arr[i]-arr[i-k]);
            // Here we are adding the "K" element and substracting the "(i-k)" element.
            // Here k elements are 3, 4, 5 and i-k elements are 0, 1, 2.
            max_sum = Math.max(curr_sum, max_sum);
        }             // So the time complexity is :- Big_O(k) + Big_O(n-k) = "Big_O(n)"
        return max_sum;
    }
    */

    // Q:Given an unsorted array of non-negative integers. Find if there is a subarray with given sum.
    /* Returns true if the there is a subarray of arr[] with sum equal to
	'sum' otherwise returns false. Also, prints the result */

    /*
    public static int subArraySum(int arr[], int n, int sum){
        int curr_sum = arr[0];
        int start = 0, i;
        for (i=1; i<=n; i++){
            //  Time complexity is :- "Big_O(n)"
            //  Because every elements goes into this windows atmost once (i.e Big_O(n)times) and goes out of this
            //  windows
            //  atmost once (i.e Big_O(n)times).
            //  So Big_O(n)times + Big_O(n)times = Big_O(2n)times = i.e "Big_O(n)" times.

            //  If curr_sum exceeds the sum, then remove the starting elements
            //  When the first element is greater than the given sum, we simply add the i_th element (i.e 1st index
            //  element of array) in it so that 2nd while loop condition will satisfy.

            while(curr_sum>sum && start<i-1){
                curr_sum -= arr[start];
                start++;
            }

            //  If the curr_sum is equal to given sum them we print the position of indexes from where elements are taken.
            //  Here p is i-1 because we increment the i value and then check if it is equal or not that's why we need
            //  substract 1 to get the original position.

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum==sum){
                int p = i-1;
                System.out.println("Sum found between indexes "+ start + " and "+ p);
                return 1;
            }
            // Add the next ith element to curr_sum to make the given sum.
            if (i<n){
                curr_sum += arr[i];
            }
        }
        System.out.println("No subarray found");
        return 0;
    }

     */

    //  N-bonacci number :- print first m n-bonacci number.
    public static void bonacciseries(int n, int m){
        // Assuming m > n.
        int a[] = new int[m];   //  Create the array of size m.
        for (int i=0; i<m; i++){    //  Fill the array of m with all zeros.
            a[i] = 0;
        }   // when n is 3 :- 0 0 1 1 2 4 7 13.
            // positions are  0 1 2 3 4 5 6 07. 
        a[n-1] = 1; //  As we know that if n is 3, then n-1 i.e first two elements are zeros and (n-1)th element is 1.
        a[n] = 1;   // And we know that nth element is also 1.

        // Uses sliding window
        for (int i=n+1;i<m;i++){    //  Here we perform operation only on n+1 to m elements.
            a[i] = 2 * a[i-1] - a[i-n-1];   //  This is observation based formula to find next element.
        }
        // Printing result
        for (int i=0;i<m;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int n = 3, m = 8;
        bonacciseries(n, m);

//        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};    // O/p:- Sum found between indexes 1 and 4.
//        int lengthOfArray = arr.length;             // O/p will return 1 as well.
//        int sumOfArray = 23;
//        System.out.println(subArraySum(arr, lengthOfArray, sumOfArray));

//        int arr[] = {1, 8, 30, -5, 20, 7};
//        int k = 3;
//        System.out.println(maxSum(arr, k));
    }
}
