package com.company.java;

//Check if a year is a leap year (A leap year is divisible by 4).

import java.util.Scanner;

public class Problem6LeapYear {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = input.nextInt();
    System.out.println("The year " + year + " is " + getLeapYear(year));
  }

  public static String getLeapYear(int year){
    if (year % 4 != 0) {
      return "Not Leap Year";
    } else if (year % 400 == 0) {
      return "Leap year";
    } else if (year % 100 == 0) {
      return "Not Leap year";
    } else {
      return "Leap year";
    }
  }
}
