package com.company.java;

import java.util.Scanner;

//Take integer input from the user, output whether it's odd or even.
public class Problem11OddEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: " );
    int num = input.nextInt();
    if(isEven(num)){
      System.out.println(num + " is even");
    }else {
      System.out.println(num + " is odd");
    }
  }

  public static boolean isEven(int num){
    if(num%2==0){
      return true;
    }else {
      return false;
    }
  }
}
