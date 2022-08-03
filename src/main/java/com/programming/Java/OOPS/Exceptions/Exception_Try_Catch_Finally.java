package com.programming.Java.OOPS.Exceptions;

/*
 * The try statement allows you to define a block of code to be tested for errors while it is being executed.
 * The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
 * The finally statement lets you execute code, after try...catch, regardless of the result:
 */

public class Exception_Try_Catch_Finally {
	
	
	public static void main(String[ ] args) {
		
		//TRY CATCH FINALLY
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    } finally {
		      System.out.println("Teh 'try catch' is finished.");
		    }
		
	  }
}
