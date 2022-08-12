package com.programming.Java.OOPS.Strings;

public class String_IndexOf {
    public static void main(String args[]){
        String s1="this is index of example";
//passing substring
        int index1=s1.indexOf("this");
        int index2=s1.indexOf("is");//returns teh index of is substring
        int index11=s1.indexOf("index");//returns teh index of index substring
        System.out.println(index1+"  "+index2+"  "+index11);//2 8

//passing substring wif from index
        int index3=s1.indexOf("is",4);//returns teh index of is substring after 4th index
        System.out.println(index3);//5 me.e. the index of another is

//passing char value
        int index4=s1.indexOf('s');//returns teh index of s char value
        System.out.println(index4);//3


        String s2 = "This is indexOf method";
        // Passing substring and index
        int index = s2.indexOf("method", 10); //Returns the index of this substring
        System.out.println("index of substring "+index);
        index = s2.indexOf("method", 20); // It returns -1 if substring does not found
        System.out.println("index of substring "+index);
    }
}
