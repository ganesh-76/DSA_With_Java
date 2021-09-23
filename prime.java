<<<<<<< HEAD
package com.example.test;

public class prime {
    /*
    static boolean isPrime(int n){       //Time Complexity "O(n)"
        if (n==1){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){      // run 2 to (i<=sqrt(n) OR i*i<=n)
            if (n%i==0){                        // Time Complexity "O(sqrt(n))"
                return false;
            }
        }
        return true;
    }
    */
    public static boolean isPrime(int n){
        if(n==1){
            return false;               // For large numbers we can use this method.
        }
        if (n==2 || n==3){
            return true;
        }
        if (n%2==0 || n%3==0){
            return false;
        }
        for (int i=5;i*i<=n;i=i+6){         //i*i<=n AND i<=Math.sqrt(n) are same.
            if (n%i==0 || n%(i+2)==0){      //This is 3 times faster than previous solutions.
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(1031));
    }
}
=======
package com.example.test;

public class prime {
    /*
    static boolean isPrime(int n){       //Time Complexity "O(n)"
        if (n==1){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){      // run 2 to (i<=sqrt(n) OR i*i<=n)
            if (n%i==0){                        // Time Complexity "O(sqrt(n))"
                return false;
            }
        }
        return true;
    }
    */
    public static boolean isPrime(int n){
        if(n==1){
            return false;               // For large numbers we can use this method.
        }
        if (n==2 || n==3){
            return true;
        }
        if (n%2==0 || n%3==0){
            return false;
        }
        for (int i=5;i*i<=n;i=i+6){         //i*i<=n AND i<=Math.sqrt(n) are same.
            if (n%i==0 || n%(i+2)==0){      //This is 3 times faster than previous solutions.
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(1031));
    }
}
>>>>>>> 9c41db94ee99178122cb83a9b81ebf42353e4122
