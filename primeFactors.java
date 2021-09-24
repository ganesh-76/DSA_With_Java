package com.example.test;

public class primeFactors {
    /*
    static void primefactors(int n){
        for (int i=2;i<n;i++){
            if (isPrime(i)){
                int x = i;
                while(n%x==0){
                    System.out.print(x);
                    System.out.print(" ");   // O(n^2_Log_n)
                    x = x*i;
                }
            }
        }
    }

    static void printPrimeFactor(int n){  //Efficient Solution
        if (n<=1){
            return;
        }
        for (int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if (n>1){
            System.out.println(n+" ");
        }
    }
     */
    static void printPrimeFactor(int n){  // More Efficient Solution
        if (n<=1){
            return;
        }
        while(n%2==0){
            System.out.print(2+" ");
            n=n/2;
        }
        while(n%3==0){
            System.out.print(3+" ");
            n=n/3;
        }
        for (int i=5;i*i<=n;i=i+6){  // This for loop will run "theta(sqrt(n))" times.(In case of prime Number.)
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if (n>3){
            System.out.println(n+" ");
        }
    }
    public static void main(String[] args) {
        // primefactors(12);
         printPrimeFactor(450);   // 450 = 2^1 * 3^2 * 5^2 && 84 = 2^2 * 3^1 * 7
    }
}