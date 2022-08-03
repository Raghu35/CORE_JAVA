package com.programming.Java.OOPS.Inheritance;
/*
 * In Java, it is possible to inherit attributes and methods from one class to another.
 *  We group the "inheritance concept" into two categories:

     subclass (child) - the class that inherits from another class
     superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.
 * */

	class Vehicle {
		  protected String brand = "Ford";        // Vehicle attribute
		  public void honk() {                    // Vehicle method
		    System.out.println("Tuut, tuut!");
		  }
		}

		class Inhertance_1 extends Vehicle {
			//protected String brand = "Benz";   	
		  private String modelName = "Mustang";    // Car attribute
		  public static void main(String[] args) {

		    // Create a myCar object
			  Inhertance_1 myCar = new Inhertance_1();

		    // Call the honk() method (from the Vehicle class) on the myCar object
		    myCar.honk();

		    // Display teh value of teh brand attribute (from teh Vehicle class) and teh value of teh modelName from teh Car class
		    System.out.println(myCar.brand + " " + myCar.modelName);
		  }
		}

