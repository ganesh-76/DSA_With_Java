package com.example.test.Recursion;

public class towerOfHanoi {
    static void TOH(int n, char A, char B, char C){
        if (n==1){
            System.out.println("Move disc 1 " + "From " + A + " to " + C);
            return;
        }
        TOH(n-1, A, C, B);
        System.out.println("Move disc "+ n + " From " + A + " to " + C);
        TOH(n-1, B, A, C);
    }

    public static void main(String[] args) {
        int n = 3;
        //TOH(n,'X','Y','Z');
        TOH(n,'A','B','C');
    }
}
