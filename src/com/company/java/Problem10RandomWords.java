package com.company.java;

//Given the array list, print a random word from the list:
// (module, class, implement).

import java.util.ArrayList;
import java.util.Collections;

public class Problem10RandomWords {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>();
    words.add("module");
    words.add("class");
    words.add("implement");
    System.out.println(getRandomWord(words));
  }

  public static String getRandomWord(ArrayList<String> words){
    String output = "";
    Collections.shuffle(words);
    output += "Random word is = " + words.get(0);
    return output;
  }
}
