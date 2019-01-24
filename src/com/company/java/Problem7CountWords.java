package com.company.java;

//Count all words in the sentence: The dog jumped over the fence
// (use String.split(" ") method).

public class Problem7CountWords {
  public static void main(String[] args) {
    System.out.println("The length of the sentence is: " + getWordsInSentence());
  }

  public static int getWordsInSentence(){
    String sentence = "The dog jumped over the fence";
    String[] splitSentence = sentence.split(" ");
    return splitSentence.length;
  }
}
