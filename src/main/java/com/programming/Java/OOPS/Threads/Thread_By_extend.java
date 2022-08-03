package com.programming.Java.OOPS.Threads;


public class Thread_By_extend extends Thread {
	
		  public static void main(String[] args) {
			  
			  Thread_By_extend thread = new Thread_By_extend();
		      thread.start();
		      System.out.println("This code is outside of the thread");
		    }
		  
		   public void run() {
		    System.out.println("This code is running in a thread");
		  }
		}


