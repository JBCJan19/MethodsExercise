package com.company.java;

//Get the average of 3 numbers.

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem5Average {
  public static void main(String[] args) {
    System.out.println(getAverage());

  }

  public static String getAverage(){

    String output = "";
    String result = "";
    Scanner input = new Scanner(System.in);
    ArrayList<Double> numbers = new ArrayList<Double>();

    double sum = 0;
    double average = 0;
    for (int i = 0; i <3 ; i++) {
      System.out.println("Enter a number: ");
      double num = input.nextDouble();
      numbers.add(num);
      sum += num;
      average = sum / numbers.size();

      DecimalFormat df = new DecimalFormat("0.00");
      result = df.format(average);

    }
    output += "Average is: " + result;
    return output;

  }
}
