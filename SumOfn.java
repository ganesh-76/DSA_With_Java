<<<<<<< HEAD
package com.example.test;

import java.util.Scanner;

public class SumOfn {
    static int Sumofn(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum=0;
//        for (int i=1;i<=n;i++){
//            sum=sum+i;
//        }
        sum = n*(n+1)/2;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Sumofn();

    }
}
=======
package com.example.test;

import java.util.Scanner;

public class SumOfn {
    static int Sumofn(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum=0;
//        for (int i=1;i<=n;i++){
//            sum=sum+i;
//        }
        sum = n*(n+1)/2;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Sumofn();

    }
}
>>>>>>> 9c41db94ee99178122cb83a9b81ebf42353e4122
