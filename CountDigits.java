<<<<<<< HEAD
package com.example.test;

import java.util.Scanner;

public class CountDigits {
    static int count() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int n = sc.nextInt();
        int counting = 0;
        while (n > 0) {
            n = n / 10;
            counting++;
        }
        return counting;
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
=======
package com.example.test;

import java.util.Scanner;

public class CountDigits {
    static int count() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int n = sc.nextInt();
        int counting = 0;
        while (n > 0) {
            n = n / 10;
            counting++;
        }
        return counting;
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
>>>>>>> 9c41db94ee99178122cb83a9b81ebf42353e4122
