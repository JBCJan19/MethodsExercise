package com.company.java;

//Get 5 letters from the user, output them sorted (Hint: Use ArrayList
// and Collections.sort())

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem3LetterSorted {
  public static void main(String[] args) {

  getSortedLetters();
  }

  public static void getSortedLetters(){

    Scanner input = new Scanner(System.in);

    ArrayList<String> letters = new ArrayList<String>();

    for (int i = 0; i <5 ; i++) {
      System.out.println("Enter a letter: ");
      String letter = input.next();
      letters.add(letter);
    }
    // Sort the array
    Collections.sort(letters);
    for (String aLetter: letters){
      System.out.println(aLetter);
    }

  }
}
