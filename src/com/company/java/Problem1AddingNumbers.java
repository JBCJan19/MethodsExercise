package com.company.java;

//Add two numbers given by the user.

import java.util.Scanner;

public class Problem1AddingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter another number: ");
        double num2 = input.nextDouble();
        System.out.println( num1 + " + " + num2 + " = " +
                getSum(num1, num2));
    }

    public static double getSum(double num1, double num2){
        return num1 + num2;
    }
}
