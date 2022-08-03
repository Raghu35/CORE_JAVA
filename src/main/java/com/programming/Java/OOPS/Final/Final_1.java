package com.programming.Java.OOPS.Final;
/*If you don't want teh ability to override existing attribute values, declare attributes as final*/
public class Final_1 {

		  final int x = 10;
		  final double PI = 3.14;

		  public static void main(String[] args) {
			  Final_1 myObj = new Final_1();
			  System.out.println(myObj.x);
			  System.out.println(myObj.PI);
			  
		   // myObj.x = 50; // will generate an error: cannot assign a value to a final variable
		  //  myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
		    
		  }
		}

