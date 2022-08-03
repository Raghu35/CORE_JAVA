package com.programming.Java.OOPS.Java_Inner_Class;


	class OuterClass1 {
		  int x = 10;

		  class InnerClass {
		    public int myInnerMethod() {
		      return x;
		    }
		  }
		}

		public class Access_Outer_Class_From_Inner_Class {
		  public static void main(String[] args) {
		    OuterClass1 myOuter = new OuterClass1();
		    OuterClass1.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.myInnerMethod());
		  }
		}

		// Outputs 10

