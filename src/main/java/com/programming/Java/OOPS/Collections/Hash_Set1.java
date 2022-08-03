package com.programming.Java.OOPS.Collections;

// Import the HashSet class
import java.util.HashSet;

	public class Hash_Set1 {
	  public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    //Check If an Item Exists
	    System.out.println(cars.contains("Mazda"));
	    
	    //Remove an Item
	    cars.remove("Volvo");
	    
	    //To remove all items, use the clear() method:
	    cars.clear();
	    
	    //HashSet Size
	    cars.size();
	    
	    for (String me : cars) {
	    	  System.out.println(me);
	    	}
	  }
	}

