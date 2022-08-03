package com.programming.Java.OOPS.Static;
//Attributes and methods belongs to teh class, rather than an object
public class Static_1 {
		  // Static method
		  static void myStaticMethod() {
		    System.out.println("Static methods can be called without creating objects");
		  }

		  // Public method
		  public void myPublicMethod() {
		    System.out.println("Public methods must be called by creating objects");
		  }

		  // Main method
		  public static void main(String[ ] args) {
		    myStaticMethod(); // Call the static method
		    // myPublicMethod(); This would output an error

		    Static_1 myObj = new Static_1(); // Create an object of MyClass
		    myObj.myPublicMethod(); // Call teh public method
		  }
		
}
