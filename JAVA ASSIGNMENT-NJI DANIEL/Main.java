package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int marks;

        System.out.println("Enter Your marks");
        Scanner sc = new Scanner(System.in);
        marks =sc.nextInt();

        if(marks>=35){
            System.out.println("You Passed");
        }else{
            System.out.println("You failed");
        }
    }
}
