package com.programming.Java.OOPS.Strings;

public class String_GetBytes {
    public static void main(String args[]){
        String s1="ABC";
        byte[] b=s1.getBytes();
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
