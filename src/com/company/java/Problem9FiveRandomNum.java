package com.company.java;

import java.util.Random;

//Print a 5 random numbers given a bound.
public class Problem9FiveRandomNum {
  public static void main(String[] args) {
    getRandomNumbers();
  }

  public static void getRandomNumbers(){
    Random rand = new Random();

    for (int i = 0; i <5 ; i++) {
      int randomNums = 1 + rand.nextInt(10);
      System.out.println(randomNums);
    }
  }
}
