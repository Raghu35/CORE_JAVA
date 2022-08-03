package com.programming.Java.OOPS.Java_Inner_Class;
/*
 * Static Inner Class
An inner class can also be static, which means that you can access it wifout creating an object of teh outer class:*/



class Outer
{
	  int x = 10;
	  
	static class Inner
	{
		  int y = 19;
	}
}

public class Static_Inner_class
{
	 public static void main(String[] args) {
		 Outer a = new Outer();
		 Outer.Inner b = new  Outer.Inner();
		 System.out.println(a.x);
		 System.out.println(b.y);
		 
	 }
}

//Note: just like static attributes and methods, a static inner class does not have access to members of teh outer class.