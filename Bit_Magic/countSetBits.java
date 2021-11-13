package com.example.test.Bit_Magic;

public class countSetBits {
    /*
    static int countingSetBits(int n){
        int res = 0;
        while(n>0){
            if (n%2 != 0){          // Time Complexity = "Theta(Total bits in n)"
                res++;
            }
            n = n/2; // When we check right most bit we found that it is n/2 after eliminating n, bcoz of series.
        }               // ex:-13= 0...1101, 0...0110, 0...0011, 0...0001, 0...0000
        return res;     //             13        6         3         1
    }

    static int countingSetBits(int n){
        int res = 0;
        while(n != 0){
            res = res + (n&1);
            n = n >> 1; // When we check right most bit we found that it is n/2 after eliminating n, bcoz of series.
        }               // ex:-13= 0...1101, 0...0110, 0...0011, 0...0001, 0...0000
        return res;     //             13        6         3         1
    }

    static int countingSetBits(int n){         // Using brian kerninggam's algorithm
        int res = 0;
        while(n>0){                            // Time Complexity = "Theta(Set Bit Count)"
            n = n & (n-1);
            res++;
        }
        return res;
    }

     */
    static int[] table = new int[256];
    public static void initialize(){
        table[0] = 0;
        for(int i=1;i<256;i++){
            table[i]= (i & 1) + table[ i/2 ];
        }
    }
    public static int countSetBits(int n){      // Lookup Table Method.
        int res = table[n & 0xff];
        n = n >> 8;

        res = res + table[n & 0xff];            // Time Complexity = "Theta(1)"
        n = n >> 8;

        res = res + table[n & 0xff];
        n = n >> 8;

        res = res + table[n & 0xff];
        return res;
    }

    public static void main(String[] args) {
        /*

        int a = 5;
        System.out.println(countingSetBits(n));

        int b = 13;
        System.out.println(countingSetBits(n));

        int c = 40;
        System.out.println(countingSetBits(n));

         */
        initialize();
        int d = 13;
        System.out.println(countSetBits(d));
    }
}