package com.programming.Java.OOPS.Date;
/*
 * LocalDate        	Represents a date (year, month, day (yyyy-MM-dd))
 * LocalTime	        Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
 * LocalDateTime	    Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
 * DateTimeFormatter	Formatter for displaying and parsing date-time objects*/

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Display_Current_Data_Time {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display teh current date
    
    LocalTime myObj1 = LocalTime.now();
    System.out.println(myObj1);
    
    LocalDateTime myObj2 = LocalDateTime.now();
    System.out.println(myObj2);
    
  }
}