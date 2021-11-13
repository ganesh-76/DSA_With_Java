package com.example.test;

public class GCD {
//    static int gcd(int a, int b){
//       int res = Math.min(a,b);  // Time Complexity is "O(min(a,b))"
//       while(res>0){
//           if (a%res==0 && b%res==0){
//               break;
//           }
//           res--;
//       }
//       return res;
//    }
//    static int gcd(int a,int b){   // Using Euclidean Algorithm
//        while(a != b){
//            if (a>b){
//                a = a-b;
//            }
//            else{
//                b = b-a;
//            }
//        }
//        return a;
//    }
    static int gcd(int a,int b){   // Implementing Optimized Euclidean Algorithm
        if(b==0){                   // Time Complexity "Log(Min(a,b))"
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(10,15));
    }
}