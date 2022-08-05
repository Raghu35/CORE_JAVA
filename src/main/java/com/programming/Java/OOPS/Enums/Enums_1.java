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
		/* Enumeration means a list of named constants. In Java, enumeration defines a class type.
		An Enumeration can has constructors, methods, and instance variables.
		It is created using the enum keyword. Each enumeration constant is public, static, and final by default.
		Even though enumeration defines a class type and has constructors, you do not instantiate an enum using new.
		Enumeration variables are used and declared in much the same way as you do a primitive variable.*/