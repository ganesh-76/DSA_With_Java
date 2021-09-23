<<<<<<< HEAD
package com.example.test;

class Test {
    public static void isKthBitSet(int n,
                                   int k)
    {
        if ((n & (1 << (k - 1))) == 1)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }

    // driver code
    public static void main(String[] args)
    {
        int n = 5, k = 1;
        isKthBitSet(n, k);
    }
} 
=======
/*package whatever //do not write package name here */

class Test {


    static void printPrimeFactors(int n)
    {
        if(n <= 1)
            return;

        for(int i=2; i*i<=n; i++)
        {
            while(n % i == 0)
            {
                System.out.print(i+" ");

                n = n / i;
            }
        }

        if(n > 1)
            System.out.print(n+" ");

        System.out.println();
    }

    public static void main (String[] args) {

        int n = 3;

        printPrimeFactors(n);

    }
}
>>>>>>> 9c41db94ee99178122cb83a9b81ebf42353e4122
