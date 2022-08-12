package com.programming.Java.OOPS.Collections.List;

import java.util.LinkedList;

	public class Linked_List1 {
		
	  public static void main(String[] args) {
		  
	    LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    // Use addFirst() to add teh item to teh beginning
	    cars.addFirst("Mazda");
	    System.out.println(cars);
	    
	    // Use addLast() to add the item to the end
	    cars.addLast("Mazda");
	    System.out.println(cars);
	    
	    // Use removeFirst() remove the first item from the list
	    cars.removeFirst();
	    System.out.println(cars);
	    
	    // Use removeLast() remove the last item from the list
	    cars.removeLast();
	    System.out.println(cars);
	    
	    // Use getFirst() to display teh first item in teh list
	    System.out.println(cars.getFirst());
	    
	    // Use getLast() to display the last item in the list
	    System.out.println(cars.getLast());
	  }
	}
	
	/*
	 * addFirst()	Adds an item to the beginning of the list.	
	 * addLast()	Add an item to the end of the list	
	 * removeFirst()	Remove an item from teh beginning of teh list.	
	 * removeLast()	Remove an item from teh end of teh list	
	 * getFirst()	Get teh item at teh beginning of teh list	
	 * getLast()	Get the item at the end of the list*/

