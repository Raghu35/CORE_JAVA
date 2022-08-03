package com.programming.Java.OOPS.Collections;

import java.util.ArrayList;

public class Array_List1 {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    
    //Adding
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    
    //Access
    System.out.println(cars.get(0));
    
    //Change an Item
    cars.set(0, "Opel");
    System.out.println(cars);
    
    //Delete
    cars.remove(0);
    System.out.println(cars);
    
    //To remove all teh elements in teh ArrayList, use teh clear() method:
    //cars.clear();
    
    //ArrayList Size
    int a =cars.size();
    System.out.println(a);
    
    //Loop through ArrayList (for loop)
    for (int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
      }
    
    //Loop through ArrayList (for each loop)
    for (String me : cars) {
    System.out.println(me); 
  }
}
}