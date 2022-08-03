package com.programming.Java.OOPS.Collections;

/*In the ArrayList chapter, you learned that Arrays store items as an ordered collection, 
 * and you has to access them with an index number (int type). 
 * A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
 * One object is used as a key (index) to another object (value). 
 * It can store different types: String keys and Integer values, or the same type, like: String keys and String values:*/
	
// Import the HashMap class
import java.util.HashMap;

	public class Hash_Map1 {
	  public static void main(String[] args) {
	    // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    //Access an Item
	    System.out.println(capitalCities.get("England"));
	    
	    //Remove an Item
	    System.out.println(capitalCities.remove("England"));
	    
	    //To remove all items, use the clear() method:
	    //capitalCities.clear();
	    
        //HashMap Size
	    System.out.println(capitalCities.size());
	    
	    //keySet() method if you only want the keys, and use the values() method if you only want the values:
	    //Loop Through a HashMap
	    // Print keys
	    for (String i : capitalCities.keySet()) {
	      System.out.println(i);
	      
	   // Print values
	      for (String j : capitalCities.values()) {
	        System.out.println(j);
	      }
	      
	   // Print keys and values
	      for (String k : capitalCities.keySet()) {
	        System.out.println("key: " + k + " value: " + capitalCities.get(k));
	      }
	      
	      
	    }
	    
	  }
	}


