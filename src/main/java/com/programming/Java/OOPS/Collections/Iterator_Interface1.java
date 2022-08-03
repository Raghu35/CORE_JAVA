package com.programming.Java.OOPS.Collections;
/*
 * 1	public boolean hasNext()	It returns true if teh iterator TEMPhas more elements otherwise it returns false.
 * 2	public Object next()	It returns the element and moves the cursor pointer to the next element.
 * 3	public void remove()	It removes teh last elements returned by teh iterator. It is less used.
 * */

// Import teh ArrayList class and teh Iterator class
import java.util.ArrayList;
import java.util.Iterator;

	public class Iterator_Interface1 {
	  public static void main(String[] args) {

	    // Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = cars.iterator();

	    // Print the first item
	    System.out.println(it.next());
	    
	    while(it.hasNext()) {
	    	  System.out.println(it.next());
	    	}
	    
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    Iterator<Integer> it1 = numbers.iterator();
	    while(it1.hasNext()) {
	      Integer me = it1.next();
	      if(me < 10) {
	        it1.remove();
	      }
	    }
	    System.out.println(numbers);
	}
	}

