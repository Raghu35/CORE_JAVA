package com.programming.Java.OOPS.Strings;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        String a = "Raghu";
        String b = new String ("Ravi");
        String c ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any string \n");
        c = sc.nextLine();
        System.out.println("a represents " + a);
        System.out.println("b represents " + b);
       System.out.println("c represents " + c);

       //Java String length()
        System.out.println("string length is: "+a.length());

        //Java String concat()
        a=a.concat(", how are you?");
        System.out.println("" + a);

        //Java String IsEmpty()
        System.out.println(b.isEmpty());

        //Java String compareTo():
        System.out.println(a.compareTo(b));

       // Java String Trim()
        String s1="  hello   ";
        System.out.println(s1.trim()+" how are you");

        String s1lower=a.toLowerCase();
        System.out.println(s1lower);

        String s2upper=a.toUpperCase();
        System.out.println(s2upper);


    }
}
