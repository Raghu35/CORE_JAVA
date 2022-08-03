package com.programming.Java.OOPS.Threads;


public class Thread_by_implement implements Runnable {
	
		  public static void main(String[] args) {
			  
			  Thread_by_implement obj = new Thread_by_implement();
		      Thread thread = new Thread(obj);
		      thread.start();
		      System.out.println("This code is outside of the thread");
		  }
		     public void run() {
		      System.out.println("This code is running in a thread");
		  }
		}

