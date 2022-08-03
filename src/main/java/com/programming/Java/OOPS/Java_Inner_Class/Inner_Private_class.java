package com.programming.Java.OOPS.Java_Inner_Class;


	class OuterClass2 {
		  int x = 10;

		  class InnerClass2 {
		    int y = 5;
		  }
		}

		public class Inner_Private_class {
		  public static void main(String[] args) {
		    OuterClass2 myOuter = new OuterClass2();
		    OuterClass2.InnerClass2 myInner = myOuter.new InnerClass2();
		    System.out.println(myInner.y + myOuter.x);
		  }
		}

