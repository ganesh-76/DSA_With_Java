<<<<<<< HEAD
package com.example.test;

public class factorialOfN {
//    static int fact(int n){
//        int factorial=1;
//      for (int i=n;i>1;i--){
//          factorial = factorial*i;
//      }
//      return factorial;
//    }

    static int fact(int n){
        if (n==0){
            return 1;
        }
        return n * fact(n-1);

    }
    public static void main(String[] args) {
        System.out.println("Factorial of number is: "+fact(5 ));
    }
}
=======
package com.example.test;

public class factorialOfN {
//    static int fact(int n){
//        int factorial=1;
//      for (int i=n;i>1;i--){
//          factorial = factorial*i;
//      }
//      return factorial;
//    }

    static int fact(int n){
        if (n==0){
            return 1;
        }
        return n * fact(n-1);

    }
    public static void main(String[] args) {
        System.out.println("Factorial of number is: "+fact(5 ));
    }
}
>>>>>>> 9c41db94ee99178122cb83a9b81ebf42353e4122
