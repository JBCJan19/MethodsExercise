package com.company.java;

import java.util.Scanner;

//Calculate the area of a rectangle with length and width input from the user.
public class Problem8RectangleArea {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length: ");
    double length = input.nextDouble();
    System.out.println("Enter the width: ");
    double width = input.nextDouble();
    System.out.println("The area of the rectangle is: " + getRectangleArea
            (length, width));
  }

  public static double getRectangleArea(double length, double width){
    return length * width;
  }
}
