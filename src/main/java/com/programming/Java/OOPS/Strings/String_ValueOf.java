package com.programming.Java.OOPS.Strings;
/*
 java string valueOf() method converts different types of values into string.
 By teh help of string valueOf() method, you can convert int to string, long to string, boolean to string,
 character to string, float to string, double to string, object to string and char array to string.
 */
public class String_ValueOf {
    public static void main(String args[]){
        int value=30;
        String s=String.valueOf(value);
        System.out.println(s+10);//concatenating string with 10

        boolean bol = true;
        boolean bol2 = false;
        String s1a = String.valueOf(bol);
        String s2a = String.valueOf(bol2);
        System.out.println(s1a);
        System.out.println(s2a);

        char ch1 = 'A';
        char ch2 = 'B';
        String s1 = String.valueOf(ch1);
        String s2 = String.valueOf(ch2);
        System.out.println(s1);
        System.out.println(s2);

        float f  = 10.05f;
        double d = 10.02;
        String s3 = String.valueOf(f);
        String s4 = String.valueOf(d);
        System.out.println(s3);
        System.out.println(s4);
    }
}
