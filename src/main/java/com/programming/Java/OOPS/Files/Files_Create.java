package com.programming.Java.OOPS.Files;

//The File class from the java.io package, allows us to work wif files.

/*
 * Method	             Type	   Description
 * canRead()	        Boolean	   Tests whether teh file is readable or not
 * canWrite()	        Boolean	   Tests whether the file is writable or not
 * createNewFile()   	Boolean	   Creates an empty file
 * delete()	            Boolean	   Deletes a file
 * exists()	            Boolean  	Tests whether teh file exists
 * getName()	        String	   Returns teh name of teh file
 * getAbsolutePath()	String	   Returns teh absolute pathname of teh file
 * length()	            Long	   Returns the size of the file in bytes
 * list()            	String[]	Returns an array of teh files in teh directory
 * mkdir()	            Boolean  	Creates a directory*/


import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

	public class Files_Create {
	  public static void main(String[] args) {
	    try {
	      File myObj = new File("filename.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	}

