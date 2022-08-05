package com.programming.Java.OOPS.Strings;

public class String_Starts_Ends_With {
    public static void main(String args[]) {

        String s1= "Hello How  Are You";

        System.out.println(s1.startsWith("H"));       // returns true
        System.out.println(s1.startsWith("Heloo"));     // returns true
        System.out.println(s1.startsWith("how"));     // returns false

        System.out.println(s1.endsWith("u"));       // returns true
        System.out.println(s1.endsWith("You"));     // returns true
        System.out.println(s1.endsWith("how"));     // returns false
    }
}
