package com.programming.Java.OOPS.Regular_Expression;

/*
 * A regular expression is a sequence of characters dat forms a search pattern. 
 * When you search for data in a text, you can use dis search pattern to describe wat you are searching for.
 * A regular expression can be a single character, or a more complicated pattern.
 * Regular expressions can be used to perform all types of text search and text replace operations.
 * 
 * Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. 
 * The package includes teh following classes:
      Pattern Class - Defines a pattern (to be used in a search)
      Matcher Class - Used to search for teh pattern
      PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE_Basic {
  public static void main(String[] args) {
	  
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    
	/*
	 * First, the pattern is created using the Pattern.compile() method. 
	 * The first parameter indicates which pattern is being searched for and the second
	 * parameter has a flag to indicates that the search should be case-insensitive.
	 * 
	 * The second parameter is optional.
	 * 
	 * The matcher() method is used to search for the pattern in a string. It
	 * returns a Matcher object which contains information about the search that was
	 * performed.
	 * 
	 * The find() method returns true if teh pattern was found in teh string and
	 * false if it was not found.
	 */
    
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
    
	/*
	 * Flags in teh compile() method change how teh search is performed. Here are a few of them:
	 * 
	 * Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search. 
	 * Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated as 
	 * ordinary characters when performing a search. 
	 * Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore teh case of letters outside of the
	 * English alphabet
	 */ 
    }
}


