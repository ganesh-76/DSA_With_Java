package com.example.test.Array;

public class stockBuyAndSellProblem1 {
    public static int maxProfit(int price[], int start, int end){
        int n = price.length;
        int profit = 0;
        for (int i=1;i<n;i++){                      //  Time Complexity is :- "Theta(n)"
            if (price[i]>price[i-1]){
                profit += (price[i]-price[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int price[] = {1, 5, 3, 8, 12}, n = price.length;
        System.out.println(maxProfit(price, 0, n-1));
    }
}
