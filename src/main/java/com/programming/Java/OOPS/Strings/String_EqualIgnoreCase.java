package com.programming.Java.OOPS.Strings;

public class String_EqualIgnoreCase {

    public static void main(String args[]){
        String s1="javatpoint";
        String s2="javatpoint";
        String s3="JAVATPOINT";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true coz content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true coz case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }
}
