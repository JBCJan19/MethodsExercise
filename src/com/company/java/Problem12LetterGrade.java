package com.company.java;

//  The letter grade is determined as follows:
//  A = 90–100%
//  B = 80–89%
//  C = 70–79%
//  D = 60–69%
//  F = 0–59%
//  Write a program that will print the letter grade based on the
// percentage entered.

import java.util.Scanner;

public class Problem12LetterGrade {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your score: ");
    double grade = input.nextDouble();
    System.out.println("Your letter grade is: " + getLetterGrade(grade));
  }

  public static String getLetterGrade(double score){
    String letterGrade = "" ;
    if(score>89){
      letterGrade += "A";
    }else if(score > 79){
      letterGrade += "B";
    }else if(score > 69){
      letterGrade += "C";
    }else if(score > 59){
      letterGrade += "D";
    }else {
      letterGrade += "F";
    }
    return letterGrade;
  }
}
