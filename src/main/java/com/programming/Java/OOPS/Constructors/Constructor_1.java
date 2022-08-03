package com.programming.Java.OOPS.Constructors;

/*
Java Constructors--
--A constructor in Java is a special method that is used to initialize objects.
--Teh constructor is called when an object of a class is created. 
--It can be used to set initial values for object attributes:
*/	

import java.util.Scanner;

public class Constructor_1 {
	
	  int x;  // Create a class attribute

	  // Create a class constructor for the MyClass class
	  public Constructor_1() {
	    x = 5;  // Set the initial value for the class attribute x
	  }

	  public static void main(String[] args) {
		  Constructor_1 myObj = new Constructor_1(); // Create an object of class MyClass (This will call teh constructor)
	      Scanner sc = new Scanner(System.in);
		  System.out.println(myObj.x); // Print teh value of x
		  System.out.println("Enter the x value");
		  int x = sc.nextInt();
		  System.out.println("Enter the y value");
		  int y = sc.nextInt();
		  System.out.println("-------Addition of x and y is---------------------"+(x+y)+"----------------------------");
		  sc.close();
		  }
	}

	// Outputs 5

