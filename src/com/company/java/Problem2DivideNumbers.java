package com.company.java;


import java.util.Scanner;

// Write an application to divide 2 numbers. Prompt the user to enter two
// numbers. Take the first number and divide it by the second number and print
// that result to the screen. If the second number is a zero, print "Undefined"
// to the screen, otherwise just print the result.
public class Problem2DivideNumbers {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    double firstNumber = input.nextDouble();
    System.out.println("Enter second number: ");
    double secondNumber = input.nextDouble();
    System.out.println(firstNumber + " / " + secondNumber + " = " +
            getDivision(firstNumber,secondNumber));
    System.out.printf("%.2f, ", firstNumber);
  }

  public static String getDivision(double num1, double num2){
    String output = "";
    double result = 0;
    if(num2 == 0){
      output += "Undefined";
    }else {
       result = num1 / num2;
       output += "The result is: " + result;
    }
    return output;
  }
}
