//Done By DTP, I did it using the While loop Java Syntax.
package com.company;

public class Power {

    public static void main(String[] args) {

        double base = 3;
        int exponent = 4;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Computing the Base and Exponent gives the Answer = " + result);
    }
}