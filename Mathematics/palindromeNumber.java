package com.example.test.Mathematics;

public class palindromeNumber {
    static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10; // n%10 helps us to get last digit as remainder
            rev = rev * 10 + lastDigit; // Adds lastDigit with (rev*10)
            temp = temp / 10; // Removes last digit
        }
        return rev == n;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));  // Time Complexity is Θ(d) where d is number of digit and input number.
    }
}