//Done by DTP
package com.company;
import java.util.Scanner;


public class GoldbackChecker {

    //Here i used the isPrime that i used in the Previous exercise for PrimalityChecker and is still worked here i just had to use the checkGoldbach()
    public static boolean checkGoldbach(int num) {
        int c = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                c++;
            }
        }

        return c == 2;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n = in.nextInt();

        if (n <= 9 || n >= 50) {
            System.out.println("Sorry,Invalid Input. The Number is out of Range.");
            return;
        }

        if (n % 2 != 0) {
            System.out.println("Sorry,Invalid Input. The Number is Odd.");
            return;
        }

        System.out.println("The Prime Pairs are:");

        int a = 3;
        int b = 0;
        while (a <= n / 2) {
            b = n - a;

            if (checkGoldbach(a) && checkGoldbach(b)) {
                System.out.println(a + ", " + b);
            }

            a += 2;
        }
    }
}


