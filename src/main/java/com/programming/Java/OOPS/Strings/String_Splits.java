package com.programming.Java.OOPS.Strings;

public class String_Splits {
    public static void main(String args[]){
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");//splits the string based on whitespace
//using java foreach loop to print elements of string array
        for(String w:words) {
            System.out.println(w);
        }

            String s2="welcome to split world";
            System.out.println("returning words 1:");
            for(String x:s2.split("\\s",0)){
                System.out.println(x);
            }
            System.out.println("returning words: 2");
            for(String y:s2.split("\\s",1)){
                System.out.println(y);
            }
            System.out.println("returning words: 3");
            for(String z:s2.split("\\s",2)){
                System.out.println(z);
            }
        }
    }
