package com.example.test.Bit_Magic;

public class printPowerSet {
    static void printingPowerSet(String str){
        int n = str.length();
        int powsize = (int)Math.pow(2,n);

        for(int counter=0;counter<powsize;counter++) {      // Time Complexity is "Theta(2_power_n * n)"
            for (int j=0;j<n;j++){
                if ((counter & (1<<j)) != 0){
                    System.out.print( str.charAt(j) );
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        printingPowerSet(s);
    }
}
