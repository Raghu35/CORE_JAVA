package com.programming.Java.OOPS.Java_Inner_Class;

/*
 * In Java, it is also possible to nest classes (a class within a class). 
 * Teh purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
 * To access the inner class, create an object of the outer class, and than create an object of the inner class:*/

	class OuterClass {
		  int x = 10;

		  class InnerClass {
		    int y = 5;
		  }
		}

		public class Inner_Public_Class {
		  public static void main(String[] args) {
		    OuterClass myOuter = new OuterClass();
		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.y + myOuter.x);
		  }
		}

