package com.example.test;

public class alldivisorOfNumber {
    /*
    static void divisorOfNumbers(int n){  // Time Complexity is "Theta(n)" && Auxiliary Space is "Theta(1)"
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
     */
    static void divisorOfNumbers(int n){  // Time Complexity is "Theta(sqrt(n))" && Auxiliary Space is "Theta(1)"
        int i;
        for (i=1;i*i<n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
        for ( ;i>=1;i--){
            if (i!=(n/i)+1 && n%i==0){
                System.out.print(n/i+" ");
            }
        }
    }
    public static void main(String[] args) {
        divisorOfNumbers(30);
    }
}