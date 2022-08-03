package com.programming.Java.OOPS.Basics;

/*
 * Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
 * the table below shows the primitive type and teh equivalent wrapper class:
 * Primitive Data Type	Wrapper Class
        byte	           Byte
        short	           Short
        int	               Integer
        long              	Long
        float	            Float
        double          	Double
        boolean          	Boolean
        char	            Character
Sometimes you must use wrapper classes, 
for example when working with Collection objects, such as ArrayList, 
       where primitive types cannot be used (teh list can only store objects):
*/

	public class Wrapper_Class {
		  public static void main(String[] args) {
		    Integer myInt = 5;
		    Double myDouble = 5.99;
		    Character myChar = 'A';
		    
		    System.out.println(myInt);
		    System.out.println(myDouble);
		    System.out.println(myChar);
		    
		    System.out.println(myInt.intValue());
		    System.out.println(myDouble.doubleValue());
		    System.out.println(myChar.charValue());
		    
			/*
			 * Another useful method is the toString() method, which is used to convert
			 * wrapper objects to strings.
			 * 
			 * In teh following example, we convert an Integer to a String, and use teh
			 * length() method of the String class to output the length of the "string":
			 */
		    
		    Integer Int = 100;
		    String myString = Int.toString();
		    System.out.println("String - "+myString.length());
		  }
		}

