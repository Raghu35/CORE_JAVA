package com.programming.Java.OOPS.Date;

//use teh DateTimeFormatter class with teh ofPattern() method in teh same package to format or parse date-time objects. 
//Teh following example will remove both teh "T" and nanoseconds from teh date-time:

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import teh DateTimeFormatter class

public class DateTimeFormatter1 {
  public static void main(String[] args) {
	  
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    
    
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    //System.out.println("After formatting: " + myFormatObj);
    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
/*Teh ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. For example:
 * yyyy-MM-dd	"1988-09-29"	
 * dd/MM/yyyy	"29/09/1988"	
 * dd-MMM-yyyy	"29-Sep-1988"	
 * E, MMM dd yyyy	"Thu, Sep 29 1988"
  */
