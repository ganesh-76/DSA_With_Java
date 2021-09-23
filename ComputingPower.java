<<<<<<< HEAD
package com.example.test;

public class ComputingPower {
    /*
    static int computePow(int x,int n){
        int res=1;
        for(int i=0;i<n;i++){  // Time Complexity is :- "Theta(n)"
            res = res*x;
        }
        return res;
    }
    static int computePow(int x,int n){
        if(n==0){
            return 1;
        }                              // Recursive Solution.
        int temp=computePow(x,n/2);   // Time Complexity is "Theta(Log_n)"
        temp=temp*temp;               // Auxiliary Space is "Theta(n)"
        if (n%2==0){
            return temp;
        }
        else return temp*x;
    }
     */
    static int computePow(int x,int n){
        int res=1;                  // Iterative Power
        while(n>0){                 // Time Complexity is "Big_O(Log_n)"
            if (n%2 != 0){          // Auxiliary Space is "Big_O(1)"
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(computePow(4,5));
    }
}
=======
package com.example.test;

public class ComputingPower {
    /*
    static int computePow(int x,int n){
        int res=1;
        for(int i=0;i<n;i++){  // Time Complexity is :- "Theta(n)"
            res = res*x;
        }
        return res;
    }
    static int computePow(int x,int n){
        if(n==0){
            return 1;
        }                              // Recursive Solution.
        int temp=computePow(x,n/2);   // Time Complexity is "Theta(Log_n)"
        temp=temp*temp;               // Auxiliary Space is "Theta(n)"
        if (n%2==0){
            return temp;
        }
        else return temp*x;
    }
     */
    static int computePow(int x,int n){
        int res=1;                  // Iterative Power
        while(n>0){                 // Time Complexity is "Big_O(Log_n)"
            if (n%2 != 0){          // Auxiliary Space is "Big_O(1)"
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(computePow(4,5));
    }
}
>>>>>>> 9c41db94ee99178122cb83a9b81ebf42353e4122
