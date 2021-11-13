package com.example.test;

import java.util.Arrays;

public class sieveOfEratosthenes {
    /*
    static void allPrime(int n){  // Time Complexity "O(n*sqrt(n))"
        for(int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static void allPrime(int n){
        if (n<=1){
            return;
        }
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);

        for (int i = 2; i*i <=n ; i++) {
            if (isPrime[i]){
                for (int j=2*i;j<=n;j=j+i){
                    isPrime[j] = false;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if (isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }

     */
    static void allPrime(int n){
        if (n<=1){
            return;
        }
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);

        for (int i = 2; i*i <=n ; i++) {
            if (isPrime[i]){                 // Time Complexity is "O(n_Log_Log_n)"
                System.out.print(i+" ");
                for (int j=i*i;j<=n;j=j+i){  // Replacing 2*i by i*i
                    isPrime[j] = false;      // Earlier if i=5 :- 10,15,20,25,30...
                }                            // Now if i=5     :- 25,30,35,40...
            }
        }
    }

    public static void main(String[] args) {
        allPrime(9);

    }
}