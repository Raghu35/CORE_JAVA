package com.programming.Java.TypeCasting;

public class ATypeCasting1 {

    public static void main(String[] args)
    {

//Java Variable Example: Widening
        int a=10;
        float b=a;
        System.out.println(a);
        System.out.println(b);

//Java Variable Example: Narrowing (Typecasting)
        float c=10.5f;
        //int a=f;//Compile time error
        int d=(int)c;
        System.out.println(c);
        System.out.println(d);

//Java Variable Example: Overflow
        int e=130;
        byte f=(byte)e;
        System.out.println(e);
        System.out.println(f);

//Java Variable Example: Adding Lower Type
        byte g=10;
        byte h=10;
        //byte c=a+b;//Compile Time Error: because a+b=20 will be int
        byte i=(byte)(g+h);
        System.out.println(i);
    }
}
