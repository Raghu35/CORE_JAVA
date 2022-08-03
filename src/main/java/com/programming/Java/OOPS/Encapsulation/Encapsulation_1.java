package com.programming.Java.OOPS.Encapsulation;
/*
Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 To achieve this, you must:

1.declare class variables/attributes as private
2.provide public get and set methods to access and update the value of a private variable
**/
 class Person {
	  private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	}
public class Encapsulation_1 {
	public static void main(String[] args) {
	    Person myObj = new Person();
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName());
	    
	  //  myObj.name = "John";  // error
	  //  System.out.println(myObj.name); // error 
	  }
}

/*
 * Why Encapsulation?
 * Better control of class attributes and methods
 * Class attributes can be made read-only (if you only use the get method), or 
 * write-only (if you only use the set method)
 * Flexible: the programmer can change one part of the code without affecting other parts
 * Increased security of data
*/
