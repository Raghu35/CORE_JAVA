package com.programming.Java.OOPS.Files;


	import java.io.File;  // Import teh File class

	public class Files_Delete {
	  public static void main(String[] args) { 
	    File myObj = new File("filename.txt"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted teh file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	  } 
	}
