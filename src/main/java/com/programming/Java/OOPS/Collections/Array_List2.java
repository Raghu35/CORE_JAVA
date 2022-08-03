package com.programming.Java.OOPS.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List2 {
	public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(90);
    myNumbers.add(15);
    myNumbers.add(11);
    myNumbers.add(25);
    System.out.println("Before Sorted");
    for (int i : myNumbers) {
      System.out.println(i);
    }
    //how to sort
    Collections.sort(myNumbers);  // Sort cars
    System.out.println("After Sorted");
    for (int i : myNumbers) {
        System.out.println(i);
      }
}
}
