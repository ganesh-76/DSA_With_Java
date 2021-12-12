package com.example.test.Array;

public class trappingRainWater {
    /*
    public static int trapRainWater(int arr[]){
        int n = arr.length;
        int res = 0;

        for (int i=1;i<n-1;i++){                // Time Complexity is :- "Theta(n_Square)"

            int lMax = arr[i];
            for(int j=0;j<i;j++){
                lMax = Math.max(lMax, arr[j]);
            }

            int rMax = arr[i];
            for (int j=i+1;j<n;j++){
                rMax = Math.max(rMax, arr[j]);
            }

            res = res + (Math.min(lMax, rMax) - arr[i]);
        }
        return res;
    }
     */

    public static int trapRainWater(int arr[]){
        int n = arr.length;
        int res = 0;
        int lMax[] = new int[n];        // Auxiliary Space is :- "Theta(n)"
        int rMax[] = new int[n];

        lMax[0] = arr[0];
        for(int i=1;i<n;i++){                                   // TIME COMPLEXITY IS :- "Theta(n)"
            lMax[i] = Math.max(arr[i],lMax[i-1]);   // lMax = {5, 5, 6, 6, 6}
        }

        rMax[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){                               // TIME COMPLEXITY IS :- "Theta(n)"
            rMax[i] = Math.max(arr[i], rMax[i+1]);  // rMax = {6, 6, 6, 3, 3}
        }

        for (int i=1;i<n;i++){                                  // TIME COMPLEXITY IS :- "Theta(n)"
            res = res + (Math.min(lMax[i], rMax[i])-arr[i]);
        }                // TIME COMPLEXITY IS :- "Theta(n) + Theta(n) + Theta(n) = 'Theta(n)' "
        return res;
    }
    public static void main(String[] args){
        int arr[] = {3, 0, 1, 2, 5};
        // int arr[] = {3, 0, 1, 4, 2, 4};
        System.out.println("The water trapped is :- "+trapRainWater(arr));
    }
}
