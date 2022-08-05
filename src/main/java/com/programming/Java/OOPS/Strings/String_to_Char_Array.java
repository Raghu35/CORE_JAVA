package com.programming.Java.OOPS.Strings;

public class String_to_Char_Array {
    public static void main(String args[]) {

        String s = "GeeksforGeeks";
        char[] gfg = s.toCharArray();
        for (int i = 0; i < gfg.length; i++) {
            System.out.println(gfg[i]);
        }
    }
}
