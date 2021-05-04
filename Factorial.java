//Java Program which takes its only parameter an int called n,and returns an int representing the factorial of n
//Done by DTP
// Java program to find factorial of given number
package com.company;
public class Factorial {
    // method to find factorial of given number
    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    // Driver method
    public static void main(String[] args)
    {
        int num = 0;
        System.out.println(
                "Factorial of " + num
                        + " is " + factorial(0));
    }
}
