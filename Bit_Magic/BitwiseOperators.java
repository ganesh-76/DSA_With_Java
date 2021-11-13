package com.example.test.Bit_Magic;

public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println(3 & 6);  //  AND  = 2
        System.out.println(3 | 6);  //  OR   = 7
        System.out.println(3 ^ 6);  //  XOR  = 5

        int x=1;
        System.out.println(~x);    // Bitwise NOT
        System.out.println(~5);    // Bitwise NOT

        int a=3;
        System.out.println(a<<1);   // Left Shift Operator
        System.out.println(a<<2);   // Left Shift Operator
        System.out.println(a<<4);   // Left Shift Operator
        System.out.println(a<<30);  // Left Shift Operator

        int y = -1;
        System.out.println(y<<1);   // Left Shift Operator

        int n = 33;
        System.out.println(n>>1);   // Right Shift
        System.out.println(n>>2);   // Right Shift

        int m = -2;
        System.out.println(m>>1);   // Right Shift Of Negative Number, It Fills Leading terms with One's To Ensure
        // That Sign Remains Same.

        System.out.println(m>>>1);  // Unsigned Right Shift Of Negative Number, It Fills Leading Terms With Zero's.
        System.out.println(m>>>2);  // Unsigned Right Shift Of Negative Number, It Fills Leading Terms With Zero's.

    }
}

