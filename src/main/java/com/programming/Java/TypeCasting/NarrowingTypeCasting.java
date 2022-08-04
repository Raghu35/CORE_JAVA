package com.programming.Java.TypeCasting;

public class NarrowingTypeCasting {
     public static void main(String args[])
     {
        double d = 166.66;
//converting double data type into long data type
        long l = (long)d;
//converting long data type into int data type
        int i = (int)l;
        System.out.println("Before conversion: "+d);
//fractional part lost
        System.out.println("After conversion into long type: "+l);
        //jhgf
//fractional part lost
        System.out.println("After conversion into int type: "+i);

         float input = 65.0f ;
         byte b = (byte) input ;
         short s = (short) input ;
         char c = (char) input ;
         int e = (int) input ;
         System.out.println("Examples of Narrowing primitive Type casting...!!");
         System.out.println("float to short : "+b);
         System.out.println("float to byte : "+s);
         System.out.println("float to char : "+c);
         System.out.println("float to int : "+e);

         System.out.println("------------------------------------------------------------------------------------");
         //IMPORTANT
         int q = 70;
         float w = (float)q;
         System.out.println("int to float : "+w);
         char z = (char) w ;
         System.out.println("float to char : "+z);
         int v = (int)z;
         System.out.println("char to int : "+v);
     }
}
