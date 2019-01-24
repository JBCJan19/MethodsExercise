package com.company.java;

import java.util.Scanner;

//Get the length of a string.
public class Problem4StringLength {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String userInput = input.nextLine();
    System.out.println("The length of the string you entered: " +
            getStringLength(userInput));

  }

  public static int getStringLength(String word){
    int wordLength = word.length();
    return wordLength;
  }

}
