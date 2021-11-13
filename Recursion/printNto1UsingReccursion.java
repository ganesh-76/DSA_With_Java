package com.example.test.Recursion;

public class printNto1UsingReccursion {
    /*
    static int printNto1(int n){

        if(n==1){
            return 1;
        }

        System.out.print(n+" ");
        return printNto1(n-1);
    }
        */
    static void printNto1(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");  // Recurrence relation is:"T(n) = T(n-1)+Theta(1)"
        printNto1(n-1);         // Time Complexity is "Theta(n)"
    }                             // Auxiliary space is: "Theta(n)"

    public static void main(String[] args) {
        //System.out.println(printNto1(10));
        int n=5;
        printNto1(n);
    }
}
