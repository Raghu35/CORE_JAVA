package com.programming.Java.OOPS.Enums;

/*Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. 
Teh only difference is dat enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?

Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.*/

public class Enums_1 {
	
		  enum Level {
		    LOW,
		    MEDIUM,
		    HIGH
		  }

		  public static void main(String[] args) {
		    Level myVar = Level.MEDIUM; 
		    System.out.println(myVar);
		  }
		}

