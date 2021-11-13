package com.example.test.Bit_Magic;

public class CheckKthBit {
    /*
    public static void isKthBitSet(int n, int k){
        if ((n&(1<<(k-1)))!=0){                    //Using Left Shift Operator.
            System.out.println("Kth Bit is SET");
        }
        else {
            System.out.println("Kth Bit is NOT SET");
        }
    }
     */
    public static void isKthBitSet(int n, int k){
        if ( (n >> (k-1) & 1) == 1 ) {              //Using Right Shift Operator.
            System.out.println("Kth Bit is SET");
        }
        else {
            System.out.println("Kth Bit is NOT SET");
        }
    }
    public static void main(String[] args) {
        int n = 13, k = 3;
        isKthBitSet(n,k);
    }
}
