<<<<<<< HEAD
package com.example.test;

public class LCM {
//    static int lcm(int a,int b){    // Time Complexity "O(a*b - max(a,b))"
//        int res = Math.max(a,b);
//        while(true) {
//            if (res % a == 0 && res % b == 0) {
//                return res;
//            }
//            res++;
//        }
//        return res;
//    }
    // a*b = gcd(a,b)*lcm(a,b)
    static int gcd1(int a,int b)
        {
            if (b == 0) {
                return a;
            }
            return gcd1(b, a % b);
        }                                 // Time Complexity "O(Log(Min(a,b)))"

    static int lcm1(int a,int b){
            {
            return (a*b)/gcd1(a,b);
            }
    }
    public static void main(String[] args) {
        int a=4, b=6;
        System.out.println(lcm1(a,b));

    }
}
=======
package com.example.test;

public class LCM {
//    static int lcm(int a,int b){    // Time Complexity "O(a*b - max(a,b))"
//        int res = Math.max(a,b);
//        while(true) {
//            if (res % a == 0 && res % b == 0) {
//                return res;
//            }
//            res++;
//        }
//        return res;
//    }
    // a*b = gcd(a,b)*lcm(a,b)
    static int gcd1(int a,int b)
        {
            if (b == 0) {
                return a;
            }
            return gcd1(b, a % b);
        }                                 // Time Complexity "O(Log(Min(a,b)))"

    static int lcm1(int a,int b){
            {
            return (a*b)/gcd1(a,b);
            }
    }
    public static void main(String[] args) {
        int a=4, b=6;
        System.out.println(lcm1(a,b));

    }
}
>>>>>>> 9c41db94ee99178122cb83a9b81ebf42353e4122
