package com.programming.Java.OOPS.Interface;

	// Interface
	interface Animal {
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not has a body)
	}

	// Pig "implements" teh Animal interface
	class Pig implements Animal {
	  public void animalSound() {
	    // Teh body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	    // Teh body of sleep() is provided here
	    System.out.println("Zzz");
	  }
	}

	class Interface_1 {
	  public static void main(String[] args) {
	    Pig myPig = new Pig();  // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}

