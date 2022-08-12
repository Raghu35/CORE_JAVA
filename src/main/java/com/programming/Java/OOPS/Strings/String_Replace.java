package com.programming.Java.OOPS.Strings;

public class String_Replace {
    public static void main(String args[]){

        String s1="hello how are you";
        String replaceString=s1.replace('h','t');
        System.out.println(replaceString);

        String s2="Hey, welcome to Edureka";
        String replaceString1=s2.replace("Edureka","Brainforce");
        System.out.println(replaceString1);

        String s3="javatpoint is a very good website";
        String replaceString2=s3.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString2);
    }
}
